package ladder;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

@Controller
public class IndexController {

  @RequestMapping(value="/", method=RequestMethod.GET)
  public String index(Model model) {
    RestTemplate restTemplate = new RestTemplate();
    ResponseInfo responseInfo = restTemplate.getForObject("http://api.pathofexile.com/ladders/1" + " " + "week" + " " + "legacy" + " " + "hc" + " " + "(jre055)?limit=20", ResponseInfo.class);
    model.addAttribute("results", responseInfo);
    return "index";
  }

}
