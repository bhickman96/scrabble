package interfaces;

public interface ITree<T> {
	void Add(T value);
	void Remove(T value);
	boolean Find(T value);
}
