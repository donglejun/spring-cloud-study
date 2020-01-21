package com.dlj.conf;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ResourceController {
    private final static String DEFAULT_NAME = "xuan";
    private static final String DEFAULT_SERVICE_ID = "application";
    private static final String DEFAULT_PORT = "8013";

    @RequestMapping(value = "/user/{userId}", method = RequestMethod.GET)
    public UserEntity getUserByUserId(@PathVariable("userId") String userId) {
        log.info("根据用户主键获取用户信息:{}", userId);
        return new UserEntity(userId);
    }
    @RequestMapping(value = "instance/{serviceId}",method = RequestMethod.GET)
    public Object instance(@PathVariable("serviceId")String serviceId){

        return serviceId;
    }

}
