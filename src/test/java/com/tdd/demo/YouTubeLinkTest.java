package com.tdd.demo;

import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YouTubeLinkTest {
    @Test
    public void shouldCalculateEmbedYouTubeLink() throws MalformedURLException {
        final YouTubeLink youtubeLink = new YouTubeLink("1234");
        final YouTubeVideoLinkCreator youTubeVideoLinkCreator = new  YouTubeVideoLinkCreator();
        youtubeLink.setYouTubeVideoLinkCreator(youTubeVideoLinkCreator::createEmbeddedUrl);
        assertEquals(youtubeLink.getEmbedUrl().toString(),"https://www.youtube.com/embed/1234");
    }
}
