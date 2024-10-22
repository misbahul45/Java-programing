package validations;

import java.util.ArrayList;

import components.User;

public class Validation {

    public void ValidationAuth(User user) throws Exception {
        if (user.getName().equals("") || user.getPassword().equals("")) {
            throw new Exception("Username or Password cannot be null");
        } else if (user.getName() == null || user.getPassword() == null) {
            throw new Exception("Username or Password cannot be null");
        }
        return;
    }

}
