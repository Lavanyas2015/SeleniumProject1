package org.access;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Encapy {

	public static void main(String[] args) {
		 Encapu e=new Encapu();
		 e.setId(100);
		 e.setName("lavanya");
		 e.setRole("QA");
		 
		 Encapu e1=new Encapu();
		 e1.setId(101);
		 e1.setName("Barkavi");
		 e1.setRole("QA");
		 
		 Encapu e3=new Encapu();
		 e3.setId(102);
		 e3.setName("Sharath");
		 e3.setRole("QA");
		 
		 int id = e.getId();
		 System.out.println(id);
		 System.out.println(e.getName());
		 System.out.println(e.getRole());
		 
		 
		 List<Encapu> li=new LinkedList<>();
		 li.add(e);
		 li.add(e1);
		 li.add(e3);
		 
		 Encapu ed = li.get(0);
		 System.out.println(ed.getId());
		 System.out.println(ed.getName());
		 System.out.println(ed.getRole());
		 
		 Encapu ed1 = li.get(1);
		 System.out.println(ed1.getId());
		 System.out.println(ed1.getName());
		 System.out.println(ed1.getRole());
		 
		 Encapu ed2 = li.get(2);
		 System.out.println(ed2.getId());
		 System.out.println(ed2.getName());
		 System.out.println(ed2.getRole());
		 System.out.println("Noraml for loop");
		 for(int i=0;i<li.size();i++) {
			 
			 System.out.println(li.get(i).getId());
			 System.out.println(li.get(i).getName());
			 System.out.println(li.get(i).getRole());
		 } System.out.println("Enhance for loop");
		 for(Encapu x:li) {
			 System.out.println(x.getId());
			 System.out.println(x.getName());
			 System.out.println(x.getRole());
		 }
		 Set<Encapu> s=new HashSet<>();
		 s.add(e);
		 s.add(e1);
		 s.add(e3);
		 System.out.println("set hjkkkkkk");
		 for(Encapu es: s) {
			 System.out.println(es.getId());
			 System.out.println(es.getName());
			 System.out.println(es.getRole());
			 
		 }
		 Map<Integer,Encapu> m=new HashMap<>();
		 m.put(1, e);
		 m.put(2, e1);
		 m.put(3, e3);
		 
		 Set<Entry<Integer, Encapu>> cd=m.entrySet();
		 for(Entry<Integer,Encapu>x1:cd) {
			 System.out.println(x1.getValue().getId());
			 System.out.println(x1.getValue().getName());
			 System.out.println(x1.getValue().getRole());
			 
		 }
		 
		 
	}}



