package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	public int size = 0;

	@Override
	public boolean add(T item) {
		if (size == items.length) {
			items = increaseArraySize();
		}
//		items[size] = item;
		System.out.println("item added" + size);
		size++;
		return true;
	}

	private Object[] increaseArraySize() {
		Object[] newArray = new Object[size * 2];
		for (int i = 0; i < size; i++) {
			newArray[i] = items[i];
		}
		return newArray;
	}

	@Override
	public int getSize() {
		return size;
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		return (T) items[index];
	}

}
