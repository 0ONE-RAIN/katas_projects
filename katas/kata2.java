public class Game {
  public String winner(String[] deckSteve, String[] deckJosh) {
    int scoreSteve = 0;
    int scoreJosh = 0;
    String cardRank = "23456789TJQKA"; // Rango de cartas

    for (int i = 0; i < deckSteve.length; i++) {
      char cardSteve = deckSteve[i].charAt(0);
      char cardJosh = deckJosh[i].charAt(0);
      
      int rankSteve = cardRank.indexOf(cardSteve);
      int rankJosh = cardRank.indexOf(cardJosh);

      if (rankSteve > rankJosh) {
        scoreSteve++;
      } else if (rankSteve < rankJosh) {
        scoreJosh++;
      }
    }

    if (scoreSteve > scoreJosh) {
      return "Steve wins " + scoreSteve + " to " + scoreJosh;
    } else if (scoreJosh > scoreSteve) {
      return "Josh wins " + scoreJosh + " to " + scoreSteve;
    } else {
      return "Tie";
    }
  }
}
