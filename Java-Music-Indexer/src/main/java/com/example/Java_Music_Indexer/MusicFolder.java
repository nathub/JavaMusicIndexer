package com.example.Java_Music_Indexer;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class MusicFolder {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	

}
