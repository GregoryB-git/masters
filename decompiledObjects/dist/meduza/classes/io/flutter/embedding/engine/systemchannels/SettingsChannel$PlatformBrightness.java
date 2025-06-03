package io.flutter.embedding.engine.systemchannels;

public enum SettingsChannel$PlatformBrightness
{
  public String name;
  
  static
  {
    dark = new PlatformBrightness("dark", 1, "dark");
  }
  
  private SettingsChannel$PlatformBrightness(String paramString)
  {
    name = paramString;
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.systemchannels.SettingsChannel.PlatformBrightness
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */