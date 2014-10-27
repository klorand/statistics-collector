import statistics.Collector;

import java.time.LocalDateTime;


public class ConcurrentCollector implements Collector {
    private final LocalDateTime startOfStats;
    public ConcurrentCollector(LocalDateTime startOfStats) {
        this.startOfStats = startOfStats;
    }

    @Override
    public void sendStatMessage(String message) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Stats currentStats() {
        throw new UnsupportedOperationException();
    }
}
