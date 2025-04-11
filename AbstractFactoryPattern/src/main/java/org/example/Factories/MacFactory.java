package org.example.Factories;

import org.example.Services.Button;
import org.example.Services.CheckBox;
import org.example.Services.MacButton;
import org.example.Services.MacCheckBox;

public class MacFactory implements Factory {
    public Button createButton() {
        return new MacButton();
    }

    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
