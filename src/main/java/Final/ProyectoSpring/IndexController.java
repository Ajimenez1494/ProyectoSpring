package Final.ProyectoSpring;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller

public class IndexController {
	@GetMapping("/index")
	    public String index(Model model) {
        model.addAttribute("tstamp", LocalDateTime.now());
	        return "index.html";
	    }
	
	@GetMapping("/index2")
    public String index2(Model model) {
    model.addAttribute("tstamp", LocalDateTime.now());
        return "index2.html";
    }
}
