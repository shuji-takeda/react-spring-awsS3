package com.example.awsimageupload.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;

@Configuration
public class AmazonConfig {

	@Bean
	public AmazonS3 s3() {
		AWSCredentials awsCredentials = new BasicAWSCredentials("ACCESS-KEY", "SECRET-KEY");
		return AmazonS3ClientBuilder.standard().withRegion("ap-northeast-3")
		        .withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();
	}
}
