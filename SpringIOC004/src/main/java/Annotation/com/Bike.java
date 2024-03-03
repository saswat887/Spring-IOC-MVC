package Annotation.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bike {
	@Autowired
	private Engine engine;

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	

}
