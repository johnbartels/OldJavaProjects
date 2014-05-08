/**
   This program tests the Student class.
*/
public class CSMajorStudentTester
{
   public static void main(String[] args)
   {
      CSMajorStudent oneNewCSStudent = new CSMajorStudent(000542274, "Smith", "Bob", 2002, 3.56, "Theory", "Computer Technology","Windows and Macintosh");

      System.out.println("The new CS student has the followings: ");
      System.out.println(oneNewCSStudent.getFirstName());
      System.out.println(oneNewCSStudent.getLastName());
      System.out.println(oneNewCSStudent.getId());
      System.out.println(oneNewCSStudent.getAge());
      System.out.println(oneNewCSStudent.getOption());
      System.out.println(oneNewCSStudent.getHours());

   }
}


