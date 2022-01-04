package models;

public class Record {
    public  String resource;
    public  String login;
    public  String password;

    public Record(String resource, String login, String password) {
        this.resource = resource;
        this.login = login;
        this.password = password;
    }

    public  String getResource() {
        return resource;
    }

    public  void setResource(String resource) {
        this.resource = resource;
    }

    public  String getLogin() {
        return login;
    }

    public  void setLogin(String login) {
        this.login = login;
    }

    public  String getPassword() {
        return password;
    }

    public  void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Record{" +
                "resource='" + resource + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
