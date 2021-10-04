package com.gpl.tams.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gpl.tams.model.data.TeacherDO;

public interface TeacherMapper extends BaseMapper<TeacherDO> {

    TeacherDO getTeacherNameByTeacher(TeacherDO teacherDO);
}
