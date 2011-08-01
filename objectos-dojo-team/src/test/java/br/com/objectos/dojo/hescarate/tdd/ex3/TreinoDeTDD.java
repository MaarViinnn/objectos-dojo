/*
 * TreinoDeTDD.java criado em 01/08/2011
 * 
 * Propriedade de Objectos Fábrica de Software LTDA.
 * Reprodução parcial ou total proibida.
 */
package br.com.objectos.dojo.hescarate.tdd.ex3;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

/**
 * @author hellen.escarate@objectos.com.br (Hellen Escarate)
 */
@Test
public class TreinoDeTDD {

  public void objetoRacionalToStringDeveImprimirFormaFracionaria() {

    Racional umQuinto = new Racional(1, 5);
    assertEquals(umQuinto.toString(), "1/5");

  }

}
