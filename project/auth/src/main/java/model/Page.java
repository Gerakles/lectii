package model;

import api.Resource;

public class Page implements Resource {
    String title;
    String body;

    public Page(String body) {
    }

    @Override
    public String getTitle() {
        return title;
    }
}
