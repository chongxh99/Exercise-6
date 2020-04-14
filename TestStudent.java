import java.util.Scanner;
class TestStudent {  
public static void main (String [] args) {
	Scanner input = new Scanner(System.in);
   String matricNo;
	double test1,test2;
	
	Student [] studDegree = new Student[3];
	//complete your code here
   for(int i=0 ; i<3; i++)
   {
      System.out.print ("Matric No : ");
      matricNo = input.next();
      System.out.print ("Test 1 : ");
      test1 = input.nextDouble();
      System.out.print ("Test 2 : ");
      test2 = input.nextDouble ();
      
      studDegree[i] = new Student(matricNo, test1, test2);
   }
   
   System.out.println ("\n**********************************************");
   System.out.println ("               STUDENT INFORMATION             ");
   System.out.println ("***********************************************");
   System.out.println ("Matric No               AverageMark       ");
   
   for (int j=0; j<3; j++)
   {
      studDegree[j].calculateAverage();
      System.out.println (studDegree[j].getStudentInfo());
   }
}
 
public class Student{
	//list of data members
private String matricNo;
	private double test1, test2, averageMark;
	
	//constructor
	public Student(String matric, double ts1, double ts2 ){
		matricNo = matric;
		test1 = ts1;
		test2 = ts2;	 
	}
	//method that returns some of students’ info
	public String getStudentInfo()
   {
		return "\t"+matricNo+"\t\t"+averageMark;
	}
	//method that calculates the average of 2 tests
public void calculateAverage()
	{
		averageMark = (test1 + test2)/2;
	} 
}
}