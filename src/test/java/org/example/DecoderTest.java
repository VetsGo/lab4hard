package org.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class DecoderTest {
    @Test
    public void testDecodeVowelReplacement() {
        String encodedMessage1 = "t2st3ng";
        String expectedDecodedMessage1 = "testing";
        assertEquals(expectedDecodedMessage1, Decoder.decodeVowelReplacement(encodedMessage1));
    }

    @Test
    public void testDecodeConsonantReplacement() {
        String encodedMessage1 = "srujigile";
        String expectedDecodedMessage1 = "tsukihime";
        assertEquals(expectedDecodedMessage1, Decoder.decodeConsonantReplacement(encodedMessage1));
    }
}