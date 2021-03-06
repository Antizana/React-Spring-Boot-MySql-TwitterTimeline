package com.edwincodex.twitter.timeline.twitter;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString @EqualsAndHashCode
public class Tweet {
    @Getter @Setter
    private Long id;
    @Getter @Setter
    private String userName;
    @Getter @Setter
    private String text;
    @Getter @Setter
    private String photo;
}
