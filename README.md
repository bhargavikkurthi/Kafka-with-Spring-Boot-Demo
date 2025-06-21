# Spring Boot Kafka Reactive Project

This is a sample Spring Boot project that demonstrates the integration of Kafka with a Spring Boot application. 
The project showcases key concepts related to Kafka, including topics, partitions, serialization, consumer groups, and offset management.

## Table of Contents

- [Requirements](#requirements)
- [Getting Started](#getting-started)
    - [Running Kafka](#running-kafka)
    - [Project Setup](#project-setup)
- [Key Concepts](#key-concepts)
    - [Kafka Cluster](#kafka-cluster)
    - [Kafka Broker](#kafka-broker)
    - [Kafka Consumer](#kafka-consumer)
    - [Kafka Producer](#kafka-producer)
    - [Kafka Topics](#kafka-topics)
    - [Partitions](#partitions)
    - [Offsets](#offsets)
    - [Consumer Groups](#consumer-groups)
    - [Serialization](#serialization)
- [Demo Application](#demo-application)


## Requirements

- Java 21 or later
- Apache Kafka (for running locally)
- Maven (or use the included `./mvnw` script)

## Getting Started

### Running Kafka

Ensure that Kafka is installed and running locally. You can download Kafka from the [official Apache Kafka website](https://kafka.apache.org/).

Start a ZooKeeper server (required by Kafka):

Go to the folder where u have your Kafka - "C:\kafka"

```bash
.\bin\zookeeper-server-start.bat config\zookeeper.properties
```

Start a Kafka broker:
```bash
.\bin\windows\kafka-server-start.bat .\config\server.properties
```


### Project Setup

Clone this repository and navigate to the project folder:

## Key Concepts

Apache Kafka is a distributed, fault-tolerant, and highly scalable message broker and stream processing platform. 
It was originally developed by LinkedIn and later open-sourced as an Apache Software Foundation project. 
Kafka is designed to handle large volumes of data streams in a real-time and fault-tolerant manner.

Key Components of Kafka:
Producer: An application that publishes messages to Kafka topics.

- **Consumer**: An application that subscribes to topics and processes the published messages.
- **Broker**: Kafka brokers form the core of the Kafka cluster, storing and managing the streams of records.
- **Topic**: A category or feed name to which records are published. Topics in Kafka are used to categorize messages.
- **Partition**: Topics are divided into partitions, allowing Kafka to parallelize processing and scale horizontally.
- **Zookeeper**: Kafka relies on Apache ZooKeeper for distributed coordination and management of the Kafka cluster.
  ![Kafka topics](img/kafka_overview.png)

### Kafka CLuster
A Kafka cluster is a group of one or more Kafka brokers (servers) working together to manage the storage and exchange of data in the form of messages. Kafka is designed to operate as a distributed system, and a cluster allows it to scale horizontally, provide fault tolerance, and handle large volumes of data across multiple nodes.
![Kafka topics](img/kafka_cluster.png)

### Kafka Broker
Kafka brokers form the core of the Kafka cluster, storing and managing the streams of records.
![Kafka topics](img/kafka_broker.png)

### Kafka Producer
Producers are applications or systems that publish messages to Kafka topics. Producers determine which partition within a topic a message should be sent to.
![Kafka topics](img/kafka_producer.png)

### Kafka Consumer
Consumers are applications or systems that subscribe to Kafka topics and process the messages. Consumers can be part of a consumer group, allowing them to parallelize the processing of messages.
![Kafka topics](img/kafka_consumer.png)

### Kafka Topics

A Kafka topic is a category or feed name to which records (messages) are published. Topics help organize and categorize messages.
![Kafka topics](img/kafka_topic.png)
---

### Partitions

Topics are divided into partitions, allowing for parallel processing and scalability. Each partition is assigned to a specific broker.
![Kafka topics](img/kafka_partitions.png)
---

### Offsets

Offsets represent the position of a message within a partition. Consumers use offsets to track their progress and resume processing from the last committed offset.
![Kafka topics](img/kafka_offset.png)
---

### Consumer Groups

Consumer groups allow for parallel and scalable message processing. Consumers within a group coordinate to consume messages from one or more partitions.
![Kafka topics](img/kafka_consumer_groups.png)
---

### Serialization

Serialization is the process of converting data to a format suitable for transmission. Kafka allows custom serializers for key and value objects.
