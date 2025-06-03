package io.flutter.embedding.android;

public enum KeyData$DeviceType
{
  private final long value;
  
  static
  {
    kDirectionalPad = new DeviceType("kDirectionalPad", 1, 1L);
    kGamepad = new DeviceType("kGamepad", 2, 2L);
    kJoystick = new DeviceType("kJoystick", 3, 3L);
    kHdmi = new DeviceType("kHdmi", 4, 4L);
  }
  
  private KeyData$DeviceType(long paramLong)
  {
    value = paramLong;
  }
  
  public static DeviceType fromLong(long paramLong)
  {
    int i = (int)paramLong;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2)
        {
          if (i != 3)
          {
            if (i == 4) {
              return kHdmi;
            }
            throw new AssertionError("Unexpected DeviceType value");
          }
          return kJoystick;
        }
        return kGamepad;
      }
      return kDirectionalPad;
    }
    return kKeyboard;
  }
  
  public long getValue()
  {
    return value;
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.android.KeyData.DeviceType
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */