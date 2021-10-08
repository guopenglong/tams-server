package com.gpl.tams.model.convert;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gpl.tams.model.data.ClassroomDO;
import com.gpl.tams.model.dto.ClassroomSaveDTO;
import com.gpl.tams.model.vo.ClassroomListVO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-10-08T10:20:29+0800",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_302 (Amazon.com Inc.)"
)
public class AbstractClassroomConverterImpl extends AbstractClassroomConverter {

    @Override
    public Page<ClassroomListVO> doPage2ListVoPage(IPage<ClassroomDO> doPage) {
        if ( doPage == null ) {
            return null;
        }

        Page<ClassroomListVO> page = new Page<ClassroomListVO>();

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
    public List<ClassroomListVO> doList2ListVoList(List<ClassroomDO> doList) {
        if ( doList == null ) {
            return null;
        }

        List<ClassroomListVO> list = new ArrayList<ClassroomListVO>( doList.size() );
        for ( ClassroomDO classroomDO : doList ) {
            list.add( do2ListVO( classroomDO ) );
        }

        return list;
    }

    @Override
    public ClassroomListVO do2ListVO(ClassroomDO dataObj) {
        if ( dataObj == null ) {
            return null;
        }

        ClassroomListVO classroomListVO = new ClassroomListVO();

        classroomListVO.setId( dataObj.getId() );
        classroomListVO.setName( dataObj.getName() );
        classroomListVO.setEnableState( dataObj.getEnableState() );

        return classroomListVO;
    }

    @Override
    public ClassroomDO saveDto2DO(ClassroomSaveDTO saveDTO) {
        if ( saveDTO == null ) {
            return null;
        }

        ClassroomDO classroomDO = new ClassroomDO();

        classroomDO.setName( saveDTO.getName() );

        return classroomDO;
    }
}
