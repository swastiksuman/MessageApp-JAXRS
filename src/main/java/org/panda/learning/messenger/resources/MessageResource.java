package org.panda.learning.messenger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.panda.learning.messenger.model.Message;
import org.panda.learning.messenger.service.MessageService;

@Path("/messages")
public class MessageResource {
	
	MessageService messageService = new MessageService();
	
	@GET
	@Produces(MediaType.TEXT_XML)
	public List<Message>  getMessages() {
		return messageService.getAllMessage();
	}
	
	@GET
	@Path("/{messageId}")
	@Produces(MediaType.TEXT_XML)
	public Message getMessageById(@PathParam("messageId") long messageId) {
		return messageService.getMessage(messageId);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public Message addMessage(Message message) {
		return messageService.addMessage(message);
	}
}
