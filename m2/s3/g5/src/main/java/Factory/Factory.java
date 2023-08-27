package Factory;

import Observer.*;

public interface Factory {
	FireSensor createSensor();
	AlarmListener createControlCenter(String name);
}
