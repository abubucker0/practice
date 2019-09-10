package com.apps.practice.interview.sort;

public class BubbleSort {
	public static void sort(int[] dat)	{
		boolean unsorted = true;
		int i = 0;
		int j = 0;
		do	{
			unsorted = false;
			while(j<dat.length-1-i)	{
				if(dat[j] > dat[j+1])	{
					swap(dat,j,j+1);
					unsorted = true;
				}
				j++;
			}
			i++;
			j = 0;
		}
		while(unsorted);
	}
	
	private static void swap(int[]a, int i, int j)	{
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	public static void main(String[] args)	{
		int[] dat = {8,4,6,2,9};
		sort(dat);
		for(int i : dat)
			System.out.println(i);
	}
}
