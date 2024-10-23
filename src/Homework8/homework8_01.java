package Homework8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class homework8_01 {
	

	public static void main(String[] args) {
	
		Collection<Object> collection = new ArrayList();
		collection.add(new Integer(100));
		collection.add(new Double(3.14));
		collection.add(new Long(21L));
		collection.add(new Short("100"));
		collection.add(new Double(5.1));
		collection.add("Kitty");
		collection.add(new Integer(100));
		collection.add(new Object());
		collection.add("Snoopy");
		collection.add(new BigInteger("1000"));

		Iterator objs = collection.iterator();
		while (objs.hasNext())
			System.out.println(objs.next());

		System.out.println();
		for (int i = 0; i < collection.size(); i++) {
			Object obj = ((ArrayList) collection).get(i);
			System.out.println(obj);

		}
		System.out.println();
		for (Object xx : collection)// 全部元素都用過後才會結束
			System.out.println(xx);
		System.out.println();

		objs = collection.iterator();
        while (objs.hasNext()) {
            Object element = objs.next();
            if (!(element instanceof Number)) {
                objs.remove();
            }
        }

		System.out.println(collection);
		System.out.println("元素個數=" + collection.size());

	}
}
