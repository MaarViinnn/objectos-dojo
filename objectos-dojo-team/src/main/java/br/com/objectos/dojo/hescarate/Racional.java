/*
 * Racional.java criado em 27/07/2011
 * 
 * Propriedade de Objectos Fábrica de Software LTDA.
 * Reprodução parcial ou total proibida.
 */
package br.com.objectos.dojo.hescarate;

/**
 * @author hellen.escarate@objectos.com.br (Hellen Escarate)
 */
public class Racional {

  Integer numerador;
  Integer denominador;

  public Racional(int numerador, int denominador) {

    this.numerador = numerador;
    this.denominador = denominador;

  }

  @Override
  public String toString() {
    return numerador.toString() + "/" + denominador.toString();
  }

  // porque fica um "x" cinza no ícone da classe? e no pacote também?
  //

}
