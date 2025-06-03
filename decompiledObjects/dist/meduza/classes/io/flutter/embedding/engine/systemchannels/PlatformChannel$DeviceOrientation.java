package io.flutter.embedding.engine.systemchannels;

import g;

public enum PlatformChannel$DeviceOrientation
{
  private String encodedName;
  
  static
  {
    PORTRAIT_DOWN = new DeviceOrientation("PORTRAIT_DOWN", 1, "DeviceOrientation.portraitDown");
    LANDSCAPE_LEFT = new DeviceOrientation("LANDSCAPE_LEFT", 2, "DeviceOrientation.landscapeLeft");
    LANDSCAPE_RIGHT = new DeviceOrientation("LANDSCAPE_RIGHT", 3, "DeviceOrientation.landscapeRight");
  }
  
  private PlatformChannel$DeviceOrientation(String paramString)
  {
    encodedName = paramString;
  }
  
  public static DeviceOrientation fromValue(String paramString)
  {
    for (DeviceOrientation localDeviceOrientation : ) {
      if (encodedName.equals(paramString)) {
        return localDeviceOrientation;
      }
    }
    throw new NoSuchFieldException(g.d("No such DeviceOrientation: ", paramString));
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.systemchannels.PlatformChannel.DeviceOrientation
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */