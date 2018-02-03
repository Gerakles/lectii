package model;

import api.Resource;

public class Photo implements Resource {
    String title;
    int size;

    public Photo(int size) {
        this.size = size;
    }

    @Override
    public String getTitle() {
        return title;
    }
}
