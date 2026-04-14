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
        // Built-in iteration is enough when you only need to go through the data in insertion order without needing custom sorting
    }

    static List<String> titles(Iterator<PlaylistItem> iterator) {
        List<String> titles = new ArrayList<>();
        while (iterator.hasNext()) {
            titles.add(iterator.next().getTitle());
        }
        return titles;
    }
}