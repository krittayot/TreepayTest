/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neung.treepayTest.facade;

import com.neung.treepayTest.vo.Promotion;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author neung
 */
@Stateless
public class PromotionFacade extends AbstractFacade<Promotion> {

  @PersistenceContext(unitName = "TreepayTestPU")
  private EntityManager em;

  @Override
  protected EntityManager getEntityManager() {
    return em;
  }

  public PromotionFacade() {
    super(Promotion.class);
  }

}
