package ladder;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Account {

  private String name;
  private Challenges challenges;
  private Twitch twitch;

  public Account() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Challenges getChallenges() {
    return challenges;
  }

  public void setChallenges(Challenges challenges) {
    this.challenges = challenges;
  }

  public Twitch getTwitch() {
    return twitch;
  }

  public void setTwitch(Twitch twitch) {
    this.twitch = twitch;
  }

  @Override
  public String toString() {
    return "Account{" +
    "name='" + name + '\'' +
    ", challenges=" + challenges +
    ", twitch=" + twitch +
    '}';
  }

}
