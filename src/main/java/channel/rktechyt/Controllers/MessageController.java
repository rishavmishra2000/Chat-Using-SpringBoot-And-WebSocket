package channel.rktechyt.Controllers;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import channel.rktechyt.Models.Message;

@RestController
public class MessageController {
	
	@MessageMapping("/message")
	@SendTo("/topic/return-to")
	public Message getMessage(@RequestBody Message msg_content) {
//		try {
//			Thread.sleep(500); // 500ms delay in sending message
//		} catch (InterruptedException e) {
//			e.printStackTrace(); // If interrupted, the throw error
//		}
		return msg_content;
	}
}
