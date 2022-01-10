package com.company;

public class Paragraph implements Element
{
    public Paragraph(final String text)
    {
        this.text = text;
    }

    public final void print()
    {
        System.out.print("Paragraf: ");
        System.out.println(text);
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

    private String text = "";
}


