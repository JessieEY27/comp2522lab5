package ca.bcit.comp2522.bookstore;


import java.util.*;

public class BookShop1
{

    private final Map<String, Novel> map;

    public BookShop1(final String name)
    {
        map = new HashMap<>();


        map.put("The Adventures of Augie March", new Novel("The Adventures of Augie March", "Saul Bellow", 1953));

        System.out.println("BookShop: " + name);

        System.out.println("All titles (via Iterator):");
        final Set<String> keySet;
        keySet = map.keySet();
        final Iterator<String> iterator;
        iterator = keySet.iterator();
        while(iterator.hasNext())
        {
            final String key;
            key = iterator.next();
            System.out.println(map.get(key).getTitle());
        }

        final Iterator<String> removeIterator;
        removeIterator = map.keySet().iterator();
        while(removeIterator.hasNext())
        {
            final String key;
            key = removeIterator.next();
            if(key.toLowerCase().contains("the"))
            {
                removeIterator.remove();
            }
        }

        System.out.println("Remaining novels (no titles containing 'the'), sorted:");
        final Set<String> remainingKeySet;
        remainingKeySet= map.keySet();
        final List<String> keyList;
        keyList = new ArrayList<>(remainingKeySet);
        Collections.sort(keyList);
        for(final String key : keyList)
        {
            System.out.println(map.get(key));
        }
    }

    public static void main(final String[] args)
    {
        new BookShop1("Classic Novels Collections");
    }
}
