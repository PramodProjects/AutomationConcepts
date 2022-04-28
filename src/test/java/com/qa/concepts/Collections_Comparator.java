package com.qa.concepts;

import java.util.Comparator;
import java.util.TreeSet;

//import CommonPrograms.Descending;

public class Collections_Comparator {

	public static void main(String[] args) {

		TreeSet ts = new TreeSet(new Descending());
		ts.add(4);
		ts.add(1);
		ts.add(16);
		ts.add(4);
		ts.add(3);
		System.out.println(ts);

	}

}



class Descending implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		Integer I1 = (Integer)o1;
		Integer I2 = (Integer)o2;
		return -I1.compareTo(I2);
	}
	
}