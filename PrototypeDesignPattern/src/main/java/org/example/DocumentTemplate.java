package org.example;

public class DocumentTemplate implements Cloneable{
    private String name;
    private String content;
    private String author;

    public DocumentTemplate(String name, String content, String author) {
        this.name = name;
        this.content = content;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public DocumentTemplate clone() {
        try {
            return (DocumentTemplate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Content: " + content);
        System.out.println("Author: " + author);
        System.out.println();
    }
}
