package com.company;

class Dimension
{
    public Dimension()
    {
    }
    public Dimension(int h, int w)
    {
        this.height = h;
        this.width = w;
    }

    public int height;
    public int width;
}
public interface Picture
{
    public abstract String url();
    public abstract Dimension dim();
    public abstract String content();
}

