package org.example.generic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilterAlphaNumericCharactersTest {

    @Test
    public void filterAlphaNumericCharacters() {
        String str = "ad1&i)t!ya % 151  !0 ";
        FilterAlphaNumericCharacters filterAlphaNumericCharacters = new FilterAlphaNumericCharacters();

        String result  = filterAlphaNumericCharacters.filter(str);

        assertEquals("ad1itya1510", result);
    }

}