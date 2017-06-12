
package sample.simple.service;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldService {
	private String name;

	public String getHelloMessage() {
		return "Hello " + this.name;
	}

}
