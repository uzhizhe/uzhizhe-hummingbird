package com.uzhizhe.hummingbird;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author qingjiang.li
 * @since 2019-07-03 1:40 PM
 */
@SpringBootApplication
@Slf4j
public class HummingbirdWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(HummingbirdWebApplication.class, args);
        log.info("Hummingbird web application successful ...");
    }

}
