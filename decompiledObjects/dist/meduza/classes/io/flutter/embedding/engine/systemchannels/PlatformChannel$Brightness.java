package io.flutter.embedding.engine.systemchannels;

import g;

public enum PlatformChannel$Brightness
{
  private String encodedName;
  
  static
  {
    DARK = new Brightness("DARK", 1, "Brightness.dark");
  }
  
  private PlatformChannel$Brightness(String paramString)
  {
    encodedName = paramString;
  }
  
  public static Brightness fromValue(String paramString)
  {
    for (Brightness localBrightness : ) {
      if (encodedName.equals(paramString)) {
        return localBrightness;
      }
    }
    throw new NoSuchFieldException(g.d("No such Brightness: ", paramString));
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.systemchannels.PlatformChannel.Brightness
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */