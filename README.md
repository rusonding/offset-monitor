"# offset-monitor" 


```
java -cp offsetapp-jar-with-dependencies.jar \
      com.quantifind.kafka.offsetapp.OffsetGetterWeb \
     --offsetStorage kafka \
     --zk zk-server1,zk-server2 \
     --port 9099 \
     --refresh 10.seconds \
     --retain 1.days
```