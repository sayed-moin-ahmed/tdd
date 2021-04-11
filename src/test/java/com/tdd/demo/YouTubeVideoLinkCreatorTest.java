package com.tdd.demo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.*;

class YouTubeVideoLinkCreatorTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    public void shouldReturnYouTubeEmbeddedUrlForGivenVideoId() throws MalformedURLException {
        final YouTubeVideoLinkCreator youTubeVideoLinkCreator =  new YouTubeVideoLinkCreator();
        final URL url = youTubeVideoLinkCreator.createEmbeddedUrl("12345");
        assertEquals(url,new URL("https://www.youtube" + ".com/embed/12345"));
    }


    @AfterEach
    void tearDown() {
    }
}