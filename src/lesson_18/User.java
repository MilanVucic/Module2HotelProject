package lesson_18;

@Stringify(includeClassName = false, delimiter = " ")
public class User {
    @StringifyFieldName("Email")
    private String email;
    @StringifyFieldName("User name")
    private String username;
    @StringifyIgnore
    private String password;

    public User(String email, String username, String password) {
        this.email = email;
        this.username = username;
        this.password = password;
    }
}
