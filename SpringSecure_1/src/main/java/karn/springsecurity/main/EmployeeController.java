package karn.springsecurity.main;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import karn.springsecurity.services.EmployeeManager;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeManager manager;

	@RequestMapping(value = "/getAllEmployees", method = RequestMethod.GET)
	public String getAllEmployees(Model model) {

		model.addAttribute("employees", manager.getAllEmployees());
		return "employeesListDisplay";
	}

	@RequestMapping(value = "/accessdenied", method = RequestMethod.GET)
	public String loginError(ModelMap modelMap) {
		modelMap.addAttribute("error", "true");
		return "denied";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpServletRequest request, HttpServletResponse response) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null) {
			new SecurityContextLogoutHandler().logout(request, response, auth);
			request.getSession().invalidate();
		}
		return "logout";
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String defaultPage(ModelMap map) {
		return "redirect:/default";
	}

	@RequestMapping(value = "/default", method = RequestMethod.GET)
	public String list(ModelMap map) {
		return "default";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(ModelMap map) {
		return "login";
	}
}
