package net.dataoriented.juju.web.oinpuser.feign.service.hystrix;

import net.dataoriented.juju.web.oinpuser.feign.service.OnipUserService;
import org.springframework.stereotype.Component;

@Component
public class OinpUserServiceHystrix implements OnipUserService{

    @Override
    public String sayHi(String message) {
        return "Hi，your message is :\"" + message + "\" but request error.";
    }
}
