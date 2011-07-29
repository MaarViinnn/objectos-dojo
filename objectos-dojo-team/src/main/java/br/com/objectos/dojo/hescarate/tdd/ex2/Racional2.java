/*
 * Racional2.java criado em 29/07/2011
 * 
 * Propriedade de Objectos Fábrica de Software LTDA.
 * Reprodução parcial ou total proibida.
 */
package br.com.objectos.dojo.hescarate.tdd.ex2;


/**
 * @author hellen.escarate@objectos.com.br (Hellen Escarate)
 */
public class Racional2 {

  Integer numerador;
  Integer denominador;

  public Racional2(int numerador, int denominador) {

    if (denominador == 0) {

      throw new IllegalArgumentException();

    } else {

      int g = mdc(Math.abs(numerador), Math.abs(denominador));

      this.numerador = numerador / g;
      this.denominador = denominador / g;

    }
  }

  private int mdc(int a, int b) {

    return b == 0 ? a : mdc(b, a % b);
    // não entendi esse "a"

  }
  public Racional2(int i) {

    this(i, 1);

  }

  @Override
  public String toString() {
    return numerador.toString() + "/" + denominador.toString();
  }

  public Racional2 soma(Racional2 numero) {

    int numerador = numero.numerador;
    int denominador = numero.denominador;

    int somaNumerador = this.numerador * denominador + numerador * this.denominador;
    int somaDenominador = this.denominador * denominador;
    return new Racional2(somaNumerador, somaDenominador);

  }

  public Racional2 multiplica(Racional2 outro) {
    return new Racional2(numerador * outro.numerador, denominador * outro.denominador);
  }

}
