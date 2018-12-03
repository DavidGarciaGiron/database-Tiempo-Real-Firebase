package pe.edu.david.firebaseapp;

public class User {
    private String uid;
    private String displayName;
    private String email;
    private String phptoUrl;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhptoUrl() {
        return phptoUrl;
    }

    public void setPhptoUrl(String phptoUrl) {
        this.phptoUrl = phptoUrl;
    }


    @Override
    public String toString() {
        return "User{" +
                "uid='" + uid + '\'' +
                ", displayName='" + displayName + '\'' +
                ", email='" + email + '\'' +
                ", phptoUrl='" + phptoUrl + '\'' +
                '}';
    }
}
