public class Exponencial{
	public static void main(String[] args){
		int i,q,c;
		System.out.println(" #   Q    C");
		System.out.println(" ");
		for(i=0;i <= 10; i++){
			if(i == 10){
				q = i * i;
				c = i * i * i;
				System.out.println(" " + i + "  " + q + "  " + c);
			}else if(i <= 3){
				q = i * i;
				c = i * i * i;
				System.out.println(" " + i + "   " + q + "    " + c);
			}else if(i > 3 && i < 10){
				q = i * i;
				c = i * i * i;
				System.out.println(" " + i + "   " + q + "   " + c);	
			}
		}
	}
}