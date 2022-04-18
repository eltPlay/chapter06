package com.wjw.test;

import com.wjw.po.Orders;
import com.wjw.po.Person;
import com.wjw.po.User;
import com.wjw.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.Test;


/**
 * Mybatis������ѯӳ�������
 */
public class MybatisAssociatedTest {
    /**
     * Ƕ�ײ�ѯ
     */
    @Test
    public void findPersonByIdTest() {
        //1��ͨ������������SqlSession����
        SqlSession session = MybatisUtils.getSession();
        //2��ʹ��MyBatisǶ�ײ�ѯ�ķ�ʽ��ѯidΪ1���˵���Ϣ
        Person person = session.selectOne("com.wjw.mapper.PersonMapper.findPersonById", 1);
        //3�������ѯ�����Ϣ
        System.out.println(person.getName());
        //4���ر�SqlSession
        session.close();
    }

    /**
     * Ƕ�׽��
     */
    @Test
    public void findPersonById2Test() {
        //1��ͨ������������SqlSession����
        SqlSession session = MybatisUtils.getSession();
        //2��ʹ��MyBatisǶ�ײ�ѯ�ķ�ʽ��ѯidΪ1���˵���Ϣ
        Person person = session.selectOne("com.wjw.mapper.PersonMapper.findPersonById2", 1);
        //3�������ѯ�����Ϣ
        System.out.println(person);
        //4���ر�SqlSession
        session.close();
    }

    /**
     * һ�Զ�
     * Ƕ�׽��
     */
    @Test
    public void findUserTest() {
        //1��ͨ������������SqlSession����
        SqlSession session = MybatisUtils.getSession();
        //2����ѯidΪ1���û���Ϣ
        User user = session.selectOne("com.wjw.mapper.UserMapper.findUserWithOrders", 1);
        //3�������ѯ�����Ϣ
        System.out.println(user);
        //4���ر�SqlSession
        session.close();
    }

    /**
     * ��Զ�
     * Ƕ�׽��
     */
    @Test
    public void findOrdersTest() {
        //1��ͨ������������SqlSession����
        SqlSession session = MybatisUtils.getSession();
        //2����ѯidΪ1�Ķ�������Ʒ��Ϣ
        Orders orders = session.selectOne("com.wjw.mapper.OrdersMapper.findOrdersWithProduct", 1);
        //3�������ѯ�����Ϣ
        System.out.println(orders);
        //4���ر�SqlSession
        session.close();
    }

    /**
     * ��Զ�
     * Ƕ�׽��
     */
    @Test
    public void findOrders2Test() {
        //1��ͨ������������SqlSession����
        SqlSession session = MybatisUtils.getSession();
        //2����ѯidΪ1�Ķ�������Ʒ��Ϣ
        Orders orders = session.selectOne("com.wjw.mapper.OrdersMapper.findOrdersWithProduct2", 1);
        //3�������ѯ�����Ϣ
        System.out.println(orders);
        //4���ر�SqlSession
        session.close();
    }
}
