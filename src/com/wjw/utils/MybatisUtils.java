package com.wjw.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * @author ����
 */
public class MybatisUtils {
    private static SqlSessionFactory sqlSessionFactory = null;

    //��ʼ��
    static {
        try {
            //ʹ��Mybatis�ṩ��Resource�����Mybatis�������ļ�
            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
            //����sqlSessionFactory����
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * ��ȡSqlSession����ľ�̬����
     */
    public static SqlSession getSession() {
        return sqlSessionFactory.openSession();
    }
}
