package collectionsdemos;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
	

		ArrayList<Employee> al= new ArrayList<Employee>();
		
		al.add(new Employee(103, "Admin", "PUNE"));
		al.add(new Employee(102, "Admin2", "PUNE"));
		al.add(new Employee(104, "Admin3", "PUNE"));
		al.add(new Employee(107, "Admin4", "PUNE"));
		
		al.add(2,new Employee(103, "Admin", "PUNE"));
		
		//al.remove(3);
	Collections.sort(al,new NameComp());
	
	//Collections.reverse(al);
		
		for(Employee ob: al) {
		
		System.out.println(ob);
		
		
		}
		
		
		

	}

}
