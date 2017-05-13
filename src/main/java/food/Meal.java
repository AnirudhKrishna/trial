package food;

public class Meal {
	
	private Fruit fruit;
	private Dairy dairy;
	private Grain grain;
	private Meat meat;
	private Vegetable veg;

	public Meal() {
		super();
		
	}

	public Meal(Fruit fruit, Dairy dairy, Grain grain, Meat meat, Vegetable veg) {
		super();
		this.fruit = fruit;
		this.dairy = dairy;
		this.grain = grain;
		this.meat = meat;
		this.veg = veg;
	}

	public String whatsInThisMeal(){
		
		String answer ="This  Meal Contains :";
		
		if(fruit != null) answer += "some fruit :" ;
		if(dairy != null) answer += "some dairy :" ;
		if(grain != null) answer += "some grain :" ;
		if(meat != null) answer += "some meat :" ;
		if(veg != null) answer += "some vegetables :" ;
	
		return answer;
		
	}
	
	

}
