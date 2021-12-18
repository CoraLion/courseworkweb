package ua.mk.cora.laba134.dao;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import ua.mk.cora.laba134.enities.HorseEntity;

import java.util.List;

@Stateless
public class HorseDAO {

    @PersistenceContext
    private EntityManager em;

    public List<HorseEntity> findAll() {
        return em.createNamedQuery("Horse.FindAll", HorseEntity.class).getResultList();
    }

    public List<HorseEntity> findEmpty() {
        String sc = "Not Rang";
        return em.createNamedQuery("Horse.FindClass", HorseEntity.class).setParameter("notrank", sc).getResultList();
    }

    public List<HorseEntity> findBreed() {
        String sc = "Not breed";
        return em.createNamedQuery("Horse.FindBreed", HorseEntity.class).setParameter("notbreed", sc).getResultList();
    }

    public List<HorseEntity> findByName(String name) {
        return em.createNamedQuery("Horse.FindByName", HorseEntity.class).setParameter("name", name).getResultList();
    }

    public List<HorseEntity> findTop() {
        return em.createNamedQuery("Horse.FindTop", HorseEntity.class).getResultList();
    }
}
