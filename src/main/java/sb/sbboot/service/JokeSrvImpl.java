package sb.sbboot.service;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeSrvImpl implements JokeSrv
{
	
	@Override
	public String getRandomJoke(
	)
	{
		
		String            joke = null;
		ChuckNorrisQuotes cnQ  = new ChuckNorrisQuotes();
		if (cnQ != null)
		{
			joke = cnQ.getRandomQuote();
		}
		
		return joke;
	}
	
}
