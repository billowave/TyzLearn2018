package test.just.hibernate.webs;

import org.hibernate.*;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.*;


public class UserDao {

    public static int save(User u) {
        int i = 0;

        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure("/test/just/hibernate/webs/hibernate.cfg.xml").build();
        // 2. ���ݷ���ע���ഴ��һ��Ԫ������Դ����ͬʱ����Ԫ���ݲ�����Ӧ��һ��Ψһ�ĵ�session����
        SessionFactory sessionFactory = new MetadataSources(registry)
                .buildMetadata().buildSessionFactory();


        Session session = sessionFactory.openSession();// �ӻỰ������ȡһ��session
        Transaction t = session.beginTransaction();
        i = (Integer) session.save(u);
        t.commit();
        session.close();

        System.out.println(u.getName());
        return i;
    }
}