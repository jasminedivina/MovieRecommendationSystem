import java.util.ArrayList;

public class MovieManager {

    private ArrayList<Movie> movies;

    // Constructor
    public MovieManager() {
        movies = new ArrayList<>();
    }

    // Add a movie
    public void addMovie(Movie movie) {
        movies.add(movie);
        System.out.println("Movie added successfully!");
    }

    // View all movies
    public void viewMovies() {

        if (movies.isEmpty()) {
            System.out.println("No movies found.");
            return;
        }

        for (Movie movie : movies) {
            System.out.println("--------------------------------");
            System.out.println("Name      : " + movie.getName());
            System.out.println("Genre     : " + movie.getGenre());
            System.out.println("Language  : " + movie.getLanguage());
            System.out.println("Year      : " + movie.getReleaseYear());
            System.out.println("IMDb      : " + movie.getImdbRating());
            System.out.println("Favorite  : " + movie.isFavorite());
        }

        System.out.println("--------------------------------");
    }

    // Search by Genre
    public void searchByGenre(String genre) {

        boolean found = false;

        for (Movie movie : movies) {

            if (movie.getGenre().equalsIgnoreCase(genre)) {

                System.out.println("----------------------------");
                System.out.println("Name      : " + movie.getName());
                System.out.println("Genre     : " + movie.getGenre());
                System.out.println("Language  : " + movie.getLanguage());
                System.out.println("Year      : " + movie.getReleaseYear());
                System.out.println("IMDb      : " + movie.getImdbRating());

                found = true;
            }
        }

        if (!found) {
            System.out.println("No movies found in this genre.");
        }
    }

    // Search by Language
    public void searchByLanguage(String language) {

        boolean found = false;

        for (Movie movie : movies) {

            if (movie.getLanguage().equalsIgnoreCase(language)) {

                System.out.println("----------------------------");
                System.out.println("Name      : " + movie.getName());
                System.out.println("Genre     : " + movie.getGenre());
                System.out.println("Language  : " + movie.getLanguage());
                System.out.println("Year      : " + movie.getReleaseYear());
                System.out.println("IMDb      : " + movie.getImdbRating());

                found = true;
            }
        }

        if (!found) {
            System.out.println("No movies found in this language.");
        }
    }

    // Recommend Movies
    public void recommendMovies(String genre) {

        boolean found = false;

        System.out.println("\nRecommended Movies:");

        for (Movie movie : movies) {

            if (movie.getGenre().equalsIgnoreCase(genre)) {

                System.out.println("----------------------------");
                System.out.println("Name      : " + movie.getName());
                System.out.println("Language  : " + movie.getLanguage());
                System.out.println("IMDb      : " + movie.getImdbRating());

                found = true;
            }
        }

        if (!found) {
            System.out.println("No recommendations available.");
        }
    }

    // Mark Favorite
    public void markFavorite(String movieName) {

        boolean found = false;

        for (Movie movie : movies) {

            if (movie.getName().equalsIgnoreCase(movieName)) {

                movie.setFavorite(true);
                System.out.println("Movie marked as favorite!");

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Movie not found.");
        }
    }

    // View Favorite Movies
    public void viewFavorites() {

        boolean found = false;

        System.out.println("\nFavorite Movies:");

        for (Movie movie : movies) {

            if (movie.isFavorite()) {

                System.out.println("----------------------------");
                System.out.println("Name      : " + movie.getName());
                System.out.println("Genre     : " + movie.getGenre());
                System.out.println("Language  : " + movie.getLanguage());
                System.out.println("IMDb      : " + movie.getImdbRating());

                found = true;
            }
        }

        if (!found) {
            System.out.println("No favorite movies found.");
        }
    }
    // Set the movie list
public void setMovies(ArrayList<Movie> movies) {
    this.movies = movies;
}
    // Return the movie list
public ArrayList<Movie> getMovies() {
    return movies;
}
}