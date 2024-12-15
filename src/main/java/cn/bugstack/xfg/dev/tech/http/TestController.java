package cn.bugstack.xfg.dev.tech.http;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test/")
public class TestController {

    /**
     * http://localhost:8099/api/test/hi
     * @return
     */
    @GetMapping("hi")
    public String hi(){
        return "hi security";
    }
}
