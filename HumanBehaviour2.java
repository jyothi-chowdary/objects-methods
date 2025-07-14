class HumanBehaviour2{
	String name="JYOTHI";
	static int age=20;
	public static void listen(){
	System.out.println("listening");
	}
	 
	public String walk(){
	 return"walking";

	}
          
	public int sleep(){
	 return 3;
	}
           
	public static void knowledge(){
	System.out.println("knowldge gaining");
	}
          
    	public static void teach(){
	System.out.println("teaching");
}
	  
public static void main(String[]args){
HumanBehaviour2 d1=new HumanBehaviour2();
HumanBehaviour2 d2=new HumanBehaviour2();
 System.out.println(d1.walk());
 System.out.println(d1.sleep());
d1.teach();
d2.listen();
System.out.println(age);
System.out.println(d1.name);


}
}



