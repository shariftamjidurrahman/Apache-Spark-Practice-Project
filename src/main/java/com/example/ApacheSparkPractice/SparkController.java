package com.example.ApacheSparkPractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SparkController {

    @Autowired
    private SparkService sparkService;

    @GetMapping("/run-spark-job")
    public String runSparkJob(){
        sparkService.performSparkOperation();
        return "Spark job completed";
    }
}
