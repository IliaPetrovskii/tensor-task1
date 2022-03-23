package main.exercise5;

public abstract class AbstractFileSystemNode implements FileSystemNode {

    private FileSystemNode parent;
    private String name;

    public AbstractFileSystemNode(String name){
        this.parent = null;
        this.name = name;
    }

    public AbstractFileSystemNode(FileSystemNode fileSystemNode, String name){
        this.parent = fileSystemNode;
        this.name = name;
    }

    public void changeParent(AbstractFileSystemNode parent) {
        this.parent = parent;
    }

    @Override
    public final FileSystemNode getParent() {
        return parent;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public final String getPath() {
        if (parent!= null) return parent.getPath() + "/" + this.getName();
        else return name;
    }
}
