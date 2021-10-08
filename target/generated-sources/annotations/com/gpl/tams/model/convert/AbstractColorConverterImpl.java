package com.gpl.tams.model.convert;

import com.gpl.tams.model.data.ColorDO;
import com.gpl.tams.model.vo.ColorListVO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-10-08T10:20:29+0800",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_302 (Amazon.com Inc.)"
)
public class AbstractColorConverterImpl extends AbstractColorConverter {

    @Override
    public List<ColorListVO> doList2ListVoList(List<ColorDO> doList) {
        if ( doList == null ) {
            return null;
        }

        List<ColorListVO> list = new ArrayList<ColorListVO>( doList.size() );
        for ( ColorDO colorDO : doList ) {
            list.add( colorDOToColorListVO( colorDO ) );
        }

        return list;
    }

    protected ColorListVO colorDOToColorListVO(ColorDO colorDO) {
        if ( colorDO == null ) {
            return null;
        }

        ColorListVO colorListVO = new ColorListVO();

        colorListVO.setId( colorDO.getId() );
        colorListVO.setName( colorDO.getName() );
        colorListVO.setValue( colorDO.getValue() );

        return colorListVO;
    }
}
