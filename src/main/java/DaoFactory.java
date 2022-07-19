public class DaoFactory {
    private static Ads adsDao;
    static Config config = new Config();

    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new MySQLDao(config);
        }
        return adsDao;
    }
}
