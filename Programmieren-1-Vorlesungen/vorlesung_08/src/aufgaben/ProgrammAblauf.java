
package aufgaben;

public class ProgrammAblauf {

	public static void main(String[] args) {
		Studierender student = new Studierender();
		
		student.setName("Hans Peter");
		student.setMatrikelNummer(12345);
		System.out.println(student.validateMAtrNum());
		System.out.println(student);
		//Student.name = "Hans Peter" ;
		//Student.matrikelNummer = 12345;
		
	}

}
