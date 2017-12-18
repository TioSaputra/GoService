package coder.service.go.com.goservice.model;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by tio on 12/10/17.
 */
@IgnoreExtraProperties
public class User {
    public String name;
    public String email;
    public User() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String username, String email) {
        this.name = username;

        this.email = email;
    }

    public User(String username, String email, String password) {
        this.name = username;
        this.email = email;
    }
}
