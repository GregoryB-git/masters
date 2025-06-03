package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

final class mi
  implements tt
{
  private final tt a;
  private final int b;
  private final ml c;
  private final byte[] d;
  private int e;
  
  public mi(tt paramtt, int paramInt, ml paramml)
  {
    boolean bool;
    if (paramInt > 0) {
      bool = true;
    } else {
      bool = false;
    }
    rp.b(bool);
    a = paramtt;
    b = paramInt;
    c = paramml;
    d = new byte[1];
    e = paramInt;
  }
  
  public final int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    if (e == 0)
    {
      tt localtt = a;
      byte[] arrayOfByte = d;
      int i = 0;
      int j;
      if (localtt.a(arrayOfByte, 0, 1) == -1)
      {
        j = i;
      }
      else
      {
        j = (d[0] & 0xFF) << 4;
        if (j != 0)
        {
          arrayOfByte = new byte[j];
          int k = j;
          int m = 0;
          int n;
          for (;;)
          {
            n = j;
            if (k <= 0) {
              break;
            }
            n = a.a(arrayOfByte, m, k);
            if (n == -1)
            {
              j = i;
              break label179;
            }
            m += n;
            k -= n;
          }
          while ((n > 0) && (arrayOfByte[(n - 1)] == 0)) {
            n--;
          }
          if (n > 0) {
            c.a(new vy(arrayOfByte, n));
          }
        }
        j = 1;
      }
      label179:
      if (j != 0) {
        e = b;
      } else {
        return -1;
      }
    }
    paramInt1 = a.a(paramArrayOfByte, paramInt1, Math.min(e, paramInt2));
    if (paramInt1 != -1) {
      e -= paramInt1;
    }
    return paramInt1;
  }
  
  public final long a(tx paramtx)
    throws IOException
  {
    throw new UnsupportedOperationException();
  }
  
  public final Uri a()
  {
    return a.a();
  }
  
  public final void a(vc paramvc)
  {
    a.a(paramvc);
  }
  
  public final Map<String, List<String>> b()
  {
    return a.b();
  }
  
  public final void c()
    throws IOException
  {
    throw new UnsupportedOperationException();
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.mi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */