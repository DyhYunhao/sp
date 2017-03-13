package spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2017/3/13.
 */
@Controller
public class control1 {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String index1(ModelMap map){
        map.addAttribute("message","hello");
        return "index";
    }
}
