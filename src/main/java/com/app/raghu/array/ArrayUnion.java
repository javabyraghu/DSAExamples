package com.app.raghu.array;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class ArrayUnion {

	public static void main(String[] args) {
		int[] arr1 = { 1, 1, 2, 3, 4, 4 };
		int[] arr2 = { 2, 3, 3, 5, 6 };
		Set<Integer> set = unionArraysUsingSet(arr1, arr2);
		ArrayList<Integer> arr = unionArrays(arr1, arr2);
		for (int e : arr) {
			System.out.print(e + " ");
		}

	}

	private static ArrayList<Integer> unionArrays(int[] arr1, int[] arr2) {
		int i = 1, j = 0, N1 = arr1.length, N2 = arr2.length;
		ArrayList<Integer> al = new ArrayList<>();
		al.add(arr1[0]);
		while (i < N1 && j < N2) {
			if (arr1[i] <= arr2[j]) {
				if (al.get(al.size() - 1) != arr1[i])
					al.add(arr1[i]);
				i++;
			} else if (arr1[i] > arr2[j]) {
				if (al.get(al.size() - 1) != arr2[j])
					al.add(arr2[j]);
				j++;
			} 
		}
		while (i < N1) {
			if (!al.contains(arr1[i]))
				al.add(arr1[i++]);
		}
		while (j < N2) {
			if (!al.contains(arr2[j]))
				al.add(arr2[j++]);
		}
		return al;
	}

	private static Set<Integer> unionArraysUsingSet(int[] arr1, int[] arr2) {
		Set<Integer> set = new TreeSet<>();
		for (int e : arr1) {
			set.add(e);
		}
		for (int e : arr2) {
			if (!set.contains(e))
				set.add(e);
		}

		return set;
	}
}
