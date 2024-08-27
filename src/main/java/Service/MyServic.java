package Service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Configuration
@Service
public class MyServic {
    @Bean
    public int show1(){
        System.out.println("Hey My Service !!!");
        return 0;
    }
}
