package com.company;

import static com.company.Globals.TEXT_MAX_LENGTH;

public class AlignCenter implements AlignStrategy {

    public final void render(Paragraph p, String context)
    {
        int freeSpace = (TEXT_MAX_LENGTH - p.getText().length()) / 2;

        String beforeText = "";
        String afterText = "";
        for (int index = 0;index < freeSpace;index++)
        {
            beforeText += " ";
        }
        freeSpace = TEXT_MAX_LENGTH - p.getText().length() - freeSpace;
        for (int index = 0;index < freeSpace;index++)
        {
            afterText += " ";
        }

        p.setText(beforeText + p.getText() + afterText);
    }
}

