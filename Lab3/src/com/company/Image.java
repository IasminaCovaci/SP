package com.company;

public class Image extends Element
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
    private String imageName = "";
}

