package models;

public class Record {
    private String resource;
    private String login;
    private String password;

    public Record(String resource, String login, String password) {
        this.resource = resource;
        this.login = login;
        this.password = password;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return '\n' + "{" +
                "Resource='" + resource + '\'' +
                ", Login='" + login + '\'' +
                ", Password='" + password + '\'' +
                '}' + '\n';
    }
}
