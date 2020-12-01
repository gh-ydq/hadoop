package com.example.hadoop;

import com.example.hadoop.dao.pojo.BehavioralData;
import org.apache.hadoop.mapreduce.lib.db.DBInputFormat;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HadoopApplication {

	public static void main(String[] args) {
		SpringApplication.run(HadoopApplication.class, args);
	}

}
