package virtualpet;

public class RoboticIceDragon extends RoboticDragon implements BlowsBitterWind{

	public RoboticIceDragon(String givenName) {
		super(givenName);

	}
	
	@Override
	public void blowBitterWind(int amount) {
	setMagic(getMagic()-amount);
	}
}