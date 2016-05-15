package demo.spring.practice;

public class DefaultNo implements Autowire {

	private SampleBean bean;

	public DefaultNo() {}
	
	public DefaultNo(SampleBean bean) {
		super();
		this.bean = bean;
	}

	public SampleBean getBean() {
		return bean;
	}

	public void setBean(SampleBean bean) {
		this.bean = bean;
	}

	public void display() {
		bean.display("Default / No");
	}
}
