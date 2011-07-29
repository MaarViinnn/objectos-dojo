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

    Racional umTerco = new Racional(1, 3);
    assertEquals(umTerco.toString(), "1/3");

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

    Racional umMeio = new Racional(1, 2);
    Racional doisTercos = new Racional(2, 3);

    Racional resultado = umMeio.mais(doisTercos);
    assertEquals(resultado.toString(), "7/6");

    // funcionalidade do teste:
    // * se recebe a soma correta de dois números racionais

  }

  public void deveSerPossivelConstruirUmRacionalPassandoApenasUmInteiro() {

    Racional tres = new Racional(3);
    assertEquals(tres.toString(), "3/1");

  }

  public void deveRetornarEquivalenteNaFormaReduzida() {

    Racional onzeSetimos = new Racional(66, 42);
    assertEquals(onzeSetimos.toString(), "11/7");

  }

  public void deveRetornarNaFormaReduzidaMesmoParaValoresNegativos() {
    Racional onzeSetimosNegativo = new Racional(-66, 42);
    assertEquals(onzeSetimosNegativo.toString(), "-11/7");
  }

  public void multiplicacaoDeveFuncionarCorretamente() {

    Racional umMeio = new Racional(1, 2);
    Racional tresQuintos = new Racional(3, 5);

    Racional resultado = umMeio.vezes(tresQuintos);
    assertEquals(resultado.toString(), "3/10");

  }

  // supportando adição
  // definir public add method na classe Racional
  // que pega outro Racional como parâmetro
  // deve criar e adicionar um novo Racional que pega a soma

}
