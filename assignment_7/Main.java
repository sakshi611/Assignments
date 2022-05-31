package assignment_day7;

public class Main {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Sakshi", 24, "980876546", "unnamed road", 5000000);
		Manager m1 = new Manager("Shruti", 42, "645678089", "unnamed road", 5500000);

		System.out.println(e1);
		e1.printSalary();
		System.out.println(m1);
		m1.printSalary();
		
		DayScholar d1 = new DayScholar(10,"Sakshi Gupta");
		Hosteller h1 = new Hosteller(11,"Ayush Gupta");
		
		d1.displayDetails();
		System.out.println(d1.payFee(22000));
		
		h1.displayDetails();
		System.out.println(h1.payFee(35000));
		
		
	}

}
