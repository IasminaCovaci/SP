package com.company;

import java.util.*;

public class Book
{
    public Book(final String title)
    {
        this.title = title;
    }

    public void addAuthor(final Author a)
    {
        authors.add(a);
    }
    public int createChapter(final String c)
    {
        chapters.add(new Chapter(c));
        return chapters.size() - 1;
    }
    public Chapter getChapter(final int index)
    {
        return chapters.get(index);
    }
    public final void print()
    {
        System.out.println(title);
    }

    private String title = "";
    private ArrayList<Chapter> chapters = new ArrayList<Chapter>();
    private ArrayList<Author> authors = new ArrayList<Author>();
}

