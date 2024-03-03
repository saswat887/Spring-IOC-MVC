package Annotation.com;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Marker1 {
	private int id;
	private String name;
	private int price;
	public int getId() {
		return id;
	}
	@Value("101")
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@Value("Camlin2")
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	@Value("1001")
	public void setPrice(int price) {
		this.price = price;
	}
	
}
