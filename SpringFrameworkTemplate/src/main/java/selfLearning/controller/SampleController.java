package selfLearning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {

	@RequestMapping("/home")
	public String home() {
		System.out.println("Inside SampleController -> home() ");
		return "home";
	}
}
