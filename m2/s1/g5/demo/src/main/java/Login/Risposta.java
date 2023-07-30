package Login;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Risposta {
	
	private final String type = "Bearer";
	
	private String token;
	private Long id;
	private String username;
	private String email;
	private List<String> ruoli;
	
	
}
