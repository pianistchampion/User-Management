package com.example.springboot.entity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;
import lombok.Value;

import java.time.LocalDateTime;
//ctrl + alt +O 去除无用的包


@Data//提供set和get方法
@TableName(value = "user")
@ToString
@ApiModel(value = "User对象",description = "")
public class User {
    @ApiModelProperty("id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    @ApiModelProperty("用户名称")
    private String username;
    @JsonIgnore
    @ApiModelProperty("密码")
    private String password;
    @ApiModelProperty("昵称")
    private String nickname;
    @ApiModelProperty("邮箱")
    private String email;
    @ApiModelProperty("电话")
    private String phone;
    @ApiModelProperty("地址")
    private String address;
    @ApiModelProperty("创建时间")
    private LocalDateTime create_time;
    @ApiModelProperty("头像")
    @TableField(value = "avatar_url")//驼峰
    private String avatarUrl;
}
