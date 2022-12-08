package com.niit.jdp.BEJ_C2_S3_REST_API_MONGODB_PC_1.proxy;

import com.niit.jdp.BEJ_C2_S3_REST_API_MONGODB_PC_1.domain.Customer;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@FeignClient(name ="customer-service",url ="customer-service:8086")
public interface CustomerProxy {
    @PostMapping("/userservice/register/")
    public ResponseEntity<?> saveUser(@RequestBody Customer customeruser);

}
