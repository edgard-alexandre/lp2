public class Aluno{
	String nome;
	int idade;
	String numeroMatricula;

	public void imprimirDadosCadastrais(){
		System.out.println("Nome: " + nome + " - Idade: " + idade + " - Numero Matricula: " + numeroMatricula);
	}

	public static void main(String[] args){
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		Aluno a4 = new Aluno();

		a1.nome = "Edgard";
		a1.idade = 16;
		a1.numeroMatricula = "123";
		a2.nome = "Caio";
		a2.idade = 12;
		a2.numeroMatricula = "321";
		a3.nome = "Pedro";
		a3.idade = 17;
		a3.numeroMatricula = "456";
		a4.nome = "João";
		a4.idade = 100;
		a4.numeroMatricula = "654";
		
		System.out.println(" ");
		a1.imprimirDadosCadastrais();
		System.out.println(" ");
		a2.imprimirDadosCadastrais();
		System.out.println(" ");
		a3.imprimirDadosCadastrais();
		System.out.println(" ");
		a4.imprimirDadosCadastrais();
	}
}