package com.company;

public class Image implements Element
{
    public Image(final String imageName)
    {
        this.imageName = imageName;
    }

    public final void print()
    {
        System.out.print("Image with name: ");
        System.out.println(imageName);
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

    private String imageName = "";
}

