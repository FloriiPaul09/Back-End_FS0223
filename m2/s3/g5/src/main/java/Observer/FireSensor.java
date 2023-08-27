package Observer;
import com.compito.g5.*;
import java.util.ArrayList;
import java.util.List;

public interface FireSensor {
	void attach(AlarmListener listener);
	void detach(AlarmListener listener);
	void notifyListeners(String idSonda, String latitudine, String longitudine, Integer smokeLevel);
}
