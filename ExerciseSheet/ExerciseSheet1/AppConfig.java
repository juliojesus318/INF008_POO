public class AppConfig{

    String appName;
    String version;
    int maxConnections;
    double timeoutSeconds;
    private boolean isDebugMode;

    public AppConfig()
    {
        this(null, null, 1, 1.0, false);
    }

    public AppConfig(String appName, String version, int maxConnections, double timeoutSeconds, boolean isDebugMode)
    {
        this.appName = appName;
        this.version = version;
        this.maxConnections = maxConnections;
        this.timeoutSeconds = timeoutSeconds;
        this.isDebugMode = isDebugMode;
    }

    public void setAppName(String appName)
    {
        this.appName = appName;
    }
    public String getAppName()
    {
        return appName;
    }

     public void setVersion(String version)
    {
        this.version = version;
    }
    public String getVersion()
    {
        return version;
    }

    public void setMaxConnections(int maxConnections)
    {
        this.maxConnections = maxConnections;
    }
    public int getMaxConnections()
    {
        return maxConnections;
    }

    public void setTimeoutSeconds(int timeoutSeconds)
    {
        this.timeoutSeconds = timeoutSeconds;
    }
    public double getTimeoutSeconds()
    {
        return timeoutSeconds;
    }


    public void updateSettings(int maxConnections, double timeoutSeconds)
    {
        this.maxConnections = maxConnections;
        this.timeoutSeconds = timeoutSeconds;
    }

    public void updateSettings(boolean isDebugMode)
    {
        this.isDebugMode = isDebugMode;
    }

    public boolean validateConfig()
    {
        if(appName == null)
            return false;
        if(timeoutSeconds > 10)
            return false;
        if(maxConnections > 1)
            return false;
        if(version == null)
            return false;

        return true;
    }
    public void display()
    {
        System.out.println("App Name: " + appName + "\n--Version: " + version + "\nConections: " + maxConnections + "\nTimeOut: " + timeoutSeconds + "\nDev Mode: " + isDebugMode);
    }


    public static void main(String[] args)
    {
        AppConfig cel = new AppConfig();


    }
}
