package org.example;

import org.example.Factories.AbstractFactory;
import org.example.Factories.Factory;
import org.example.Services.Button;
import org.example.Services.CheckBox;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String os = scanner.nextLine();
        Factory factory = AbstractFactory.createFactory(os);
        Button button = factory.createButton();
        button.click();
        CheckBox checkBox = factory.createCheckBox();
        checkBox.check();
    }
}