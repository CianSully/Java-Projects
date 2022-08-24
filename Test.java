public class Test
{
    // Add a static print mthod to this class.
    public static int numberPasses (Student [] mystudents)
    {
        int allstudents = mystudents.length;
        int passcount = 0;
        
        for(int i=0;i<allstudents;i++)
        {
            if(mystudents[i].getMark() >= 40)
            {
                passcount++;
            }
        }
        
        int percentagecount = (allstudents / passcount);
        return passcount;
    }
}