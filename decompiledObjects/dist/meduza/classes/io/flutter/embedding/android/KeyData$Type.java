package io.flutter.embedding.android;

public enum KeyData$Type
{
  private long value;
  
  static
  {
    kRepeat = new Type("kRepeat", 2, 2L);
  }
  
  private KeyData$Type(long paramLong)
  {
    value = paramLong;
  }
  
  public static Type fromLong(long paramLong)
  {
    int i = (int)paramLong;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i == 2) {
          return kRepeat;
        }
        throw new AssertionError("Unexpected Type value");
      }
      return kUp;
    }
    return kDown;
  }
  
  public long getValue()
  {
    return value;
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.android.KeyData.Type
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */