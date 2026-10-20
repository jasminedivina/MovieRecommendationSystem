import java.io.*;
import java.util.ArrayList;

public class FileManager {

    // Save movies
    public static void saveMovies(ArrayList<Movie> movies) {

        try {

            FileWriter writer = new FileWriter("movies.txt");

            for (Movie movie : movies) {

                writer.write(
                        movie.getName() + "," +
                        movie.getGenre() + "," +
                        movie.getLanguage() + "," +
                        movie.getReleaseYear() + "," +
                        movie.getImdbRating() + "," +
                        movie.isFavorite() + "\n"
                );
            }

            writer.close();

            System.out.println("Movies saved successfully.");

        } catch (IOException e) {

            System.out.println("Error saving movies.");
        }
    }

    // Load movies
    public static ArrayList<Movie> loadMovies() {

        ArrayList<Movie> movies = new ArrayList<>();

        try {

            BufferedReader reader = new BufferedReader(new FileReader("movies.txt"));

            String line;

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(",");

                Movie movie = new Movie(
                        data[0],
                        data[1],
                        data[2],
                        Integer.parseInt(data[3]),
                        Double.parseDouble(data[4]),
                        Boolean.parseBoolean(data[5])
                );

                movies.add(movie);
            }

            reader.close();

        } catch (IOException e) {

            System.out.println("No previous movie data found.");
        }

        return movies;
    }
}