
public class Unicorn extends Animal{
	public Unicorn()
	{
		super();
		System.out.println("Now I am a Unicorn!");
	}

	@Override
	public String sleep() {
		return "A unicorn sleeps...";
	}

	@Override
	public String eat() {
		return "A unicorn eats...";
	}

	public String talk(){
		return "Magic is real if you just believe...";
	}
}
