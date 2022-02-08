package in.nareshit.raghu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import in.nareshit.raghu.entity.Specialization;
import in.nareshit.raghu.service.ISpecializationService;

@Controller
@RequestMapping("/spec")
public class SpecializationController {

	@Autowired
	private ISpecializationService service;//HAS-A
	
	//1. Show Register Page
	@GetMapping("/register")
	public String showReg() {
		return "SpecializationRegister";
	}
	
	//2. save
	@PostMapping("/save")
	public String save(
			//reading Form data
			@ModelAttribute Specialization specialization,
			Model model
			)
	{
		//calling service
		Long id = service.saveSpecialization(specialization);
		
		//creating message 
		String message = "SPECIALIZATION '"+id+"' CREATED";
		
		//sending message to UI
		model.addAttribute("message", message);
		
		//goto FORM Page
		return "SpecializationRegister";
	}
	
	//3. fetch and display
	
	//4. remove
	
	//5. show edit page
	
	//6. update data
	
	
}
