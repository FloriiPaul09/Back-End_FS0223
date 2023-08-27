package com.compito.g5;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ControllerCentroControllo {
	
	@GetMapping("/alarm")
	public String receiveAlarm(
			@RequestParam("idSonda") String idSonda,
			@RequestParam("lat") String latitudine,
			@RequestParam("lon") String longitudine,
			@RequestParam("smokeLevel") Integer smokeLevel
			) {
		return "Alarm received, we will send a squad";
	}
}
