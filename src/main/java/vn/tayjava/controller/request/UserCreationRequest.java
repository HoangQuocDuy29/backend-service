package vn.tayjava.controller.request;

import com.fasterxml.jackson.annotation.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import vn.tayjava.common.Gender;
import vn.tayjava.common.UserType;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
public class UserCreationRequest implements Serializable {
    private String firstName;
    private String lastName;
    private Gender gender;
    private Date birthday;
    private String username;
    private String email;
    private String phone;
    private UserType type;
    private List<AddressRequest> addresses; // home,office


}