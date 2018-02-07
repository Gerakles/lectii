package model;

import api.Authorization;
import api.Resource;
import service.Authentication;

import java.util.List;

public class Role implements Authorization{
    String name;
    List<Resource> resources;

    public Role(String name, List <Resource> resources) {
        this.name = name;
        this.resources = resources;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List <Resource> getResources() {
        return resources;
    }

    public void setResources(List <Resource> resources) {
        this.resources = resources;
    }

    @Override
    public boolean hasAccess(Resource resource) {
        return resources.contains( resource );
    }
}
