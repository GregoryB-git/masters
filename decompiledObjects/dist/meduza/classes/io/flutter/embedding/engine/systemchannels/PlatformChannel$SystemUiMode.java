package io.flutter.embedding.engine.systemchannels;

import g;

public enum PlatformChannel$SystemUiMode
{
  private String encodedName;
  
  static
  {
    IMMERSIVE = new SystemUiMode("IMMERSIVE", 1, "SystemUiMode.immersive");
    IMMERSIVE_STICKY = new SystemUiMode("IMMERSIVE_STICKY", 2, "SystemUiMode.immersiveSticky");
    EDGE_TO_EDGE = new SystemUiMode("EDGE_TO_EDGE", 3, "SystemUiMode.edgeToEdge");
  }
  
  private PlatformChannel$SystemUiMode(String paramString)
  {
    encodedName = paramString;
  }
  
  public static SystemUiMode fromValue(String paramString)
  {
    for (SystemUiMode localSystemUiMode : ) {
      if (encodedName.equals(paramString)) {
        return localSystemUiMode;
      }
    }
    throw new NoSuchFieldException(g.d("No such SystemUiMode: ", paramString));
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiMode
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */