# Apache Kafka

Kafka, developed by the Apache Software Foundation, is a distributed event streaming platform designed to manage high-throughput data streams. It is primarily used to process, store, and transmit large amounts of data in real-time. Kafka acts like a message queue to facilitate the transfer of data from one system to another.

## Key Components of Kafka:
1. **Producer**: Applications that send data to Kafka.
2. **Consumer**: Applications that receive data from Kafka.
3. **Broker**: Servers where messages are stored.
4. **Topic**: Categories or channels in which data is organized.
5. **Partition**: Subdivisions of each topic that allow for distribution and parallel processing of data.

## Use Cases:
1. **Real-Time Data Streaming**: Monitoring user activities on websites and applications in real-time.
2. **Data Integration**: Collecting and combining data from different systems.
3. **Log Management**: Collecting and analyzing application logs.
4. **IoT Applications**: Gathering and processing data from sensors.
5. **Financial Services**: Real-time transaction monitoring and risk management.
6. **Machine Learning**: Providing data streams for model training.

Kafka plays a significant role in big data ecosystems due to its scalability, durability, and high performance.

# Improving Kafka Performance

There are several key configurations to enhance Kafka's performance. These settings can help increase the speed of data flow and make more efficient use of system resources. Here are some important configurations:

## 1. Producer Settings
- **acks**: Instead of `acks=all`, using `acks=1` or `acks=0` can reduce the waiting time for the producer's acknowledgment. However, this can increase the risk of data loss.
- **batch.size**: Increasing the maximum size of batches of messages sent (e.g., 16384 bytes or more) can optimize data transfer.
- **linger.ms**: This setting determines how long the producer will wait before sending messages. Increasing this time allows for more messages to be sent together.
- **compression.type**: Compressing messages (e.g., using `lz4` or `snappy`) can reduce data size and efficiently utilize bandwidth.

## 2. Broker Settings
- **num.partitions**: Creating more partitions per topic allows for more parallel processing of data.
- **replication.factor**: A higher replication factor increases data security but may affect performance. It’s important to strike a balance based on needs.
- **log.segment.bytes**: Increasing the size of log segments can optimize disk I/O.

## 3. Consumer Settings
- **max.poll.records**: Increasing the maximum number of records a consumer can fetch at once can speed up data consumption.
- **fetch.min.bytes**: This setting causes the consumer to wait until a certain amount of data is available before fetching. Higher values allow for larger data batches.
- **fetch.max.bytes**: This determines the maximum amount of data a consumer can fetch in one request. Higher values enable fetching more data at once.

## 4. Zookeeper Settings
- **tickTime**: Optimizing the duration of Zookeeper’s internal loop can improve the system’s response time.

## 5. Hardware and Infrastructure
- **Disk and Network Performance**: Using SSDs improves disk I/O. High bandwidth and low-latency network connections accelerate data flow.
- **Memory**: Providing sufficient RAM for Kafka brokers supports faster processing of in-memory data.

These settings should be optimized based on specific scenarios and requirements. It’s essential to analyze the current state and needs of the system before making performance improvements.






## To run the project:

1. Build the project.
```
mvn clean package
```
2. Using Docker Compose.
```
docker-compose up --build
```
3. Sending Messages
```
curl -X POST -H "Content-Type: application/json" -d "\"Hello, Kafka!\"" http://localhost:8080/api/messages
```
