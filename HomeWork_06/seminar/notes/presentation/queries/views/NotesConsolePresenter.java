package seminar.notes.presentation.queries.views;

import seminar.notes.core.application.interfaces.NotesPresenter;
import seminar.notes.core.domain.Note;

import java.util.Collection;

public class NotesConsolePresenter implements NotesPresenter {
    @Override
    public void printAll(Collection<Note> notes) {
        for (Note note: notes) {
            System.out.println(note);
        }
    }
}
