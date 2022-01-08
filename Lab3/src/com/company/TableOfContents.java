package com.company;

public class TableOfContents extends Element
{
    public TableOfContents(String something)
    {
        this.something = something;
    }
    public final void print()
    {
        System.out.print("TableOfContents: ");
        System.out.println(something);
    }

    private String something = "";
}

