package com.example.reactive.hello;

import reactor.core.publisher.Mono;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping("/{whoami}")
	private Mono<Message> getMessage(@PathVariable String whoami) {
		return Mono.just(new Message(String.format("Hello %s!!", whoami)));
	}

}