package com.google.ads.interactivemedia.v3.internal;

public class ajc
{
  private final byte[] a = new byte['Ā'];
  private int b;
  private int c;
  
  public ajc(byte[] paramArrayOfByte)
  {
    for (int i = 0; i < 256; i++) {
      a[i] = ((byte)(byte)i);
    }
    int j = 0;
    i = j;
    while (j < 256)
    {
      byte[] arrayOfByte = a;
      int k = arrayOfByte[j];
      i = i + k + paramArrayOfByte[(j % paramArrayOfByte.length)] & 0xFF;
      arrayOfByte[j] = ((byte)arrayOfByte[i]);
      arrayOfByte[i] = ((byte)k);
      j++;
    }
    b = 0;
    c = 0;
  }
  
  public static void a(boolean paramBoolean, String paramString, Object... paramVarArgs)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalArgumentException(String.format(paramString, paramVarArgs));
  }
  
  public void a(byte[] paramArrayOfByte)
  {
    int i = b;
    int j = c;
    for (int k = 0; k < paramArrayOfByte.length; k++)
    {
      i = i + 1 & 0xFF;
      byte[] arrayOfByte = a;
      int m = arrayOfByte[i];
      j = j + m & 0xFF;
      arrayOfByte[i] = ((byte)arrayOfByte[j]);
      arrayOfByte[j] = ((byte)m);
      int n = paramArrayOfByte[k];
      paramArrayOfByte[k] = ((byte)(byte)(arrayOfByte[(arrayOfByte[i] + m & 0xFF)] ^ n));
    }
    b = i;
    c = j;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ajc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */