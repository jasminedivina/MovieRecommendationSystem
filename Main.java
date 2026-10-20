
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MovieManager manager = new MovieManager();

        manager.setMovies(FileManager.loadMovies());

        int choice = 0;

        do {
            System.out.println("\n========== Movie Recommendation System ==========");
            System.out.println("1. Add Movie");
            System.out.println("2. View Movies");
            System.out.println("3. Search by Genre");
            System.out.println("4. Search by Language");
            System.out.println("5. Recommend Movies");
            System.out.println("6. Mark Favorite");
            System.out.println("7. View Favorites");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid choice! Enter a number from 1 to 8.");
                continue;
            }

            switch (choice) {

                case 1:
                    System.out.print("Movie Name: ");
                    String name = scanner.nextLine().trim();

                    System.out.print("Genre: ");
                    String genre = scanner.nextLine().trim();

                    System.out.print("Language: ");
                    String language = scanner.nextLine().trim();

                    if (name.isEmpty() || genre.isEmpty() || language.isEmpty()) {
                        System.out.println("Name, genre, and language cannot be empty.");
                        break;
                    }

                    try {
                        System.out.print("Release Year: ");
                        int year = Integer.parseInt(scanner.nextLine().trim());

                        if (year < 1888 || year > 2100) {
                            System.out.println("Enter a valid release year (1888–2100).");
                            break;
                        }

                        System.out.print("IMDb Rating (0–10): ");
                        double rating = Double.parseDouble(scanner.nextLine().trim());

                        if (Double.isNaN(rating) || Double.isInfinite(rating)
                                || rating < 0 || rating > 10) {
                            System.out.println("Rating must be between 0 and 10.");
                            break;
                        }

                        Movie movie = new Movie(
                                name, genre, language, year, rating, false);

                        manager.addMovie(movie);

                    } catch (NumberFormatException e) {
                        System.out.println("Year must be a whole number and rating must be numeric.");
                    }
                    break;

                case 2:
                    manager.viewMovies();
                    break;

                case 3:
                    System.out.print("Enter Genre: ");
                    manager.searchByGenre(scanner.nextLine().trim());
                    break;

                case 4:
                    System.out.print("Enter Language: ");
                    manager.searchByLanguage(scanner.nextLine().trim());
                    break;

                case 5:
                    System.out.print("Enter Preferred Genre: ");
                    manager.recommendMovies(scanner.nextLine().trim());
                    break;

                case 6:
                    System.out.print("Enter Movie Name: ");
                    manager.markFavorite(scanner.nextLine().trim());
                    break;

                case 7:
                    manager.viewFavorites();
                    break;

                case 8:
                    FileManager.saveMovies(manager.getMovies());
                    System.out.println("Thank you for using the Movie Recommendation System!");
                    break;

                default:
                    System.out.println("Invalid choice! Please enter a number from 1 to 8.");
            }

        } while (choice != 8);

        scanner.close();
    }
}
