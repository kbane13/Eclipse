package com.aurionpro.model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MovieManager {
	private List<Movie> movies;
	private static final String filepath = "./MovieData/data.bin";

	public MovieManager() {
		movies = new ArrayList<Movie>();
		movies.add(new Movie(1, "Sholay", 1975, "Action"));
		movies.add(new Movie(2, "KGF", 2000, "Action"));
		movies.add(new Movie(3, "Annabelle", 2019, "Horror"));
		saveMovies();
		loadMovies();
	}

	@Override
	public String toString() {
		return "MovieManager [movies=" + movies + "]";
	}

	private void saveMovies() {
		try {
			// Saving of object in a file
			FileOutputStream file = new FileOutputStream(filepath);
			ObjectOutputStream out = new ObjectOutputStream(file);

			// Method for serialization of object
			out.writeObject(movies);

			out.close();
			file.close();
			System.out.println("Object has been serialized");

		}

		catch (IOException ex) {
			System.out.println("IOException is caught");
		}

	}

	private void loadMovies() {
		try {

			FileInputStream file = new FileInputStream(filepath);
			ObjectInputStream in = new ObjectInputStream(file);
			movies = (List<Movie>) in.readObject();

			in.close();
			file.close();

		}

		catch (IOException ex) {
			System.out.println("IOException is caught");
		} catch (ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException is caught");
		}

	}



	public List<Movie> getMovies() {
		return movies;
	}

	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}

	public static String getFilepath() {
		return filepath;
	}

	public void addMovies(Movie movie) {
		movies.add(movie);
		saveMovies();
		
		
	}
	public void deleteAllMovies() {
		movies.clear();
		saveMovies();
	}
	public boolean deleteMovie(int id) {
		int index=-1;
		for(int i=0;i<movies.size();i++) {
			if(movies.get(i).getId()==id) {
				index=i;
			}
		}
		if(index!=-1) {
			movies.remove(index);
			saveMovies();
			return true;
			
			
		}
		return false;
	}
	

}
