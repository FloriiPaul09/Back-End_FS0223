package Observer;
import com.compito.g5.*;

public interface AlarmListener {
	void updateAlarm(String idSonda, String latitudine, String longitudine, Integer smokeLevel);
}
