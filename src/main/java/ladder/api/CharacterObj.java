package ladder;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CharacterObj {

  private String name;
  private int level;
  @JsonProperty("class")
  private String characterClass;
  private long experience;

  public CharacterObj() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getLevel() {
    return level;
  }

  public void setLevel(int level) {
    this.level = level;
  }

  public String getCharacterClass() {
    return characterClass;
  }

  public void setCharacterClass(String characterClass) {
    this.characterClass = characterClass;
  }

  public long getExperience() {
    return experience;
  }

  public void setExperience(long experience) {
    this.experience = experience;
  }

  @Override
  public String toString() {
    return "Character{" +
    "name='" + name + '\'' +
    ", level=" + level +
    ", class='" + characterClass + '\'' +
    ", experience=" + experience +
    '}';
  }

}
