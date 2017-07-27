
public class Dog extends Animal{

	public Dog(){
		//Super();
		System.out.println("Woof! A wild doggo apears");
	}
	@Override
	public String sleep(){
		return "breath snore snore snore";
	}
	@Override
	public String eat(){
		return "Oh boy puppy chow nom nom nom";
	}
	public String fetch(){
		return "a ball a ball! MY BALL!";
	}
	public String sit(){
		return "im a good boy.  I'll sit";
	}
	
}
