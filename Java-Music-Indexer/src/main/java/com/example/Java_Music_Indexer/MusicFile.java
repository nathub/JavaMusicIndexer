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
	private Long libraryId;
	
	protected MusicFile() {}
	
	public MusicFile(String path) {
		
		
	}
	
	private File getFile(String path) {
		File song = new File("");
		return new File("");
	}
	
	@Override
	public String toString() {
		return String.format("MusicFile[id=%d, songName='%s', folderId=%d]",
								id, songName, folderId);
	}
	
	public Long getId() {
		return id;
	}
	
	public String getSongName() {
		return songName;
	}
	
	
	
	
}
