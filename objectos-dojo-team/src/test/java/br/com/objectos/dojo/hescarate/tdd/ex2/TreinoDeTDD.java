/*
 * TreinoDeTDD2.java criado em 29/07/2011
 * 
 * Propriedade de Objectos Fábrica de Software LTDA.
 * Reprodução parcial ou total proibida.
 */
package br.com.objectos.dojo.hescarate.tdd.ex2;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

/**
 * @author hellen.escarate@objectos.com.br (Hellen Escarate)
 */
@Test
public class TreinoDeTDD {

  public void objetoRacionalToStringDeveRetornarNaFormaFracionaria() {

    Racional2 oitoQuintos = new Racional2(8, 5);
    assertEquals(oitoQuintos.toString(), "8/5");

  }

  public void qualquerObjetoRacionalToStringDeveRetornarNaFormaFracionaria() {

    Racional2 quatroQuintos = new Racional2(4, 5);
    assertEquals(quatroQuintos.toString(), "4/5");

  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void objetoRacionalToStringNaoPodeInstanciarComDenominadorZero() {

    new Racional2(3, 0);

  }

  public void objetoRacionalToStringDeveAdicionarCampoQueRetornaSoma() {

    Racional2 umMeio = new Racional2(1, 2);
    Racional2 doisTercos = new Racional2(2, 3);

    Racional2 resultado = umMeio.soma(doisTercos);
    assertEquals(resultado.toString(), "7/6");

  }

  public void deveSerPossivelConstruirUmRacionalPassandoApenasUmInteiro() {

    Racional2 tres = new Racional2(10);
    assertEquals(tres.toString(), "10/1");

  }

  public void retornarEquivalenteNaFormaReduzida() {

    Racional2 onzeSetimos = new Racional2(66, 42);
    assertEquals(onzeSetimos.toString(), "11/7");

  }

  public void retornarNaFormaReduzidaParaValoresNegativos() {

    Racional2 onzeSetimosNegativo = new Racional2(-66, 42);
    assertEquals(onzeSetimosNegativo.toString(), "-11/7");

  }

  public void multiplicacaoDeveRetornarCorretamente() {

    Racional2 umMeio = new Racional2(1, 1);
    Racional2 doisMeios = new Racional2(3, 5);

    Racional2 resultado = umMeio.multiplica(doisMeios);
    assertEquals(resultado.toString(), "3/5");
  }

}
