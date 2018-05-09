/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.teplosetejb.facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.tyaa.teplosetejb.entity.DocF2Mb;

/**
 *
 * @author yurii
 */
@Stateless
public class DocF2MbFacade extends AbstractFacade<DocF2Mb> {

    @PersistenceContext(unitName = "TeplosetEJB-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DocF2MbFacade() {
        super(DocF2Mb.class);
    }
    
}
