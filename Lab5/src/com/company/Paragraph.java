package com.company;

public class Paragraph implements Element {
    public Paragraph(final String text)
    {
        this.text_ = text;
    }

    public final void print()
    {
        System.out.print("Paragraf: ");
        System.out.print(text_);
        System.out.print("\n");
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

    public final void setAlighStrategy(AlignStrategy alignStrategy)
    {
        textAlign = alignStrategy;
        textAlign.render(this,"");
    }
    public final String getText()
    {
        return text_;
    }
    public final void setText(String text)
    {
        text_ = text;
    }
    private String text_ = "";
    private AlignStrategy textAlign;
}




class Globals
{
    public static final int TEXT_MAX_LENGTH = 15;
}

