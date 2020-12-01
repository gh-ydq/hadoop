package com.example.hadoop.dao.pojo;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.mapred.JobConf;

public class HadoopTest {
    public static void main(String[] args) {
        Configuration configuration=new Configuration();
        JobConf jobConf=new JobConf(configuration);
    }
}
