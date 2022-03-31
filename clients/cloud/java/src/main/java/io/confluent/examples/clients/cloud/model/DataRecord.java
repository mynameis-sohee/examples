package io.confluent.examples.clients.cloud.model;

// public class DataRecord {

//     Long count;

//     public DataRecord() {
//     }

//     public DataRecord(Long count) {
//         this.count = count;
//     }

//     public Long getCount() {
//         return count;
//     }

//     public String toString() {
//         return new com.google.gson.Gson().toJson(this);
//     }

// }



public class DataRecord {

    private Object AttributesMap;
    private String MessageData;

    public DataRecord() {
    }

    public DataRecord(Object AttributesMap, String MessageData) {
        this.AttributesMap = AttributesMap;
        this.MessageData = MessageData;
    }

    public Object getAttributesMap() {
        return AttributesMap;
    }

    public void setAttributesMap(Object AttributesMap) {
        this.AttributesMap = AttributesMap;
    }

    public String getMessageData() {
        return MessageData;
    }

    public void setMessageData(String MessageData) {
        this.MessageData = MessageData;
    }

    @Override
    public String toString() {
        return "Foo{" +
                "AttributesMap='" + AttributesMap + '\'' +
                ", MessageData='" + MessageData + '\'' +
                '}';
    }
}