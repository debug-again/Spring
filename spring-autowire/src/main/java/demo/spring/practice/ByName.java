package demo.spring.practice;

public class ByName implements Autowire {
	
	private SampleBean bean;

	public SampleBean getBean() {
		return bean;
	}

	public void setBean(SampleBean bean) {
		this.bean = bean;
	}
	
	public void display(){
		bean.display("by Name");
	}
}
