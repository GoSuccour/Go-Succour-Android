package gosoccour.com.gosuccour.Login.models;

public class Token {
    private String uuid ="";

    public Token() {
        this.uuid = uuid;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public String toString() {
        return "[uuid=" + uuid +"]";
    }
}

