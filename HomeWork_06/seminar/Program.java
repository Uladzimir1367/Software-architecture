package seminar;


import seminar.database.NotesDatabase;
import seminar.notes.core.application.ConcreteNoteEditor;
import seminar.notes.infrastructure.persistance.NotesDbContext;
import seminar.notes.presentation.queries.controllers.NotesController;
import seminar.notes.presentation.queries.views.NotesConsolePresenter;

public class Program {

    public static void main(String[] args) {
        NotesController controller = new NotesController(
                new ConcreteNoteEditor(new NotesDbContext(new NotesDatabase()), new NotesConsolePresenter()));
        controller.routeGetAll();
    }

}
