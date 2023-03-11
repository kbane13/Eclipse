package com.aurionpro.model;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MovieController {

	private MovieManager manager;
	
	
	public MovieController() {
		super();
		this.manager = new MovieManager();
	}
	
	public void start() {
		displayMenu();
	}
	private void displayMenu() {
		int choice=1;
		System.out.println("Welcome to movie menu");
		while(choice!=5) {
		
	System.out.println("Enter 1 to add movies");
	System.out.println("Enter 2 to Display movie");
	System.out.println("Enter 3 to Delete all movies");
	System.out.println("Enter 4 to Delete movie by id");
	System.out.println("Enter 5 to Exit");
	Scanner sc=new Scanner(System.in);
	 choice=sc.nextInt();
	switch(choice) {
	   case 1:
		   Movie movie=setMovieDetails();
		   manager.addMovies(movie);
		   break;
	   case 2:
		   List<Movie>movies=manager.getMovies();
		   if (movies.size() != 0) {
				System.out.println("List of movies are: ");
				Iterator<Movie> itr = movies.iterator();
				while (itr.hasNext()) {
					System.out.println(itr.next());
				}
			} else {
				System.out.println("List is empty.");
			}
			break;
	   case 3:
		   if(manager.getMovies().size()!=0) {
			   manager.deleteAllMovies();
			   System.out.println("All movies deleted");
		   }
		   else {
			   System.out.println("Nothing is deleted");
		   }
		   break;
	   case 4:
		   System.out.println("Enter ID: ");
			int id = sc.nextInt();
			if (manager.deleteMovie(id)) {
				System.out.println("Movie deleted.");
			} else {
				System.out.println("ID could not be found.");
			}
			break;
	   case 5:
		   System.out.println("Exit");
		   break;
		   default:
			   System.out.println("Invalid Choice");
	}
	}}
	private Movie setMovieDetails() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter movie ID");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter movie Name");
		String name=sc.nextLine();
		sc.nextLine();
		System.out.println("Enter movie Year");
		int year=sc.nextInt();
		System.out.println("Enter movie Genre");
		String genre=sc.nextLine();
		sc.nextLine();
		
		return new Movie(id,name,year,genre);
	}
	
	
}
