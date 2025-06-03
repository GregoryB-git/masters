package com.google.ads.interactivemedia.v3.internal;

import android.util.Log;

public final class hy
{
  public final boolean a;
  public final String b;
  public final gl c;
  public final int d;
  public final byte[] e;
  
  public hy(boolean paramBoolean, String paramString, int paramInt1, byte[] paramArrayOfByte1, int paramInt2, int paramInt3, byte[] paramArrayOfByte2)
  {
    int i = 0;
    int j = 1;
    int k;
    if (paramInt1 == 0) {
      k = 1;
    } else {
      k = 0;
    }
    int m;
    if (paramArrayOfByte2 == null) {
      m = 1;
    } else {
      m = 0;
    }
    rp.b(k ^ m);
    a = paramBoolean;
    b = paramString;
    d = paramInt1;
    e = paramArrayOfByte2;
    if (paramString == null)
    {
      k = j;
    }
    else
    {
      switch (paramString.hashCode())
      {
      }
      do
      {
        do
        {
          do
          {
            do
            {
              paramInt1 = -1;
              break;
            } while (!paramString.equals("cens"));
            paramInt1 = 3;
            break;
          } while (!paramString.equals("cenc"));
          paramInt1 = 2;
          break;
        } while (!paramString.equals("cbcs"));
        paramInt1 = 1;
        break;
        paramInt1 = i;
      } while (!paramString.equals("cbc1"));
      k = j;
      switch (paramInt1)
      {
      default: 
        paramArrayOfByte2 = new StringBuilder(paramString.length() + 68);
        paramArrayOfByte2.append("Unsupported protection scheme type '");
        paramArrayOfByte2.append(paramString);
        paramArrayOfByte2.append("'. Assuming AES-CTR crypto mode.");
        Log.w("TrackEncryptionBox", paramArrayOfByte2.toString());
        k = j;
        break;
      case 0: 
      case 1: 
        k = 2;
      }
    }
    c = new gl(k, paramArrayOfByte1, paramInt2, paramInt3);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.hy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */