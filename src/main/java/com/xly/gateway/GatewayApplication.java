package com.xly.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }

    //在这里我们使用@Bean注入 fastJsonHttpMessageConvert
    @RequestMapping("hi")
    public Integer hi(){
        int i=10;
        i = i-10;
        return i;
    }

   /* @Bean
    @Primary
    public CustomRedisRateLimiter customRedisRateLimiter(ReactiveRedisTemplate<String, String> redisTemplate,
                                                         @Qualifier(RedisRateLimiter.REDIS_SCRIPT_NAME) RedisScript<List<Long>> redisScript,
                                                         Validator validator) {
        return new CustomRedisRateLimiter(redisTemplate, redisScript, validator);
    }

    @Bean
    public RateLimiterGatewayFilterFactory rateLimiterGatewayFilterFactory(CustomRedisRateLimiter customRedisRateLimiter, CustomKeyResolver customKeyResolver) {
        return new RateLimiterGatewayFilterFactory(customRedisRateLimiter, customKeyResolver);
    }*/

}
