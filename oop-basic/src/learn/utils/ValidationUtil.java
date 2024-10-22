package learn.utils;

import learn.data.LoginRequest;
import learn.errors.ValidationExceptions;

public class ValidationUtil {
    public void validateLoginUser(LoginRequest loginRequest) throws ValidationExceptions{
        if(loginRequest.getUsername()==null){
            throw new ValidationExceptions("Usernam is null");
        }else if(loginRequest.getUsername().equals("")){
            throw new ValidationExceptions("Username is blank");
        }
    }
}
