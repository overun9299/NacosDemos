package soap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created by ZhangPY on 2020/4/6
 * Belong Organization OVERUN-9299
 * overun9299@163.com
 * Explain:
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class TwoApp {

    public static void main(String[] args) {
        SpringApplication.run(TwoApp.class , args);
    }
}
