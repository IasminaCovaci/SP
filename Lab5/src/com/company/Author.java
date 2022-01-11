package com.company;

public class Author
{
    public Author(final String name)
    {
        this.name_ = name;
    }

    public final void print()
    {
        System.out.print(name_);
        System.out.print("\n");
    }
    private String name_ = "";
    private String surName_ = "";

}

