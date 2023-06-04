package com.tw.leave.infrastructure.common;


import lombok.Data;

@Data
public class ResultModel<T> {

    private String code;

    private String msg;

    private T data;

    private MetaData metaData;

    public ResultModel() {

    }

    public ResultModel(final String code, final String msg, final T data, final MetaData metaData) {
        this.code = code;
        this.msg = msg;
        this.data = data;
        this.metaData = metaData;
    }

    public static <T> ResultModel<T> ok(T data) {
        return (ResultModel<T>) builder().code(BasicCode.OK.code).msg(BasicCode.OK.desc).data(data).build();
    }

    public static <T> ResultModel<T> ok(T data, MetaData metaData) {
        return (ResultModel<T>) builder().code(BasicCode.OK.code).msg(BasicCode.OK.desc).data(data).metaData(metaData).build();
    }

    public static <T> ResultModel<T> fail(T data) {
        return (ResultModel<T>) builder().code(BasicCode.FAIL.code).msg(BasicCode.FAIL.desc).data(data).build();
    }

    public static <T> ResultModel<T> fail(T data, MetaData metaData) {
        return (ResultModel<T>) builder().code(BasicCode.FAIL.code).msg(BasicCode.FAIL.desc).data(data).metaData(metaData).build();
    }

    public static <T> ResultModel.ResultModelBuilder<T> builder() {
        return new ResultModel.ResultModelBuilder<>();
    }

    public static class ResultModelBuilder<T> {
        private String code;

        private String msg;

        private T data;

        private MetaData metaData;

        ResultModelBuilder() {

        }

        public ResultModel.ResultModelBuilder<T> code(final String code) {
            this.code = code;
            return this;
        }

        public ResultModel.ResultModelBuilder<T> msg(final String msg) {
            this.msg = msg;
            return this;
        }

        public ResultModel.ResultModelBuilder<T> data(final T data) {
            this.data = data;
            return this;
        }

        public ResultModel.ResultModelBuilder<T> metaData(final MetaData metaData) {
            this.metaData = metaData;
            return this;
        }

        public ResultModel<T> build() {
            return new ResultModel<>(this.code, this.msg, this.data, this.metaData);
        }
    }
}
