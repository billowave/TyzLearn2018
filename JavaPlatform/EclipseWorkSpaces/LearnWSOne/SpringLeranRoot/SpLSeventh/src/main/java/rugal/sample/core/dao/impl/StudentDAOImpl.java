package rugal.sample.core.dao.impl;

import lombok.extern.slf4j.Slf4j;
import ml.rugal.sshcommon.hibernate.HibernateBaseDao;
import org.springframework.stereotype.Repository;

import ga.rugal.sample.core.dao.StudentDAO;
import ga.rugal.sample.core.entity.Student;


/**
 *
 * @author Rugal Bernstein
 */
@Slf4j
@Repository
public class StudentDAOImpl extends HibernateBaseDao<Student, Integer> implements StudentDAO
{

    @Override
    protected Class<Student> getEntityClass()
    {
        return Student.class;
    }
}
