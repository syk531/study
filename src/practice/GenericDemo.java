package practice;

class EmployeeInfo {
	public int rank;
	EmployeeInfo (int rank) { this.rank = rank; }
}

class Person<T, S> {
	public T info;
	public S id;
	
	Person(T info, S id) {
		this.info = info;
		this.id = id;
	}
}

public class GenericDemo {
	public static void main(String args[]) {
		EmployeeInfo e = new EmployeeInfo(2);
		Person<EmployeeInfo, Integer> p = new Person<EmployeeInfo, Integer>(e, 1);
		System.out.println(p.id); 
		System.out.print( p.info.rank);
	}
}
