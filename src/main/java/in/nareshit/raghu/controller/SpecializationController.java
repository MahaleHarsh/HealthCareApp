package in.nareshit.raghu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	@GetMapping("/all")
	public String showData(Model model) {
		//call service
		List<Specialization> list = service.getAllSpecializations();
		//send data to UI
		model.addAttribute("list", list);
		
		//goto HTML Page
		return "SpecializationData";
	}
	
	
	//4. remove
	@GetMapping("/delete")
	public String delete(
			@RequestParam Long id
			) 
	{
		service.deleteSpecialization(id);
		return "redirect:all";
	}
	
	//5. show edit page
	@GetMapping("/edit")
	public String showEdit(
			@RequestParam Long id,
			Model model
			) 
	{
		//call service
		Specialization obj =  service.getOneSpecialization(id);
		//send data to UI
		model.addAttribute("specialization", obj);
		//Goto Edit HTML Page
		return "SpecializationEdit";
	}
	
	//6. update data
	
	
}
