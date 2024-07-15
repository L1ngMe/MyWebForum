package com.ling.MyWebForum.models.message;

import java.util.Date;

public record Message(
        Long id,
        Date date,
        String author,
        String text
) {
}
