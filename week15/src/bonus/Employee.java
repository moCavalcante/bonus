package bonus;

public class Employee {

	static final double OVERTIMEPAY = 16.5;

	static final double REGULARPAY = 15;

	public String name;

	public double totalPay;

	public double hours;

	public Employee(String name, double hours) {

		this.name = name;
		this.hours = hours;
		setTotalPay(hours);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getTotalPay() {
		return totalPay;
	}

	public void setTotalPay(double totalPay) {

		if (hours < 40) {

			this.totalPay = hours * REGULARPAY;

		} else {

			this.totalPay = (hours - 40) * OVERTIMEPAY + 40 * REGULARPAY;
		}

	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

}
