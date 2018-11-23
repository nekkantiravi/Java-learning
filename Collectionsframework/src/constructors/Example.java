package constructors;

public class Example {
	   /* Constructor has following properties:
		Constructor has same name as class name.
		It is used for initializing variables of class..
		It is called whenever object of class is created..
		It does not have return type, not even void..
		It can have parameter.
		Constructors can be overloaded, which means a class can have more than one constructor.
		Overriding doesnot applicable for constructor, as the overriding occurs on inheritance with different classes..
		A constructor may have any access modifier like private, protected, default, public..
		Default constructor is automatically inserted when Compiler does not find any valid declaration of a constructor inside a class..
	*/
	public int age;
	public String name;
	
	public Example() {
		System.out.println("Default constructor");
	}
	
	public Example(int age, String name) {
		System.out.println("age");
		
		this.age=age;
		this.name=name;
		
	}

	public void sum() {
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		Example obj1=new Example();
		Example obj=new Example(20,"ravi");
		obj.sum();
       System.out.println(obj.age);
       System.out.println(obj.name);
	}

	
}
