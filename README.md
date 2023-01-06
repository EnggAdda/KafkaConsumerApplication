# KafkaConsumerApplication
Link to download :-
https://kafka.apache.org/downloads

Command to unzip :-
Tar -xvzf C:\Youtube\kafka\kafka_2.13-3.2.0.tgz -C C:\Youtube\kafka

Steps to be followed


start zookeper :-C:\Youtube\kafka\bin\windows\zookeeper-server-start.bat C:\Youtube\kafka\kafka\config\zookeeper.properties

start kafka server :-C:\Youtube\kafka\bin\windows\kafka-server-start.bat C:\Youtube\kafka\kafka\config\server.properties

create  topic :-C:\Youtube\kafka\bin\windows\kafka-topics.bat --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic enggadda


 list out all topic :-C:\Youtube\kafka\bin\windows\kafka-topics.bat --list --bootstrap-server localhost:9092
 
 

produce something :- C:\Youtube\kafka\bin\windows\kafka-console-producer.bat --bootstrap-server localhost:9092 --topic enggadda

//we can produce something from spring boot app as well

consume what produced :- C:\Youtube\kafka\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic enggadda --from-beginning
