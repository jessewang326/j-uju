package net.dataoriented.juju.web.oinpuser.feign.Controller;

import net.dataoriented.juju.web.oinpuser.feign.service.OnipUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OinpUserController {

    @Autowired
    @Qualifier("FeignService")
    private OnipUserService userService;

    @RequestMapping(value = "hi", method = RequestMethod.GET)
    public String sayHi(String message) {
        return userService.sayHi(message);
    }
}
