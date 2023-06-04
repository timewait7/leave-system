package com.tw.leave.infrastructure.common;

public class MetaData {

    private String uri;

    private String method;

    private String traceId;

    private String spanId;

    public MetaData() {

    }

    public MetaData(String uri, String method, String traceId, String spanId) {
        this.uri = uri;
        this.method = method;
        this.traceId = traceId;
        this.spanId = spanId;
    }

    public static MetaData.MetaDataBuilder builder() {
        return new MetaData.MetaDataBuilder();
    }

    public static class MetaDataBuilder {
        private String uri;

        private String method;

        private String traceId;

        private String spanId;

        public MetaData.MetaDataBuilder uri(final String uri) {
            this.uri = uri;
            return this;
        }

        public MetaData build() {
            return new MetaData(this.uri, this.method, this.traceId, this.spanId);
        }
    }
}
