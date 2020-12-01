package com.example.hadoop.dao.pojo;

import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapreduce.lib.db.DBWritable;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class BehavioralData implements DBWritable {
	private static final long serialVersionUID = 7552140078483764069L;
	private String id;
	private Date createdTime;
	private Date updatedTime;
	private String action;
	private String appName;
	private String appVersion;
	private String eventData;
	private Date eventDate;
	private String eventName;
	private String ipAddress;
	private String mobileBrand;
	private String osVersion;
	private String pageName;
	private String phoneNo;
	private String userCode;
	private String appsFlyerId;
	private String source;
	private String deviceId;


	@Override
	public void write(PreparedStatement preparedStatement) throws SQLException {

	}

	@Override
	public void readFields(ResultSet resultSet) throws SQLException {
		this.id = resultSet.getString(1);
		this.createdTime = resultSet.getDate(2);
		this.updatedTime = resultSet.getDate(3);
		this.action = resultSet.getString(4);
	}
}
