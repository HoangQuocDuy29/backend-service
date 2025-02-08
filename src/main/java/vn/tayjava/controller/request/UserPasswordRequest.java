package vn.tayjava.controller.request;

import jakarta.validation.constraints.*;
import lombok.Getter;

import java.io.Serializable;

@Getter
public class UserPasswordRequest implements Serializable {
    @NotNull(message = "Không đc bỏ trống Id")
    @Min(value = 1, message = "ID phải có giá trị > 0")
    private Long id;
    @NotBlank(message = "password Không đc bỏ trống")
    private String password;
    @NotBlank(message = "confirmPassword Không đc bỏ trống")
    private String confirmPassword;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}