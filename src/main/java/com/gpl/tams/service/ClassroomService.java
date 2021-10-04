package com.gpl.tams.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.gpl.tams.model.dto.ClassroomPageQuery;
import com.gpl.tams.model.dto.ClassroomSaveDTO;
import com.gpl.tams.model.vo.ClassroomListVO;

import java.util.List;

public interface ClassroomService {

    IPage<ClassroomListVO> pageCourse(ClassroomPageQuery pageQuery);

    List<ClassroomListVO> refList();

    ClassroomListVO getCourseById(Long id);

    boolean saveCourse(ClassroomSaveDTO saveDTO);

    boolean updateCourseById(Long id, ClassroomSaveDTO saveDTO);

    boolean updateCourseEnableStateById(Long id, Integer enableState);
}
