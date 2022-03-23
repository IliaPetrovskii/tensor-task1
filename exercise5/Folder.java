package main.exercise5;

import java.util.ArrayList;

public class Folder extends AbstractFileSystemNode {

    private ArrayList<AbstractFileSystemNode> childNodes = new ArrayList<AbstractFileSystemNode>();

    public Folder(String name, AbstractFileSystemNode... abstractFileSystemNodes) {
        super(name);
        for (AbstractFileSystemNode f : abstractFileSystemNodes) {
            f.changeParent(this);
            childNodes.add(f);
        }
    }

    public Folder(AbstractFileSystemNode parent, String name, AbstractFileSystemNode... abstractFileSystemNodes) {
        super(parent, name);
        for (AbstractFileSystemNode f : abstractFileSystemNodes) {
            f.changeParent(this);
            childNodes.add(f);
        }
    }

    public ArrayList<AbstractFileSystemNode> getChildNodes() {
        return childNodes;
    }
}
