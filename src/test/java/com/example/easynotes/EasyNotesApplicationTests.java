package com.example.easynotes;

import com.example.easynotes.model.Note;
import com.example.easynotes.repository.NoteRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class EasyNotesApplicationTests {

	@MockBean
	NoteRepository noteRepository;
	@Test
	public void contextLoads() {

		when(noteRepository.findAll()).thenReturn(Stream.of(new Note(1,"rakesh","mahajan")).collect(Collectors.toList()));
		assertEquals(1,noteRepository.findById(1L));
	}

}
