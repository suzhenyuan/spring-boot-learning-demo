package org.spring.action.demo;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.spring.action.demo.soundsystem.CompactDisc;
import org.spring.action.demo.soundsystem.PlaySoundConfig;
import org.spring.action.demo.soundsystem.RequestProcessor;
import org.spring.action.demo.soundsystem.RequestTargetConfig;
import org.spring.action.demo.soundsystem.TrackCounter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={PlaySoundConfig.class})
public class TrackPlayTest {

	
	
	@Autowired
	private CompactDisc compactDisc;
	
	@Autowired
	private TrackCounter trackCounter;
	
	@Autowired
	RequestProcessor requestTarget;

	@Test
	public void test() {
		compactDisc.playTrack(0);
		System.out.println("test output,playCount --->"+trackCounter.getCount(0));

		compactDisc.playTrack(1);
		System.out.println("test output,playCount --->"+trackCounter.getCount(0));

		compactDisc.playTrack(1);
		System.out.println("test output,playCount --->"+trackCounter.getCount(0));

		compactDisc.playTrack(0);
		System.out.println("test output,playCount --->"+trackCounter.getCount(0));
		
		requestTarget.doAround();
		
		
		System.out.println("---------------");
		compactDisc.doAround();
	}

}
