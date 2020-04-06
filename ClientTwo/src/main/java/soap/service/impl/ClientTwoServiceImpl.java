package soap.service.impl;

import org.springframework.stereotype.Service;
import soap.service.ClientTwoService;

/**
 * Created by ZhangPY on 2020/4/6
 * Belong Organization OVERUN-9299
 * overun9299@163.com
 * Explain:
 */
@Service
public class ClientTwoServiceImpl implements ClientTwoService {
    @Override
    public String ClinetTwoSpecialMethod() {

        return "客户端Two特有方法";
    }
}
