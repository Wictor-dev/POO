1. Suponha uma classe Hotel que sirva apenas para guardar a quantidade de
solicitações de reservas feitas conforme a classe abaixo:
  public class Hotel {
    int quantReservas;
    void adicionarReserva() {
      quantReservas++;
    }
  }
Podemos afirmar que haverá um problema de compilação, pois a variável inteira não
foi inicializada previamente? Justifique.

R - Não dará erro pois atributos que não são inicializados no construtor, recebem um valor padrão. no caso de um atributo inteiro, receberá o valor 0.

2. Ainda sobre a classe do exemplo anterior, considere o método main abaixo:
...
public static void main(String args[]) {
  Hotel hotel = new Hotel(2);
  System.out.print(hotel.quantReservas);
}
...
Qual o resultado da compilação e/ou execução da classe que tenha o método acima?
Justifique.

R - dará erro pois o construtor não foi inicializado.

3. Qual o resultado da execução abaixo. Justifique.
public class Teste {
int b = 1;
int a;
Teste(int a) {
a = b + a;
System.out.print(this.a);
}
public static void main(String args[]) {
Teste t = new Teste(2);
}
}

R - O resultado da execução é 0, pois a variável a que é inicializada no construtor não é a mesma da classe teste. 

5 – A classe Radio pede um parâmetro inteiro “volume”, que não é passada no construtor da classe TestaRadio. Para resolver esse problema, basta apenas passar um parâmetro no construtor.

6 – a) O resultado dos dois prints é 90, pois quando se iguala a variável c1 à variável c2, a variável c1 vai apontar para o mesmo espaço de  memória de c2, assim sendo, qualquer alteração feita em c1 ou c2, acontecerá para ambos.
b) Parametros não referenciados são descartados.
