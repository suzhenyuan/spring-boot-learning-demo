package org.spring.action.demo.soundsystem;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class CompactDisc implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8319606805395839930L;

	private String title;
	private String artist;

	private List<String> tracks;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}


	public void playTrack(int trackNum) {
		System.out.println(new Date()+",Playing "+trackNum);
	}

	public void setTracks(List<String> tracks) {
		this.tracks = tracks;
	}
	
	
	public void doAround(){
		System.out.println("doaround");
	}

}
