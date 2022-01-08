package com.company;

public class Table extends Element
{
    public Table(final String title)
    {
        this.title = title;
    }

    public final void print()
    {
        System.out.print("Table with title: ");
        System.out.println(title);
    }
    private String title = "";
}
