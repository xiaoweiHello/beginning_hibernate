package com.xiaowei.hibernate.xml.test.chaptor03;

import com.xiaowei.hibernate.xml.pojo.Message;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import java.util.Iterator;
import java.util.List;

/**
 * @ClassName TestDemo
 * @Desciption TODO
 * @Author weizheng
 * @Date 2018/12/14 16:51
 **/
public class TestDemo {

    /**
     * 第一个hibernate实例
     * 编写中的问题：由于是maven项目，所以编译导致的结果是 src/main/java 下的配置文件无法被编译
     *      解决方法：1. 在pom文件的build --> resources --> resource --> includes --> include 中加上编译类型。
     *                2. 将所有配置文件写到 resources 中
     */
    @Test
    public void messageTest(){
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        List list = session.createQuery("from Message ").list();

        if (list != null && list.size() > 0) {
            System.out.println("res size = " + list.size());
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                Message message  = (Message) iterator.next();
                System.out.println(message);
            }
        }
    }
}
