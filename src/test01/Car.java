package test01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	@Autowired
	@Qualifier(value="wheelBeanQualifier")
	private Wheel Wheel;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(test01.Wheel wheel) {
		super();
		Wheel = wheel;
	}

	public Wheel getWheel() {
		return Wheel;
	}

	public void setWheel(Wheel wheel) {
		Wheel = wheel;
	}

	@Override
	public String toString() {
		return "Car [Wheel=" + Wheel + "]";
	}
	
	

}
