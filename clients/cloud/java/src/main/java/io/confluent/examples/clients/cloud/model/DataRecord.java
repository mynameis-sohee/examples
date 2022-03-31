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

    private Long name;
    private String description;

    public DataRecord() {
    }

    public DataRecord(Long name, String description) {
        this.name = name;
        this.description = description;
    }

    public Long getName() {
        return name;
    }

    public void setName(Long name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Foo{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}