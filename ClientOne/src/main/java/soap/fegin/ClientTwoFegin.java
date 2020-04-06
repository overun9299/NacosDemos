package soap.fegin;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by ZhangPY on 2020/4/6
 * Belong Organization OVERUN-9299
 * overun9299@163.com
 * Explain:
 */
@FeignClient(value = "Nacos-ClientTwo" ,path = "/two")
public interface ClientTwoFegin {

    @GetMapping(value = "/oneself")
    String ClinetTwoSpecialMethod();
}
