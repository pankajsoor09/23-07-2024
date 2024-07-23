package pack1;

public class StaticDemo {
	
	int number;// instance of variable 
    static int count;//class variable
    
    void show() {
    	System.out.println("in show() :");
    	System.out.println("Number :"+number);
    	System.out.println("count : "+count);
    }
    
    static void display() {
    	System.out.println("in staic display() ");
    	//System.out.println("Number : "+number);  number is non static cannot access in static
    	System.out.println("count : "+count);
    }
    
    public static void main(String[] args) {
		StaticDemo.count =100;//Standard method of accessing properties... Classname.property_name
		System.out.println("Count is : "+count);//with same class can access directly
		StaticDemo.display(); // Classname.property_name
		//show(); // show () is non static can't access static method
		StaticDemo obj = new StaticDemo();
		obj.number = 10;
		//obj.count = 200; // not standard method
		System.out.println("Number is : "+obj.number);
		//System.out.println("obj count : "+obj.count);
		StaticDemo obj1 = new StaticDemo();
		obj1.number = 30;
		
		System.out.println("Number is : "+obj1.number);
		//System.out.println("obj1 count "+obj1.count);
		
	}
}
/* static keyword in java static property stored in stack .instance stored in heap
 *      
 *  1.class : inner classes
 *  2.method
 *  3.data  members 
 *  Classname.property_name
 *  
 *  static data member : class member
 *  static property belongs to class
 *  Class Demo {
 *   int number;
 *   static int count;
 *   }
 *   Demo.count  in static without creating object we can access data member
 *   
 *   static data member only single copy is shared . in instance different copy
 *   
 *   in static method only static property is accessed. non static cannot be accessed
 *   -------------------------------------------------------------------------
 *   
 *   class Demo {
 *   int number; 
 *   static int count;
 *   
 *   void show (){
 *     sop(number);//error in static method only static property is accessed. non static cannot be accessed
 *     sop(count);
 *     }
 *     }
 *     Demo.display();
 *   
 */