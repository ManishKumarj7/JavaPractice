
public class Constructors {
public Constructors() {
	System.out.println("i am in the constructor");
}
public Constructors(int a,int b) {
	System.out.println("Parametrized Constructor");
	System.out.println("sum:"+(a+b));
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Constructors con=new Constructors();
Constructors  cn=new Constructors(4,5);
	}

}
