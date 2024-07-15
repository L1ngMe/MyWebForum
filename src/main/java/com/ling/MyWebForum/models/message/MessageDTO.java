package com.ling.MyWebForum.models.message;

import java.util.Date;

public record MessageDTO(
        Date date,
        String author,
        String text
) {
}
