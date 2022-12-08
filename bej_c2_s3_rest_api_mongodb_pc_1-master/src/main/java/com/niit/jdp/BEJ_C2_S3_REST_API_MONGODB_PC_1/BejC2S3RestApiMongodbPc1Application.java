package com.niit.jdp.BEJ_C2_S3_REST_API_MONGODB_PC_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class BejC2S3RestApiMongodbPc1Application {

    public static void main(String[] args) {
        SpringApplication.run(BejC2S3RestApiMongodbPc1Application.class, args);
    }

}
