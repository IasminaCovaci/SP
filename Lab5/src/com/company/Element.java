package com.company;

import java.util.*;

public interface Element
{
    public abstract void print();

    public void add(Element element);
    public void remove(Element element);
    public Element get(int index);

}
