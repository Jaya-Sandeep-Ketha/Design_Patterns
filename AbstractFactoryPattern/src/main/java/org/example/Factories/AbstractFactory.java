package org.example.Factories;

public class AbstractFactory {
    public static Factory createFactory(String os) {
        switch (os) {
            case "mac":
                return new MacFactory();
            case "windows":
                return new WindowsFactory();
            default:
                throw new IllegalArgumentException("Unsupported OS: " + os);
        }
    }
}
