package fac;

public class RegistrationRecord {
   private student student;
   private subject [] subjects;
	int count = 0;
     
   
   
   
   public  RegistrationRecord () {
	   student = new student();
	   subjects = new subject[10];
	   for(int i = 0; i < 10; i++) {
		   subjects[i] = new subject ();
	   }
   }
   public RegistrationRecord (int n) {
	   student = new student();
	   subjects = new subject[n];
	for(int i = 0; i < n; i++) {
		   subjects[i] = new subject ();
		   
	   }
   
  }
 public void addSubject(subject s) {

	if(count < subjects.length -1) {
		 subjects[count] = s;
		 count++;
	}       	
 }    	             
  
 public void display() {
	
	for(int i = 0 ; i<count; i++) {
		 System.out.print(subjects[i] );
	 }
	 
	 
	 
 }
 }