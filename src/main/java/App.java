import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import static spark.Spark.*;

public class App {
    public static void main(String[] args) { //type “psvm + tab” to autocreate this :)
        staticFileLocation("/public");

        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            ArrayList<CD> allCds = CD.getAll();
            model.put("myCds", allCds);
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        post("/cds/new", (request, response) -> { //URL to make new post on POST route
            Map<String, Object> model = new HashMap<String, Object>();
            String name = request.queryParams("artist");
            String genre = request.queryParams("genre");
            int year = Integer.parseInt(request.queryParams("year"));
            int price = Integer.parseInt(request.queryParams("price"));
            CD newCd = new CD(name, genre, year, price);
            return new ModelAndView(model, "success.hbs");
        }, new HandlebarsTemplateEngine());
    }


}
