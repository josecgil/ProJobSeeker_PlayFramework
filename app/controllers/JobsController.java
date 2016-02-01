package controllers;

import play.*;
import play.mvc.*;

import views.html.Jobs.*;

import infrastructure.*;
import models.*;

public class JobsController extends Controller {

    private static JobRepository jobRepository=JobRepository.getInstance();

    public static Result index(String categoryName) {
        if (categoryName==null) {
            CategoryCollection categories=jobRepository.findAll();
            return ok(index.render(categories));
        }
        Category categoryFromRepo=jobRepository.findCategoryByName(categoryName);
        return ok(category.render(categoryFromRepo));
    }

    public static Result detail(int id) {
        Job job=jobRepository.findById(id);
        return ok(detail.render(job));
    }

    public static Result create() {
        return ok(create.render());
    }

}