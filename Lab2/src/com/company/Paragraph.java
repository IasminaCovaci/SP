package com.company;

public class Paragraph implements Element {
    public Paragraph(final String text)
    {
        this.text = text;
    }

    public final void print()
    {
        System.out.print("Paragraf: ");
        System.out.println(text);
    }
    private String text = "";
}

