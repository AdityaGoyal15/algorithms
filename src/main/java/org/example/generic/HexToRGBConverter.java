package org.example.generic;

public class HexToRGBConverter {

  public RGBColor convert(String hex) {
    if (hex.startsWith("#")) {
      hex = hex.substring(1);
    }

    if (hex.length() == 3) {
      char r = hex.charAt(0);
      char g = hex.charAt(1);
      char b = hex.charAt(2);
      hex = "" + r + r + g + g + b + b;
    }

    if (hex.length() == 6) {
      int red = Integer.parseInt(hex.substring(0, 2), 16);
      int green = Integer.parseInt(hex.substring(2, 4), 16);
      int blue = Integer.parseInt(hex.substring(4, 6), 16);

      return new RGBColor(red, green, blue);
    }

    return null;
  }
}
