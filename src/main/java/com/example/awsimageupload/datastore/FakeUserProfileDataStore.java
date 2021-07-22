package com.example.awsimageupload.datastore;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.example.awsimageupload.profile.UserProfile;

@Repository
public class FakeUserProfileDataStore {

	private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

	static {
		USER_PROFILES.add(new UserProfile(UUID.fromString("78fe49f1-9cd7-492b-8a74-d96f41baa7f0"),
		        "janet", null));
		USER_PROFILES.add(new UserProfile(UUID.fromString("c026a1d5-939d-4c6c-a6ff-79af225aa0fc"),
		        "antonio", null));
	}

	public List<UserProfile> getUserProfiles() {
		return USER_PROFILES;
	}
}
