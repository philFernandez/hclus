package collectionsdemos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class HashSetDemo {
	public static void main(String[] args) {
TreeSet<Employee> al= new TreeSet<Employee>();
		
		al.add(new Employee(103, "Admin", "PUNE"));
		al.add(new Employee(102, "Admin2", "PUNE"));
		al.add(new Employee(104, "Admin3", "PUNE"));
		al.add(new Employee(107, "Admin4", "PUNE"));
		al.add(new Employee(103, "Admin", "PUNE"));
		
		
		//Collections.sort(al);
		
		for(Employee ob: al) {
		
		System.out.println(ob);
		
		
		}
	}

}
