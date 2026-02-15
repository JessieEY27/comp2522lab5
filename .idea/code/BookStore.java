package ca.bcit.comp2522.bookstore;

public class BookStore {
    private final String bookStoreName;
    private final List<String> novelReferences;

    public BookStore()
    {
        novelReferences = new ArrayList<>();
        novelReferences.add("The Adventures of Augie March");
        novelReferences.add("All the King's Men");
        novelReferences.add("American Pastoral");
        novelReferences.add("An American Tragedy");


    }

    public void String printAllTitles()
    {
        return novelReferences.toUpperCase();
    }

    public printBookTitle(String title)
    {
        return title;
    }

    public void printTitlesInAlphaOrder()
    {
        return novelReferences;
    }

    public printGroupByDecade(int decade)
    {
        return novelReferences;
    }

    public void getLongest()
    {
        return novelReferences;
    }

    public boolean isThereABookWrittenIn(int year)
    {
        return true;
    }

    public int howManyBooksContain(String word)
    {
        return 0;
    }

    public int whichPercentWrittenBetween(int first, int last)
    {
        return 0;
    }

    public void getOldestBook()
    {
        return novelReferences;
    }

    public List getBooksThisLength(int titleLength)
    {
        return novelReferences;
    }

}


public static void main(final String[] args) {
    public static void main ( final String[] args){
        6
        COMP2522 Lab 5 Collections
        final BookStore bookstore;
        final Novel oldest;
        final List<Novel> fifteenCharTitles;
        bookstore = new BookStore("Classic Novels Collection");
        System.out.println("All Titles in UPPERCASE:");
        bookstore.printAllTitles();
        System.out.println("\nBook Titles Containing 'the':");
        bookstore.printBookTitle("the");
        System.out.println("\nAll Titles in Alphabetical Order:");
        bookstore.printTitlesInAlphaOrder();
        System.out.println("\nBooks from the 2000s:");
        bookstore.printGroupByDecade(2000);
        System.out.println("\nLongest Book Title:");
        bookstore.getLongest();
        System.out.println("\nIs there a book written in 1950?");
        System.out.println(bookstore.isThereABookWrittenBetween(1950));
        System.out.println("\nHow many books contain 'heart'?");
        System.out.println(bookstore.howManyBooksContain("heart"));
        System.out.println("\nPercentage of books written between 1940 and 1950:");
        System.out.println(bookstore.whichPercentWrittenBetween(1940, 1950) + "%");
        System.out.println("\nOldest book:");
        oldest = bookstore.getOldestBook();
        System.out.println(oldest.getTitle() + " by " + oldest.getAuthorName() + ", " +
                oldest.getYearPublished());
        System.out.println("\nBooks with titles 15 characters long:");
        fifteenCharTitles = bookstore.getBooksThisLength(15);
        fifteenCharTitles.forEach(novel -> System.out.println(novel.getTitle()));
    }
}