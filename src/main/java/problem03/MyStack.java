package problem03;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyStack {
	
	private String[] buffer;
	private int count = 0;

	public MyStack( int size ) {
		buffer = new String[size];
	}
	
	public void push(String item) {
		if(count == 3) {
			buffer = (String[])resizeArray(buffer,5);
		}
		buffer[count] = item;
		count++;
	}

	public String pop() {
		if(count>0) {
			count--;
			String popValue = buffer[count];
			buffer = Arrays.copyOf(buffer, buffer.length-1);
			return popValue;
		} else {
			return null;
		}
		
		
	}

	public boolean isEmpty() {
		boolean result = (Array.getLength(buffer) == 0)? true : false; 
		return result;
	}
	
	public int size() {
		return 0;
	}
	
	private static Object resizeArray(Object oldArr, int newSize) {
		int oldSize = Array.getLength(oldArr);
		Class elementType = oldArr.getClass().getComponentType();
		Object newArr = Array.newInstance(elementType, newSize);
		System.arraycopy(oldArr, 0, newArr, 0, oldSize);
		return newArr;
	}
}