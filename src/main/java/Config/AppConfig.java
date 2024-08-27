package Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import Service.MyServic;

@Configuration
public class AppConfig {
    @Bean
    public MyServic myservice(){
        return new MyServic();
    }

}
