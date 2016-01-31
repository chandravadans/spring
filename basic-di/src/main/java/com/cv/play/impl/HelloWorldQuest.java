package com.cv.play.impl;

import java.io.PrintStream;

import com.cv.play.interfaces.Quest;

public class HelloWorldQuest implements Quest {

private PrintStream ps;
	
	public HelloWorldQuest(PrintStream p){
		this.ps = p;
	}
	
	public void embark() {
		ps.println("Saying Hello to the world. Hello World!");
	}

}
