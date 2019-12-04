package com.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;

import com.example.vo.UserTest;
	/**
 * @author  作者 E-mail: 
 * @date 创建时间：2019年12月3日 上午11:31:48
 * @version 1.0 
 * @parameter 
 * @since  
 * @return  */
public class JPATest {
	
	 /**
     * 获取应用管理的EntityManager
     */
    @Test
    public void testApplicationEntityManager() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MyJPA");
        EntityManager em = entityManagerFactory.createEntityManager();
        //开启事务
        em.getTransaction().begin();
        UserTest user = new UserTest();
        user.setName("hly");
        //以上两行为新建状态
        //托管状态，执行保存
        em.persist(user);
        //事务提交或调用flush()方法后会同步到数据库
        em.getTransaction().commit();
        //根据主键获取对象
        //System.err.println(em.find(User.class,1));
        //System.err.println(em.getReference(User.class,1));
        // 释放资源
        em.close();
        entityManagerFactory.close();
    }
}
