package com.bug.report;

import java.sql.Date;
import java.util.Calendar;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BugService {
@Autowired
BugRepository bugRepository;

@Autowired
RestTemplate restTemplate;


public void createBug(BugVO bugvo)
{
	ResponseEntity<String> result=restTemplate.getForEntity("http://EMAIL-SERVICE/email/"+bugvo.getEmailAddress(),String.class);
	System.out.println("result::"+result.getBody());
	java.sql.Date createdDate= new java.sql.Date(Calendar.getInstance().getTime().getTime());
	bugvo.setCreatedDate(createdDate);
	bugRepository.save(bugvo);
	}

public BugVO getBugVO(Integer id)
{
	Optional<BugVO> bugVO=bugRepository.findById(id);
	if(bugVO.isPresent()) {
		System.out.println("value present");
	}
	return bugVO.get();
}
}
