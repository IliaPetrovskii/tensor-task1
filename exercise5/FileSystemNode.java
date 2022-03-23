package main.exercise5;

public interface FileSystemNode {

    FileSystemNode getParent();
    String getName();
    String getPath();
}
