package body;

import Interfaces.Resourse;

public class Photo implements Resourse{
    String title;
    String size;

    public Photo(String title, int size) {
        this.title = title;
        this.size = size;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String getTitle() {
        return title;
    }
}
