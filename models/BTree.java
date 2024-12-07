package models;

import java.util.ArrayList;
import java.util.List;

import interfaces.ITree;

public class BTree<T extends Comparable<T>> implements ITree<T> {
	List<T> keys;
	List<BTree<T>> children;
	int order;
	
	public BTree(int order) {
		this.order = order;
		keys = new ArrayList<T>();
		children = new ArrayList<BTree<T>>();
	}
	
	@Override
	public void Add(T value) {
		if (keys.size() == 0) {
			keys.add(value);
		}
	}

	@Override
	public void Remove(T value) {
		
	}

	@Override
	public boolean Find(T value) {
		for (int i = 0; i < keys.size(); i++) {
			if (keys.get(i).equals(value)) {
				return true;
			}
			if (keys.get(i).compareTo(value) > 0) {
				return children.get(i).Find(value);
			}
		}
		return false;
	}

}
