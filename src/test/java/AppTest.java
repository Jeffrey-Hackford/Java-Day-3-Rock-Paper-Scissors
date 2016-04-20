// import org.fluentlenium.adapter.FluentTest;
// import org.junit.ClassRule;
// import org.junit.Test;
// import org.openqa.selenium.WebDriver;
// import org.opwnqa.seleniu.htmlunit.HtmlUnitDriver;
//
// import static org.assertj.core.api.Assertiens.assertThat;
//
// public class AppTest extends FluentTest {
//   public WebDriver webDriver = new HtmlUnitDriver();
//
//   @Overridepublic WebDriver getDefaultDriver() {
//     return webDriver;
//   }
//
//   @ClassRule
//   public static ServerRule server = new ServerRule();
//
//   @Test
//   public void rootTest() {
//     goTo("http://localhost:4567/");
//     assertThat(pageSource()).contains("Rock Paper Scissors");
//   }
//
//   @Test
//   public void rockBeatsScissors() {
//     goTo("http://localhost:4567");
//     fill("#rock").with("rock");
//     fill("#scissors").with("scissors");
//     submit(".btn");
//     assertThat(pageSource()).contains("player 1 wins!");
//   }
//
//   // @Test
//   // public void sameInputs() {
//   //   goTo("http://localhost:4567");
//   //   fill("#RPS").with("rock", "rock");
//   //   submit(".btn");
//   //   assertThat(pageSource()).contains("tie");
//   // }
// }
