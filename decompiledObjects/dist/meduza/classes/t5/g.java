package t5;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import v5.e0;

public final class g
  extends f
{
  public final ContentResolver e;
  public Uri f;
  public AssetFileDescriptor g;
  public FileInputStream h;
  public long i;
  public boolean j;
  
  public g(Context paramContext)
  {
    super(false);
    e = paramContext.getContentResolver();
  }
  
  public final long a(n paramn)
  {
    int k = 2000;
    try
    {
      Object localObject1 = a;
      f = ((Uri)localObject1);
      q(paramn);
      if ("content".equals(a.getScheme()))
      {
        localObject2 = new android/os/Bundle;
        ((Bundle)localObject2).<init>();
        ((BaseBundle)localObject2).putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
        localObject2 = e.openTypedAssetFileDescriptor((Uri)localObject1, "*/*", (Bundle)localObject2);
      }
      else
      {
        localObject2 = e.openAssetFileDescriptor((Uri)localObject1, "r");
      }
      g = ((AssetFileDescriptor)localObject2);
      if (localObject2 != null)
      {
        long l1 = ((AssetFileDescriptor)localObject2).getLength();
        localObject1 = new java/io/FileInputStream;
        ((FileInputStream)localObject1).<init>(((AssetFileDescriptor)localObject2).getFileDescriptor());
        h = ((FileInputStream)localObject1);
        boolean bool = l1 < -1L;
        if ((bool) && (f > l1))
        {
          paramn = new t5/g$a;
          paramn.<init>(null, 2008);
          throw paramn;
        }
        long l2 = ((AssetFileDescriptor)localObject2).getStartOffset();
        l2 = ((FileInputStream)localObject1).skip(f + l2) - l2;
        if (l2 == f)
        {
          if (!bool)
          {
            localObject2 = ((FileInputStream)localObject1).getChannel();
            l1 = ((FileChannel)localObject2).size();
            if (l1 == 0L)
            {
              i = -1L;
            }
            else
            {
              l1 -= ((FileChannel)localObject2).position();
              i = l1;
              if (l1 < 0L)
              {
                paramn = new t5/g$a;
                paramn.<init>(null, 2008);
                throw paramn;
              }
            }
          }
          else
          {
            l1 -= l2;
            i = l1;
            if (l1 < 0L) {
              break label370;
            }
          }
          l1 = g;
          if (l1 != -1L)
          {
            l2 = i;
            if (l2 != -1L) {
              l1 = Math.min(l2, l1);
            }
            i = l1;
          }
          j = true;
          r(paramn);
          l1 = g;
          if (l1 == -1L) {
            l1 = i;
          }
          return l1;
          label370:
          paramn = new t5/g$a;
          paramn.<init>(null, 2008);
          throw paramn;
        }
        paramn = new t5/g$a;
        paramn.<init>(null, 2008);
        throw paramn;
      }
      a locala = new t5/g$a;
      paramn = new java/io/IOException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      ((StringBuilder)localObject2).append("Could not open file descriptor for: ");
      ((StringBuilder)localObject2).append(localObject1);
      paramn.<init>(((StringBuilder)localObject2).toString());
      locala.<init>(paramn, 2000);
      throw locala;
    }
    catch (IOException paramn)
    {
      if ((paramn instanceof FileNotFoundException)) {
        k = 2005;
      }
      throw new a(paramn, k);
    }
    catch (a paramn)
    {
      throw paramn;
    }
  }
  
  /* Error */
  public final void close()
  {
    // Byte code:
    //   0: aload_0
    //   1: aconst_null
    //   2: putfield 42	t5/g:f	Landroid/net/Uri;
    //   5: aload_0
    //   6: getfield 106	t5/g:h	Ljava/io/FileInputStream;
    //   9: astore_1
    //   10: aload_1
    //   11: ifnull +7 -> 18
    //   14: aload_1
    //   15: invokevirtual 169	java/io/FileInputStream:close	()V
    //   18: aload_0
    //   19: aconst_null
    //   20: putfield 106	t5/g:h	Ljava/io/FileInputStream;
    //   23: aload_0
    //   24: getfield 89	t5/g:g	Landroid/content/res/AssetFileDescriptor;
    //   27: astore_1
    //   28: aload_1
    //   29: ifnull +7 -> 36
    //   32: aload_1
    //   33: invokevirtual 170	android/content/res/AssetFileDescriptor:close	()V
    //   36: aload_0
    //   37: aconst_null
    //   38: putfield 89	t5/g:g	Landroid/content/res/AssetFileDescriptor;
    //   41: aload_0
    //   42: getfield 144	t5/g:j	Z
    //   45: ifeq +12 -> 57
    //   48: aload_0
    //   49: iconst_0
    //   50: putfield 144	t5/g:j	Z
    //   53: aload_0
    //   54: invokevirtual 173	t5/f:p	()V
    //   57: return
    //   58: astore_1
    //   59: goto +18 -> 77
    //   62: astore_1
    //   63: new 6	t5/g$a
    //   66: astore_2
    //   67: aload_2
    //   68: aload_1
    //   69: sipush 2000
    //   72: invokespecial 113	t5/g$a:<init>	(Ljava/io/IOException;I)V
    //   75: aload_2
    //   76: athrow
    //   77: aload_0
    //   78: aconst_null
    //   79: putfield 89	t5/g:g	Landroid/content/res/AssetFileDescriptor;
    //   82: aload_0
    //   83: getfield 144	t5/g:j	Z
    //   86: ifeq +12 -> 98
    //   89: aload_0
    //   90: iconst_0
    //   91: putfield 144	t5/g:j	Z
    //   94: aload_0
    //   95: invokevirtual 173	t5/f:p	()V
    //   98: aload_1
    //   99: athrow
    //   100: astore_1
    //   101: goto +18 -> 119
    //   104: astore_1
    //   105: new 6	t5/g$a
    //   108: astore_2
    //   109: aload_2
    //   110: aload_1
    //   111: sipush 2000
    //   114: invokespecial 113	t5/g$a:<init>	(Ljava/io/IOException;I)V
    //   117: aload_2
    //   118: athrow
    //   119: aload_0
    //   120: aconst_null
    //   121: putfield 106	t5/g:h	Ljava/io/FileInputStream;
    //   124: aload_0
    //   125: getfield 89	t5/g:g	Landroid/content/res/AssetFileDescriptor;
    //   128: astore_2
    //   129: aload_2
    //   130: ifnull +7 -> 137
    //   133: aload_2
    //   134: invokevirtual 170	android/content/res/AssetFileDescriptor:close	()V
    //   137: aload_0
    //   138: aconst_null
    //   139: putfield 89	t5/g:g	Landroid/content/res/AssetFileDescriptor;
    //   142: aload_0
    //   143: getfield 144	t5/g:j	Z
    //   146: ifeq +12 -> 158
    //   149: aload_0
    //   150: iconst_0
    //   151: putfield 144	t5/g:j	Z
    //   154: aload_0
    //   155: invokevirtual 173	t5/f:p	()V
    //   158: aload_1
    //   159: athrow
    //   160: astore_1
    //   161: goto +18 -> 179
    //   164: astore_1
    //   165: new 6	t5/g$a
    //   168: astore_2
    //   169: aload_2
    //   170: aload_1
    //   171: sipush 2000
    //   174: invokespecial 113	t5/g$a:<init>	(Ljava/io/IOException;I)V
    //   177: aload_2
    //   178: athrow
    //   179: aload_0
    //   180: aconst_null
    //   181: putfield 89	t5/g:g	Landroid/content/res/AssetFileDescriptor;
    //   184: aload_0
    //   185: getfield 144	t5/g:j	Z
    //   188: ifeq +12 -> 200
    //   191: aload_0
    //   192: iconst_0
    //   193: putfield 144	t5/g:j	Z
    //   196: aload_0
    //   197: invokevirtual 173	t5/f:p	()V
    //   200: aload_1
    //   201: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	202	0	this	g
    //   9	24	1	localObject1	Object
    //   58	1	1	localObject2	Object
    //   62	37	1	localIOException1	IOException
    //   100	1	1	localObject3	Object
    //   104	55	1	localIOException2	IOException
    //   160	1	1	localObject4	Object
    //   164	37	1	localIOException3	IOException
    //   66	112	2	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   23	28	58	finally
    //   32	36	58	finally
    //   63	77	58	finally
    //   23	28	62	java/io/IOException
    //   32	36	62	java/io/IOException
    //   5	10	100	finally
    //   14	18	100	finally
    //   105	119	100	finally
    //   5	10	104	java/io/IOException
    //   14	18	104	java/io/IOException
    //   124	129	160	finally
    //   133	137	160	finally
    //   165	179	160	finally
    //   124	129	164	java/io/IOException
    //   133	137	164	java/io/IOException
  }
  
  public final Uri l()
  {
    return f;
  }
  
  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0) {
      return 0;
    }
    long l1 = i;
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
      FileInputStream localFileInputStream = h;
      int k = e0.a;
      paramInt1 = localFileInputStream.read(paramArrayOfByte, paramInt1, paramInt2);
      if (paramInt1 == -1) {
        return -1;
      }
      l2 = i;
      if (l2 != -1L) {
        i = (l2 - paramInt1);
      }
      o(paramInt1);
      return paramInt1;
    }
    catch (IOException paramArrayOfByte)
    {
      throw new a(paramArrayOfByte, 2000);
    }
  }
  
  public static final class a
    extends l
  {
    public a(IOException paramIOException, int paramInt)
    {
      super(paramIOException);
    }
  }
}

/* Location:
 * Qualified Name:     t5.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */