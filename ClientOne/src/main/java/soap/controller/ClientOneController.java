package soap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import soap.fegin.ClientTwoFegin;
import soap.service.ClientOneService;

/**
 * Created by ZhangPY on 2020/4/6
 * Belong Organization OVERUN-9299
 * overun9299@163.com
 * Explain:
 */
@RestController
@RefreshScope
public class ClientOneController {

    @Autowired
    private ClientOneService clientOneService;

    @Autowired
    private ClientTwoFegin clientTwoFegin;

    @Autowired
    private RestTemplate restTemplate;

    @Value("${myName}")
    private String myName;

    @Value("${mark}")
    private String mark;

    @GetMapping(value = "/oneself")
    public String invokOneselfMehtod() {
        return "客户端One通过自身调用自己的-"+clientOneService.ClinetOneSpecialMethod()+myName+mark;
    }

    @GetMapping(value = "/otherself")
    public String invokOtherselfMehtod() {
        return "客户端One通过Fegin远程调用-"+clientTwoFegin.ClinetTwoSpecialMethod()+ "远程配置中心属性myName="+myName+"--mark="+mark;
    }

    @GetMapping(value = "/otherselfA")
    public String invokOtherselfAMehtod() {
        ResponseEntity<String> forEntity = restTemplate.getForEntity("http://localhost:9902/two/oneself", String.class);
        String body = forEntity.getBody();
        return "客户端One通过RestTemplate远程调用-"+body;
    }
}
