package scope;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class GlobalScope {

	public static void main(String[] args) {
		
		List<Object> list = new ArrayList<Object>();
		
		try {
			while(list.size() < 1000000){
				GlobalScope scope = new GlobalScope();
				scope.doSomething();
				
				list.add(scope);
				
				if(list.size() % 1000 == 0){
					System.out.println(list.size());
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private int make_count = 10;
	
	public void doSomething(){
		
		this.doSomething1();
		this.doSomething2();
		this.doSomething3();
		this.doSomething4();
		this.doSomething5();
		this.doSomething6();
		this.doSomething7();
		this.doSomething8();
		this.doSomething9();
		this.doSomething10();
	}

	public String str1 = "";
	public String str2 = "";
	public String str3 = "";
	public String str4 = "";
	public String str5 = "";
	public String str6 = "";
	public String str7 = "";
	public String str8 = "";
	public String str9 = "";
	public String str10 = "";
	
	public void doSomething1(){
		
		for(int i=0;i<make_count;i++){
			str1 = i+"gc scope test string gc scope test string gc scope test string gc scope test string gc scope test string gc scope test stringgc scope test string gc scope test string gc scope test stringgc scope test string gc scope test string gc scope test string gc scope test string gc scope test string gc scope test stringgc scope test string gc scope test string gc scope test string";
		}
	}

	public void doSomething2(){
		
		for(int i=0;i<make_count;i++){
			str2 = i+"gc scope test string gc scope test string gc scope test string gc scope test string gc scope test string gc scope test stringgc scope test string gc scope test string gc scope test stringgc scope test string gc scope test string gc scope test string gc scope test string gc scope test string gc scope test stringgc scope test string gc scope test string gc scope test string";
		}
	}

	public void doSomething3(){
		
		for(int i=0;i<make_count;i++){
			str3 = i+"gc scope test string gc scope test string gc scope test string gc scope test string gc scope test string gc scope test stringgc scope test string gc scope test string gc scope test stringgc scope test string gc scope test string gc scope test string gc scope test string gc scope test string gc scope test stringgc scope test string gc scope test string gc scope test string";
		}
	}

	public void doSomething4(){
		
		for(int i=0;i<make_count;i++){
			str4 = i+"gc scope test string gc scope test string gc scope test string gc scope test string gc scope test string gc scope test stringgc scope test string gc scope test string gc scope test stringgc scope test string gc scope test string gc scope test string gc scope test string gc scope test string gc scope test stringgc scope test string gc scope test string gc scope test string";
		}
	}

	public void doSomething5(){
		
		for(int i=0;i<make_count;i++){
			str5 = i+"gc scope test string gc scope test string gc scope test string gc scope test string gc scope test string gc scope test stringgc scope test string gc scope test string gc scope test stringgc scope test string gc scope test string gc scope test string gc scope test string gc scope test string gc scope test stringgc scope test string gc scope test string gc scope test string";
		}
	}

	public void doSomething6(){
		
		for(int i=0;i<make_count;i++){
			str6 = i+"gc scope test string gc scope test string gc scope test string gc scope test string gc scope test string gc scope test stringgc scope test string gc scope test string gc scope test stringgc scope test string gc scope test string gc scope test string gc scope test string gc scope test string gc scope test stringgc scope test string gc scope test string gc scope test string";
		}
	}

	public void doSomething7(){
		
		for(int i=0;i<make_count;i++){
			str7 = i+"gc scope test string gc scope test string gc scope test string gc scope test string gc scope test string gc scope test stringgc scope test string gc scope test string gc scope test stringgc scope test string gc scope test string gc scope test string gc scope test string gc scope test string gc scope test stringgc scope test string gc scope test string gc scope test string";
		}
	}

	public void doSomething8(){
		
		for(int i=0;i<make_count;i++){
			str8 = i+"gc scope test string gc scope test string gc scope test string gc scope test string gc scope test string gc scope test stringgc scope test string gc scope test string gc scope test stringgc scope test string gc scope test string gc scope test string gc scope test string gc scope test string gc scope test stringgc scope test string gc scope test string gc scope test string";
		}
	}

	public void doSomething9(){
		
		for(int i=0;i<make_count;i++){
			str9 = i+"gc scope test string gc scope test string gc scope test string gc scope test string gc scope test string gc scope test stringgc scope test string gc scope test string gc scope test stringgc scope test string gc scope test string gc scope test string gc scope test string gc scope test string gc scope test stringgc scope test string gc scope test string gc scope test string";
		}
	}

	public void doSomething10(){
		
		for(int i=0;i<make_count;i++){
			str10 = i+"gc scope test string gc scope test string gc scope test string gc scope test string gc scope test string gc scope test stringgc scope test string gc scope test string gc scope test stringgc scope test string gc scope test string gc scope test string gc scope test string gc scope test string gc scope test stringgc scope test string gc scope test string gc scope test string";
		}
	}

}
