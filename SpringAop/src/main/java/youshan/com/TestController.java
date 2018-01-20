package youshan.com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by syou on 2018/1/16.
 */
@Controller
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/list")
    ModelAndView modelAndView() {

        System.out.println("我来了...");
        ModelAndView mv = new ModelAndView();
        mv.addObject("user","youshan");
        mv.setViewName("index");
        print();
        return mv;
    }

    @RequestMapping("/print")
    public String print(){
        System.out.println("执行.....");
        return "index";
    }
}
