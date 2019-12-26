package info.devfield.springMVC;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	@RequestMapping("/")
	public String viewHomePage(Model theModel) {
		
		User theUser = new User();
		theModel.addAttribute("user", theUser);
		
		return "index";
	}
	
	@RequestMapping("/processForm")
	public String viewWelcomePage(@Valid @ModelAttribute("user") User theUser,
			BindingResult theBindingResult) {
		if( theBindingResult.hasErrors() ) {
			return "index";
		}
		else {
			return "welcome";
		}
		
	}
	
}
