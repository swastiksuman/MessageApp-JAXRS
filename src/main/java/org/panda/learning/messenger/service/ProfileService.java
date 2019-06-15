package org.panda.learning.messenger.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.panda.learning.messenger.dao.MessageDAO;
import org.panda.learning.messenger.dao.ProfileDAO;
import org.panda.learning.messenger.model.Message;
import org.panda.learning.messenger.model.Profile;

public class ProfileService {

	private Map<Long, Profile> profiles = ProfileDAO.getProfiles();

	public ProfileService() {

	}

	public List<Profile> getAllProfiles() {
		return new ArrayList<Profile>(profiles.values());
	}

	public Profile getProfile(long id) {
		return profiles.get(id);
	}

	public Profile addProfile(Profile profile) {
		profile.setId(profiles.size() + 1);
		profiles.put(profile.getId(), profile);
		return profile;
	}

	public Profile updateProfile(Profile profile) {
		profiles.put(profile.getId(), profile);
		return profile;
	}

	public Profile removeMessage(long id) {
		return profiles.remove(id);
	}

}
