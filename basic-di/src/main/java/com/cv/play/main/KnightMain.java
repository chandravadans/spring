package com.cv.play.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cv.play.config.SpringAppConfig;
import com.cv.play.interfaces.Knight;

public class KnightMain {

	public static void main(String[] args) {
		
		/* A basic example of DI through beans.
		 * A knight needs to go on a quest, which can be of several types.
		 * We, as the king decide which quest a knight can embark on.
		 * The analogy is taken a bit too far, but the point is about having loosely coupled 
		 * components in software.
		 * No more 'new BraveKnight()', 'new DragonSlayQuest()' and `braveKnight.setQuest(dragonSlayQuest)'
		 */
		
		//Two ways of wiring up beans.
		//1. Java config
		 ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringAppConfig.class);
		 Knight annotationKnight = (Knight)ctx.getBean("knight");
		 annotationKnight.embarkOnQuest();
		 
		 //2. XML Config
		 ClassPathXmlApplicationContext ctx2 = new ClassPathXmlApplicationContext("spring-knights.xml");
		 Knight xmlKnight = (Knight) ctx2.getBean("knight");
		 xmlKnight.embarkOnQuest();
		 
		 /*
		  * I think Java config is better. Mostly because XML is so verbose and hard to write!
		  * Also, defining all the beans in Java/XML is quite dumb. Will see if and how Autowiring and Component Scanning
		  * might come to the rescue
		  */
		

	}

}
