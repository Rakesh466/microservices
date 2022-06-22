package com.bug.report;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BugController {
	@Autowired
	BugService bugService;
@PostMapping
public void createBug(@Valid @RequestBody BugVO bugvo) {
	System.out.println("Working:");
	bugService.createBug(bugvo);
}
@GetMapping("/{id}")
public BugVO getOrder(@PathVariable("id")Integer id) {
	System.out.println("getOrder");
	return bugService.getBugVO(id);
}
}
