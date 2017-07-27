
public class Pikachu extends Animal{
	public Pikachu(){
		//super();
		System.out.println("Pika!");
	}

	@Override
	public String sleep(){
		return "zzz pika zzz pika";
	}
	@Override
	public String eat(){
		return "nibble nibble nibble";
	}
	public String thunderbolt(){
		return "ZAPPPPP!";
	}
	public String pokeBall(){
		return "Ha i aint going in there";
	}

}
