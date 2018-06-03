package scope;

public class Sample {

	public String globalStr = "global";
	
	public void doSomething(){
		this.doSomething1();
		this.doSomething2();
		this.doSomething3();
	}
	
	public void doSomething1(){
		
		for(int i=0;i<10;i++){
			globalStr = "gc scope test string";
		}
	}
	
	public void doSomething2(){
		String str = "";
		
		for(int i=0;i<10;i++){
			str = "gc scope test string";
		}
	}
	
	public void doSomething3(){
		
		for(int i=0;i<10;i++){
			String str = "gc scope test string";
		}
	}
}
