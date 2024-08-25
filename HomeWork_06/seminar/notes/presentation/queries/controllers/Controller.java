package seminar.notes.presentation.queries.controllers;

import seminar.notes.presentation.queries.views.Presenter;

public abstract class Controller {

    public <T extends Presenter> void view(T presenter){
    }

}
