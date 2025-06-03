package i0;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import g0.M;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

public final class d
  extends b
{
  public final ContentResolver e;
  public Uri f;
  public AssetFileDescriptor g;
  public FileInputStream h;
  public long i;
  public boolean j;
  
  public d(Context paramContext)
  {
    super(false);
    e = paramContext.getContentResolver();
  }
  
  /* Error */
  public void close()
  {
    // Byte code:
    //   0: aload_0
    //   1: aconst_null
    //   2: putfield 39	i0/d:f	Landroid/net/Uri;
    //   5: aload_0
    //   6: getfield 41	i0/d:h	Ljava/io/FileInputStream;
    //   9: astore_1
    //   10: aload_1
    //   11: ifnull +18 -> 29
    //   14: aload_1
    //   15: invokevirtual 45	java/io/FileInputStream:close	()V
    //   18: goto +11 -> 29
    //   21: astore_1
    //   22: goto +109 -> 131
    //   25: astore_2
    //   26: goto +91 -> 117
    //   29: aload_0
    //   30: aconst_null
    //   31: putfield 41	i0/d:h	Ljava/io/FileInputStream;
    //   34: aload_0
    //   35: getfield 47	i0/d:g	Landroid/content/res/AssetFileDescriptor;
    //   38: astore_1
    //   39: aload_1
    //   40: ifnull +18 -> 58
    //   43: aload_1
    //   44: invokevirtual 50	android/content/res/AssetFileDescriptor:close	()V
    //   47: goto +11 -> 58
    //   50: astore_1
    //   51: goto +43 -> 94
    //   54: astore_1
    //   55: goto +25 -> 80
    //   58: aload_0
    //   59: aconst_null
    //   60: putfield 47	i0/d:g	Landroid/content/res/AssetFileDescriptor;
    //   63: aload_0
    //   64: getfield 52	i0/d:j	Z
    //   67: ifeq +12 -> 79
    //   70: aload_0
    //   71: iconst_0
    //   72: putfield 52	i0/d:j	Z
    //   75: aload_0
    //   76: invokevirtual 55	i0/b:r	()V
    //   79: return
    //   80: new 6	i0/d$a
    //   83: astore_2
    //   84: aload_2
    //   85: aload_1
    //   86: sipush 2000
    //   89: invokespecial 58	i0/d$a:<init>	(Ljava/io/IOException;I)V
    //   92: aload_2
    //   93: athrow
    //   94: aload_0
    //   95: aconst_null
    //   96: putfield 47	i0/d:g	Landroid/content/res/AssetFileDescriptor;
    //   99: aload_0
    //   100: getfield 52	i0/d:j	Z
    //   103: ifeq +12 -> 115
    //   106: aload_0
    //   107: iconst_0
    //   108: putfield 52	i0/d:j	Z
    //   111: aload_0
    //   112: invokevirtual 55	i0/b:r	()V
    //   115: aload_1
    //   116: athrow
    //   117: new 6	i0/d$a
    //   120: astore_1
    //   121: aload_1
    //   122: aload_2
    //   123: sipush 2000
    //   126: invokespecial 58	i0/d$a:<init>	(Ljava/io/IOException;I)V
    //   129: aload_1
    //   130: athrow
    //   131: aload_0
    //   132: aconst_null
    //   133: putfield 41	i0/d:h	Ljava/io/FileInputStream;
    //   136: aload_0
    //   137: getfield 47	i0/d:g	Landroid/content/res/AssetFileDescriptor;
    //   140: astore_2
    //   141: aload_2
    //   142: ifnull +18 -> 160
    //   145: aload_2
    //   146: invokevirtual 50	android/content/res/AssetFileDescriptor:close	()V
    //   149: goto +11 -> 160
    //   152: astore_1
    //   153: goto +44 -> 197
    //   156: astore_2
    //   157: goto +26 -> 183
    //   160: aload_0
    //   161: aconst_null
    //   162: putfield 47	i0/d:g	Landroid/content/res/AssetFileDescriptor;
    //   165: aload_0
    //   166: getfield 52	i0/d:j	Z
    //   169: ifeq +12 -> 181
    //   172: aload_0
    //   173: iconst_0
    //   174: putfield 52	i0/d:j	Z
    //   177: aload_0
    //   178: invokevirtual 55	i0/b:r	()V
    //   181: aload_1
    //   182: athrow
    //   183: new 6	i0/d$a
    //   186: astore_1
    //   187: aload_1
    //   188: aload_2
    //   189: sipush 2000
    //   192: invokespecial 58	i0/d$a:<init>	(Ljava/io/IOException;I)V
    //   195: aload_1
    //   196: athrow
    //   197: aload_0
    //   198: aconst_null
    //   199: putfield 47	i0/d:g	Landroid/content/res/AssetFileDescriptor;
    //   202: aload_0
    //   203: getfield 52	i0/d:j	Z
    //   206: ifeq +12 -> 218
    //   209: aload_0
    //   210: iconst_0
    //   211: putfield 52	i0/d:j	Z
    //   214: aload_0
    //   215: invokevirtual 55	i0/b:r	()V
    //   218: aload_1
    //   219: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	220	0	this	d
    //   9	6	1	localFileInputStream	FileInputStream
    //   21	1	1	localObject1	Object
    //   38	6	1	localAssetFileDescriptor	AssetFileDescriptor
    //   50	1	1	localObject2	Object
    //   54	62	1	localIOException1	IOException
    //   120	10	1	locala1	a
    //   152	30	1	localObject3	Object
    //   186	33	1	locala2	a
    //   25	1	2	localIOException2	IOException
    //   83	63	2	localObject4	Object
    //   156	33	2	localIOException3	IOException
    // Exception table:
    //   from	to	target	type
    //   5	10	21	finally
    //   14	18	21	finally
    //   117	131	21	finally
    //   5	10	25	java/io/IOException
    //   14	18	25	java/io/IOException
    //   34	39	50	finally
    //   43	47	50	finally
    //   80	94	50	finally
    //   34	39	54	java/io/IOException
    //   43	47	54	java/io/IOException
    //   136	141	152	finally
    //   145	149	152	finally
    //   183	197	152	finally
    //   136	141	156	java/io/IOException
    //   145	149	156	java/io/IOException
  }
  
  public long e(k paramk)
  {
    int k = 2000;
    Object localObject1;
    try
    {
      localObject1 = a.normalizeScheme();
      f = ((Uri)localObject1);
      s(paramk);
      if ("content".equals(((Uri)localObject1).getScheme()))
      {
        localObject2 = new android/os/Bundle;
        ((Bundle)localObject2).<init>();
        ((BaseBundle)localObject2).putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
        localObject2 = e.openTypedAssetFileDescriptor((Uri)localObject1, "*/*", (Bundle)localObject2);
      }
    }
    catch (IOException paramk)
    {
      break label461;
    }
    catch (a paramk)
    {
      break label482;
    }
    Object localObject2 = e.openAssetFileDescriptor((Uri)localObject1, "r");
    g = ((AssetFileDescriptor)localObject2);
    if (localObject2 != null)
    {
      long l1 = ((AssetFileDescriptor)localObject2).getLength();
      localObject1 = new java/io/FileInputStream;
      ((FileInputStream)localObject1).<init>(((AssetFileDescriptor)localObject2).getFileDescriptor());
      h = ((FileInputStream)localObject1);
      boolean bool = l1 < -1L;
      if ((bool) && (g > l1))
      {
        paramk = new i0/d$a;
        paramk.<init>(null, 2008);
        throw paramk;
      }
      long l2 = ((AssetFileDescriptor)localObject2).getStartOffset();
      l2 = ((FileInputStream)localObject1).skip(g + l2) - l2;
      if (l2 == g)
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
              paramk = new i0/d$a;
              paramk.<init>(null, 2008);
              throw paramk;
            }
          }
        }
        else
        {
          l1 -= l2;
          i = l1;
          if (l1 < 0L) {
            break label378;
          }
        }
        l1 = h;
        if (l1 != -1L)
        {
          l2 = i;
          if (l2 != -1L) {
            l1 = Math.min(l2, l1);
          }
          i = l1;
        }
        j = true;
        t(paramk);
        l1 = h;
        if (l1 == -1L) {
          l1 = i;
        }
        return l1;
        label378:
        paramk = new i0/d$a;
        paramk.<init>(null, 2008);
        throw paramk;
      }
      paramk = new i0/d$a;
      paramk.<init>(null, 2008);
      throw paramk;
    }
    paramk = new i0/d$a;
    IOException localIOException = new java/io/IOException;
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    ((StringBuilder)localObject2).append("Could not open file descriptor for: ");
    ((StringBuilder)localObject2).append(localObject1);
    localIOException.<init>(((StringBuilder)localObject2).toString());
    paramk.<init>(localIOException, 2000);
    throw paramk;
    label461:
    if ((paramk instanceof FileNotFoundException)) {
      k = 2005;
    }
    throw new a(paramk, k);
    label482:
    throw paramk;
  }
  
  public Uri k()
  {
    return f;
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
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
      paramInt1 = ((FileInputStream)M.i(h)).read(paramArrayOfByte, paramInt1, paramInt2);
      if (paramInt1 == -1) {
        return -1;
      }
      l1 = i;
      if (l1 != -1L) {
        i = (l1 - paramInt1);
      }
      q(paramInt1);
      return paramInt1;
    }
    catch (IOException paramArrayOfByte)
    {
      throw new a(paramArrayOfByte, 2000);
    }
  }
  
  public static class a
    extends h
  {
    public a(IOException paramIOException, int paramInt)
    {
      super(paramInt);
    }
  }
}

/* Location:
 * Qualified Name:     i0.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */