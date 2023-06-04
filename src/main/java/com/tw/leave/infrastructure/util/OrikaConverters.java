package com.tw.leave.infrastructure.util;

import com.google.common.collect.Lists;
import ma.glasnost.orika.MappingContext;
import ma.glasnost.orika.converter.BidirectionalConverter;
import ma.glasnost.orika.metadata.Type;
import org.apache.commons.lang.StringUtils;

import java.util.Arrays;
import java.util.List;

public class OrikaConverters {

    public static class StringToListConverter extends BidirectionalConverter<String, List<String>> {

        @Override
        public List<String> convertTo(String source, Type<List<String>> destinationType, MappingContext mappingContext) {
            if (StringUtils.isBlank(source)) {
                return Lists.newArrayList();
            }
            return Arrays.asList(source.split(","));
        }

        @Override
        public String convertFrom(List<String> source, Type<String> type, MappingContext mappingContext) {
            return String.join(",", source);
        }
    }

    public static class IntegerToBooleanConverter extends BidirectionalConverter<Integer, Boolean> {
        @Override
        public Boolean convertTo(Integer source, Type<Boolean> destinationType, MappingContext mappingContext) {
            return source.equals(1);
        }

        @Override
        public Integer convertFrom(Boolean source, Type<Integer> destinationType, MappingContext mappingContext) {
            return source ? 1 : 0;
        }
    }
}
