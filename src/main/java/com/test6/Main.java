package com.test6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.test6")

class JavaConfig {}

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        Student student = context.getBean(Student.class);
        student.setName("홍길동");
        System.out.println(student.getName());
        Student student2 = context.getBean(Student.class);
        System.out.println(student2.getName());
    }
}
