package notebook;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Value {
	private int i;
	private String name;
	
	public void set (int i) {
		this.i = i;
	}
	
	public int get() {
		return i;
	}
	public String toString() {
		return ""+i;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void add(String string) {
		// TODO Auto-generated method stub
		
	}
	
	
}
public class Notebook {
	private ArrayList<String> notes = new ArrayList<String>();
	/*ArrayList范型类
	容器类有两个类型
	~容器的类型
	~元素的类型
	ArrayList是容器的类型
	尖括号里的东西是元素的类型
	ArrayList 自带size
	*/
	public void add(String s) {
		notes.add(s);
	}
	
	public void add (String s, int location) {
		notes.add(location,s);
	}
	public int getSize() {
		return notes.size();
	}
	
	public String getNote(int index) {
		return notes.get(index);
	}
	
	public void removeNote(int index) {
		notes.remove(index);
	}
	
	public String[] list() {
		int [] ia = new int[10];
		String[] a = new String[notes.size()];
//		for (int i =  0; i<notes.size(); i++) {
//			a[i] = notes.get(i);
//		}
		notes.toArray(a);
		return a;
	}
	
	public static void main(String[] args) {
		Value v = new Value();
		v.set(10);
		System.out.println(v);
		
//		int [] ia = new int [10];
//		for (int i = 0; i< ia.length; i++) {
//			ia[i] = i;
//		}
//		for ( int k : ia) {
//			System.out.println(k);
//		}
//		Value[] a = new Value[10];
		ArrayList<String> a = new ArrayList<String>();
		a.add("First");
		a.add("Second");
		a.add("First");
		System.out.println(a);
		System.out.println("---------------------------------");
		HashSet<String> s = new HashSet<String>();
		s.add("First");
		s.add("Second");
		s.add("First");
		System.out.println(s);
		
//		for (int i=0; i<10; i++) {
//			Value value = new Value();
//			value.set(2);
//			value.setName("");
//			a.add(value);	
//		}
//		for(Value v : a ) {
//			System.out.println(v.get());
//			v.set(0);
//		}
//		for(Value v : a ) {
//			System.out.println(v.get());
//		}
		
//		String [] a = new String[10];
//		for (int i = 0; i <a.length; i++) {
//			a[i] = ""+i;
//		}
//		System.out.println(ia[0]+2);
//		System.out.println(a[0].length());
		//对象数组中的每个元素都是对象的管理之而非对象本身
//		Notebook nb = new Notebook();
//		nb.add("First");
//		nb.add("Second");
//		nb.add("Third", 1);
//		System.out.println(nb.getSize());
//		System.out.println(nb.getNote(1));
//		nb.removeNote(1);
//		String[] a = nb.list();
//		for (String s : a) {
//			System.out.println(s);
//		}
	}

}
