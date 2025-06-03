package com.appsflyer.internal;

public final class AFg1zSDK
{
  public static long[] AFInAppEventType(int paramInt1, int paramInt2)
  {
    long[] arrayOfLong = new long[4];
    long l = paramInt1;
    arrayOfLong[0] = (paramInt2 & 0xFFFFFFFF | (l & 0xFFFFFFFF) << 32);
    for (paramInt1 = 1; paramInt1 < 4; paramInt1++)
    {
      l = arrayOfLong[(paramInt1 - 1)];
      arrayOfLong[paramInt1] = ((l ^ l >> 30) * 1812433253L + paramInt1);
    }
    return arrayOfLong;
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFg1zSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */