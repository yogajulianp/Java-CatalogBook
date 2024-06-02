package com.risenamaweb;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.risenameweb.domain.Author;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //Author author = new Author(); //tanggung jawab pembuatan objek dan pengelolaan daur hidupnya di programmer
    
        ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("application-context.xml");
        Author author = (Author) appContext.getBean("author");
        System.out.println("author id "+ author.getId());
        System.out.println("author nama "+ author.getName());
        System.out.println("author tanggal lahir "+ author.getBirthDate());
    }
}
