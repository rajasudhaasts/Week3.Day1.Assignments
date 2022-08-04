
public class Automation extends MultipleLanguage implements Language, TestTool {
		public void selenium()
		{
			System.out.println("Selenium");
		}
		
		public void java()
		{
			System.out.println("Java");
		}
		public void ruby()
		{
			System.out.println("Ruby");
		}
	
		public static void main(String[] args) {
		Automation auto = new Automation(); 
		auto.java();
		auto.python();
		auto.ruby();
		auto.selenium();
		

	}

}
