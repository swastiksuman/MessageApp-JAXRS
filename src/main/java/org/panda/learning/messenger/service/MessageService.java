package org.panda.learning.messenger.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.panda.learning.messenger.dao.MessageDAO;
import org.panda.learning.messenger.model.Message;

public class MessageService {
	
	private Map<Long, Message> messages = MessageDAO.getMessages();
	
	MessageService(){
		Message m1 = new Message(1L, "Test", new Date(), "Test");
		Message m2 = new Message(1L, "Test", new Date(), "Test");
		Message m3 = new Message(1L, "Test", new Date(), "Test");
		List<Message> list = new ArrayList<Message>();
		list.add(m1);
		list.add(m3);
	}
	public List<Message> getAllMessage() {
		
		//list.add(m2);
		return new ArrayList<Message>(messages.values());
	}
	
	public Message getMessage(long id) {
		return messages.get(id);
	}
	public Message addMessage(Message message) {
		message.setId(messages.size()+1);
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message updateMessage(Message message) {
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message removeMessage(long id) {
		return messages.remove(id);
	}
	
}
