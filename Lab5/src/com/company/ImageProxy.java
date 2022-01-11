package com.company;

public class ImageProxy implements Element, Picture
{
    public ImageProxy(final String url)
    {
        this.url = url;
        realImg = null;
    }

    @Override
    public void print()
    {
        loadImage();

        System.out.print("Image with url: ");
        System.out.println(url);
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

    private Image loadImage()
    {

        if (realImg == null)
        {
            realImg = new Image(url);
        }
        return realImg;
    }

    private String url = "";
    private Dimension dim = new Dimension();
    private Image realImg;

    @Override
    public String url() {
        return null;
    }

    @Override
    public Dimension dim() {
        return null;
    }

    @Override
    public String content() {
        return null;
    }
}
