package soap.service.impl;

import org.springframework.stereotype.Service;
import soap.service.ClientOneService;

/**
 * Created by ZhangPY on 2020/4/6
 * Belong Organization OVERUN-9299
 * overun9299@163.com
 * Explain:
 */
@Service
public class ClientOneServiceImpl implements ClientOneService {


    @Override
    public String ClinetOneSpecialMethod() {
        return "客户端One特有方法";
    }
}
