package channel.rktechyt.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Message {
	private String name;
	private String msg_content;
	
	public String getMsg_content() {
		return msg_content;
	}
	
	public String getName() {
		return name;
	}
}
