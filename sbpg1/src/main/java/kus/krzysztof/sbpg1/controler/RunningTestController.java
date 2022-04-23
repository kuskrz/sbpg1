package kus.krzysztof.sbpg1.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RunningTestController {
	@GetMapping(value = "/test")
	public String test(Model model) {
		model.addAttribute("message", "This is test entry point");
		return "test";
	}
}