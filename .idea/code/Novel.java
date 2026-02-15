package ca.bcit.comp2522.bookstore;

public class Novel {
    private final String title;
    private final String authorName;
    private final int yearPublished;

    public Novel(String title, String authorName, int yearPublished) {
        this.title = title;
        this.authorName = authorName;
        this.yearPublished = yearPublished;
    }

    public String getTitle(final String title){
        return title;
    }

    public String getAuthorName(final String authorName){
        return authorName;
    }

    public int getYearPublished(final int yearPublished){
        return yearPublished;
    }
}
