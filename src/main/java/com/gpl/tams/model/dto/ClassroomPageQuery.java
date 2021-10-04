package com.gpl.tams.model.dto;

import com.gpl.tams.model.BasePageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "教室分页查询参数")
@Data
public class ClassroomPageQuery extends BasePageQuery {

    @ApiModelProperty(value = "停启用状态")
    private Integer enableState;
}
