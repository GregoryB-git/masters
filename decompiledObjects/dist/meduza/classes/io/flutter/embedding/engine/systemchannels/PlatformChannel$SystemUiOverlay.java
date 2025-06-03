package io.flutter.embedding.engine.systemchannels;

import g;

public enum PlatformChannel$SystemUiOverlay
{
  private String encodedName;
  
  static
  {
    BOTTOM_OVERLAYS = new SystemUiOverlay("BOTTOM_OVERLAYS", 1, "SystemUiOverlay.bottom");
  }
  
  private PlatformChannel$SystemUiOverlay(String paramString)
  {
    encodedName = paramString;
  }
  
  public static SystemUiOverlay fromValue(String paramString)
  {
    for (SystemUiOverlay localSystemUiOverlay : ) {
      if (encodedName.equals(paramString)) {
        return localSystemUiOverlay;
      }
    }
    throw new NoSuchFieldException(g.d("No such SystemUiOverlay: ", paramString));
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiOverlay
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */