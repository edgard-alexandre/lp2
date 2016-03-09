public class Palindrome{
	public static void main(String[] args){
		String parametro = args[0];		
		String palin;
		String teste = parametro;
		palin = teste;
		int tamString,a,b,xtam,ipos,zvez=0,i,z;
		boolean p = false;
		xtam = teste.length();	
		tamString = teste.length();
		while(xtam > 1 && p == false){				
			a = xtam;
			for(ipos=0; ipos <= zvez; ipos++){	
				b = ipos + a;		
				teste = palin.substring(ipos,b); 
				StringBuffer sb = new StringBuffer(teste);
				sb.reverse();
				String reverso = sb.toString();
				if(teste.equals(reverso)){
					z = b - 1;
					System.out.println(" ");
					System.out.println(" " + teste + "  " + "Posicao: " + ipos + "-" + z);
					p = true;				
				}
			}
			zvez++;
			xtam--;
		}
		if(p == false){
			System.out.println(" ");
			System.out.println(" Nenhum palindrome foi encontrado.");
		}
	}
}
