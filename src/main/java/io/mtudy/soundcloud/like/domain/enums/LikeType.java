package io.mtudy.soundcloud.like.domain.enums;

public enum LikeType {
    TRACK(Values.TRACK), ALBUM(Values.ALBUM), PLAYLIST(Values.PLAYLIST);

    LikeType (String val) {}

    public static class Values {
        public static final String TRACK = "TRACK";
        public static final String ALBUM = "ALBUM";
        public static final String PLAYLIST = "PLAYLIST";
    }
}
