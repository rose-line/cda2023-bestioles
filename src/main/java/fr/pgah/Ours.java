package fr.pgah;

import java.awt.*;


public class Ours extends Bestiole {
  private Color couleur;

  public Ours(boolean polaire) {
    this.couleur = polaire ? Color.WHITE : Color.BLACK;
  }

  @Override
  public Color getCouleur() {
    return couleur;
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Action getAction(BestioleInfo info) {
    // TODO Auto-generated method stub
    return null;
  }
}
