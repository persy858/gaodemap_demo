package gaode_map_demo.gaode.map.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MapController {

	  @RequestMapping("/sign")
	    public String login(){
		   
	        return "map_sign";
	    }
	  
	  @RequestMapping("/demo")
	    public String demo(){
		   
	        return "map_demo";
	    }
	  
	  
	  @RequestMapping("/busy")
	    public String busy_loading(){
		   
	        return "busy_loading";
	    }
	  
	  @RequestMapping("/card")
	    public String card_demo(){
		   
	        return "card_demo";
	    }
	  
	  @RequestMapping("/card2")
	    public String card_demo2(){
		   
	        return "card_demo2";
	    }
	  @RequestMapping("/bank_index")
	    public String bank_index_demo(){
		   
	        return "bank_index_demo";
	    }
	  
	  @RequestMapping("/nowui_form")
	    public String nowui_form(){
		   
	        return "nowui_form";
	    }

	  @RequestMapping("/adminlte_demo")
	    public String adminlte_demo(){
		   
	        return "adminlte_demo";
	    }
	  
}
