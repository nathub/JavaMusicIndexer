package com.example.Java_Music_Indexer;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface MusicFileRepository extends CrudRepository<MusicFile, Long> {
	
	List<MusicFile> findBySongName(String songName);
	
	List<MusicFile> findByArtistId(Long artistId);
	
	List<MusicFile> findByAlbumId(Long albumId);
	
	List<MusicFile> findByFolderId(Long folderId);
	
	List<MusicFile> findByLibraryId(Long libraryId);
	
	Optional<MusicFile> findById(Long id);
	
	
}
