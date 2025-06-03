package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class uf
  extends to
{
  private RandomAccessFile a;
  private Uri b;
  private long c;
  private boolean d;
  
  public uf()
  {
    super(false);
  }
  
  public final int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws ue
  {
    if (paramInt2 == 0) {
      return 0;
    }
    if (c == 0L) {
      return -1;
    }
    try
    {
      paramInt1 = ((RandomAccessFile)wl.a(a)).read(paramArrayOfByte, paramInt1, (int)Math.min(c, paramInt2));
      if (paramInt1 > 0)
      {
        c -= paramInt1;
        a(paramInt1);
      }
      return paramInt1;
    }
    catch (IOException paramArrayOfByte)
    {
      throw new ue(paramArrayOfByte);
    }
  }
  
  public final long a(tx paramtx)
    throws ue
  {
    try
    {
      Uri localUri = a;
      b = localUri;
      b(paramtx);
      RandomAccessFile localRandomAccessFile = new java/io/RandomAccessFile;
      localRandomAccessFile.<init>((String)rp.a(localUri.getPath()), "r");
      a = localRandomAccessFile;
      localRandomAccessFile.seek(f);
      long l1 = g;
      long l2 = l1;
      if (l1 == -1L) {
        l2 = localRandomAccessFile.length() - f;
      }
      c = l2;
      if (l2 >= 0L)
      {
        d = true;
        c(paramtx);
        return c;
      }
      paramtx = new java/io/EOFException;
      paramtx.<init>();
      throw paramtx;
    }
    catch (IOException paramtx)
    {
      throw new ue(paramtx);
    }
  }
  
  public final Uri a()
  {
    return b;
  }
  
  /* Error */
  public final void c()
    throws ue
  {
    // Byte code:
    //   0: aload_0
    //   1: aconst_null
    //   2: putfield 57	com/google/ads/interactivemedia/v3/internal/uf:b	Landroid/net/Uri;
    //   5: aload_0
    //   6: getfield 27	com/google/ads/interactivemedia/v3/internal/uf:a	Ljava/io/RandomAccessFile;
    //   9: astore_1
    //   10: aload_1
    //   11: ifnull +7 -> 18
    //   14: aload_1
    //   15: invokevirtual 104	java/io/RandomAccessFile:close	()V
    //   18: aload_0
    //   19: aconst_null
    //   20: putfield 27	com/google/ads/interactivemedia/v3/internal/uf:a	Ljava/io/RandomAccessFile;
    //   23: aload_0
    //   24: getfield 94	com/google/ads/interactivemedia/v3/internal/uf:d	Z
    //   27: ifeq +12 -> 39
    //   30: aload_0
    //   31: iconst_0
    //   32: putfield 94	com/google/ads/interactivemedia/v3/internal/uf:d	Z
    //   35: aload_0
    //   36: invokevirtual 106	com/google/ads/interactivemedia/v3/internal/to:d	()V
    //   39: return
    //   40: astore_1
    //   41: goto +15 -> 56
    //   44: astore_1
    //   45: new 21	com/google/ads/interactivemedia/v3/internal/ue
    //   48: astore_2
    //   49: aload_2
    //   50: aload_1
    //   51: invokespecial 49	com/google/ads/interactivemedia/v3/internal/ue:<init>	(Ljava/io/IOException;)V
    //   54: aload_2
    //   55: athrow
    //   56: aload_0
    //   57: aconst_null
    //   58: putfield 27	com/google/ads/interactivemedia/v3/internal/uf:a	Ljava/io/RandomAccessFile;
    //   61: aload_0
    //   62: getfield 94	com/google/ads/interactivemedia/v3/internal/uf:d	Z
    //   65: ifeq +12 -> 77
    //   68: aload_0
    //   69: iconst_0
    //   70: putfield 94	com/google/ads/interactivemedia/v3/internal/uf:d	Z
    //   73: aload_0
    //   74: invokevirtual 106	com/google/ads/interactivemedia/v3/internal/to:d	()V
    //   77: aload_1
    //   78: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	79	0	this	uf
    //   9	6	1	localRandomAccessFile	RandomAccessFile
    //   40	1	1	localObject	Object
    //   44	34	1	localIOException	IOException
    //   48	7	2	localue	ue
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
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.uf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */