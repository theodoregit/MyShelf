package registration;


class Library {
    private String title, author, genre;
    private int page;
    
    Library(String title, String author, int page, String genre){
        this.title = title;
        this.author = author;
        this.page = page;
        this.genre = genre;
    }
    
    String getTitle(){
        return title;
    }
    String getAuthor(){
        return author;
    }
    int getPage(){
        return page;
    }
    String getGenre(){
        return genre;
    }
}
