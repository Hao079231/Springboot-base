package com.base.auth.form.customer;

import com.base.auth.validation.Gender;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import lombok.Data;

@Data
@ApiModel
public class CreateCustomerForm {
  @NotEmpty(message = "username cant not be null")
  @ApiModelProperty(name = "username", required = true)
  private String username;
  @ApiModelProperty(name = "email")
  @Email
  private String email;
  @ApiModelProperty(name = "phone")
  private String phone;
  @NotEmpty(message = "password cant not be null")
  @ApiModelProperty(name = "password", required = true)
  private String password;
  @NotNull(message = "kind cant not be null")
  @ApiModelProperty(name = "kind", required = true)
  private Integer kind;
  @NotEmpty(message = "fullName cant not be null")
  @ApiModelProperty(name = "fullName",example = "Trinh Trung Hao",required = true)
  private String fullName;
  private String avatarPath;
  @Past(message = "birthday must be a past day.")
  @ApiModelProperty(name = "birthday", example = "22-12-2012", required = true)
  @JsonFormat(pattern = "dd-MM-yyyy")
  private Date birthday;
  @Gender
  @NotNull(message = "gender cant not be null")
  @ApiModelProperty(name = "gender", example = "0 - nam, 1 - nu, 2 - khac", required = true)
  private Integer gender;
  @NotEmpty(message = "address cant not be null")
  @ApiModelProperty(name = "address", example = "Quan 9, TPHCM", required = true)
  private String address;
  @NotNull(message = "province cant not be null")
  @ApiModelProperty(name = "provinceId", required = true)
  private Long provinceId;
  @NotNull(message = "district cant not be null")
  @ApiModelProperty(name = "districtId", required = true)
  private Long districtId;
  @NotNull(message = "commune cant not be null")
  @ApiModelProperty(name = "communeId", required = true)
  private Long communeId;
}
