package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import android.util.Base64;
import java.io.IOException;
import java.net.URLDecoder;

public final class tq
  extends to
{
  private tx a;
  private byte[] b;
  private int c;
  private int d;
  
  public tq()
  {
    super(false);
  }
  
  public final int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0) {
      return 0;
    }
    int i = c - d;
    if (i == 0) {
      return -1;
    }
    paramInt2 = Math.min(paramInt2, i);
    System.arraycopy(wl.a(b), d, paramArrayOfByte, paramInt1, paramInt2);
    d += paramInt2;
    a(paramInt2);
    return paramInt2;
  }
  
  public final long a(tx paramtx)
    throws IOException
  {
    b(paramtx);
    a = paramtx;
    d = ((int)f);
    Uri localUri = a;
    Object localObject = localUri.getScheme();
    if (!"data".equals(localObject))
    {
      paramtx = String.valueOf(localObject);
      if (paramtx.length() != 0) {
        paramtx = "Unsupported scheme: ".concat(paramtx);
      } else {
        paramtx = new String("Unsupported scheme: ");
      }
      throw new ce(paramtx);
    }
    localObject = wl.a(localUri.getSchemeSpecificPart(), ",");
    if (localObject.length == 2)
    {
      String str = localObject[1];
      if (localObject[0].contains(";base64")) {
        try
        {
          b = Base64.decode(str, 0);
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
          paramtx = String.valueOf(str);
          if (paramtx.length() != 0) {
            paramtx = "Error while parsing Base64 encoded string: ".concat(paramtx);
          } else {
            paramtx = new String("Error while parsing Base64 encoded string: ");
          }
          throw new ce(paramtx, localIllegalArgumentException);
        }
      } else {
        b = wl.c(URLDecoder.decode(str, "US-ASCII"));
      }
      long l = g;
      int i;
      if (l != -1L) {
        i = (int)l + d;
      } else {
        i = b.length;
      }
      c = i;
      if ((i <= b.length) && (d <= i))
      {
        c(paramtx);
        return c - d;
      }
      b = null;
      throw new tv(0);
    }
    paramtx = String.valueOf(localIllegalArgumentException);
    StringBuilder localStringBuilder = new StringBuilder(paramtx.length() + 23);
    localStringBuilder.append("Unexpected URI format: ");
    localStringBuilder.append(paramtx);
    throw new ce(localStringBuilder.toString());
  }
  
  public final Uri a()
  {
    tx localtx = a;
    if (localtx != null) {
      return a;
    }
    return null;
  }
  
  public final void c()
  {
    if (b != null)
    {
      b = null;
      d();
    }
    a = null;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.tq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */