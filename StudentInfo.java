
public class StudentInfo {

	public void getStudentInfo()
	{
		System.out.println("Method without parameters");
	}

	public void getStudentInfo(int id)
	{
	System.out.println("Student ID : " + id);
	}

	public void getStudentInfo(int id,String studname,String dept)
	{
	System.out.println("Student details : " + " " + id + " " + studname + " " + dept + " ");

	}
	public static void main(String[] args) {

	int id=1;
	String studname = "Sudha";
	String dept = "CSE";
	
	
	StudentInfo student = new StudentInfo();
	student.getStudentInfo();
	student.getStudentInfo(id);
	student.getStudentInfo(id, studname, dept);
}

}
