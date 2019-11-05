

public class Train extends Carrier {

	public Train(int id) {
		super(id);
	}
	
	public String getLocation(){
		return "Ship.getLocation()";
	}

	@Override
	public void add(Cargo c) {
	}
}
