package demo.practice.spring;

public class StaticSampleBeanFactory {

	public static SampleBean getSampleBean(){
		return new SampleBean();
	}
	
	public static SampleBean getSampleBean(String str){
		return new SampleBean(str);
	}
}
