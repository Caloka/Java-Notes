public class TestandoLaços{
	
	public static void main (String[] args){
		int cont = 0;
		
		System.out.println("Executando laço: WHILE");
		while (cont <=5){
			System.out.println(cont);
			cont = cont + 1;
		}
		cont = 0;
		System.out.println("Executando laço: DO...WHILE!");
		do{
			System.out.println(cont);
			cont = cont + 2;
		} 
		while (cont < 4);
		
		System.out.println("Executando laço: FOR");
		for (int i = 0; i<6;i = i + 2){
			System.out.println(i);
		}
	}
}