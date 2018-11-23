package strings;

import java.util.HashSet;

public class DublicateElements {

	public static void main(String[] args) {
		String[] names = { "java", "string", "array", "java", "code", "errors", "code" };

		// Hashset:it stores unique values
		HashSet<String> store = new HashSet<String>();
		for (String name : names) {
			if (store.add(name) == false) {
				System.out.println("duplicate elements:" + name);
			}
		}
     for(int i=0; i<names.length;i++) {
    	 for(int j=i+1; j<names.length;j++) {
    		 if(names[i].equals(names[j])) {
    			 System.out.println("duplicate elements:" + names[i]);
    		 }
    	 }
     }
	}

}
