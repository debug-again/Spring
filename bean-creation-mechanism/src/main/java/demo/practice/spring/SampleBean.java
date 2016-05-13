package demo.practice.spring;

public class SampleBean {
	
	private String str;
	
	public SampleBean() {}
	public SampleBean(String str){
		this.str = str;
	}
	
	
	public void display(){
		if(str == null)
			System.out.println("Sample Bean instantiated");
		else
			System.out.println("SampleBean instantiated with String : " + str);
	}

}
