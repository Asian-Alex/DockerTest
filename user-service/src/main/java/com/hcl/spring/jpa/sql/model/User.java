package com.hcl.spring.jpa.sql.model;

import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
@Table(name = "users_table")
//@Data   // useful annotation to reduce boilerplate getter/setter
public class User {
    // -----------------------------------------
    //    ATTRIBUTES
    // -----------------------------------------
    //  MINIMUM SPEC
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="user_id")
    private long userId;

    @NonNull
//    @Column(name = "email")
    private String email;

    @NonNull
    @Column(name = "password")
    private String password;

    @NonNull
    @Column(name = "is_admin")
    private boolean isAdmin;

    @NonNull
    @Column(name = "username")
    private String username;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;
    //	//    The target destination supplied by Destination service
//	@Column(name = "destination")
//	private Destination destination;
//
//	//    List of destinations for the specific destination supplied by the RecommendationService
//	@Column(name = "recommendations")
//	private Object recommendations;
//
//	//    List of reviews for the destination supplied by DestinationService
//	@Column(name = "reviews")
//	private Object reviews;
//

    // -----------------------------------------
    //    CONSTRUCTORS
    // -----------------------------------------
    public User() {

    }

    public User(@NonNull String email, @NonNull String password, boolean isAdmin) {
        this(email, password, false, "");
    }

    public User(@NonNull String email, @NonNull String password, boolean isAdmin, @NonNull String username) {
        this.email = email;
        this.password = password;
        this.isAdmin = isAdmin;
        this.username = username;
    }

    // -----------------------------------------
    //    GETTERS / SETTERS
    // -----------------------------------------
    //  MINIMUM SPEC

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

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public long getUserId() {
        return userId;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + userId +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", isAdmin=" + isAdmin +
                ", username='" + username + '\'' +
                '}';
    }
}