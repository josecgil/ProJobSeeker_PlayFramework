package controllers;

import play.*;
import play.mvc.*;

import views.html.Jobs.*;

import infrastructure.*;
import models.*;

public class DefaultController extends Controller {

    public static Result index() {
        return redirect("/jobs");
    }
}