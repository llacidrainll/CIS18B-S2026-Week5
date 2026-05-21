package edu.norcocollege.cis18b.week5.mini06;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PlaylistDemo {

    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.add(new PlaylistItem("Intro", 1));
        playlist.add(new PlaylistItem("Demo", 2));
        playlist.add(new PlaylistItem("Quiz", 3));

        System.out.println("Default order: " + titles(playlist.iterator()));
        System.out.println("Priority order: " + titles(playlist.priorityIterator()));

        // TODO: Add a brief reflection in your submission about when built-in iteration would be enough.
        System.out.println("\nReflection:");
        System.out.println("Built in iterations is enough when only one natural order is needed like an insertion order.");
        System.out.println("Custom iterators can be useful when needing different views like priority sorting or filtered traversal without changing the original data.");
    }

    static List<String> titles(Iterator<PlaylistItem> iterator) {
        List<String> titles = new ArrayList<>();
        while (iterator.hasNext()) {
            titles.add(iterator.next().getTitle());
        }
        return titles;
    }
}