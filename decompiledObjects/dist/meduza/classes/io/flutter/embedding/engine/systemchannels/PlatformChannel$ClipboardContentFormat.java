package io.flutter.embedding.engine.systemchannels;

import g;

public enum PlatformChannel$ClipboardContentFormat
{
  private String encodedName;
  
  private PlatformChannel$ClipboardContentFormat(String paramString)
  {
    encodedName = paramString;
  }
  
  public static ClipboardContentFormat fromValue(String paramString)
  {
    for (ClipboardContentFormat localClipboardContentFormat : ) {
      if (encodedName.equals(paramString)) {
        return localClipboardContentFormat;
      }
    }
    throw new NoSuchFieldException(g.d("No such ClipboardContentFormat: ", paramString));
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.systemchannels.PlatformChannel.ClipboardContentFormat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */