package ca.bcit.comp2522.bookstore;

import java.util.ArrayList;
import java.util.List;

public class BookStore
{

    private final String bookStoreName;
    private final List<Novel> novelReferences;

    public BookStore(final String bookStoreName)
    {
        this.bookStoreName = bookStoreName;
        this.novelReferences = new ArrayList<>();

        novelReferences.add(new Novel("The Adventures of Augie March", "Saul Bellow", 1953));
        novelReferences.add(new Novel("All the King's Men", "Robert Penn Warren", 1946));
        novelReferences.add(new Novel("American Pastoral", "Philip Roth", 1997));
        novelReferences.add(new Novel("An American Tragedy", "Theodore Dreiser", 1925));
        novelReferences.add(new Novel("Animal Farm", "George Orwell", 1946));
        novelReferences.add(new Novel("Appointment in Samarra", "John O'Hara", 1934));
        novelReferences.add(new Novel("Are You There God? It's Me, Margaret.", "Judy Blume", 1970));
        novelReferences.add(new Novel("The Assistant", "Bernard Malamud", 1957));
        novelReferences.add(new Novel("At Swim-Two-Birds", "Flann O'Brien", 1938));
        novelReferences.add(new Novel("Atonement", "Ian McEwan", 2002));
        novelReferences.add(new Novel("Beloved", "Toni Morrison", 1987));
        novelReferences.add(new Novel("The Berlin Stories", "Christopher Isherwood", 1946));
        novelReferences.add(new Novel("The Big Sleep", "Raymond Chandler", 1939));
        novelReferences.add(new Novel("The Blind Assassin", "Margaret Atwood", 2000));
        novelReferences.add(new Novel("Blood Meridian", "Cormac McCarthy", 1986));
        novelReferences.add(new Novel("Brideshead Revisited", "Evelyn Waugh", 1946));
        novelReferences.add(new Novel("The Bridge of San Luis Rey", "Thornton Wilder", 1927));
        novelReferences.add(new Novel("Call It Sleep", "Henry Roth", 1935));
        novelReferences.add(new Novel("Catch-22", "Joseph Heller", 1961));
        novelReferences.add(new Novel("The Catcher in the Rye", "J.D. Salinger", 1951));
        novelReferences.add(new Novel("A Clockwork Orange", "Anthony Burgess", 1963));
        novelReferences.add(new Novel("The Confessions of Nat Turner", "William Styron", 1967));
        novelReferences.add(new Novel("The Corrections", "Jonathan Franzen", 2001));
        novelReferences.add(new Novel("The Crying of Lot 49", "Thomas Pynchon", 1966));
        novelReferences.add(new Novel("A Dance to the Music of Time", "Anthony Powell", 1951));
        novelReferences.add(new Novel("The Day of the Locust", "Nathanael West", 1939));
        novelReferences.add(new Novel("Death Comes for the Archbishop", "Willa Cather", 1927));
        novelReferences.add(new Novel("A Death in the Family", "James Agee", 1958));
        novelReferences.add(new Novel("The Death of the Heart", "Elizabeth Bowen", 1958));
        novelReferences.add(new Novel("Deliverance", "James Dickey", 1970));
        novelReferences.add(new Novel("Dog Soldiers", "Robert Stone", 1974));
        novelReferences.add(new Novel("Falconer", "John Cheever", 1977));
        novelReferences.add(new Novel("The French Lieutenant's Woman", "John Fowles", 1969));
        novelReferences.add(new Novel("The Golden Notebook", "Doris Lessing", 1962));
        novelReferences.add(new Novel("Go Tell It on the Mountain", "James Baldwin", 1953));
        novelReferences.add(new Novel("Gone with the Wind", "Margaret Mitchell", 1936));
        novelReferences.add(new Novel("The Grapes of Wrath", "John Steinbeck", 1939));
        novelReferences.add(new Novel("Gravity's Rainbow", "Thomas Pynchon", 1973));
        novelReferences.add(new Novel("The Great Gatsby", "F. Scott Fitzgerald", 1925));
        novelReferences.add(new Novel("A Handful of Dust", "Evelyn Waugh", 1934));
        novelReferences.add(new Novel("The Heart Is a Lonely Hunter", "Carson McCullers", 1940));
        novelReferences.add(new Novel("The Heart of the Matter", "Graham Greene", 1948));
        novelReferences.add(new Novel("Herzog", "Saul Bellow", 1964));
        novelReferences.add(new Novel("Housekeeping", "Marilynne Robinson", 1981));
        novelReferences.add(new Novel("A House for Mr. Biswas", "V.S. Naipaul", 1962));
        novelReferences.add(new Novel("I, Claudius", "Robert Graves", 1934));
        novelReferences.add(new Novel("Infinite Jest", "David Foster Wallace", 1996));
        novelReferences.add(new Novel("Invisible Man", "Ralph Ellison", 1952));
        novelReferences.add(new Novel("Light in August", "William Faulkner", 1932));
        novelReferences.add(new Novel("The Lion, The Witch and the Wardrobe", "C.S. Lewis", 1950));
        novelReferences.add(new Novel("Lolita", "Vladimir Nabokov", 1955));
        novelReferences.add(new Novel("Lord of the Flies", "William Golding", 1954));
        novelReferences.add(new Novel("The Lord of the Rings", "J.R.R. Tolkien", 1954));
        novelReferences.add(new Novel("Loving", "Henry Green", 1945));
        novelReferences.add(new Novel("Lucky Jim", "Kingsley Amis", 1954));
        novelReferences.add(new Novel("The Man Who Loved Children", "Christina Stead", 1940));
        novelReferences.add(new Novel("Midnight's Children", "Salman Rushdie", 1981));
        novelReferences.add(new Novel("Money", "Martin Amis", 1984));
        novelReferences.add(new Novel("The Moviegoer", "Walker Percy", 1961));
        novelReferences.add(new Novel("Mrs. Dalloway", "Virginia Woolf", 1925));
        novelReferences.add(new Novel("Naked Lunch", "William Burroughs", 1959));
        novelReferences.add(new Novel("Native Son", "Richard Wright", 1940));
        novelReferences.add(new Novel("Neuromancer", "William Gibson", 1984));
        novelReferences.add(new Novel("Never Let Me Go", "Kazuo Ishiguro", 2005));
        novelReferences.add(new Novel("1984", "George Orwell", 1948));
        novelReferences.add(new Novel("On the Road", "Jack Kerouac", 1957));
        novelReferences.add(new Novel("One Flew Over the Cuckoo's Nest", "Ken Kesey", 1962));
        novelReferences.add(new Novel("The Painted Bird", "Jerzy Kosinski", 1965));
        novelReferences.add(new Novel("Pale Fire", "Vladimir Nabokov", 1962));
        novelReferences.add(new Novel("A Passage to India", "E.M. Forster", 1924));
        novelReferences.add(new Novel("Play It as It Lays", "Joan Didion", 1970));
        novelReferences.add(new Novel("Portnoy's Complaint", "Philip Roth", 1969));
        novelReferences.add(new Novel("Possession", "A.S. Byatt", 1990));
        novelReferences.add(new Novel("The Power and the Glory", "Graham Greene", 1939));
        novelReferences.add(new Novel("The Prime of Miss Jean Brodie", "Muriel Spark", 1961));
        novelReferences.add(new Novel("Rabbit, Run", "John Updike", 1960));
        novelReferences.add(new Novel("Ragtime", "E.L. Doctorow", 1975));
        novelReferences.add(new Novel("The Recognitions", "William Gaddis", 1955));
        novelReferences.add(new Novel("Red Harvest", "Dashiell Hammett", 1929));
        novelReferences.add(new Novel("Revolutionary Road", "Richard Yates", 1961));
        novelReferences.add(new Novel("The Sheltering Sky", "Paul Bowles", 1949));
        novelReferences.add(new Novel("Slaughterhouse-Five", "Kurt Vonnegut", 1969));
        novelReferences.add(new Novel("Snow Crash", "Neal Stephenson", 1992));
        novelReferences.add(new Novel("The Sot-Weed Factor", "John Barth", 1960));
        novelReferences.add(new Novel("The Sound and the Fury", "William Faulkner", 1929));

        public void printAllTitles()
        {
            for (Novel n : novelReferences)
            {
                System.out.println(n.getTitle().toUpperCase());
            }
        }

        public void printBookTitle(final String title)
        {
            for (Novel n : novelReferences) {
                if (n.getTitle().toLowerCase().contains(title.toLowerCase()))
                {
                    System.out.println(n.getTitle());
                }
            }
        }

        public void printTitlesInAlphaOrder()
        {
            List<String> titles = new ArrayList<>();
            for (Novel n : novelReferences)
            {
                titles.add(n.getTitle());
            }

            while (!titles.isEmpty())
            {
                String smallest = titles.get(0);

                for (String t : titles)
                {
                    if (t.compareTo(smallest) < 0)
                    {
                        smallest = t;
                    }
                }

                System.out.println(smallest);

                titles.remove(smallest);
            }
        }

        public void printGroupByDecade(int decade)
        {
            int startYear = decade;
            int endYear = decade + 9

            for(Novel n : novelReferences) {
                int year = n.getYearPublished();
                if(year >= startYear && year <= endYear) {
                    System.out.println(n.getTitle() + " (" + year + ")");
                }
            }
        }
        public String getLongest()
    {
            if(novelReferences.isEmpty())
            {
                return "No books in bookstore";
            }

            Novel longest = novelReferences.get(0);

            for(int i = 1; i < novelReferences.size(); i++)
            {
                Novel current = novelReferences.get(i);
                if(current.getTitle().length() > longest.getTitle().length())
                {
                    longest = current;
                }
            }

            return longest.getTitle();
        }

        public boolean isThereABookWrittenIn(int year)
        {
            for(Novel n : novelReferences)
            {
                if (n.getYearPublished() == year)
                {
                    return true;
                }
            }
            return false;
        }

        public int howManyBooksContain(String word)
        {
            int count = 0;
            String lowerWord = word.toLowerCase();

            for (Novel n : novelReferences)
            {
                String title = n.getTitle().toLowerCase();
                if (title.contains(lowerWord))
                {
                    count++;
                }
            }

            return count;
        }

        public double whichPercentWrittenBetween(int first, int last)
        {
            if (novelReferences.isEmpty())
            {
                return 0.0;
            }

            int count = 0;

            for (Novel n : novelReferences)
            {
                int year = n.getYearPublished();
                if (year >= first && year <= last)
                {
                    count++;
                }
            }

            return (count * 100.0) / novelReferences.size();
        }

        public Novel getOldestBook() {
            if (novelReferences.isEmpty()) {
                return null;
            }

            Novel oldest = novelReferences.get(0);

            for(int i = 1; i < novelReferences.size(); i++) {
                Novel current = novelReferences.get(i);
                if (current.getYearPublished() < oldest.getYearPublished()) {
                    oldest = current;
                }
            }

            return oldest;
        }

        public List<Novel> getBooksThisLength(int titleLength)
        {
            List<Novel> result = new ArrayList<>();

            for (Novel n : novelReferences)
            {
                if (n.getTitle().length() == titleLength) {
                    result.add(n);
                }
            }

            return result;
        }
    }
}

public void main(String[] args)
{
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
    System.out.println(bookstore.isThereABookWrittenIn(1950));
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