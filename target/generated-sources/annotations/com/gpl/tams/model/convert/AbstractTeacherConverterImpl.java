package com.gpl.tams.model.convert;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gpl.tams.model.data.TeacherDO;
import com.gpl.tams.model.dto.TeacherSaveDTO;
import com.gpl.tams.model.vo.TeacherListVO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-10-08T10:20:29+0800",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_302 (Amazon.com Inc.)"
)
public class AbstractTeacherConverterImpl extends AbstractTeacherConverter {

    @Override
    public Page<TeacherListVO> doPage2ListVoPage(IPage<TeacherDO> doPage) {
        if ( doPage == null ) {
            return null;
        }

        Page<TeacherListVO> page = new Page<TeacherListVO>();

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
    public List<TeacherListVO> doList2ListVoList(List<TeacherDO> doList) {
        if ( doList == null ) {
            return null;
        }

        List<TeacherListVO> list = new ArrayList<TeacherListVO>( doList.size() );
        for ( TeacherDO teacherDO : doList ) {
            list.add( do2ListVO( teacherDO ) );
        }

        return list;
    }

    @Override
    public TeacherListVO do2ListVO(TeacherDO dataObj) {
        if ( dataObj == null ) {
            return null;
        }

        TeacherListVO teacherListVO = new TeacherListVO();

        teacherListVO.setId( dataObj.getId() );
        teacherListVO.setName( dataObj.getName() );
        teacherListVO.setPassword( dataObj.getPassword() );
        teacherListVO.setEnableState( dataObj.getEnableState() );

        return teacherListVO;
    }

    @Override
    public TeacherDO saveDto2DO(TeacherSaveDTO saveDTO) {
        if ( saveDTO == null ) {
            return null;
        }

        TeacherDO teacherDO = new TeacherDO();

        teacherDO.setName( saveDTO.getName() );
        teacherDO.setPassword( saveDTO.getPassword() );

        return teacherDO;
    }
}
