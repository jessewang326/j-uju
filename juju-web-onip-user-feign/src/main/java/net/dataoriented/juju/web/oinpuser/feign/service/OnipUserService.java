package net.dataoriented.juju.web.oinpuser.feign.service;

import net.dataoriented.juju.web.oinpuser.feign.service.hystrix.OinpUserServiceHystrix;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="JUJU-OINP-USER", fallback = OinpUserServiceHystrix.class)
@Qualifier("FeignService")
public interface OnipUserService {

    @RequestMapping(value = "hi", method = RequestMethod.GET)
    String sayHi(@RequestParam(value = "message") String message);
}
