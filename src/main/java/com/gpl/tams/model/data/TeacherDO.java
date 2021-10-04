package com.gpl.tams.model.data;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_teacher")
public class TeacherDO {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 密码
     */
    private String password;
    /**
     * 停启用状态
     */
    private Integer enableState;

    @TableField(select = false)
    private String token;

    public TeacherDO() {
    }

    public TeacherDO(String name, String password) {
        this.name = name;
        this.password = password;
    }
}
