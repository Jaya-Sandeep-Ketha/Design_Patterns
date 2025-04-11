package org.example.Factories;

import org.example.Services.Button;
import org.example.Services.CheckBox;
import org.example.Services.WindowsButton;
import org.example.Services.WindowsCheckBox;

public class WindowsFactory implements Factory {
    public Button createButton() {
        return new WindowsButton();
    }
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
