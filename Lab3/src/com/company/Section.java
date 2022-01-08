package com.company;

public class Section extends Element
{
    public Section()
    {
    }
    public Section(String title)
    {
        this.title = title;
    }

    public final void add(Element element)
    {
        elements.add(element);
    }
    public final void remove(Element element)
    {

    }
    public Element get(final int index)
    {
        return elements.get(index);
    }

    public void print()
    {
        System.out.println(title);

        for (Element e : elements)
        {
            e.print();
        }
    }

    private String title = "";
}

