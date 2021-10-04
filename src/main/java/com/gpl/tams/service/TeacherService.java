package com.gpl.tams.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.gpl.tams.model.data.TeacherDO;
import com.gpl.tams.model.dto.TeacherPageQuery;
import com.gpl.tams.model.dto.TeacherSaveDTO;
import com.gpl.tams.model.vo.TeacherListVO;

import java.util.List;

public interface TeacherService {

    IPage<TeacherListVO> pageTeacher(TeacherPageQuery pageQuery);

    List<TeacherListVO> refList();

    TeacherListVO getTeacherById(Long id);

    boolean saveTeacher(TeacherSaveDTO saveDTO);

    boolean updateTeacherById(Long id, TeacherSaveDTO saveDTO);

    boolean updateTeacherEnableStateById(Long id, Integer enableState);

    boolean loginByTeacher(TeacherDO teacherDO);
}
