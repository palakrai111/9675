package daoexample;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class SEtExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Set s1 = new HashSet();
    // Set s2 = new LinkedHashSet();
     Set s2 = new TreeSet();
     s2.add(1);
     s2.add(87);
     s2.add(98);
     s2.add(98);
     s2.add(65);
     s2.add(65);
    // s2.add(null);
     System.out.println(s2);
     
     /*Stack s = new Stack();
     s.push(1);
     s.push(2);
     s.push(3);
     s.push(4);
     s.push(5);
     s.pop();
     s.pop();
     System.out.println(s );
     System.out.println(s.peek());*/
     
     
     Vector v = new Vector();
     v.addElement(1);
     v.addElement(2);
     v.addElement(3);
     Enumeration e = v.elements();
     while(e.hasMoreElements())
     {
    	System.out.println(e.nextElement()); 
     }
     
     
		
	}

}
