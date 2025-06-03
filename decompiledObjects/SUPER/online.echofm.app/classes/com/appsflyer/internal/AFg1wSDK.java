package com.appsflyer.internal;

public class AFg1wSDK
{
  public static void AFInAppEventParameterName(byte[] paramArrayOfByte, byte paramByte, long paramLong)
  {
    for (int i = 0; i < paramArrayOfByte.length; i++) {
      if ((1L << i & paramLong) != 0L) {
        paramArrayOfByte[i] = ((byte)(byte)(paramArrayOfByte[i] ^ paramByte));
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFg1wSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */