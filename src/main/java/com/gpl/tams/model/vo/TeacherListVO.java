package com.gpl.tams.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "教师列表返回结果")
@Data
public class TeacherListVO {

    @ApiModelProperty(value = "id")
    private Long id;

    @ApiModelProperty(value = "姓名")
    private String name;

    @ApiModelProperty(value = "密码")
    private String password;

    @ApiModelProperty(value = "停启用状态")
    private Integer enableState;
}
