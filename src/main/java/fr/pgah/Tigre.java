package fr.pgah;

import java.awt.Color;
import java.util.Random;

public class Tigre extends Bestiole {

  private int couleur;

  private int deplacement; // 1, 2, 3

  private Random rand;

  public Tigre() {
    rand = new Random();
    couleur = rand.nextInt(3) + 1;
    deplacement = 0;
  }

  @Override
  public Color getCouleur() {
    // ROUGE, VERT, BLEU, changé tous les 3 mouvements
    deplacement++;
    if (deplacement == 4) {
      deplacement = 1;
      couleur = rand.nextInt(3) + 1;
    }
    if (couleur == 1) {
      return Color.RED;
    } else if (couleur == 2) {
      return Color.GREEN;
    } else {
      return Color.BLUE;
    }
  }
}
