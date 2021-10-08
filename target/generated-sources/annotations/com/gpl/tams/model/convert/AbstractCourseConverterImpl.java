package com.gpl.tams.model.convert;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gpl.tams.model.data.CourseDO;
import com.gpl.tams.model.dto.CourseSaveDTO;
import com.gpl.tams.model.vo.CourseListVO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-10-08T10:20:29+0800",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_302 (Amazon.com Inc.)"
)
public class AbstractCourseConverterImpl extends AbstractCourseConverter {

    @Override
    public Page<CourseListVO> doPage2ListVoPage(IPage<CourseDO> doPage) {
        if ( doPage == null ) {
            return null;
        }

        Page<CourseListVO> page = new Page<CourseListVO>();

        page.setPages( doPage.getPages() );
        page.setRecords( doList2ListVoList( doPage.getRecords() ) );
        page.setTotal( doPage.getTotal() );
        page.setSize( doPage.getSize() );
        page.setCurrent( doPage.getCurrent() );
        page.setSearchCount( doPage.isSearchCount() );
        page.setHitCount( doPage.isHitCount() );

        return page;
    }

    @Override
    public List<CourseListVO> doList2ListVoList(List<CourseDO> doList) {
        if ( doList == null ) {
            return null;
        }

        List<CourseListVO> list = new ArrayList<CourseListVO>( doList.size() );
        for ( CourseDO courseDO : doList ) {
            list.add( do2ListVO( courseDO ) );
        }

        return list;
    }

    @Override
    public CourseListVO do2ListVO(CourseDO dataObj) {
        if ( dataObj == null ) {
            return null;
        }

        CourseListVO courseListVO = new CourseListVO();

        courseListVO.setId( dataObj.getId() );
        courseListVO.setName( dataObj.getName() );
        courseListVO.setEnableState( dataObj.getEnableState() );
        courseListVO.setDuration( dataObj.getDuration() );
        courseListVO.setBackgroundColor( dataObj.getBackgroundColor() );

        return courseListVO;
    }

    @Override
    public CourseDO saveDto2DO(CourseSaveDTO saveDTO) {
        if ( saveDTO == null ) {
            return null;
        }

        CourseDO courseDO = new CourseDO();

        courseDO.setName( saveDTO.getName() );
        courseDO.setDuration( saveDTO.getDuration() );
        courseDO.setBackgroundColor( saveDTO.getBackgroundColor() );

        return courseDO;
    }
}
