package ladder;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Entry {

  private int rank;
  private boolean dead;
  private boolean online;
  private CharacterObj character;
  private Account account;

  public Entry() {
  }

  public int getRank() {
    return rank;
  }

  public void setRank(int rank) {
    this.rank = rank;
  }

  public boolean getDead() {
    return dead;
  }

  public void setDead(boolean dead) {
    this.dead = dead;
  }

  public boolean getOnline() {
    return online;
  }

  public void setOnline(boolean online) {
    this.online = online;
  }

  public CharacterObj getCharacter() {
    return character;
  }

  public void setCharacter(CharacterObj character) {
    this.character = character;
  }

  public Account getAccount() {
    return account;
  }

  public void setAccount(Account account) {
    this.account = account;
  }

  @Override
  public String toString() {
    return "Entry{" +
      "rank=" + rank +
      ", dead=" + dead +
      ", online=" + online +
      ", character=" + character +
      ", account=" + account +
      '}';
  }

}
