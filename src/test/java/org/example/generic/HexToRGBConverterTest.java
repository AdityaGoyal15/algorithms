package org.example.generic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HexToRGBConverterTest {

  @Test
  void should_return_rgb_from_hex() {
    HexToRGBConverter converter = new HexToRGBConverter();

    RGBColor rgb = converter.convert("#FF9933");

    assertEquals(255, rgb.red());
    assertEquals(153, rgb.green());
    assertEquals(51, rgb.blue());
  }

  @Test
  void should_return_rgb_from_hex_short_hand() {
    HexToRGBConverter converter = new HexToRGBConverter();

    RGBColor rgb = converter.convert("#F93");

    assertEquals(255, rgb.red());
    assertEquals(153, rgb.green());
    assertEquals(51, rgb.blue());
  }
}
