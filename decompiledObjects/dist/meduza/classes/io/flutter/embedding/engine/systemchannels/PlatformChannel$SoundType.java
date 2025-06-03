package io.flutter.embedding.engine.systemchannels;

import g;

public enum PlatformChannel$SoundType
{
  private final String encodedName;
  
  static
  {
    ALERT = new SoundType("ALERT", 1, "SystemSoundType.alert");
  }
  
  private PlatformChannel$SoundType(String paramString)
  {
    encodedName = paramString;
  }
  
  public static SoundType fromValue(String paramString)
  {
    for (SoundType localSoundType : ) {
      if (encodedName.equals(paramString)) {
        return localSoundType;
      }
    }
    throw new NoSuchFieldException(g.d("No such SoundType: ", paramString));
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.systemchannels.PlatformChannel.SoundType
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */