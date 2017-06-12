package ladder;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseInfo{

  private int total;
  private List<Entry> entries;

  public ResponseInfo(){
  }

  public int getTotal() {
    return total;
  }

  public void setTotal(int total) {
    this.total = total;
  }

  public List<Entry> getEntries() {
    return entries;
  }

  public void setEntries(List<Entry> entries) {
    this.entries = entries;
  }

  @Override
  public String toString() {
    return "ResponseInfo{" +
    "total=" + total +
    ", entries=" + entries +
    '}';
  }

}
