package fac;

public class student {

	
             public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getTel() {
		return Tel;
	}

	public void setTel(String tel) {
		Tel = tel;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

			String Name,ID,Tel,Email;

	
public class d{
  
public void main(String[] args) {
	student s1 = new student ();
	s1.setName("max");
	s1.setID("123456");
	s1.setTel("0972365694");
	s1.setEmail("fd12112542@gmail.com");
	
	System.out.println("Name"+s1.Name);
    System.out.println("ID"+s1.ID);
    System.out.println("Tel"+s1.Tel);
    System.out.println("Email"+s1.Email);
 
}
	
	
 }
}