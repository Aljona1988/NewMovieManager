import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MovieManagerTest {

    @Test

    public void shouldAddNewMovie() {
        MovieManager movie = new MovieManager();

        movie.addMovie("Movie1");
        movie.addMovie("Movie2");
        movie.addMovie("Movie3");
        movie.addMovie("Movie4");
        movie.addMovie("Movie5");

        String[] expected = {"Movie1", "Movie2", "Movie3", "Movie4", "Movie5"};
        String[] actual = movie.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMovieMin() {
        MovieManager movie = new MovieManager();

        movie.addMovie("Movie1");
        movie.addMovie("Movie2");
        movie.addMovie("Movie3");

        String[] expected = {"Movie3", "Movie2", "Movie1"};
        String[] actual = movie.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindLastMovieMax() {
        MovieManager movie = new MovieManager();

        movie.addMovie("Movie1");
        movie.addMovie("Movie2");
        movie.addMovie("Movie3");
        movie.addMovie("Movie4");
        movie.addMovie("Movie5");
        movie.addMovie("Movie6");
        movie.addMovie("Movie7");
        movie.addMovie("Movie8");
        movie.addMovie("Movie9");
        movie.addMovie("Movie10");
        movie.addMovie("Movie11");
        movie.addMovie("Movie12");
        movie.addMovie("Movie13");
        movie.addMovie("Movie14");
        movie.addMovie("Movie15");
        movie.addMovie("Movie16");

        String[] expected = {"Movie16", "Movie15", "Movie14", "Movie13", "Movie12", "Movie11", "Movie10", "Movie9", "Movie8", "Movie7", "Movie6", "Movie5", "Movie4", "Movie3", "Movie2", "Movie1"};
        String[] actual = movie.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}

