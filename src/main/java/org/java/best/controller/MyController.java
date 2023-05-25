package org.java.best.controller;

import java.util.Arrays;
import java.util.List;

import org.java.best.obj.Movie;
import org.java.best.obj.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/")
public class MyController {
	

	private List<Movie> getBestMovies(){
		
		return Arrays.asList(new Movie[] {
			
			new Movie(1, "film1"),
			new Movie(2, "film2"),
			new Movie(3, "film3"),
				
		});
	}
	
	private List<Song> getBestSongs(){
		
		return Arrays.asList(new Song[] {
			
			new Song(1, "song1"),
			new Song(2, "song2"),
			new Song(3, "song3"),
				
		});
	}
	
	
//	@GetMapping("/ciao")
//	public String sayHello(Model model,
//							@RequestParam(name = "name") String name) {
//		
//		model.addAttribute("name", name);
//		
//		return "index";
//	}
	

	
	@GetMapping("/movies")
	public String getMovies(Model model){
		
//		String mts = "";
//		for(Movie m : getBestMovies()) {
//			
//			mts += m.getTitolo() + ", ";
//		}
//		mts = mts.substring(0, mts.length() -2);
//		
//		model.addAttribute("movieTitles",mts);
		
		List<Movie> movies = getBestMovies();
		
		model.addAttribute("movies", movies);
	
		
		return "movies";
	}
	
	@GetMapping("movies/{id}")
	public String getMovie(Model model,
		@PathVariable("id") int id) {
		
		Movie resM = null;
		for(Movie m : getBestMovies()) {
			if (m.getId() == id) {
				resM = m;
			}
			if(resM != null) {
				model.addAttribute("titles", resM.getTitolo());
			}
			
		}
		return "titles";
	}
	
	
	
	@GetMapping("/songs")
	public String getSongs(Model model){
		
//		String mts = "";
//		for(Song s : getBestSongs()) {
//			
//			mts += s.getTitolo() + ", ";
//		}
//		mts = mts.substring(0, mts.length() -2);
//		
//		model.addAttribute("songTitles", mts);
		
		List<Song> songs = getBestSongs();
		
		model.addAttribute("songs", songs);
		
		return "songs";
	}
	
	@GetMapping("songs/{id}")
	public String getSong(Model model,
		@PathVariable("id") int id) {
		
		Song resM = null;
		for(Song s : getBestSongs()) {
			if (s.getId() == id) {
				resM = s;
			}
			if(resM != null) {
				model.addAttribute("titles", resM.getTitolo());
			}
			
		}
		return "titles";
	}
	
}
