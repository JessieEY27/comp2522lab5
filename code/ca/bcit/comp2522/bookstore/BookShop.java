package ca.bcit.comp2522.bookstore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BookShop
{
    /**
     * Map storing novels with title as key and Novel object as value.
     */
    private final Map<String, Novel> map;

    /**
     * Constructs a Bookshop with the specified name.
     * Populates the bookshop with a collection of 100 classic novels.
     * Prints all novel titles using an iterator, removes novels containing "the" in the title,
     * and prints the remaining novels in sorted alphabetical order.
     *
     * @param name name of the bookshop
     */
    public BookShop(final String name)
    {

        map = new HashMap<>();

        map.put("The Adventures of Augie March",    new Novel("The Adventures of Augie March",    "Saul Bellow",           1953));
        map.put("All the King's Men",               new Novel("All the King's Men",               "Robert Penn Warren",    1946));
        map.put("American Pastoral",                new Novel("American Pastoral",                "Philip Roth",           1997));
        map.put("An American Tragedy",              new Novel("An American Tragedy",              "Theodore Dreiser",      1925));
        map.put("Animal Farm",                      new Novel("Animal Farm",                      "George Orwell",         1946));
        map.put("Appointment in Samarra",           new Novel("Appointment in Samarra",           "John O'Hara",           1934));
        map.put("Are You There God? It's Me, Margaret.", new Novel("Are You There God? It's Me, Margaret.", "Judy Blume", 1970));
        map.put("The Assistant",                    new Novel("The Assistant",                    "Bernard Malamud",       1957));
        map.put("At Swim-Two-Birds",                new Novel("At Swim-Two-Birds",                "Flann O'Brien",         1938));
        map.put("Atonement",                        new Novel("Atonement",                        "Ian McEwan",            2002));
        map.put("Beloved",                          new Novel("Beloved",                          "Toni Morrison",         1987));
        map.put("The Berlin Stories",               new Novel("The Berlin Stories",               "Christopher Isherwood", 1946));
        map.put("The Big Sleep",                    new Novel("The Big Sleep",                    "Raymond Chandler",      1939));
        map.put("The Blind Assassin",               new Novel("The Blind Assassin",               "Margaret Atwood",       2000));
        map.put("Blood Meridian",                   new Novel("Blood Meridian",                   "Cormac McCarthy",       1986));
        map.put("Brideshead Revisited",             new Novel("Brideshead Revisited",             "Evelyn Waugh",          1946));
        map.put("The Bridge of San Luis Rey",       new Novel("The Bridge of San Luis Rey",       "Thornton Wilder",       1927));
        map.put("Call It Sleep",                    new Novel("Call It Sleep",                    "Henry Roth",            1935));
        map.put("Catch-22",                         new Novel("Catch-22",                         "Joseph Heller",         1961));
        map.put("The Catcher in the Rye",           new Novel("The Catcher in the Rye",           "J.D. Salinger",         1951));
        map.put("A Clockwork Orange",               new Novel("A Clockwork Orange",               "Anthony Burgess",       1963));
        map.put("The Confessions of Nat Turner",    new Novel("The Confessions of Nat Turner",    "William Styron",        1967));
        map.put("The Corrections",                  new Novel("The Corrections",                  "Jonathan Franzen",      2001));
        map.put("The Crying of Lot 49",             new Novel("The Crying of Lot 49",             "Thomas Pynchon",        1966));
        map.put("A Dance to the Music of Time",     new Novel("A Dance to the Music of Time",     "Anthony Powell",        1951));
        map.put("The Day of the Locust",            new Novel("The Day of the Locust",            "Nathanael West",        1939));
        map.put("Death Comes for the Archbishop",   new Novel("Death Comes for the Archbishop",   "Willa Cather",          1927));
        map.put("A Death in the Family",            new Novel("A Death in the Family",            "James Agee",            1958));
        map.put("The Death of the Heart",           new Novel("The Death of the Heart",           "Elizabeth Bowen",       1958));
        map.put("Deliverance",                      new Novel("Deliverance",                      "James Dickey",          1970));
        map.put("Dog Soldiers",                     new Novel("Dog Soldiers",                     "Robert Stone",          1974));
        map.put("Falconer",                         new Novel("Falconer",                         "John Cheever",          1977));
        map.put("The French Lieutenant's Woman",    new Novel("The French Lieutenant's Woman",    "John Fowles",           1969));
        map.put("The Golden Notebook",              new Novel("The Golden Notebook",              "Doris Lessing",         1962));
        map.put("Go Tell It on the Mountain",       new Novel("Go Tell It on the Mountain",       "James Baldwin",         1953));
        map.put("Gone with the Wind",               new Novel("Gone with the Wind",               "Margaret Mitchell",     1936));
        map.put("The Grapes of Wrath",              new Novel("The Grapes of Wrath",              "John Steinbeck",        1939));
        map.put("Gravity's Rainbow",                new Novel("Gravity's Rainbow",                "Thomas Pynchon",        1973));
        map.put("The Great Gatsby",                 new Novel("The Great Gatsby",                 "F. Scott Fitzgerald",   1925));
        map.put("A Handful of Dust",                new Novel("A Handful of Dust",                "Evelyn Waugh",          1934));
        map.put("The Heart Is a Lonely Hunter",     new Novel("The Heart Is a Lonely Hunter",     "Carson McCullers",      1940));
        map.put("The Heart of the Matter",          new Novel("The Heart of the Matter",          "Graham Greene",         1948));
        map.put("Herzog",                           new Novel("Herzog",                           "Saul Bellow",           1964));
        map.put("Housekeeping",                     new Novel("Housekeeping",                     "Marilynne Robinson",    1981));
        map.put("A House for Mr. Biswas",           new Novel("A House for Mr. Biswas",           "V.S. Naipaul",          1962));
        map.put("I, Claudius",                      new Novel("I, Claudius",                      "Robert Graves",         1934));
        map.put("Infinite Jest",                    new Novel("Infinite Jest",                    "David Foster Wallace",  1996));
        map.put("Invisible Man",                    new Novel("Invisible Man",                    "Ralph Ellison",         1952));
        map.put("Light in August",                  new Novel("Light in August",                  "William Faulkner",      1932));
        map.put("The Lion, The Witch and the Wardrobe", new Novel("The Lion, The Witch and the Wardrobe", "C.S. Lewis",  1950));
        map.put("Lolita",                           new Novel("Lolita",                           "Vladimir Nabokov",      1955));
        map.put("Lord of the Flies",                new Novel("Lord of the Flies",                "William Golding",       1954));
        map.put("The Lord of the Rings",            new Novel("The Lord of the Rings",            "J.R.R. Tolkien",        1954));
        map.put("Loving",                           new Novel("Loving",                           "Henry Green",           1945));
        map.put("Lucky Jim",                        new Novel("Lucky Jim",                        "Kingsley Amis",         1954));
        map.put("The Man Who Loved Children",       new Novel("The Man Who Loved Children",       "Christina Stead",       1940));
        map.put("Midnight's Children",              new Novel("Midnight's Children",              "Salman Rushdie",        1981));
        map.put("Money",                            new Novel("Money",                            "Martin Amis",           1984));
        map.put("The Moviegoer",                    new Novel("The Moviegoer",                    "Walker Percy",          1961));
        map.put("Mrs. Dalloway",                    new Novel("Mrs. Dalloway",                    "Virginia Woolf",        1925));
        map.put("Naked Lunch",                      new Novel("Naked Lunch",                      "William Burroughs",     1959));
        map.put("Native Son",                       new Novel("Native Son",                       "Richard Wright",        1940));
        map.put("Neuromancer",                      new Novel("Neuromancer",                      "William Gibson",        1984));
        map.put("Never Let Me Go",                  new Novel("Never Let Me Go",                  "Kazuo Ishiguro",        2005));
        map.put("1984",                             new Novel("1984",                             "George Orwell",         1948));
        map.put("On the Road",                      new Novel("On the Road",                      "Jack Kerouac",          1957));
        map.put("One Flew Over the Cuckoo's Nest",  new Novel("One Flew Over the Cuckoo's Nest",  "Ken Kesey",             1962));
        map.put("The Painted Bird",                 new Novel("The Painted Bird",                 "Jerzy Kosinski",        1965));
        map.put("Pale Fire",                        new Novel("Pale Fire",                        "Vladimir Nabokov",      1962));
        map.put("A Passage to India",               new Novel("A Passage to India",               "E.M. Forster",          1924));
        map.put("Play It as It Lays",               new Novel("Play It as It Lays",               "Joan Didion",           1970));
        map.put("Portnoy's Complaint",              new Novel("Portnoy's Complaint",              "Philip Roth",           1969));
        map.put("Possession",                       new Novel("Possession",                       "A.S. Byatt",            1990));
        map.put("The Power and the Glory",          new Novel("The Power and the Glory",          "Graham Greene",         1939));
        map.put("The Prime of Miss Jean Brodie",    new Novel("The Prime of Miss Jean Brodie",    "Muriel Spark",          1961));
        map.put("Rabbit, Run",                      new Novel("Rabbit, Run",                      "John Updike",           1960));
        map.put("Ragtime",                          new Novel("Ragtime",                          "E.L. Doctorow",         1975));
        map.put("The Recognitions",                 new Novel("The Recognitions",                 "William Gaddis",        1955));
        map.put("Red Harvest",                      new Novel("Red Harvest",                      "Dashiell Hammett",      1929));
        map.put("Revolutionary Road",               new Novel("Revolutionary Road",               "Richard Yates",         1961));
        map.put("The Sheltering Sky",               new Novel("The Sheltering Sky",               "Paul Bowles",           1949));
        map.put("Slaughterhouse-Five",              new Novel("Slaughterhouse-Five",              "Kurt Vonnegut",         1969));
        map.put("Snow Crash",                       new Novel("Snow Crash",                       "Neal Stephenson",       1992));
        map.put("The Sot-Weed Factor",              new Novel("The Sot-Weed Factor",              "John Barth",            1960));
        map.put("The Sound and the Fury",           new Novel("The Sound and the Fury",           "William Faulkner",      1929));
        map.put("The Sportswriter",                 new Novel("The Sportswriter",                 "Richard Ford",          1986));
        map.put("The Spy Who Came in from the Cold",new Novel("The Spy Who Came in from the Cold","John le Carré",         1964));
        map.put("The Sun Also Rises",               new Novel("The Sun Also Rises",               "Ernest Hemingway",      1926));
        map.put("Their Eyes Were Watching God",     new Novel("Their Eyes Were Watching God",     "Zora Neale Hurston",    1937));
        map.put("Things Fall Apart",                new Novel("Things Fall Apart",                "Chinua Achebe",         1959));
        map.put("To Kill a Mockingbird",            new Novel("To Kill a Mockingbird",            "Harper Lee",            1960));
        map.put("To the Lighthouse",                new Novel("To the Lighthouse",                "Virginia Woolf",        1929));
        map.put("Tropic of Cancer",                 new Novel("Tropic of Cancer",                 "Henry Miller",          1934));
        map.put("Ubik",                             new Novel("Ubik",                             "Philip K. Dick",        1969));
        map.put("Under the Net",                    new Novel("Under the Net",                    "Iris Murdoch",          1954));
        map.put("Under the Volcano",                new Novel("Under the Volcano",                "Malcolm Lowry",         1947));
        map.put("Watchmen",                         new Novel("Watchmen",                         "Alan Moore and Dave Gibbons", 1986));
        map.put("White Noise",                      new Novel("White Noise",                      "Don DeLillo",           1985));
        map.put("White Teeth",                      new Novel("White Teeth",                      "Zadie Smith",           2000));
        map.put("Wide Sargasso Sea",                new Novel("Wide Sargasso Sea",                "Jean Rhys",             1966));

        System.out.println("Bookshop: " + name);

        System.out.println("All titles (via Iterator):");
        final Set<String> keySet;
        keySet = map.keySet();
        final Iterator<String> iterator;
        iterator = keySet.iterator();
        while (iterator.hasNext())
        {
            final String key;
            key = iterator.next();
            System.out.println(map.get(key).getTitle());
        }
        System.out.println();

        final Iterator<String> removeIterator;
        removeIterator = map.keySet().iterator();
        while (removeIterator.hasNext())
        {
            final String key;
            key = removeIterator.next();
            if (key.toLowerCase().contains("the"))
            {
                removeIterator.remove();
            }
        }

        System.out.println("Remaining novels (no titles containing 'the'), sorted:");
        final Set<String> remainingKeySet = map.keySet();
        final List<String> keyList;
        keyList = new ArrayList<>(remainingKeySet);
        Collections.sort(keyList);
        for (final String key : keyList)
        {
            System.out.println(map.get(key));
        }
    }

    /**
     * Drives the program.
     *
     * @param args unused
     */
    public static void main(final String[] args)
    {
        new BookShop("Classic Novels Collection");
    }
}
