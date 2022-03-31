# Overview

Produce messages to and consume messages from a Kafka cluster using the Java Producer and Consumer, and Kafka Streams API.


# Documentation

You can find the documentation and instructions for running this Java example at [https://docs.confluent.io/platform/current/tutorials/examples/clients/docs/java.html](https://docs.confluent.io/platform/current/tutorials/examples/clients/docs/java.html?utm_source=github&utm_medium=demo&utm_campaign=ch.examples_type.community_content.clients-ccloud)



mvn clean package

## 필드 수정하는법
/Users/hansohee/dev/confluent_java_examples/examples/clients/cloud/java/target/generated-sources/io/confluent/examples/clients/cloud/DataRecordAvro.java

## 실행하는법
mvn exec:java -Dexec.mainClass="io.confluent.examples.clients.cloud.ProducerExample" \
-Dexec.args="java.config test2"

## 실행하는법
mvn exec:java -Dexec.mainClass="io.confluent.examples.clients.cloud.ConsumerAvroExample" \
-Dexec.args="java.config test1"





# 참고 
https://memorynotfound.com/spring-kafka-json-serializer-deserializer-example/