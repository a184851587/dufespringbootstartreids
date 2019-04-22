import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("dufe.redis")
public class RedisProperties {

    private String myIp;
    private int myPort;

    public String getMyIp() {
        return myIp;
    }

    public void setMyIp(String myIp) {
        this.myIp = myIp;
    }

    public int getMyPort() {
        return myPort;
    }

    public void setMyPort(int myPort) {
        this.myPort = myPort;
    }
}
