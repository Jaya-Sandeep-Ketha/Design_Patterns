public class FileExplorer {
    public static void main(String[] args) {
        File resume = new File("Resume.pdf", 200);
        File notes = new File("Notes.txt", 100);

        Folder documents = new Folder("Documents");
        documents.add(resume);
        documents.add(notes);

        File rock = new File("rock.mp3", 4000);
        File classic = new File("classic.mp3", 3000);
        Folder albums = new Folder("Albums");
        albums.add(classic);

        Folder music = new Folder("Music");
        music.add(rock);
        music.add(albums);

        Folder root = new Folder("Root");
        root.add(documents);
        root.add(music);
        System.out.println("Total Size: " + root.getSize() + "KB");
    }
}
