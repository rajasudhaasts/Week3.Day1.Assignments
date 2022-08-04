
public class Employee {

		int Empid;
		String EmpName; 
		int Salary;
		String Design;

		

	void display()
	{
		System.out.println(Empid);
		System.out.println(EmpName);
		System.out.println(Salary);
		System.out.println(Design);
	}
			
		public static void main(String[] args) {
			Employee emp1 = new Employee();
			emp1.Empid=101;
			emp1.EmpName="Sudha";
			emp1.Salary=10000;
			emp1.Design="Testing";
			emp1.display();


	}

}
