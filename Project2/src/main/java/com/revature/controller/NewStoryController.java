package com.revature.controller;

import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.revature.beans.Board;
import com.revature.beans.ScrumUser;
import com.revature.beans.Story;
import com.revature.service.AppService;

@Controller
public class NewStoryController {
	@Autowired
	AppService service;
	
	@RequestMapping(value = "/newStory", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Story> addBoard(Story newStory, HttpServletRequest request) {
		return new ResponseEntity<Story>(service.addNewStory(newStory), HttpStatus.OK);
	}
}
