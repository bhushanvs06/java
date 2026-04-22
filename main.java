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

class Data{
	String n;
	int a;
	Data(String name,int age){
		this.n = name;
		this.a = age;
	}
	String greet(){
		return("hi "+n);
	}
	String changename(String name){
		this.n = name;
		return "done bro";
	}
}

public class main{

	public static void main(String[] args) {
		System.out.println("hii");
		System.out.println("tan");
		//this is previouse safe version
		Data d = new Data("Aniket",80);
		Data d1=new Data("bhushan",100);
		System.out.println(d.greet());
		System.out.println(d1.greet());
		// System.out.println(d.changename("bhushan"));
		// System.out.println(d.greet());

	}
}
