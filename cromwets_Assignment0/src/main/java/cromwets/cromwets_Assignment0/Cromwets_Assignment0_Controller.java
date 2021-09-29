package cromwets.cromwets_Assignment0;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//http://127.0.0.1:8080/index

@Controller
public class Cromwets_Assignment0_Controller {

	@RequestMapping("/index")
	public String index() {
		return "index";
	}

}
