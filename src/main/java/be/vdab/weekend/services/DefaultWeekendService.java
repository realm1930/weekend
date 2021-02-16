package be.vdab.weekend.services;

import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * @author Arne Van Eycken
 * @version 1.0
 */

@Service
public class DefaultWeekendService implements WeekendService {
    @Override
    public boolean isWeekend() {
        var dag = DayOfWeek.from(LocalDate.now()).getValue();
        if (dag == 6 || dag == 7) return true;
        return false;
    }
}
