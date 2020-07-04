package com.test;

import com.example.domain.Person;
import com.example.domain.School;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class BaseTest {

    @Autowired
    private Person person;

    @Autowired
    private School school;

    @Test
    public void test1(){
        System.out.println(person);
    }

    @Test
    public void test2(){
        System.out.println(school);
    }
}
