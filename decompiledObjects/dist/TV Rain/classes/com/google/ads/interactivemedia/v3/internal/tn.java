package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public final class tn
  extends to
{
  private final AssetManager a;
  private Uri b;
  private InputStream c;
  private long d;
  private boolean e;
  
  public tn(Context paramContext)
  {
    super(false);
    a = paramContext.getAssets();
  }
  
  public final int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws aix
  {
    if (paramInt2 == 0) {
      return 0;
    }
    long l1 = d;
    if (l1 == 0L) {
      return -1;
    }
    long l2;
    if (l1 != -1L) {
      l2 = paramInt2;
    }
    try
    {
      paramInt2 = (int)Math.min(l1, l2);
      paramInt1 = ((InputStream)wl.a(c)).read(paramArrayOfByte, paramInt1, paramInt2);
      if (paramInt1 == -1)
      {
        if (d == -1L) {
          return -1;
        }
        throw new aix(new EOFException());
      }
      l2 = d;
      if (l2 != -1L) {
        d = (l2 - paramInt1);
      }
      a(paramInt1);
      return paramInt1;
    }
    catch (IOException paramArrayOfByte)
    {
      throw new aix(paramArrayOfByte);
    }
  }
  
  public final long a(tx paramtx)
    throws aix
  {
    try
    {
      Object localObject = a;
      b = ((Uri)localObject);
      String str = (String)rp.a(((Uri)localObject).getPath());
      if (str.startsWith("/android_asset/"))
      {
        localObject = str.substring(15);
      }
      else
      {
        localObject = str;
        if (str.startsWith("/")) {
          localObject = str.substring(1);
        }
      }
      b(paramtx);
      localObject = a.open((String)localObject, 1);
      c = ((InputStream)localObject);
      if (((InputStream)localObject).skip(f) >= f)
      {
        long l = g;
        if (l != -1L)
        {
          d = l;
        }
        else
        {
          l = c.available();
          d = l;
          if (l == 2147483647L) {
            d = -1L;
          }
        }
        e = true;
        c(paramtx);
        return d;
      }
      paramtx = new java/io/EOFException;
      paramtx.<init>();
      throw paramtx;
    }
    catch (IOException paramtx)
    {
      throw new aix(paramtx);
    }
  }
  
  public final Uri a()
  {
    return b;
  }
  
  /* Error */
  public final void c()
    throws aix
  {
    // Byte code:
    //   0: aload_0
    //   1: aconst_null
    //   2: putfield 74	com/google/ads/interactivemedia/v3/internal/tn:b	Landroid/net/Uri;
    //   5: aload_0
    //   6: getfield 45	com/google/ads/interactivemedia/v3/internal/tn:c	Ljava/io/InputStream;
    //   9: astore_1
    //   10: aload_1
    //   11: ifnull +7 -> 18
    //   14: aload_1
    //   15: invokevirtual 130	java/io/InputStream:close	()V
    //   18: aload_0
    //   19: aconst_null
    //   20: putfield 45	com/google/ads/interactivemedia/v3/internal/tn:c	Ljava/io/InputStream;
    //   23: aload_0
    //   24: getfield 124	com/google/ads/interactivemedia/v3/internal/tn:e	Z
    //   27: ifeq +12 -> 39
    //   30: aload_0
    //   31: iconst_0
    //   32: putfield 124	com/google/ads/interactivemedia/v3/internal/tn:e	Z
    //   35: aload_0
    //   36: invokevirtual 132	com/google/ads/interactivemedia/v3/internal/to:d	()V
    //   39: return
    //   40: astore_1
    //   41: goto +15 -> 56
    //   44: astore_1
    //   45: new 31	com/google/ads/interactivemedia/v3/internal/aix
    //   48: astore_2
    //   49: aload_2
    //   50: aload_1
    //   51: invokespecial 63	com/google/ads/interactivemedia/v3/internal/aix:<init>	(Ljava/io/IOException;)V
    //   54: aload_2
    //   55: athrow
    //   56: aload_0
    //   57: aconst_null
    //   58: putfield 45	com/google/ads/interactivemedia/v3/internal/tn:c	Ljava/io/InputStream;
    //   61: aload_0
    //   62: getfield 124	com/google/ads/interactivemedia/v3/internal/tn:e	Z
    //   65: ifeq +12 -> 77
    //   68: aload_0
    //   69: iconst_0
    //   70: putfield 124	com/google/ads/interactivemedia/v3/internal/tn:e	Z
    //   73: aload_0
    //   74: invokevirtual 132	com/google/ads/interactivemedia/v3/internal/to:d	()V
    //   77: aload_1
    //   78: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	79	0	this	tn
    //   9	6	1	localInputStream	InputStream
    //   40	1	1	localObject	Object
    //   44	34	1	localIOException	IOException
    //   48	7	2	localaix	aix
    // Exception table:
    //   from	to	target	type
    //   5	10	40	finally
    //   14	18	40	finally
    //   45	56	40	finally
    //   5	10	44	java/io/IOException
    //   14	18	44	java/io/IOException
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.tn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */