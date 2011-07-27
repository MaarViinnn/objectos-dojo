/*
 * TreinoDeTDD.java criado em 27/07/2011
 * 
 * Propriedade de Objectos Fábrica de Software LTDA.
 * Reprodução parcial ou total proibida.
 */
package br.com.objectos.dojo.hescarate;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

/**
 * @author hellen.escarate@objectos.com.br (Hellen Escarate)
 */
@Test
public class TreinoDeTDD {

  public void objetoRacionalToStringDeveImprimirFormaFracionaria() {

    Racional cincoQuintos = new Racional(3, 5);
    assertEquals(cincoQuintos.toString(), "3/5");

  }

  public void qualquerObjetoRacionalToStringDeveImprimirFormaFracionaria() {

    Racional umQuinto = new Racional(8, 10);
    assertEquals(umQuinto.toString(), "8/10");

  }

}
