package com.google.ads.interactivemedia.v3.internal;

import android.util.Base64;

public class agv
{
  public String a(byte[] paramArrayOfByte, boolean paramBoolean)
  {
    return Base64.encodeToString(paramArrayOfByte, 11);
  }
  
  public byte[] a(String paramString, boolean paramBoolean)
    throws IllegalArgumentException
  {
    return Base64.decode(paramString, 2);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.agv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */