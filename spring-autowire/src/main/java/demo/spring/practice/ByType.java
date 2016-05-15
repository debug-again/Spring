package demo.spring.practice;

public class ByType implements Autowire {
	
	private SampleBean bean;

	public void setBean(SampleBean bean) {
		this.bean = bean;
	}
	
	/* (non-Javadoc)
	 * @see demo.spring.practice.Autowire#display()
	 */
	public void display(){
		bean.display("By Type");
	}
	
}
