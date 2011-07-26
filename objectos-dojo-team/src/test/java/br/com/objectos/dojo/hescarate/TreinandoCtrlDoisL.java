/*
 * TreinandoCtrlDoisL.java criado em 25/07/2011
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
public class TreinandoCtrlDoisL {

  public void treinandoCtrlDoisLAtribuindoValor() {

    Integer testevalor = Integer.valueOf("101010111", 2);
    assertEquals(testevalor.intValue(), 343);
  }

  public void treinandoCtrlDoisLUsandoValueOf() {

    Integer variavelteste = Integer.valueOf("101011", 2);
    assertEquals(variavelteste.intValue(), 43);

  }

  public void treinandoCtrlDoisLUsandoBibliotecaMathPi() {

    Double testemath = new Double(Math.PI);
    assertEquals(testemath.doubleValue(), 3.141592653589793);

  }

  public void treinandoCtrlDoisLBibliotecaMathRound() {

    Double arredonda = new Double(Math.PI);
    assertEquals(Math.round(arredonda.doubleValue()), 3);

  }

  public void treinandoCtrlDoisLUsandoBibliotecaMathRaizQuadrada() {

    Integer raizquadrada = new Integer(121);
    assertEquals(Math.sqrt(raizquadrada.intValue()), 11.0);

  }

  public void treinandoCtrlDoisLUsandoBibliotecaMathHipotenusa() {

    Double hipotenusa = new Double(Math.hypot(3.0, 4.0));
    assertEquals(hipotenusa.doubleValue(), 5.0);

  }

}
