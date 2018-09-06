
public class MethodCalling {
	
	// Static component --> cannot five a  call to non static component directly

	public static void main(String[] args) {
		
		// if method is static you do not need to create an instance of the class
		// if method is NOT static you need to create instance of the class to use its methods	

		MethodCalling m = new MethodCalling();
//		m.go();
		m.go1();
//		m.go2();
		
		// static component can call any static component
		// non static can call non static 
		
//		go3();
		
		System.out.println("after calling go1 method");
	
	}
	
	
	public void go() {
		System.out.println("Inside go method");
		go2();
		System.out.println("after calling go2 method");
	}
	
	public void go1() {
		System.out.println("Inside go1 method");
		go();
		System.out.println("after calling go method");
	}	
	
	public void go2() {
		System.out.println("Inside go2 method");
	}
	
	public static void go3() {
		System.out.println("Inside go3 method");
	}

}
