package collectionsdemos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		


		LinkedList<Employee> al= new LinkedList<Employee>();
		
		al.add(new Employee(103, "Admin", "PUNE"));
		al.add(new Employee(102, "Admin2", "PUNE"));
		al.add(new Employee(104, "Admin3", "PUNE"));
		al.add(new Employee(107, "Admin4", "PUNE"));
		
		al.addFirst(new Employee(103, "Admin", "PUNE"));
		al.addLast(new Employee(103, "Admin", "PUNE"));
		
		//al.remove(3);
	Collections.sort(al,new NameComp());
	
	//Collections.reverse(al);
		
		for(Employee ob: al) {
		
		System.out.println(ob);
		
		

	}}

}
