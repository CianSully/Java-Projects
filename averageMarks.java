public class Test
{
    // Add a static getPassingAverage method to this class. It should return a double value
    //  representing the average makr of passing students
    public static double getPassingAverage (Student [] mystudents)
    {
        double totalMarks = 0;
        double averageMark = 0;
        int passcount = 0;

        
        for(int i=0;i<mystudents.length;i++)
        {
            if(mystudents[i].getMark() >= 40)
            {
                totalMarks = mystudents[i].getMark() + totalMarks;
                passcount++;
            }
        }
        
        averageMark = totalMarks / passcount;
        
        return averageMark;
        
    }
}
