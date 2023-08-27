package Factory;

import Observer.*;
import Proxy.*;

public class Component implements Factory{
	
	private String controlCenterUrl;
	
	public Component(String controlCenterUrl) {
		this.controlCenterUrl = controlCenterUrl;
	}
	
	@Override
	public FireSensor createSensor(){
		
		return new SmokeDetector();
		
	}
	
	@Override
	public AlarmListener createControlCenter(String name) {
		
		return new ControlCenter(name);
		
	}
	
	public AlarmProxy createAlarmProxy() {
		
		return new Proxy(controlCenterUrl);
		
	}

}
	

