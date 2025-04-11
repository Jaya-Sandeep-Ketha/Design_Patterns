package org.example.Factories;

import org.example.Services.Button;
import org.example.Services.CheckBox;

public interface Factory {
    Button createButton();
    CheckBox createCheckBox();
}
