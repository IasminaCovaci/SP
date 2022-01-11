package com.company;

public class TableOfContents implements Element
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

    private String something = "";
}


