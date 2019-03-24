package com.demo.mybatisPlus.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("user")
@ApiModel(value = "用户")
public class User implements Serializable {
    @TableId(value = "id")
    @ApiModelProperty(value = "用户id")
    private Long id;
    @ApiModelProperty(value = "用户姓名")
    @TableField(value = "name")
    private String name;
    @ApiModelProperty(value = "用户年龄")
    @TableField(value = "age")
    private Integer age;
    @TableField(value = "email")
    @ApiModelProperty(value = "用户邮箱")
    private String email;
}
