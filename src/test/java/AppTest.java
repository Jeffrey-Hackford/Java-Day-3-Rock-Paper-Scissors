import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override public WebDriver getDefaultDriver() {
    return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
    goTo("http://localhost:4567/");
    assertThat(pageSource()).contains("Rock Paper Scissors");
  }

  @Test
  public void rockBeatsScissors() {
    goTo("http://localhost:4567");
    fill("#playerOne").with("rock");
    fill("#playerTwo").with("scissors");
    submit(".btn");
    assertThat(pageSource()).contains("player 1 wins");
  }

  @Test
  public void sameInputs() {
    goTo("http://localhost:4567");
    fill("#playerOne").with("rock");
    fill("#playerTwo").with("rock");
    submit(".btn");
    assertThat(pageSource()).contains("tie");
  }
}
