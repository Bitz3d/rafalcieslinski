package rafalcieslinski

class User {

    String login
    String firstName
    String lastName
    String password
    String confirmPassword
    String email
    String role

    static constraints = {


        login(blank: false, unique: true )
        firstName(blank: false)
        lastName(blank: false)
        password(min: '8',blank: false, nullable: false)
        confirmPassword(min: '8', blank: false, nullable: false, transparent: true)
        email(email: true, blank: false)
        role(nullable: false)

    }

}
