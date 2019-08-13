package fac;

public class subject {
	private   String Code ;
	private  String name ;
	private   String grade ;
	private  String umt;
  
	
	void Subject() {}

	

     public String getCode() {
		return Code;
	}



	public void setCode(String code) {
		Code = code;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getGrade() {
		return grade;
	}



	public void setGrade(String grade) {
		this.grade = grade;
	}



	public String getUmt() {
		return umt;
	}



	public void setUmt(String umt) {
		this.umt = umt;
	}



	public String toString() {
    	 
    	 String unit;
		return "Code:" + Code + "," 
    	 + "Name:" + name + ","
    	 +"Unit:"+unit+     ","
    	 +"Grade:" + grade;
    	 
    	 
     }  
      
      
      
      
      
   //   public static void main(String[] args) {
    ///	  subject s1 = new subject () ;
    	//  s1.setName("Max"); 
    	 // s1.setCode("12112542");
    	 // s1.showgrade("64");
    	 // s1.showumt("umt");
    	  
    	  
      }














}
