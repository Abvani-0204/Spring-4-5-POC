package com.ab.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ab.model.WebServiceModel;
import com.ab.service.RegistrationService;

@Controller
public class RegistrationController {

	@Autowired
	private RegistrationService registrationService;

	@RequestMapping(value = "/registration", method = { RequestMethod.GET, RequestMethod.POST })
	public String registration(@ModelAttribute("webModel") WebServiceModel webModel, HttpServletRequest request,
			Model model) {

		if ((request.getMethod()).equalsIgnoreCase("GET")) {
			model.addAttribute("webModel", webModel);
			return "registration";
		} else {
			registrationService.saveRecordService(webModel);
			model.addAttribute("webModel", new WebServiceModel());
			return "registration";
		}

	}
}
