package demo.practice.spring;

public class BeanA {

	private BeanB beanB;

	public BeanA() {
	}
	
	public BeanA(BeanB beanB) {
		this.beanB = beanB;
	}
	
	public void show(){
		beanB.display();
	}
	
}
