package com.gpl.tams.model.convert;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gpl.tams.model.data.CourseDO;
import com.gpl.tams.model.dto.CourseSaveDTO;
import com.gpl.tams.model.vo.CourseListVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public abstract class AbstractCourseConverter {

    public static AbstractCourseConverter INSTANCE = Mappers.getMapper(AbstractCourseConverter.class);

    public abstract Page<CourseListVO> doPage2ListVoPage(IPage<CourseDO> doPage);

    public abstract List<CourseListVO> doList2ListVoList(List<CourseDO> doList);

    public abstract CourseListVO do2ListVO(CourseDO dataObj);

    public abstract CourseDO saveDto2DO(CourseSaveDTO saveDTO);

}
