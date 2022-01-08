package com.company;

import java.util.*;

public class Book extends Section
{
    public Book(final String title)
    {
        this.title = title;
    }

    public void addAuthor(final Author a)
    {
        authors.add(a);
    }
    public final void addContent(Element element)
    {
        super.add(element);
    }
    public void print()
    {
        System.out.println(title);
        System.out.println("Authors:");

        for (Author a : authors)
        {
            a.print();
        }
        System.out.print("\n");

        super.print();


    }

    private String title = "";
    private ArrayList<Author> authors = new ArrayList<Author>();
}

