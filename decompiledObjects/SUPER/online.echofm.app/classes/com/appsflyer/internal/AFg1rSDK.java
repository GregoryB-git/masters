package com.appsflyer.internal;

public final class AFg1rSDK
{
  public static final Object AFInAppEventParameterName = new Object();
  public static int AFInAppEventType;
  public static int AFKeystoreWrapper;
  
  public static char[] AFInAppEventType(long paramLong, char[] paramArrayOfChar, int paramInt)
  {
    int i = paramArrayOfChar.length;
    char[] arrayOfChar = new char[i];
    int j = 0;
    int k = 0;
    int m = 4;
    while (j < paramArrayOfChar.length)
    {
      if ((((paramLong >>> j & 1L) != paramInt) || (k >= 4)) && (m < i))
      {
        arrayOfChar[m] = ((char)paramArrayOfChar[j]);
        m++;
      }
      else
      {
        arrayOfChar[k] = ((char)paramArrayOfChar[j]);
        k++;
      }
      j++;
    }
    return arrayOfChar;
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFg1rSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */