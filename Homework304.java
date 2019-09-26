package Home3;

public class Homework304 {

	public static void main (String []args)
{
		 Homework303 theList = new  Homework303();
		 
		 theList.insertFirst(22, 2.99);
		 theList.insertFirst(44, 4.99);
		 theList.insertFirst(66, 6.99);
		 theList.insertFirst(88, 8.99);
		
		 theList.displayHomework3();
		
		 Homework3 f = theList.find(44);
		 if(f !=null)
			 System.out.println("Found link with key"+ f.iData);
		 else
			 System.out.println("Can't fimd link");
		 
		 
		 Homework3 d = theList.delete(66);
		 if(d !=null)
			 System.out.print("Deleted link with key"+d.iData);
		 else 
			 System.out.println("Can' t deldte link");
		 theList.displayHomework3();
 }				
}
