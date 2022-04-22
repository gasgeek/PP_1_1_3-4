/*
package jm.task.core.jdbc.dao;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import java.util.ArrayList;
import java.util.List;

public class UserDaoHibernateImpl implements UserDao {
    private final SessionFactory sessionFactory;
    public UserDaoHibernateImpl() {
        sessionFactory = Util.createHibernateSessionFactory();
    }
    @Override
    public void createUsersTable() {
        String SQL = "CREATE TABLE IF NOT EXISTS users"
                + "(id INT(5) NOT NULL AUTO_INCREMENT,"
                + " name VARCHAR(50) NOT NULL, "
                + " lastName VARCHAR(50) NOT NULL, "
                + " age INT NOT NULL, " + "PRIMARY KEY(id))";
        Transaction transaction = null;
        try (Session session = sessionFactory.getCurrentSession()) {
            transaction = session.beginTransaction();
            session.createSQLQuery(SQL)
                    .addEntity(User.class)
                    .executeUpdate();
            transaction.commit();
            System.out.println("Table has created");
        } catch (HibernateException e) {
            if (transaction != null) {
                transaction.rollback();
            }
            System.out.println("Exception due creating user table");
        }
    }
    @Override
    public void dropUsersTable() {
        String SQL = "DROP TABLE IF EXISTS users";
        Transaction transaction = null;
        try (Session session = sessionFactory.getCurrentSession()) {
            transaction = session.beginTransaction();
            session.createSQLQuery(SQL)
                    .addEntity(User.class)
                    .executeUpdate();
            transaction.commit();
            System.out.println("Table has dropped");
        } catch (HibernateException e) {
            if (transaction != null) {
                transaction.rollback();
            }
            System.out.println("Exception due table dropping");
        }
    }
    @Override
    public void saveUser(String name, String lastName, byte age) {
        User user = new User(name, lastName, age);
        Transaction transaction = null;
        try (Session session = sessionFactory.getCurrentSession()) {
            transaction = session.beginTransaction();
            session.save(user);
            transaction.commit();
            System.out.println("User with " + user.getName() + " has saved");
        } catch (HibernateException e) {
            if (transaction != null) {
                transaction.rollback();
            }
            System.out.println("Exception due user saving");
        }
    }
    @Override
    public void removeUserById(long id) {
        Transaction transaction = null;
        try (Session session = sessionFactory.getCurrentSession()) {
            transaction = session.beginTransaction();
            User user = session.get(User.class, id);
            session.delete(user);
            */
/*System.out.println("User with id " + user.getId() + " was removed");*//*

            transaction.commit();
        } catch (HibernateException e) {
            if (transaction != null) {
                transaction.rollback();
            }
            System.out.println("Exception due removing user by ID");
        }
    }
    @Override
    public List<User> getAllUsers() {
        List<User> userArrayList = new ArrayList<>();
        Transaction transaction = null;
        try (Session session = sessionFactory.getCurrentSession()) {
            transaction = session.beginTransaction();
            userArrayList = session.createQuery("from User").getResultList();
            transaction.commit();
        } catch (HibernateException e) {
            System.out.println("Exception due getting all users");
            if (transaction != null) {
                transaction.rollback();
            }
        }
        return userArrayList;
    }
    @Override
    public void cleanUsersTable() {
        String SQL = "TRUNCATE TABLE users";
        Transaction transaction = null;
        try (Session session = sessionFactory.getCurrentSession()) {
            transaction = session.beginTransaction();
            session.createSQLQuery(SQL)
                    .executeUpdate();
            System.out.println("Table has truncated");
            transaction.commit();
        } catch (HibernateException e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}*/
