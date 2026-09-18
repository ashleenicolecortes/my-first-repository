Public class LabActivity1{

    public static void main(String [] args){
    
        Movie movie1 = new Movie();
        movie1.title = " The Dark Knight ";
        movie1.genre = "Action";
        movie1.duratin = "152";

        Movie movie2 = new Movie();
        movie2.title = " Avatar ";
        movie2.genre = "Action/Sci-Fi";
        movie2.duratin = "162";

        Movie movie3 = new Movie();
        movie3.title = " Spirited Away ";
        movie3.genre = "Fantasy/Animation";
        movie3.duratin = "125";
        
        
    movie1.diplayInfo();
    movie2.diplayInfo();
    movie3.diplayInfo();
    
    }

}