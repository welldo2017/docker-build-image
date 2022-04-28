package registry.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author:welldo
 * date: 2022-02-18 13:19
 */
@RestController
public class TestController {


    @RequestMapping("/test")
    public String test(){
        return "test-success";
    }

    @RequestMapping("/")
    public String index(){
        return "index -ok";
    }
}
