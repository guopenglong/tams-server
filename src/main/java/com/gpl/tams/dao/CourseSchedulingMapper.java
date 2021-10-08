package com.gpl.tams.dao;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.gpl.tams.model.data.CourseSchedulingDO;
import com.gpl.tams.model.vo.CourseSchedulingExportVO;
import com.gpl.tams.model.vo.CourseSchedulingListVO;
import com.gpl.tams.model.vo.CourseSchedulingReportVO;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public interface CourseSchedulingMapper extends BaseMapper<CourseSchedulingDO> {

    List<CourseSchedulingListVO> selectCourseSchedulingList(@Param(Constants.WRAPPER) Wrapper<?> queryWrapper);

    CourseSchedulingListVO selectCourseSchedulingById(Long id);

    List<Map<String, String>> selectCourseSchedulingCourseCount(@Param(Constants.WRAPPER) Wrapper<?> queryWrapper);

    List<String> selectTimePeriodByDateRange(@Param("dateList") List<LocalDate> dateList, @Param("classroomId") Long classroomId, @Param("teacherId") Long teacherId);

    List<CourseSchedulingExportVO> selectByDateRange(@Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate, @Param("classroomId") Long classroomId,@Param("teacherId") Long teacherId);

    List<CourseSchedulingReportVO> selectReportTeacherCount(@Param("startDate") String startDate, @Param("endDate") String endDate);

    List<CourseSchedulingReportVO> selectReportCourseCount(@Param("startDate") String startDate, @Param("endDate") String endDate);
}
