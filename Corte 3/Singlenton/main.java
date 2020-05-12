
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logger logger1 = Logger.getIntance();
		Logger logger2 = Logger.getIntance();
		
		logger1.setValue("Hola Mundo!");
		System.out.println(logger2.getValue());

	}

}
