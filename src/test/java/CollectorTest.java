import org.junit.Test;
import statistics.Collector;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

import static org.junit.Assert.assertEquals;

public class CollectorTest {

    @Test
    public void testSimple() {
        LocalDateTime startOfStats = LocalDate.of(2014, Month.JULY, 13).atStartOfDay();
        Collector collector = new ConcurrentCollector(startOfStats);
        collector.sendStatMessage("almauser pageView " + startOfStats.plusHours(1).toLocalTime().toSecondOfDay());
        assertEquals("almauser", collector.currentStats().getMostActiveUserid());
    }
}
