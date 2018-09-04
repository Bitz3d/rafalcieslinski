class User {

    Long id
    String login
    String firstName
    String lastName
    String password
    String confirmPassword
    String email
    String role

    static constraints = {

        id( blank: false,nullable: false, unique: true )
        login(blank: false, unique: true )
        firstName(blank: false)
        lastName(blank: false)
        password(min: 8, blank: false, nullable: false)
        confirmPassword(min: 8, blank: false, nullable: false, transparent: true)
        email(email: true, blank: false)
        role(nullable: false)

    }

    User(String login, String firstName, String lastName, String password, String confirmPassword, String email, String role) {
        this.login = login
        this.firstName = firstName
        this.lastName = lastName
        this.password = password
        this.confirmPassword = confirmPassword
        this.email = email
        this.role = role
    }

    String getLogin() {
        return login
    }

    void setLogin(String login) {
        this.login = login
    }

    String getFirstName() {
        return firstName
    }

    void setFirstName(String firstName) {
        this.firstName = firstName
    }

    String getLastName() {
        return lastName
    }

    void setLastName(String lastName) {
        this.lastName = lastName
    }

    String getPassword() {
        return password
    }

    void setPassword(String password) {
        this.password = password
    }

    String getConfirmPassword() {
        return confirmPassword
    }

    void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword
    }

    String getEmail() {
        return email
    }

    void setEmail(String email) {
        this.email = email
    }

    String getRole() {
        return role
    }

    void setRole(String role) {
        this.role = role
    }

}
