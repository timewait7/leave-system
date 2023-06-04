package com.tw.leave.infrastructure.util;

import com.tw.leave.api.dto.LeaveDTO;
import com.tw.leave.domain.leave.entity.Leave;
import ma.glasnost.orika.CustomMapper;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.MappingContext;
import ma.glasnost.orika.impl.DefaultMapperFactory;

import java.util.List;

/**
 * @Author linfeng
 * @create 2023/6/2 12:22 下午
 */
public class OrikaBeanUtil {

    public static MapperFacade mapperFacade;

    public static MapperFactory mapperFactory = new DefaultMapperFactory.Builder().mapNulls(false).build();

    public static <S, T> T convert(S source, Class<T> target) {
        return mapperFacade.map(source, target);
    }

    public static <S, T> List<T> convertList(List<S> sources, Class<T> target) {
        return mapperFacade.mapAsList(sources, target);
    }

    public static <S, T> void map(S source, T target) {
        mapperFacade.map(source, target);
    }

    static {
        mapperFactory.getConverterFactory().registerConverter(new OrikaConverters.IntegerToBooleanConverter());

        mapperFactory.getConverterFactory().registerConverter(new OrikaConverters.StringToListConverter());
    }

    static {
        mapperFactory.classMap(LeaveDTO.class, Leave.class)
                .customize(new CustomMapper<LeaveDTO, Leave>() {
                    @Override
                    public void mapAtoB(LeaveDTO leaveDTO, Leave leave, MappingContext context) {
                        super.mapAtoB(leaveDTO, leave, context);
                    }

                    @Override
                    public void mapBtoA(Leave leave, LeaveDTO leaveDTO, MappingContext context) {
                        super.mapBtoA(leave, leaveDTO, context);
                    }
                })
                .byDefault().register();
    }
}
