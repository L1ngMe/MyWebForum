package com.ling.MyWebForum.models.user;

import java.util.Date;

public record UserDTO(
        String name,
        Date dateOfCreating
) {
    @Override
    public String name() {
        return name;
    }

    @Override
    public Date dateOfCreating() {
        return dateOfCreating;
    }
}
