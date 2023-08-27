package Proxy;
import com.compito.g5.*;

public interface AlarmProxy {

	void sendAlarm(String idSonda, String latitudine, String longitudine, Integer smokeLevel);
	
}
