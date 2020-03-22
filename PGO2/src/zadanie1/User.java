package zadanie1;

public class User {


    private String name;
    private String lastName;
    private String email;
    private String password;
    private boolean isGuest;

    public User(String name, String lastName, String email, String password)throws Exception{
        if(name==null||lastName==null||email==null||password==null) throw new Exception("Błąd danych");
        this.name=name;
        this.lastName=lastName;
        this.email=email;
        this.password=password;
        this.setGuest(false);
    }

    public User(String email)throws Exception{
        if(email==null)throw new Exception("Błąd danych");
        this.email=email;
        this.setGuest(true);
    }

    public void setUserFromGuest(String name, String lastName, String password){
       this.name=name;
       this.lastName=lastName;
       this.password=password;
       setGuest(false);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isGuest() {
        return isGuest;
    }

    public void setGuest(boolean guest) {
        isGuest = guest;
    }

    @Override
    public String toString() {
        return "zadanie1.User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", isGuest=" + isGuest +
                '}';
    }

}
