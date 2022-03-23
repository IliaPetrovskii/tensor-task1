package main.exercise5;

public class File extends AbstractFileSystemNode {
    private String extension;

    public File(String name, String extension) {
        super(name);
        this.extension = extension;
    }

    public File(AbstractFileSystemNode parent, String name, String extension) {
        super(parent, name);
        this.extension = extension;
    }

    @Override
    public String getName() {
        return super.getName() + "." + extension;
    }

    public String getExtension() {
        return extension;
    }
}
