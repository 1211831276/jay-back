package org.jay.admin.domain;


import com.baomidou.mybatisplus.annotation.*;

@TableName("user")
public class UserDO {
    @TableId(type = IdType.AUTO)
    private Long id;
    @TableField("name")
    private String username;
    private String password;
    private Integer gender;
    @TableLogic(value = "0", delval = "1")
    @TableField("is_deleted")
    private Boolean deleted;
}
