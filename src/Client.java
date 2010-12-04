public class Client {

	public static void main(String[] args) {
		
	Context myContext = new Context();
	//Addition
	myContext.setStrategy(new ClassA());
		myContext.dosomething();
	//Subtraction
	myContext.setStrategy(new ClassB());
	myContext.dosomething();
	}
}
