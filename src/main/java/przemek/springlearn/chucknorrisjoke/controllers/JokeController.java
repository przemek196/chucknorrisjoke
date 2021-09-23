package przemek.springlearn.chucknorrisjoke.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import przemek.springlearn.chucknorrisjoke.services.JokeService;
import przemek.springlearn.chucknorrisjoke.services.JokeServiceImpl;

@Controller
public class JokeController {

    private final JokeService jokeService;

@Autowired
    public JokeController(@Qualifier("jokeServiceImpl") JokeService jokeService) {
        this.jokeService = jokeService;
    }



    public String showJokeCommandLine()
    {
        return jokeService.getJoke();
    }

    @RequestMapping("/showjoke")
public String showJoke(Model model)
{
    model.addAttribute("joke",jokeService.getJoke());

    return "index";
}


}
