package test01;

import org.springframework.stereotype.Component;

@Component
public class Wheel {
	
	private int radius = 5;
	
	public Wheel() {
		System.out.println("기본생성자 호출");
	}

	public Wheel(int radius) {
		super();
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		System.out.println("setRadius : " + radius);
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Wheel [radius=" + radius + "]";
	}
	
	

}
