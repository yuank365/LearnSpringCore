package org.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author yuank
 * @Package org.configuration
 * @Date 2024/8/1 15:31
 * @description: configuration
 */
@Configuration
@ComponentScan(basePackages = "org.component")
public class MyConfig {
}