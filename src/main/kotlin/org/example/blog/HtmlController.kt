package org.example.blog

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.ui.Model
import org.springframework.ui.set

@Controller
class HtmlController{
	
	@GetMapping("/")
	fun blog(model: Model): String {
		model["title"] = "My Blog"
		return "blog"
	}
}