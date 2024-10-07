public class Logger {
    private Logger(){

    }
    private static Logger instance;
    public static Logger GetInstance(){
        if(instance!= null)
            return instance;
        return new Logger();
    }

     void Log(String message, LogLevel level){
        switch (level){
            case LogLevel.WARNING:
                break;
            case LogLevel.ERROR:
                break;
            case LogLevel.INFO:
                break;
        }

        System.out.println(message + level);
    }


}
