package com.gpl.tams.model.convert;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gpl.tams.model.data.ClassroomDO;
import com.gpl.tams.model.dto.ClassroomSaveDTO;
import com.gpl.tams.model.vo.ClassroomListVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public abstract class AbstractClassroomConverter {

    public static AbstractClassroomConverter INSTANCE = Mappers.getMapper(AbstractClassroomConverter.class);

    public abstract Page<ClassroomListVO> doPage2ListVoPage(IPage<ClassroomDO> doPage);

    public abstract List<ClassroomListVO> doList2ListVoList(List<ClassroomDO> doList);

    public abstract ClassroomListVO do2ListVO(ClassroomDO dataObj);

    public abstract ClassroomDO saveDto2DO(ClassroomSaveDTO saveDTO);

}
