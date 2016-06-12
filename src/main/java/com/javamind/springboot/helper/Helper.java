package com.javamind.springboot.helper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Helper {
	public static <T> List<T> copyIterator(Iterator<T> iterator) {
		List<T> copyList = new ArrayList<T>();
		while (iterator.hasNext()) {
			copyList.add(iterator.next());
		}
		return copyList;
	}
}
