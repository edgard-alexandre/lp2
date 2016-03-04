public class Calculadora{
	int variavel1,variavel2;

	public void soma(){
		int s;
		s = variavel1 + variavel2;
		System.out.println("A soma dos dois números são: " + s);
	}
	public void subtracao(){
		int sub;
		sub = variavel1 - variavel2;
		System.out.println("A subtração dos dois números são: " + sub);
	}
	public void multiplicacao(){
		int m;
		m = variavel1 * variavel2;
		System.out.println("A multiplicação dos dois números são: " + m);
	}
	public void divisao(){
		int d;
		d = variavel1 / variavel2;
		System.out.println("A divisão dos dois números são: " + d);
	}
	
	public static void main(String[] args){
		Calculadora obj1 = new Calculadora();
		Calculadora obj2 = new Calculadora();
		Calculadora obj3 = new Calculadora();

		obj1.variavel1 = 16;
		obj1.variavel2 = 2;
		
		obj2.variavel1 = 378;
		obj2.variavel2 = 49;

		obj3.variavel1 = 52;
		obj3.variavel2 = 38;

		System.out.println(" ");
		obj1.soma();
		obj1.subtracao();
		obj1.multiplicacao();
		obj1.divisao();
		
		System.out.println(" ");
		obj2.soma();
		obj2.subtracao();
		obj2.multiplicacao();
		obj2.divisao();
		
		System.out.println(" ");
		obj3.soma();
		obj3.subtracao();
		obj3.multiplicacao();
		obj3.divisao();
	}
}