package org.panda.learning.messenger.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.panda.learning.messenger.dao.MessageDAO;
import org.panda.learning.messenger.model.Message;

public class MessageService {
	
	private Map<Long, Message> messages = MessageDAO.getMessages();
	
	public MessageService(){
		Message m1 = new Message(1L, "Test1", new Date(), "Test");
		Message m2 = new Message(2L, "Test2", new Date(), "Test");
		Message m3 = new Message(3L, "Test3", new Date(), "Test");
		messages.put(1L,m1);
		messages.put(2L,m2);
		messages.put(3L,m3);
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
	public List<Message> getFilteredMessage(String textSearch) {
		return messages.values().stream().filter((m) -> m.getMessage().contains(textSearch)).collect(Collectors.toList());

	}
	
}
