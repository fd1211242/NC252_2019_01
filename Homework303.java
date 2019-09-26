package Home3;

public class Homework303 {
	   
		private Homework3 first;
		
		public Homework303()
		{
		first = null;
	    }
		public void insertFirst(int id,double dd)
		{
			Homework3 newHomework3 = new Homework3(id, dd);
			newHomework3.next = first;
			first = newHomework3;
		}
		public Homework3 find (int key)
		{
			Homework3 current = first;
			while (current.iData !=key)
			{
				if(current.next == null)
					return null;
				else
					current = current.next;
			}
			return current;
		}
}
			
				
		

