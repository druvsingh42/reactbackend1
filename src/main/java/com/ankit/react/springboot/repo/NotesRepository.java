package com.ankit.react.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ankit.react.springboot.entities.Note;

public interface NotesRepository extends JpaRepository<Note, Long> {

}
