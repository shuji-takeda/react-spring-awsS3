package com.example.awsimageupload.bucket;

public enum BucketName {
	PROFILE_IMAGE("takeshu-demo-image-upload");

	private final String bucketName;

	BucketName(String bucketName) {
		this.bucketName = bucketName;
	}

	public String getBucketName() {
		return bucketName;
	}
}
