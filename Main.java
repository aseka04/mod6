public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.GetInstance();
        logger.Log("waaaa", LogLevel.WARNING);
        System.out.println(logger);
    }
}