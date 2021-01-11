package com.example.web.resource;

import com.example.web.validator.CheckDateFormat;
import com.example.web.validator.UniqueEmail;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserResource {

    @JsonIgnore
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Long userId;

    @NotBlank(message = "Email Address is compulsory")
    @Email(message = "Email Address is not valid")
    @UniqueEmail
    private String email;

    @NotEmpty(message = "First name is compulsory")
    @Pattern(regexp = "[a-z-A-Z]*", message = "First name has invalid characters")
    private String firstName;

    @NotEmpty(message = "Last name is compulsory")
    @Pattern(regexp = "[a-z-A-Z]*", message = "Last name has invalid characters")
    private String lastName;

    @NotEmpty(message = "Password is compulsory")
    private String password;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @CheckDateFormat(pattern = "yyyy-MM-dd")
    private String dob;
}
