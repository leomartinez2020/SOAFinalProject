package Utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class SetProperties {
    private String api_key;
    private String base_url;
    private String username;
    private String password;

    public SetProperties() {
        Properties properties = new Properties();
        try {
            properties.load(new FileReader("src\\test\\java\\Resources\\data.properties.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        setApi_key(properties.getProperty("api_key"));
        setBase_url(properties.getProperty("base_url"));
        setPassword(properties.getProperty("password"));
        setUsername(properties.getProperty("username"));
    }

    public String getApi_key() {
        return api_key;
    }

    public void setApi_key(String api_key) {
        this.api_key = api_key;
    }

    public String getBase_url() {
        return base_url;
    }

    public void setBase_url(String base_url) {
        this.base_url = base_url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
