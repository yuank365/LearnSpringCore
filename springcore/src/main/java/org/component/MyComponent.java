package org.component;

import org.springframework.stereotype.Component;

/**
 * @Author yuank
 * @Package org.bean
 * @Date 2024/8/1 15:11
 * @description: bean
 */

@Component
public class MyComponent {
    public void hello(){
        System.out.println("hello");
    }
}