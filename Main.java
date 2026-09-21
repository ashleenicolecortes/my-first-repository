public class Main {

    public static void main(String[] args) {
            
            
     Movie movie1 = new Movie();
        movie1.title = "Avatar";
        movie1.genre = "Sci-Fi/Action";
        movie1.duration = 148;

     Movie movie2 = new Movie();
        movie2.title = "The Dark Knight";
        movie2.genre = "Action";
        movie2.duration = 152;

     Movie movie3 = new Movie();
        movie3.title = "Interstellar";
        movie3.genre = "Sci-Fi";
        movie3.duration = 169;

      movie1.displayInfo();
      movie2.displayInfo();
      movie3.displayInfo();
    }
}