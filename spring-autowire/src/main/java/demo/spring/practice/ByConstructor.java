package demo.spring.practice;

public class ByConstructor implements Autowire {
	
	private SampleBean bean;
	
	public ByConstructor() {
	}
	
	public ByConstructor(SampleBean bean){
		this.bean = bean;
	}
	
	public void display(){
		bean.display("By Constructor");
	}

}
