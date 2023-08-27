package Proxy;
import com.compito.g5.*;

public class Proxy implements AlarmProxy{

	private AlarmProxy realSubject;
	
	public Proxy(String controlCenterUrl) {
		realSubject = new AlarmSender(controlCenterUrl);
	}
	
	@Override
	public void sendAlarm(String idSonda, String latitudine, String longitudine, Integer smokeLevel) {
		realSubject.sendAlarm(idSonda, latitudine, longitudine, smokeLevel);
	}
	
}
