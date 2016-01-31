package com.cv.play.impl;

import org.springframework.stereotype.Component;

import com.cv.play.interfaces.Knight;
import com.cv.play.interfaces.Quest;

@Component
public class BraveKnight implements Knight {

	
	private Quest knightsQuest;
	
	public BraveKnight(Quest q){
		this.knightsQuest = q;
	}
	
	public void embarkOnQuest() {

		knightsQuest.embark();
		
	}

}
