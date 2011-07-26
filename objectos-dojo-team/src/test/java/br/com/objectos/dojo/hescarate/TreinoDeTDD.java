/*
 * TreinoDeTDD.java criado em 26/07/2011
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
    Racional umSobreDois = new Racional(1, 2);
    assertEquals(umSobreDois.toString(), "1/2");
  }

  public void qualquerObjetoRacionalDeveImprimirFormaFracionaria() {

    Racional doisTercos = new Racional(2, 3);
    assertEquals(doisTercos.toString(), "2/3");

  }

}
