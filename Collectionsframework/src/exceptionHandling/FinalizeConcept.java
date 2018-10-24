package exceptionHandling;

public class FinalizeConcept {
	
	public void finalize() {  //Called by the garbage collector on an object when garbage collection determines that there are 
		                      //no more references to the object
		System.out.println("garbage collector");
	}

	public static void main(String[] args) {
		
		FinalizeConcept gc1=new FinalizeConcept();
		FinalizeConcept gc2=new FinalizeConcept();
		
  gc1=null;
  gc2=null;
  
  System.gc(); 
  /*public static void gc()

  Runs the garbage collector. 
  Calling the gc method suggests that the Java Virtual Machine expend effort toward recycling unused objects in order to make the memory they currently occupy available for quick reuse. When control returns from the method call, the Java Virtual Machine has made a best effort to reclaim space from all discarded objects. 

  The call System.gc() is effectively equivalent to the call: */

	}

}
