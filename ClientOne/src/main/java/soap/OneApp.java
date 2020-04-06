package soap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by ZhangPY on 2020/4/6
 * Belong Organization OVERUN-9299
 * overun9299@163.com
 * Explain:
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class OneApp {

    public static void main(String[] args) {
        SpringApplication.run(OneApp.class , args);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
