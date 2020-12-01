package com.example.hadoop.config;

import org.apache.hadoop.mapred.JobConf;
import org.apache.hadoop.mapred.lib.db.DBConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HDConfigJob {
    private String dburl = "jdbc:mysql://47.74.219.229:3306/suncash_lend?useUnicode=true&characterEncoding=UTF-8&rewriteBatchedStatements=true&useFractionalSeconds=true&serverTimezone=GMT%2b8";
    private String driverClass = "com.mysql.cj.jdbc.Driver";
    private String userName = "suncash";
    private String password = "9mx9dolPI7L1AzUA";
    @Bean
    public DBConfiguration dBConfiguration(){
        JobConf jobConf = new JobConf();
        DBConfiguration.configureDB(jobConf,driverClass,dburl,userName,password);
        return null;
    }
}
