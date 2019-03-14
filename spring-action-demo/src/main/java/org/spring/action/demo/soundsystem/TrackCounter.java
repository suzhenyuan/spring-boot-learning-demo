package org.spring.action.demo.soundsystem;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;


@Aspect
public class TrackCounter {

	private Map<Integer, Integer> trackCount = new HashMap<Integer, Integer>();

	@Pointcut("execution(* org.spring.action.demo.soundsystem.CompactDisc.playTrack(int)) && args(trackNumber)")
	public void trackPlayed(int trackNumber) {
		System.out.println("trackPlayed:"+trackNumber);
		
	};

	/*@Autowired
	private ThreadPoolTaskExecutor taskExecutor;
*/

	@Before("trackPlayed(trackNumber)")
	public void countTrack(final int trackNumber) throws Exception {
		
		
		System.out.println("before sleep: " + new Date());/*
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("after sleep: " + new Date());*/
		int count = getCount(trackNumber);
		trackCount.put(trackNumber, count + 1);
		System.out.println("TrackCounter:" + trackNumber);
		/*
		taskExecutor.execute(new Runnable() {
			public void run() {
				
			}
		});
*/
		//throw new Exception("Error");
	}
	
	public int getCount(int trackNumber) {
		int count = trackCount.containsKey(trackNumber) ? trackCount.get(trackNumber) : 0;
		return count;
	}
	
	@Pointcut("execution(* org.spring.action.demo.soundsystem.RequestProcessor.doAround(..))")
	public void doAroundPc() {
	};
	
	@Around("doAroundPc()")
	public void doAroundMethod(ProceedingJoinPoint jp) throws Throwable {
		System.out.println("before preocess");
		jp.proceed();
		System.out.println("after preocess");
	}
	
	
}
