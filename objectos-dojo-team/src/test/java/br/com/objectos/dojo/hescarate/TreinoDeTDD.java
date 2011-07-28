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

    Racional cincoQuintos = new Racional(5, 5);
    assertEquals(cincoQuintos.toString(), "5/5");

  }

  public void qualquerObjetoRacionalToStringDeveImprimirFormaFracionaria() {

    Racional umQuinto = new Racional(1, 5);
    assertEquals(umQuinto.toString(), "1/5");

  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void objetoRacionalNaoDeveReceberInstanciaZero() {

    new Racional(100, 0);

  }

  public void objetoRacionalToStringDeveAdicionarCampoQueRetornaSoma() {

 Racional racional = new Racional(1,2);
 Racional racional2 = new Racional(1,3);
    
    racional.add(racional2); 
    
  }

  // supportando adição
  // definir public add method na classe Racional
  // que pega outro Racional como parâmetro
  // deve criar e adicionar um novo Racional que pega a soma

}
