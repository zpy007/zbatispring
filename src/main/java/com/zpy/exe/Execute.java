package com.zpy.exe;

import com.zpy.dao.ClientsMapper;
import com.zpy.service.ServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;


public class Execute {

    public void doExecute(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-config.xml");
        //ServiceImpl impl = context.getBean("serviceImpl",ServiceImpl.class);
        //impl.doService();
        ClientsMapper mapper=(ClientsMapper) context.getBean("clientsMapper");
        HashMap map=mapper.selectClient("150404198209020915");
        System.out.println(map);
    }

    public static void main(String[] args){
        Execute e = new Execute();
        e.doExecute();
    }
}
