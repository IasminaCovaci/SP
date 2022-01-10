package com.company;

public class Table implements Element
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

    @Override
    public void add(Element element) {

    }

    @Override
    public void remove(Element element) {

    }

    @Override
    public Element get(int index) {
        return null;
    }

    private String title = "";
}
