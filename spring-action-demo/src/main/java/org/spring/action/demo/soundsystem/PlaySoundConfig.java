package org.spring.action.demo.soundsystem;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;


@Configuration
@EnableAspectJAutoProxy
public class PlaySoundConfig {

	@Bean
	public CompactDisc compactDisc() {
		System.out.println("compactDisc init");
		CompactDisc dc = new CompactDisc();

		dc.setTitle("hello,world");
		dc.setArtist("myself");

		List<String> tracks = new ArrayList<String>();
		tracks.add("1.when i was yound");
		tracks.add("2.I listened to the radio");
		tracks.add("3.It make me sad");
		tracks.add("4.lalallala");
		tracks.add("5.every salalala every owowowow");

		dc.setTracks(tracks);
		return dc;
	}


	@Bean
	public TrackCounter trackCounter() {
		System.out.println("trackCounter init");
		return new TrackCounter();
	}
/*
	@Bean
	public ThreadPoolTaskExecutor taskExecutor() {
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		executor.setCorePoolSize(4);
		executor.setMaxPoolSize(4);
		executor.setThreadNamePrefix("default_task_executor_thread");
		executor.initialize();
		return executor;
	}*/
	@Bean
	public RequestProcessor requestTarget() {
		System.out.println("RequestTarget init");
		return new RequestProcessor();
	}
}
