package pack3;

public class Heart {
	private int id;
	private String color;
	private int price;
	
	@Override
	public String toString() {
		return "Heart [id=" + id + ", color=" + color + ", price=" + price + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
