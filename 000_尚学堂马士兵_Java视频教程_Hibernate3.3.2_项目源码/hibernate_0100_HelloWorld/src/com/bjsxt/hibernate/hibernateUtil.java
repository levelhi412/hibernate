package com.bjsxt.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 * @Author:jiexuan
 * @Description:
 * @Date: Created in 21:40 2017/12/2
 * @Modified By:
 */
public class hibernateUtil {

    public static Session getSession(){
        SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        return session;
    }



}
