import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class RPS {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/results", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/results.vtl");

      String playerOne = request.queryParams("playerOne");
      String playerTwo = request.queryParams("playerTwo");
      String result = runRockPaperScissors(playerOne, playerTwo);
      
      model.put("results", result);
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }

  public static String runRockPaperScissors(String playerOne, String playerTwo) {

    String result = "";
    if (playerOne.equals("rock") && playerTwo.equals("scissors")) {
      result = "player 1 wins";
    }  else if (playerOne.equals("scissors") && playerTwo.equals("rock")) {
      result = "player 2 wins";
    } else if (playerOne.equals("paper") && playerTwo.equals("rock")) {
      result = "player 1 wins";
    } else if (playerOne.equals("rock") && playerTwo.equals("paper")) {
      result = "player 2 wins";
    } else if (playerOne.equals("scissors") && playerTwo.equals("paper")) {
      result = "player 1 wins";
    } else if (playerOne.equals("paper") && playerTwo.equals("scissors")) {
      result = "player 2 wins";
    } else if (playerOne.equals(playerTwo)) {
      result = "tie game";
    }
    return result;
  }

}
