package com.cv.play.impl;

import java.io.PrintStream;

import org.springframework.stereotype.Component;

import com.cv.play.interfaces.Quest;

@Component
public class DragonSlayQuest implements Quest {

	private PrintStream ps;
	
	public DragonSlayQuest(PrintStream p){
		this.ps = p;
	}
	
	public void embark() {
		ps.println("Embarking on a DragonSlay Quest! Wish me luck!");
	}

}
