import org.junit.*;
import static org.junit.Assert.*;

public class RPSTest {

  @Test
  public void checkWinner_rockVSScissors_true() {
    RPS testGame = new RPS();
    assertEquals("player 1 wins", testGame.runRockPaperScissors("rock", "scissors"));
  }
  @Test
  public void checkWinner_scissorsVSPaper_true() {
    RPS testGame = new RPS();
    assertEquals("player 1 wins", testGame.runRockPaperScissors("scissors", "paper"));
  }
  @Test
  public void checkWinner_paperVSRock_true() {
    RPS testGame = new RPS();
    assertEquals("player 1 wins", testGame.runRockPaperScissors("paper", "rock"));
  }

  @Test
  public void checkWinner_scissorsVSRock_true() {
    RPS testGame = new RPS();
    assertEquals("player 2 wins", testGame.runRockPaperScissors("scissors", "rock"));
  }
  @Test
  public void checkWinner_paperVSScissors_true() {
    RPS testGame = new RPS();
    assertEquals("player 2 wins", testGame.runRockPaperScissors("paper", "scissors"));
  }
  @Test
  public void checkWinner_rockVSpaper_true() {
    RPS testGame = new RPS();
    assertEquals("player 2 wins", testGame.runRockPaperScissors("rock", "paper"));
  }

  @Test
  public void checkWinner_rockVSRock_true() {
    RPS testGame = new RPS();
    assertEquals("tie game", testGame.runRockPaperScissors("rock", "rock"));
  }

  @Test
  public void checkWinner_scissorsVSScissors_true() {
    RPS testGame = new RPS();
    assertEquals("tie game", testGame.runRockPaperScissors("scissors", "scissors"));
  }

  @Test
  public void checkWinner_paperVSPaper_true() {
    RPS testGame = new RPS();
    assertEquals("tie game", testGame.runRockPaperScissors("paper", "paper"));
  }



}
