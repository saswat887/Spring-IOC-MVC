package pack3;

public class Human {
	private int id;
	private String name;
	private int age;
	private Heart heart;
	
	@Override
	public String toString() {
		return "Human [id=" + id + ", name=" + name + ", age=" + age + ", heart=" + heart + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Heart getHeart() {
		return heart;
	}
	public void setHeart(Heart heart) {
		this.heart = heart;
	}

}
