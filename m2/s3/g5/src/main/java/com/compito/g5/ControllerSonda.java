package com.compito.g5;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerSonda {

	@GetMapping("/fire-alarm")
	public String triggerAlarm(
			@RequestParam("idSonda") String idSonda,
			@RequestParam("lat") String latitudine,
			@RequestParam("lon") String longitudine,
			@RequestParam("smokeLevel") Integer smokeLevel) {
		if(smokeLevel > 5) {
			sendAlarmToCenter(idSonda, latitudine, longitudine, smokeLevel);
			return "Alarm triggered!";
		}
		
		return "No alarm was triggered.";
	}
	
	private void sendAlarmToCenter(String idSonda, String latitudine, String longitudine, Integer smokeLevel){
		
		
	}
}
