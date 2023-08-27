package Observer;
import java.util.ArrayList;
import java.util.List;

import com.compito.g5.*;

public class SmokeDetector implements FireSensor{
	private List<AlarmListener> listeners = new ArrayList<>();
	
	@Override
	public void attach(AlarmListener listener) {
		listeners.add(listener);
	}
	
	@Override
	public void detach(AlarmListener listener) {
		listeners.remove(listener);
	}
	
	@Override
	public void notifyListeners(String idSonda, String latitudine, String longitudine, Integer smokeLevel) {
		
		for(AlarmListener listener : listeners) {
			
			listener.updateAlarm(idSonda, latitudine, longitudine, smokeLevel);
		
		}
	}
	
	
	
	public void detectSmoke(String idSonda, String latitudine, String longitudine, Integer smokeLevel) {
	
		notifyListeners(idSonda, latitudine, longitudine, smokeLevel);
		
	}
	
}
