package com.example.ApacheSparkPractice;

import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SparkService {

    @Autowired
    private JavaSparkContext javaSparkContext;

    public void performSparkOperation(){
        JavaRDD<String> data = javaSparkContext.textFile("path/to/your/data.txt");
        long count = data.count();
        System.out.println("Number of records: " + count);
    }
}
