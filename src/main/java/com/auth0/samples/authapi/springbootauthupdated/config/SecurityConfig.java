package com.auth0.samples.authapi.springbootauthupdated.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author MA Motyim <mohamed.motyim@gmail.com>
 * @see <www.motyim.me>
 * @since 10/28/2018
 */
@Configuration
public class SecurityConfig {

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
