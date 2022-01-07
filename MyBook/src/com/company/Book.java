package com.company;
import java.util.*;

public class Book
{
    ArrayList<String> pharagraphs=new ArrayList<String>();
    ArrayList<String> images=new ArrayList<String>();
    ArrayList<String> tables=new ArrayList<String>();
    String name;

    public Book(String name) {
        this.name = name;
    }


    public void createPharagraph(final String pharargraph)
    {
        pharagraphs.add(pharargraph);
    }
    public void createImage(final String image)
    {
        images.add(image);
    }
    public void createTable(final String table)
    {
        tables.add(table);
    }
    public void print()
    {
        System.out.println("Pharagraphs");
        for (String s : pharagraphs)
        {
            System.out.println(s);
        }

        System.out.println("Images");
        for (String s : images)
        {
            System.out.println(s);

        }

        System.out.println("Tables");
        for (String s : tables)
        {
            System.out.println(s);
        }
    }
}
