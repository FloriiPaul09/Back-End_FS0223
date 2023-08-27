package Observer;

public class ControlCenter implements AlarmListener{

	private String name;
	
	public ControlCenter(String name) {
		this.name = name;
	}
	
	@Override
	public void updateAlarm(String idSonda, String latitudine, String longitudine, Integer smokeLevel) {
		
		System.out.println( name + "received alarm from " + idSonda +
				" at the coordinates " + latitudine + " " + longitudine + 
				" with a level of smoke of " + smokeLevel);
		
	}
	
}
