import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BuscaBinariaTeste {
  
//Será retornado um número inteiro que represente a posição da chave inteira no array, sendo que a chave é o primeiro número da lista. 
  @Test
  public void retornarInicio() {
    BuscaBinaria buscaBinaria = new BuscaBinaria();

    int[] array = {1, 2, 5, 7, 10};
    int chave = 1;

    assertEquals(0, buscaBinaria.busca(array, chave), 0.001);
  } 

//Será retornado "-1" se o número possuir um valor maior que os que estão presentes na lista Array. 
  @Test
  public void retornarNumeroMaiorQueArray() {
    BuscaBinaria buscaBinaria = new BuscaBinaria();

    int[] array = {1, 2, 5, 7, 10};
    int chave = 19;

    assertEquals(-1, buscaBinaria.busca(array, chave), 0.001);
  } 

//Será retornado um número inteiro que represente a posição da chave no array, sendo que neste caso o valor desta chave será o número do meio da lista Array. 
  @Test
  public void retornarMeio() {
    BuscaBinaria buscaBinaria = new BuscaBinaria();

    int[] array = {1, 2, 5, 7, 10};
    int chave = 5;

    assertEquals(2, buscaBinaria.busca(array, chave), 0.001);
  } 

//Será retornado "-1" caso o número não faça parte dos que estão presentes na lista Array. 
  @Test
  public void retornarNumQueNaoPertence() {
    BuscaBinaria buscaBinaria = new BuscaBinaria();

    int[] array = {1, 2, 5, 7, 10};
    int chave = 8;

    assertEquals(-1, buscaBinaria.busca(array, chave), 0.001);
  } 

//Será retornado um número inteiro que represente a posição da chave inteira no array, sendo que a chave é o ultimo número da lista Array. 
  @Test
  public void retornarUltimoNumero() {
    BuscaBinaria buscaBinaria = new BuscaBinaria();

    int[] array = {1, 2, 5, 7, 10};
    int chave = 10;

    assertEquals(4, buscaBinaria.busca(array, chave), 0.001);
  } 

}