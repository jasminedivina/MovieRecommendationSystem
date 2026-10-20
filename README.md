
# Movie Recommendation System

A console-based Java application that helps users manage their movie collections and discover movies based on their preferred genres.

## Features

- Add and view movies
- Search movies by genre or language
- Get genre-based movie recommendations
- Mark movies as favorites
- View favorite movies
- Save movie details to a local text file
- Load saved movies when the application starts
- Validate user input and handle invalid entries

## Technologies Used

- Java 21
- Object-Oriented Programming (OOP)
- ArrayList and Java Collections
- File Handling
- Exception Handling
- Visual Studio Code

## Project Structure

```text
MovieRecommendationSystem/
├── Main.java
├── Movie.java
├── MovieManager.java
├── FileManager.java
├── movies.txt
└── README.md
```

## How to Run

### Prerequisites

Install the Java Development Kit (JDK) and configure it on your system.

### Steps

1. Open the project folder in VS Code.
2. Open the terminal in the project directory.
3. Compile the Java files:

   ```bash
   javac *.java
   ```

4. Run the application:

   ```bash
   java Main
   ```

5. Use the menu to manage movies.

## Data Storage

Movie records are stored locally in `movies.txt`. The application loads saved records when it starts and saves updates when the user exits.

## Future Enhancements

- MySQL database integration using JDBC
- User login and authentication
- Recommendations based on ratings and viewing history
- Graphical user interface using Java Swing or JavaFX
- Integration with an online movie database API
