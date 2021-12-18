package ua.mk.cora.laba134.dao;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import ua.mk.cora.laba134.enities.UsersEntity;
import ua.mk.cora.laba134.enities.WorkersEntity;

import java.util.List;

@Stateless
public class WorkersDAO {

    @PersistenceContext
    private EntityManager em;

    public List<WorkersEntity> findSch() {
        return em.createNamedQuery("Workers.FindSch", WorkersEntity.class).getResultList();
    }

    public List<WorkersEntity> findOneTrain() {
        return em.createNamedQuery("Workers.findOneTrain", WorkersEntity.class).getResultList();
    }
    public List<WorkersEntity> findTwoTrain() {
        return em.createNamedQuery("Workers.findTwoTrain", WorkersEntity.class).getResultList();
    }
    public List<WorkersEntity> findThreeTrain() {
        return em.createNamedQuery("Workers.findThreeTrain", WorkersEntity.class).getResultList();
    }
    public List<WorkersEntity> findFourTrain() {
        return em.createNamedQuery("Workers.findFourTrain", WorkersEntity.class).getResultList();
    }

    public List<WorkersEntity> findAll() {
        return em.createNamedQuery("Workers.findAll", WorkersEntity.class).getResultList();
    }
}
