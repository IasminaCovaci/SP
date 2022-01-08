package com.company;

public class Author
{
    public Author(final String name)
    {
        this.name = name;
    }

    public final void print()
    {
        System.out.println(name);
    }
    private String name = "";

}

