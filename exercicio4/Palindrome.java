public class Palindrome{
	public static void main(String[] args){
		String parametro = args[0];		
		String teste = parametro;
		String palin;
		palin = teste;
		int tamString,a,b,c,xtam,ipos,zvez=0;
		boolean p = false;
		xtam = teste.length();	
		tamString = teste.length();
		while(xtam > 4 && p == false){				
			a = xtam;
			for(ipos=0; ipos <= zvez; ipos++){	
				if(p == false){
					b = ipos + a;		
					teste = palin.substring(ipos,b); 
					StringBuffer sb = new StringBuffer(teste);
					sb.reverse();
					String reverso = sb.toString();
					if(teste.equals(reverso) && reverso.length() == 5){
						c = b - 1;
						System.out.println(" ");
						System.out.println(" " + teste + "  " + "Posicao: " + ipos + "-" + c);
						p = true;				
					}
				}
			}
			zvez++;
			xtam--;
		}
		if(p == false){
			System.out.println(" ");
			System.out.println(" Nenhum palindrome de tamanho 5 foi encontrado.");
		}
	}
}
