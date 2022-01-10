package com.company;

public class Author
{
    public Author(final String name)
    {
        this.name = name;
    }

    public final void print()
    {
        System.out.print(name);
        System.out.print("\n");
    }
    private String name = "";
    private String surName = "";

}

