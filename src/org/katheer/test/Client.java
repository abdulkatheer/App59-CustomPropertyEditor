package org.katheer.test;

import org.katheer.bean.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        /*
        Custom Property Editor - Dev can define how a data should be parsed
        for a particular type of object.

        For ex, if I have address class with five different properties, I can
         get a single string with all property values with some separator
         (like comma or hifen) from the user or app context file and I can
         split them and create an Address object and then return that address
          object to the respective bean.

          We are specifying how a text should be parsed for a particular type
           of object.
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("org" +
                "/katheer/resource/applicationContext.xml");
        Student student = (Student) context.getBean("student");
        student.printStudentDetails();
    }
}
