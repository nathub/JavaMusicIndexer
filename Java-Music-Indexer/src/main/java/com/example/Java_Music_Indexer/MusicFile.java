package com.example.Java_Music_Indexer;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.File;

@Entity
public class MusicFile {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String songName;
	private Long artistId;
	private Long albumId;
	private Long folderId;
	private String fileName;
	private Long libraryId;
	
	protected MusicFile() {}
	
	public MusicFile(String path) { //Maybe switch path for filename and folder id?
		
		File song = getFile(path);
		this.fileName = song.getName();
		
		
		
		
	}
	
	private File getFile(String path) {
		File song = new File(path);
		return song;
	}
	
	@Override
	public String toString() {
		return String.format("MusicFile[id=%d, songName='%s', folderId=%d, fileName='%s']",
								id, songName, folderId, fileName);
	}
	
	public String printMusicFile() {
		
		return "printout not yet available"; //fetch library, artist, and album names for this print
	}
	
	public Long getId() {
		return id;
	}
	
	public String getSongName() {
		return songName;
	}
	
	
	
	
}
