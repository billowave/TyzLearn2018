package test.just.hibernate.annotation;

import org.hibernate.*;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.*;

public class TestAnoHibernate {
    public static void main(String[] args) {
        //Session session = new AnnotationConfiguration().configure().buildSessionFactory().openSession();
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure("/test/just/hibernate/annotation/hibernate.cfg.xml")
                .build();
        // 2. ���ݷ���ע���ഴ��һ��Ԫ������Դ����ͬʱ����Ԫ���ݲ�����Ӧ��һ��Ψһ�ĵ�session����
        SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();

        /**** ����������׼�������濪ʼ���ǵ����ݿ���� ******/
        Session session = sessionFactory.openSession();// �ӻỰ������ȡһ��session
        Transaction t = session.beginTransaction();

        AnoStudent e1 = new AnoStudent();
        e1.setId(1001);
        e1.setFirst_name("Yii");
        e1.setLast_name("Bai");
        e1.setMarks(88);

        AnoStudent e2 = new AnoStudent();
        e2.setId(1002);
        e2.setFirst_name("Min");
        e2.setLast_name("Su");
        e2.setMarks(99);

        session.persist(e1);
        session.persist(e2);

        t.commit();
        session.close();
        System.out.println("successfully saved");
    }
}