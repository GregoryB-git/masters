package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class vb
  extends to
{
  private final Resources a;
  private Uri b;
  private AssetFileDescriptor c;
  private InputStream d;
  private long e;
  private boolean f;
  
  public vb(Context paramContext)
  {
    super(false);
    a = paramContext.getResources();
  }
  
  public final int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws va
  {
    if (paramInt2 == 0) {
      return 0;
    }
    long l1 = e;
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
      paramInt1 = ((InputStream)wl.a(d)).read(paramArrayOfByte, paramInt1, paramInt2);
      if (paramInt1 == -1)
      {
        if (e == -1L) {
          return -1;
        }
        throw new va(new EOFException());
      }
      l2 = e;
      if (l2 != -1L) {
        e = (l2 - paramInt1);
      }
      a(paramInt1);
      return paramInt1;
    }
    catch (IOException paramArrayOfByte)
    {
      throw new va(paramArrayOfByte);
    }
  }
  
  public final long a(tx paramtx)
    throws va
  {
    try
    {
      Object localObject1 = a;
      b = ((Uri)localObject1);
      boolean bool = TextUtils.equals("rawresource", ((Uri)localObject1).getScheme());
      if (bool) {
        try
        {
          int i = Integer.parseInt((String)rp.a(((Uri)localObject1).getLastPathSegment()));
          b(paramtx);
          Object localObject2 = a.openRawResourceFd(i);
          c = ((AssetFileDescriptor)localObject2);
          if (localObject2 != null)
          {
            localObject1 = new java/io/FileInputStream;
            ((FileInputStream)localObject1).<init>(((AssetFileDescriptor)localObject2).getFileDescriptor());
            d = ((InputStream)localObject1);
            ((FileInputStream)localObject1).skip(((AssetFileDescriptor)localObject2).getStartOffset());
            if (((FileInputStream)localObject1).skip(f) >= f)
            {
              long l1 = g;
              long l2 = -1L;
              if (l1 != -1L)
              {
                e = l1;
              }
              else
              {
                l1 = ((AssetFileDescriptor)localObject2).getLength();
                if (l1 != -1L) {
                  l2 = l1 - f;
                }
                e = l2;
              }
              f = true;
              c(paramtx);
              return e;
            }
            paramtx = new java/io/EOFException;
            paramtx.<init>();
            throw paramtx;
          }
          paramtx = new com/google/ads/interactivemedia/v3/internal/va;
          localObject2 = String.valueOf(localObject1);
          i = ((String)localObject2).length();
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>(i + 24);
          ((StringBuilder)localObject1).append("Resource is compressed: ");
          ((StringBuilder)localObject1).append((String)localObject2);
          paramtx.<init>(((StringBuilder)localObject1).toString());
          throw paramtx;
        }
        catch (NumberFormatException paramtx)
        {
          paramtx = new com/google/ads/interactivemedia/v3/internal/va;
          paramtx.<init>("Resource identifier must be an integer.");
          throw paramtx;
        }
      }
      paramtx = new com/google/ads/interactivemedia/v3/internal/va;
      paramtx.<init>("URI must use scheme rawresource");
      throw paramtx;
    }
    catch (IOException paramtx)
    {
      throw new va(paramtx);
    }
  }
  
  public final Uri a()
  {
    return b;
  }
  
  /* Error */
  public final void c()
    throws va
  {
    // Byte code:
    //   0: aload_0
    //   1: aconst_null
    //   2: putfield 78	com/google/ads/interactivemedia/v3/internal/vb:b	Landroid/net/Uri;
    //   5: aload_0
    //   6: getfield 47	com/google/ads/interactivemedia/v3/internal/vb:d	Ljava/io/InputStream;
    //   9: astore_1
    //   10: aload_1
    //   11: ifnull +7 -> 18
    //   14: aload_1
    //   15: invokevirtual 180	java/io/InputStream:close	()V
    //   18: aload_0
    //   19: aconst_null
    //   20: putfield 47	com/google/ads/interactivemedia/v3/internal/vb:d	Ljava/io/InputStream;
    //   23: aload_0
    //   24: getfield 117	com/google/ads/interactivemedia/v3/internal/vb:c	Landroid/content/res/AssetFileDescriptor;
    //   27: astore_1
    //   28: aload_1
    //   29: ifnull +7 -> 36
    //   32: aload_1
    //   33: invokevirtual 181	android/content/res/AssetFileDescriptor:close	()V
    //   36: aload_0
    //   37: aconst_null
    //   38: putfield 117	com/google/ads/interactivemedia/v3/internal/vb:c	Landroid/content/res/AssetFileDescriptor;
    //   41: aload_0
    //   42: getfield 146	com/google/ads/interactivemedia/v3/internal/vb:f	Z
    //   45: ifeq +12 -> 57
    //   48: aload_0
    //   49: iconst_0
    //   50: putfield 146	com/google/ads/interactivemedia/v3/internal/vb:f	Z
    //   53: aload_0
    //   54: invokevirtual 183	com/google/ads/interactivemedia/v3/internal/to:d	()V
    //   57: return
    //   58: astore_1
    //   59: goto +15 -> 74
    //   62: astore_2
    //   63: new 33	com/google/ads/interactivemedia/v3/internal/va
    //   66: astore_1
    //   67: aload_1
    //   68: aload_2
    //   69: invokespecial 65	com/google/ads/interactivemedia/v3/internal/va:<init>	(Ljava/io/IOException;)V
    //   72: aload_1
    //   73: athrow
    //   74: aload_0
    //   75: aconst_null
    //   76: putfield 117	com/google/ads/interactivemedia/v3/internal/vb:c	Landroid/content/res/AssetFileDescriptor;
    //   79: aload_0
    //   80: getfield 146	com/google/ads/interactivemedia/v3/internal/vb:f	Z
    //   83: ifeq +12 -> 95
    //   86: aload_0
    //   87: iconst_0
    //   88: putfield 146	com/google/ads/interactivemedia/v3/internal/vb:f	Z
    //   91: aload_0
    //   92: invokevirtual 183	com/google/ads/interactivemedia/v3/internal/to:d	()V
    //   95: aload_1
    //   96: athrow
    //   97: astore_1
    //   98: goto +15 -> 113
    //   101: astore_1
    //   102: new 33	com/google/ads/interactivemedia/v3/internal/va
    //   105: astore_2
    //   106: aload_2
    //   107: aload_1
    //   108: invokespecial 65	com/google/ads/interactivemedia/v3/internal/va:<init>	(Ljava/io/IOException;)V
    //   111: aload_2
    //   112: athrow
    //   113: aload_0
    //   114: aconst_null
    //   115: putfield 47	com/google/ads/interactivemedia/v3/internal/vb:d	Ljava/io/InputStream;
    //   118: aload_0
    //   119: getfield 117	com/google/ads/interactivemedia/v3/internal/vb:c	Landroid/content/res/AssetFileDescriptor;
    //   122: astore_2
    //   123: aload_2
    //   124: ifnull +7 -> 131
    //   127: aload_2
    //   128: invokevirtual 181	android/content/res/AssetFileDescriptor:close	()V
    //   131: aload_0
    //   132: aconst_null
    //   133: putfield 117	com/google/ads/interactivemedia/v3/internal/vb:c	Landroid/content/res/AssetFileDescriptor;
    //   136: aload_0
    //   137: getfield 146	com/google/ads/interactivemedia/v3/internal/vb:f	Z
    //   140: ifeq +12 -> 152
    //   143: aload_0
    //   144: iconst_0
    //   145: putfield 146	com/google/ads/interactivemedia/v3/internal/vb:f	Z
    //   148: aload_0
    //   149: invokevirtual 183	com/google/ads/interactivemedia/v3/internal/to:d	()V
    //   152: aload_1
    //   153: athrow
    //   154: astore_1
    //   155: goto +15 -> 170
    //   158: astore_1
    //   159: new 33	com/google/ads/interactivemedia/v3/internal/va
    //   162: astore_2
    //   163: aload_2
    //   164: aload_1
    //   165: invokespecial 65	com/google/ads/interactivemedia/v3/internal/va:<init>	(Ljava/io/IOException;)V
    //   168: aload_2
    //   169: athrow
    //   170: aload_0
    //   171: aconst_null
    //   172: putfield 117	com/google/ads/interactivemedia/v3/internal/vb:c	Landroid/content/res/AssetFileDescriptor;
    //   175: aload_0
    //   176: getfield 146	com/google/ads/interactivemedia/v3/internal/vb:f	Z
    //   179: ifeq +12 -> 191
    //   182: aload_0
    //   183: iconst_0
    //   184: putfield 146	com/google/ads/interactivemedia/v3/internal/vb:f	Z
    //   187: aload_0
    //   188: invokevirtual 183	com/google/ads/interactivemedia/v3/internal/to:d	()V
    //   191: aload_1
    //   192: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	193	0	this	vb
    //   9	24	1	localObject1	Object
    //   58	1	1	localObject2	Object
    //   66	30	1	localva	va
    //   97	1	1	localObject3	Object
    //   101	52	1	localIOException1	IOException
    //   154	1	1	localObject4	Object
    //   158	34	1	localIOException2	IOException
    //   62	7	2	localIOException3	IOException
    //   105	64	2	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   23	28	58	finally
    //   32	36	58	finally
    //   63	74	58	finally
    //   23	28	62	java/io/IOException
    //   32	36	62	java/io/IOException
    //   5	10	97	finally
    //   14	18	97	finally
    //   102	113	97	finally
    //   5	10	101	java/io/IOException
    //   14	18	101	java/io/IOException
    //   118	123	154	finally
    //   127	131	154	finally
    //   159	170	154	finally
    //   118	123	158	java/io/IOException
    //   127	131	158	java/io/IOException
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.vb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */