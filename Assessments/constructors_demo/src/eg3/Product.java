package eg3;

public class Product {
	
	private int id;
	private String name;
	private double rating;
	private double cost;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	

	public Product(int id, String name, double rating, double cost) {
		super();
		this.id = id;
		this.name = name;
		this.rating = rating;
		this.cost = cost;
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", rating=" + rating + ", cost=" + cost + "]";
	}
	

}
