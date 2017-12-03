package com.bjsxt.hibernate;

import org.hibernate.Session;

/**
 * @Author:jiexuan
 * @Description:
 * @Date: Created in 21:35 2017/12/2
 * @Modified By:
 */
public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.setId(3);
        student.setName("jiexuan");
        student.setAge(28);

        Session session = hibernateUtil.getSession();
        session.beginTransaction();
        session.save(student);
        session.getTransaction().commit();


    }




}
