package com.cv.play.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cv.play.impl.BraveKnight;
import com.cv.play.impl.DragonSlayQuest;
import com.cv.play.impl.HelloWorldQuest;
import com.cv.play.interfaces.Knight;
import com.cv.play.interfaces.Quest;

@Configuration
public class SpringAppConfig {
	
	@Bean
	public Knight knight(){
		//Can inject whatever quest you want here!
		return new BraveKnight(helloWorldQuest());
	}
	
	@Bean
	public Quest dragonQuest(){
		return new DragonSlayQuest(System.out);
	}
	
	@Bean
	public Quest helloWorldQuest(){
		return new HelloWorldQuest(System.out);
	}
	

}
