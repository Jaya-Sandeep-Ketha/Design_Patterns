package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DocumentTemplate template = new DocumentTemplate("Document", "Content", "Author");
        DocumentTemplate copy = template.clone();

        copy.setName("New Document");
        copy.setAuthor("New Author");
        copy.setContent("New Content");

        template.display();
        copy.display();

        System.out.println("Checking if objects are equal: " + template.equals(copy));
    }
}