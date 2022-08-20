public class GroupStudents
{
   public static void main(String [] args)
   {
      Student [] group = {
               new Student("John", 50),
               new Student("Abby", 40),
               new Student("Dylan", 20),
            };

      double passingAverage = Test.getPassingAverage(group);
      System.out.println("The average mark of all students who passed is " + passingAverage);
   }
}
