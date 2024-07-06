package com.practice.code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

// find the  that gives the  2 pair that gives the absolute sum
//3,7,4,1,8,2 // k=9

public class absolutePairSum {

	public static void main(String[] args) {
		int k = 9;
		int[] arr = new int[] { 3, 7, 4, 1, 8, 2 };
		Map<Integer, Integer> m = new HashMap<>();
		// a+a=k
		// a=k-a
		for (int i = 0; i < arr.length; i++) {
			m.put(arr[i], m.getOrDefault(arr[i], 1) + 1);
		}

		Map<List<Integer>, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (m.containsKey(k - arr[i])) {
				System.out.println(arr[i] + "  " + (k - arr[i]));
			}

		}

	}

}
