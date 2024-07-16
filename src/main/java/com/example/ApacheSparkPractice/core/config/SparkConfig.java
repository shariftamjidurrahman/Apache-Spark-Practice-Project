package com.example.ApacheSparkPractice.core.config;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SparkConfig {

    @Bean
    public SparkConf sparkConf(){
        SparkConf sparkConf = new SparkConf()
                .setAppName("Spring Boot Spark Example")
                .setMaster("local[*]");
        return sparkConf;
    }

    public JavaSparkContext javaSparkContext(SparkConf sparkConf){
        return new JavaSparkContext(sparkConf);
    }
}
