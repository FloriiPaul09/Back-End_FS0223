package Proxy;
import com.compito.g5.*;

public class AlarmSender implements AlarmProxy{

	private String controlCenterUrl;
	
	public AlarmSender(String controlCenterUrl) {
		
		this.controlCenterUrl = controlCenterUrl;
		
	}
	
	@Override
	public void sendAlarm(String idSonda, String latitudine, String longitudine, Integer smokeLevel) {
		System.out.println("Sending alarm...");
	}
	
}
