package com.company;

import java.util.*;

public class SubChapter
{
    public SubChapter(final String name)
    {
        this.name = name;
    }

    public final void createNewElement(Element e)
    {
        elements.add(e);
    }

    public final void print()
    {
        System.out.print("SubChapter: ");
        System.out.println(name);
        for (var s : elements)
        {
            s.print();
        }
    }
    private String name = "";
    private ArrayList<Element> elements = new ArrayList<Element>();

}
