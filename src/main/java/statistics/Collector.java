package statistics;


public interface Collector {
     void sendStatMessage(String message);
     Stats currentStats();
    public interface Stats {
        int getUniqUserids();
        String getMostPopularEventName();
        int getMaxEventCountForOneUser();
        String getMostActiveUserid();
    }
}
