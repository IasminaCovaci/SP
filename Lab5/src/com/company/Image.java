package com.company;

import java.util.concurrent.TimeUnit;

public class Image implements Element, Picture
{
    Image(String url) {
        this.url = url;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String url() {
        return null;
    }

    @Override
    public Dimension dim() {
        return null;
    }

    public final String content()
    {
        return content;
    }
    @Override
    public void print()
    {
        System.out.print("Image with name: ");
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

    private String url = "";
    private String content = "";
}
