package com.google.ads.interactivemedia.v3.internal;

public final class aja
{
  public static boolean a(Object[] paramArrayOfObject, Object paramObject)
  {
    if (paramArrayOfObject != null)
    {
      if (paramObject == null) {
        for (i = 0; i < paramArrayOfObject.length; i++) {
          if (paramArrayOfObject[i] == null) {
            break label60;
          }
        }
      }
      for (i = 0; i < paramArrayOfObject.length; i++) {
        if (paramObject.equals(paramArrayOfObject[i])) {
          break label60;
        }
      }
    }
    int i = -1;
    label60:
    return i != -1;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.aja
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */