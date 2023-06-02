package com.tw.leave.infrastructure.util;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
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
}
