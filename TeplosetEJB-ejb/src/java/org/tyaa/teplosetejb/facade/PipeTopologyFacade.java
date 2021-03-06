/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.facade;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.tyaa.teplosetejb.entity.Pipe;
import org.tyaa.teplosetejb.entity.PipeEntry;
import org.tyaa.teplosetejb.entity.PipeTopology;

/**
 *
 * @author yurii
 */
@Stateless
public class PipeTopologyFacade extends AbstractFacade<PipeTopology> {

    @PersistenceContext(unitName = "TeplosetEJB-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PipeTopologyFacade() {
        super(PipeTopology.class);
    }
    
    /* Добавленные методы */
    
    public PipeTopology findByPipecode(Pipe _pipecode) {
        
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery cq = cb.createQuery();
        Root<PipeTopology> pipeTopologyRoot = cq.from(PipeTopology.class);
        
        List<Predicate> predicateList = new ArrayList<>();
        predicateList.add(cb.equal(pipeTopologyRoot.get("pipecode"), _pipecode));
        
        predicateList.add(
                cb.or(
                    cb.isNull(pipeTopologyRoot.<Date>get("enddate"))
                    , cb.greaterThanOrEqualTo(pipeTopologyRoot.<Date>get("enddate"), new Date())
                )
        );
        
        cq.select(pipeTopologyRoot).where(predicateList.toArray(new Predicate[]{}));
        TypedQuery<PipeTopology> q = em.createQuery(cq);
        
        return q.getResultList().get(0);
    }
    
    public List<PipeTopology> findByPipecode2(Pipe _ownerPipecode) {
        
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery cq = cb.createQuery();
        Root<PipeTopology> pipeTopologyRoot = cq.from(PipeTopology.class);
        
        List<Predicate> predicateList = new ArrayList<>();
        predicateList.add(cb.equal(pipeTopologyRoot.get("pipecode"), _ownerPipecode));
        //predicateList.add(cb.equal(pipeEntryRoot.get("pipeLevel"), 30));
        
        cq.select(pipeTopologyRoot).where(predicateList.toArray(new Predicate[]{}));
        //cq.orderBy(cb.asc(pipeTopologyRoot.get("pipeObject")));
        TypedQuery<PipeTopology> q = em.createQuery(cq);
                
        return q.getResultList();
    }
}
