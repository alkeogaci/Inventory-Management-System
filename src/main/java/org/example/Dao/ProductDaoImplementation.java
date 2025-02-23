package org.example.Dao;

import org.example.Configuration.HibernateConfiguration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.example.Entity.Product;
import org.hibernate.Transaction;

import java.util.List;

public class ProductDaoImplementation implements ProductDao {

    private final SessionFactory sessionFactory;

    public ProductDaoImplementation(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void save(Product product) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(product);
            transaction.commit();
        }
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Product> findAll() {
        return List.of();
    }

    @Override
    public Product findById(Long id) {
        return null;
    }
}
