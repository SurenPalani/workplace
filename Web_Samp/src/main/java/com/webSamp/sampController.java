package com.webSamp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class sampController {

	@RequestMapping ("samp")
	/* public ModelAndView samp(String name, HttpSession session) */
	public ModelAndView samp(UserDetails ud)
	{
		/*
		 * HttpSession session = request.getSession(); String s =
		 * request.getParameter("name");
		 */
		ModelAndView mav = new ModelAndView();
		mav.addObject("Details", ud);
		mav.setViewName("samp");
		return mav;
		/*
		 * session.setAttribute("UserName", name);
		 * 
		 * return "samp";
		 */
	}
}
