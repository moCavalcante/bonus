package bonus;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeTest {

	@Test
	void testGetTotalPay() {

		Employee emp = new Employee("Moises", 20);
		assertEquals(300, emp.getTotalPay());

		Employee emp1 = new Employee("Gabi", 50);
		assertEquals(765, emp1.getTotalPay());

	}

}
