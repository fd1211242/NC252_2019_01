package forck;

public class Homework202 {
	Homework2 [] homework2;
	int eSize;
	
	public Homework202(int size) {
		this.eSize = 0;
		this.homework2 = new Homework2[size];
	}
	
	public void insert(Homework2 s) {
		this.homework2[eSize++] = s;
	}
	
	public void show() {
		for(int i=0; i < eSize; i++) {
			System.out.println(this.homework2[i]);
		}
	}
	
	public void Sort() {
		int in = 0, out;
		for(out = eSize - 1; out > 0; out--) {
			for(in = 0; in < out; in++) {
			if(this.homework2[in].code.compareTo(this.homework2[in+1].code) > 0) {
				this.swap(in, in+1);
			}
			}
		}
	}
	
	public void swap(int left,int right) {
		Homework2 temp = this.homework2[left];
		this.homework2[left] = this.homework2[right];
		this.homework2[right] = temp;
	}
	
	public static void main(String[] args) {
		Homework202  S1 = new Homework202 (5);
		Homework2 X = new Homework2();
		X.setCode("101");
		X.setGrad("1.5");
		X.setName("science");
		X.setUnti(3);
		
		Homework2 X2 = new Homework2();
		X2.setCode("201");
		X2.setGrad("4");
		X2.setName("Math");
		X2.setUnti(3);
		
		Homework2 X3 = new Homework2();
		X3.setCode("301");
		X3.setGrad("4");
		X3.setName("Math2");
		X3.setUnti(3);
		
		Homework2 X4 = new Homework2();
		X4.setCode("302");
		X4.setGrad("2.5");
		X4.setName("Java");
		X4.setUnti(2.5f);
		
		Homework2 X5 = new Homework2();
		X5.setCode("102");
		X5.setGrad("1.5");
		X5.setName("Thai ");
		X5.setUnti(2);
		
		S1.insert(X);
		S1.insert(X2);
		S1.insert(X3);
		S1.insert(X4);
		S1.insert(X5);
		
		
		S1.Sort();
		S1.show();
	}

}


