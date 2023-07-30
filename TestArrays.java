/*
 ________________________________________________
|                                               | 
|	INICIANDO NOSSOS TESTE COM ARRAYS NO JAVA   |
|_______________________________________________|


É necessário importar a classe 'Arrays' para se trabalhar com arrays.
*/

import java.util.Arrays;

public class TestArrays{
	
	public static void main (String[] args){
		
		System.out.println("------------------------------------------------------------------------------------------------");
		
	  	String[] lista = {"1","Calil","true"};
		
		System.out.println("Transformando tudo que contém no array 'lista' em string (através do comando Arrays.toString):");
		
		System.out.println(Arrays.toString (lista));
		
		System.out.println("------------------------------------------------------------------------------------------------");
		
		System.out.println("Encontrando a posição da palavra 'Calil' dentro do array 'lista':");
		
		
		int posição = Arrays.binarySearch (lista,"Calil");
		
		System.out.println(posição);
		
		System.out.println("------------------------------------------------------------------------------------------------");
		
		System.out.println("Os valores abaixo são todos ositens pertencentes ao array 'lista'.");
		
		for (int i =0; i<3; i = i +1 ){
			
			System.out.println(lista[i]);
			
		}
		
		System.out.println("------------------------------------------------------------------------------------------------");
		
		System.out.print("O tamanho do array é:");
		System.out.println(lista.length);
		System.out.println("------------------------------------------------------------------------------------------------");
		System.out.println("Usando o 'Arrays.sort()'");
		Arrays.sort (lista,0,lista.length);
		System.out.println(lista);
	}
}