package org.panda.learning.messenger.dao;

import java.util.HashMap;
import java.util.Map;

import org.panda.learning.messenger.model.Message;

public class MessageDAO {
	private static Map<Long, Message> messages = new HashMap<>();
	
	public static Map<Long, Message> getMessages() {
		return messages;
	}
}
