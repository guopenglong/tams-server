package com.gpl.tams.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gpl.tams.dao.ColorMapper;
import com.gpl.tams.model.data.ColorDO;
import com.gpl.tams.service.ColorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColorServiceImpl extends ServiceImpl<ColorMapper, ColorDO> implements ColorService {

    @Override
    public List<String> getEffectiveList() {

        LambdaQueryWrapper<ColorDO> queryWrapper = Wrappers.<ColorDO>lambdaQuery()
                .select(ColorDO::getValue)
                .notExists("select 1 from t_course course where course.background_color = t_color.value")
                .orderByAsc(ColorDO::getValue);

        return listObjs(queryWrapper, Object::toString);
    }
}
