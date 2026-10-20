public class Movie {

    private String name;
    private String genre;
    private String language;
    private int releaseYear;
    private double imdbRating;
    private boolean favorite;

    // Constructor
    public Movie(String name, String genre, String language,
                 int releaseYear, double imdbRating, boolean favorite) {

        this.name = name;
        this.genre = genre;
        this.language = language;
        this.releaseYear = releaseYear;
        this.imdbRating = imdbRating;
        this.favorite = favorite;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public String getLanguage() {
        return language;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public double getImdbRating() {
        return imdbRating;
    }

    public boolean isFavorite() {
        return favorite;
    }

    // Setter
    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }
}