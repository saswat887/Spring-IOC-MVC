package pack2;

import java.util.List;
import java.util.Set;

import lombok.Data;
@Data
public class Chair {
	private int id;
	private String name;
	private List<String> color;
	private Set<Integer> price;
}
