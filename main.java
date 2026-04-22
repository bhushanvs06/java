class aniket{
	int rel(int a,int b){
		return a+b;
	}
	
}

class tan extends aniket{
	int rel(int a,int b){
		return a+b+100;
	}
	int life(int q,int t){
		return super.rel(q,t);
	}
	
}

public class main{

	public static void main(String[] args) {
		System.out.println("hii");
		System.out.println("tan");
		tan t = new tan();
		System.out.println(t.life(1,7));
	}
}
