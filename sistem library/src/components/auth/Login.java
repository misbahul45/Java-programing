package components.auth;

import java.util.ArrayList;

import components.User;

public class Login {
    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void LoginUser(ArrayList<User> listUser) throws Exception {
        boolean isLogin = false;
        for (User user : listUser) {
            if (user.getName().equals(this.name) && user.getPassword().equals(this.password)) {
                isLogin = true;
                break;
            }
        }

        if (isLogin) {
            System.out.println("Login Success\n");
            return;
        } else {
            throw new Exception("Username or Password is incorrect\n");
        }
    }

    public void RegisterUser(ArrayList<User> listUser) throws Exception {
        for (User user : listUser) {
            if (user.getName().equals(this.name)) {
                throw new Exception("Username already exists\n");
            } else {
                System.out.println("Register Success\n");
                return;
            }
        }
    }

}
