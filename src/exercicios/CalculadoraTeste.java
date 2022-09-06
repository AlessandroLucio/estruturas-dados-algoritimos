package exercicios;

public class CalculadoraTeste {

	public static void main(String[] args) {
		
		for(int i=1; i<20; i++){
			System.out.print(fibonacci(i) + " ");
		}
		
	}
	
	public static int fibonacci(int nun) {
		
		if(nun < 2) {
			return 1;
		}
		
		return fibonacci(nun - 1) + fibonacci(nun - 2);
	}
	
	
}
