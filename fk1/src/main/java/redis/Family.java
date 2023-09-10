package redis;

import org.springframework.data.redis.core.index.Indexed;

public class Family {
    @Indexed
    private String type;
    @Indexed
    private String username;

    public Family(String type, String username) {
        this.type = type;
        this.username = username;
    }

    public Family() {
    }

    public String getType() {
        return type;
    }

    public String getUsername() {
        return username;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Family{" +
                "type='" + type + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
