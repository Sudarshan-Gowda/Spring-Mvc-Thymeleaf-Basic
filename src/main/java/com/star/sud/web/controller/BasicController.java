/*@author
 *  Sudarshan Gowda*/

package com.star.sud.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BasicController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String displayText(Model model) {

		model.addAttribute("message", "Welcome to Spring ThymeLeaf Basic Example....");

		return "template/hello-world";
	}

}
