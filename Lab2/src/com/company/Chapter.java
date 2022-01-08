package com.company;

import java.util.*;

public class Chapter
{
    public Chapter(final String name)
    {
        this.name = name;
    }

    public int createSubChapter(final String c)
    {
        subChapters.add(new SubChapter(c));
        return subChapters.size() - 1;
    }
    public SubChapter getSubChapter(final int index)
    {
        return subChapters.get(index);
    }
    public final void print()
    {
        System.out.println(name);
    }

    private String name = "";
    private ArrayList<SubChapter> subChapters = new ArrayList<SubChapter>();
}
