package com.laoou.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//扫描
@ComponentScan("com.laoou.controller")
public class SpringMvcConfig {
}
