package com.tdd.demo;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class YouTubeVideoLinkCreator {
    private static final String EMBED_URL = "https://www.youtube" + ".com/embed/";

    public URL createEmbeddedUrl(final String videoId) {
        try {
            return URI.create(EMBED_URL + videoId).toURL();
        } catch (final MalformedURLException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
