package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
      
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
       Employee emp=context.getBean("emp", Employee.class);
       System.out.println(emp);
       
        
    }
}