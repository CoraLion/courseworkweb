package ua.mk.cora.laba134.dao;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import ua.mk.cora.laba134.enities.UsersEntity;

import java.util.List;

@Stateless
public class UserDAO {
    @PersistenceContext
    private EntityManager em;

    public List<UsersEntity> findAll() {
        return em.createNamedQuery("Users.FindAll", UsersEntity.class).getResultList();
    }


}
