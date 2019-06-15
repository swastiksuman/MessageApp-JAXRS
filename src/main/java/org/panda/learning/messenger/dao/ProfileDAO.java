package org.panda.learning.messenger.dao;

import java.util.HashMap;
import java.util.Map;

import org.panda.learning.messenger.model.Message;
import org.panda.learning.messenger.model.Profile;

public class ProfileDAO {
	private static Map<Long, Profile> profiles = new HashMap<>();
	
	public static Map<Long, Profile> getProfiles() {
		return profiles;
	}
}
