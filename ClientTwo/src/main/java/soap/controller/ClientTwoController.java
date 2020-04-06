package soap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import soap.service.ClientTwoService;

/**
 * Created by ZhangPY on 2020/4/6
 * Belong Organization OVERUN-9299
 * overun9299@163.com
 * Explain:
 */
@RestController
public class ClientTwoController {

    @Autowired
    private ClientTwoService clientTwoService;

    @GetMapping(value = "/oneself")
    public String invokOneselfMehtod() {
        return "客户端Two通过自身调用自己的-"+clientTwoService.ClinetTwoSpecialMethod();
    }
}
