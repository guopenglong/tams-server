package com.gpl.tams.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "教师分页查询参数")
@Data
public class TeacherSaveDTO {

    @ApiModelProperty(value = "姓名")
    private String name;

    @ApiModelProperty(value = "密码")
    private String password;

}
