package Controller;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import Service.MyServic;


@Controller
// @Component
public class MyController {
    private final MyServic myservice;

    @Autowired

    public MyController(MyServic myservice){
        this.myservice = myservice;
    }
    @Qualifier
    public void show(){
        myservice.show1();
    }
}
