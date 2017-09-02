package nero.service.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class StartProvider {

    public static void main(String[] args) {
        SpringApplication.run(StartProvider.class, args);
    }

}
