package main.exercise5;

public class Main {
    public static void main(String[] args) {
        File one = new File("one", "txt");
        File two = new File("two", "exe");
        File three = new File("three", "jpg");
        File four = new File("four", "doc");
        File five = new File("five", "png");
        Folder folder1 = new Folder("folder1", one, three, five);
        Folder folder2 = new Folder("folder2", two, four);
        Folder root = new Folder("root", folder1, folder2);
        System.out.println("Путь до файла " + two.getName() + " - " + two.getPath());
        System.out.println("Расширение файла " + five.getName() + " - " + five.getExtension());
    }
}
