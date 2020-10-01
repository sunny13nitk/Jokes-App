package sb.sbboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import sb.sbboot.service.JokeSrv;

@Controller
public class JokesController
{
	
	private final JokeSrv jokesSrv;
	
	private final String showJokes = "showJokes";
	
	@Autowired // Constructor DI
	public JokesController(
	        JokeSrv jokesSrv
	)
	{
		this.jokesSrv = jokesSrv;
	}
	
	@GetMapping(value =
	{ "/", "" })
	public String getJokes(
	        Model model
	)
	{
		if (jokesSrv != null)
		{
			model.addAttribute("joke", jokesSrv.getRandomJoke());
		}
		return showJokes;
	}
	
}
