package demo.practice.spring;

public class SampleBeanFactory {
	
	public SampleBean getSampleBean(){
		return new SampleBean();
	}
	
	public SampleBean getSampleBean(String str){
		return new SampleBean(str);
	}
	

}
