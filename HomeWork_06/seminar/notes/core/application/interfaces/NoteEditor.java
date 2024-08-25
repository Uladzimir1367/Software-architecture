package seminar.notes.core.application.interfaces;

import seminar.notes.core.domain.Note;

public interface NoteEditor extends Editor<Note, Integer> {

    void printAll();
}
