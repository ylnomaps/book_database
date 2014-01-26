package net46.andreasb.controller;

import java.util.Map;

import net46.andreasb.model.Student;
import net46.andreasb.service.StudentService;
import net46.andreasb.model.User;
import net46.andreasb.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/")
	public String setupForm(Map<String, Object> map){
		Student student = new Student();
		map.put("student", student);
		map.put("studentList", studentService.getAllStudent());
		return "student";
	}
	
	
	
	  @RequestMapping(value = "hi", method = RequestMethod.POST)
	  public String CRUDWebAppMavenized(@ModelAttribute String message, @RequestParam("name") String name, Model model) {
	    String message2 = "Hi " + name + "!";
	    model.addAttribute("message", message2);
	    return "hi";
	  }
	  @RequestMapping(value = "/Bucks/", method = RequestMethod.POST)
	  public String CRUD(@ModelAttribute String message, @RequestParam("name") String name, Model model) {
	    String message2 = "Hi " + name + "!";
	    model.addAttribute("message", message2);
	    return "/Bucks";
	
	  }
	  @RequestMapping(value = "login", method = RequestMethod.POST)
	  public String LOG(@ModelAttribute String name,@RequestParam("log") String log, Model model) {
		  User usr = new User();
		  String n =usr.getName();
		  String message2 = "Hi " + log + "!";
		  model.addAttribute("n", message2);
	    return "login";
	  }
	
	
	@RequestMapping(value="/student.do", method=RequestMethod.POST)
	public String doActions(@ModelAttribute Student student, BindingResult result, @RequestParam String action, Map<String, Object> map){
		Student studentResult = new Student();
		switch(action.toLowerCase()){	//only in Java7 you can put String in switch
		case "add":
			studentService.add(student);
			studentResult = student;
			break;
		case "edit":
			studentService.edit(student);
			studentResult = student;
			break;
		case "delete":
			studentService.delete(student.getBookID());
			studentResult = new Student();
			break;
		case "search":
			Student searchedStudent = studentService.getStudent(student.getBookID());
			studentResult = searchedStudent!=null ? searchedStudent : new Student();
			break;
		}
		map.put("student", studentResult);
		map.put("studentList", studentService.getAllStudent());
		return "student";
	}
}
