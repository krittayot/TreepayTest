/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neung.treepayTest.service;

import com.neung.treepayTest.facade.AbstractFacade;
import com.neung.treepayTest.vo.Promotion;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author neung
 */
@Stateless
@Path("com.neung.treepaytest.vo.promotion")
public class PromotionFacadeREST extends AbstractFacade<Promotion> {

  @PersistenceContext(unitName = "TreepayTestPU")
  private EntityManager em;

  public PromotionFacadeREST() {
    super(Promotion.class);
  }

  @POST
  @Override
  @Consumes({MediaType.APPLICATION_JSON})
  public void create(Promotion entity) {
    super.create(entity);
  }

  @PUT
  @Path("{id}")
  @Consumes({MediaType.APPLICATION_JSON})
  public void edit(@PathParam("id") Long id, Promotion entity) {
    super.edit(entity);
  }

  @DELETE
  @Path("{id}")
  public void remove(@PathParam("id") Long id) {
    super.remove(super.find(id));
  }

  @GET
  @Path("{id}")
  @Produces({MediaType.APPLICATION_JSON})
  public Promotion find(@PathParam("id") Long id) {
    return super.find(id);
  }

  @GET
  @Override
  @Produces({MediaType.APPLICATION_JSON})
  public List<Promotion> findAll() {
    return super.findAll();
  }

  @GET
  @Path("{from}/{to}")
  @Produces({MediaType.APPLICATION_JSON})
  public List<Promotion> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
    return super.findRange(new int[]{from, to});
  }

  @GET
  @Path("count")
  @Produces(MediaType.TEXT_PLAIN)
  public String countREST() {
    return String.valueOf(super.count());
  }

  @Override
  protected EntityManager getEntityManager() {
    return em;
  }

}
