package com.gpl.tams.model.convert;

import com.gpl.tams.model.data.CourseSchedulingDO;
import com.gpl.tams.model.dto.CourseSchedulingBatchSaveDTO;
import com.gpl.tams.model.dto.CourseSchedulingSaveDTO;
import com.gpl.tams.model.dto.CourseSchedulingTimeUpdateDTO;
import com.gpl.tams.model.dto.CourseSchedulingUpdateDTO;
import com.gpl.tams.model.vo.CourseSchedulingListVO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-10-08T10:20:29+0800",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_302 (Amazon.com Inc.)"
)
public class AbstractCourseSchedulingConverterImpl extends AbstractCourseSchedulingConverter {

    @Override
    public List<CourseSchedulingListVO> doList2ListVoList(List<CourseSchedulingDO> doList) {
        if ( doList == null ) {
            return null;
        }

        List<CourseSchedulingListVO> list = new ArrayList<CourseSchedulingListVO>( doList.size() );
        for ( CourseSchedulingDO courseSchedulingDO : doList ) {
            list.add( do2ListVO( courseSchedulingDO ) );
        }

        return list;
    }

    @Override
    public CourseSchedulingListVO do2ListVO(CourseSchedulingDO dataObj) {
        if ( dataObj == null ) {
            return null;
        }

        CourseSchedulingListVO courseSchedulingListVO = new CourseSchedulingListVO();

        courseSchedulingListVO.setId( dataObj.getId() );
        courseSchedulingListVO.setClassroomId( dataObj.getClassroomId() );
        courseSchedulingListVO.setCourseId( dataObj.getCourseId() );
        courseSchedulingListVO.setTeacherId( dataObj.getTeacherId() );
        courseSchedulingListVO.setDate( dataObj.getDate() );
        courseSchedulingListVO.setAttendTime( dataObj.getAttendTime() );
        courseSchedulingListVO.setFinishTime( dataObj.getFinishTime() );

        return courseSchedulingListVO;
    }

    @Override
    public CourseSchedulingDO saveDto2DO(CourseSchedulingSaveDTO saveDTO) {
        if ( saveDTO == null ) {
            return null;
        }

        CourseSchedulingDO courseSchedulingDO = new CourseSchedulingDO();

        courseSchedulingDO.setClassroomId( saveDTO.getClassroomId() );
        courseSchedulingDO.setCourseId( saveDTO.getCourseId() );
        courseSchedulingDO.setTeacherId( saveDTO.getTeacherId() );
        courseSchedulingDO.setDate( saveDTO.getDate() );
        courseSchedulingDO.setAttendTime( saveDTO.getAttendTime() );
        courseSchedulingDO.setFinishTime( saveDTO.getFinishTime() );

        return courseSchedulingDO;
    }

    @Override
    public CourseSchedulingDO batchSaveDto2DO(CourseSchedulingBatchSaveDTO saveDTO) {
        if ( saveDTO == null ) {
            return null;
        }

        CourseSchedulingDO courseSchedulingDO = new CourseSchedulingDO();

        courseSchedulingDO.setClassroomId( saveDTO.getClassroomId() );
        courseSchedulingDO.setCourseId( saveDTO.getCourseId() );
        courseSchedulingDO.setTeacherId( saveDTO.getTeacherId() );
        courseSchedulingDO.setAttendTime( saveDTO.getAttendTime() );
        courseSchedulingDO.setFinishTime( saveDTO.getFinishTime() );

        return courseSchedulingDO;
    }

    @Override
    public CourseSchedulingDO timeUpdateDto2DO(CourseSchedulingTimeUpdateDTO updateDTO) {
        if ( updateDTO == null ) {
            return null;
        }

        CourseSchedulingDO courseSchedulingDO = new CourseSchedulingDO();

        courseSchedulingDO.setDate( updateDTO.getDate() );
        courseSchedulingDO.setAttendTime( updateDTO.getAttendTime() );
        courseSchedulingDO.setFinishTime( updateDTO.getFinishTime() );

        return courseSchedulingDO;
    }

    @Override
    public CourseSchedulingDO updateDto2DO(CourseSchedulingUpdateDTO updateDTO) {
        if ( updateDTO == null ) {
            return null;
        }

        CourseSchedulingDO courseSchedulingDO = new CourseSchedulingDO();

        courseSchedulingDO.setClassroomId( updateDTO.getClassroomId() );
        courseSchedulingDO.setCourseId( updateDTO.getCourseId() );
        courseSchedulingDO.setTeacherId( updateDTO.getTeacherId() );

        return courseSchedulingDO;
    }
}
