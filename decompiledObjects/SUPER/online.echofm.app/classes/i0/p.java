package i0;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import g0.M;
import g0.a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class p
  extends b
{
  public RandomAccessFile e;
  public Uri f;
  public long g;
  public boolean h;
  
  public p()
  {
    super(false);
  }
  
  public static RandomAccessFile u(Uri paramUri)
  {
    int i = 2006;
    try
    {
      RandomAccessFile localRandomAccessFile = new RandomAccessFile((String)a.e(paramUri.getPath()), "r");
      return localRandomAccessFile;
    }
    catch (RuntimeException paramUri) {}catch (SecurityException paramUri)
    {
      break label50;
    }
    catch (FileNotFoundException localFileNotFoundException) {}
    throw new b(paramUri, 2000);
    label50:
    throw new b(paramUri, 2006);
    if ((TextUtils.isEmpty(paramUri.getQuery())) && (TextUtils.isEmpty(paramUri.getFragment())))
    {
      if ((M.a < 21) || (!a.a(localFileNotFoundException.getCause()))) {
        i = 2005;
      }
      throw new b(localFileNotFoundException, i);
    }
    throw new b(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", new Object[] { paramUri.getPath(), paramUri.getQuery(), paramUri.getFragment() }), localFileNotFoundException, 1004);
  }
  
  /* Error */
  public void close()
  {
    // Byte code:
    //   0: aload_0
    //   1: aconst_null
    //   2: putfield 97	i0/p:f	Landroid/net/Uri;
    //   5: aload_0
    //   6: getfield 99	i0/p:e	Ljava/io/RandomAccessFile;
    //   9: astore_1
    //   10: aload_1
    //   11: ifnull +18 -> 29
    //   14: aload_1
    //   15: invokevirtual 101	java/io/RandomAccessFile:close	()V
    //   18: goto +11 -> 29
    //   21: astore_1
    //   22: goto +43 -> 65
    //   25: astore_1
    //   26: goto +25 -> 51
    //   29: aload_0
    //   30: aconst_null
    //   31: putfield 99	i0/p:e	Ljava/io/RandomAccessFile;
    //   34: aload_0
    //   35: getfield 103	i0/p:h	Z
    //   38: ifeq +12 -> 50
    //   41: aload_0
    //   42: iconst_0
    //   43: putfield 103	i0/p:h	Z
    //   46: aload_0
    //   47: invokevirtual 105	i0/b:r	()V
    //   50: return
    //   51: new 9	i0/p$b
    //   54: astore_2
    //   55: aload_2
    //   56: aload_1
    //   57: sipush 2000
    //   60: invokespecial 55	i0/p$b:<init>	(Ljava/lang/Throwable;I)V
    //   63: aload_2
    //   64: athrow
    //   65: aload_0
    //   66: aconst_null
    //   67: putfield 99	i0/p:e	Ljava/io/RandomAccessFile;
    //   70: aload_0
    //   71: getfield 103	i0/p:h	Z
    //   74: ifeq +12 -> 86
    //   77: aload_0
    //   78: iconst_0
    //   79: putfield 103	i0/p:h	Z
    //   82: aload_0
    //   83: invokevirtual 105	i0/b:r	()V
    //   86: aload_1
    //   87: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	88	0	this	p
    //   9	6	1	localRandomAccessFile	RandomAccessFile
    //   21	1	1	localObject	Object
    //   25	62	1	localIOException	IOException
    //   54	10	2	localb	b
    // Exception table:
    //   from	to	target	type
    //   5	10	21	finally
    //   14	18	21	finally
    //   51	65	21	finally
    //   5	10	25	java/io/IOException
    //   14	18	25	java/io/IOException
  }
  
  public long e(k paramk)
  {
    Object localObject = a;
    f = ((Uri)localObject);
    s(paramk);
    localObject = u((Uri)localObject);
    e = ((RandomAccessFile)localObject);
    long l2;
    try
    {
      ((RandomAccessFile)localObject).seek(g);
      long l1 = h;
      l2 = l1;
      if (l1 == -1L) {
        l2 = e.length() - g;
      }
    }
    catch (IOException paramk)
    {
      break label111;
    }
    g = l2;
    if (l2 >= 0L)
    {
      h = true;
      t(paramk);
      return g;
    }
    throw new b(null, null, 2008);
    label111:
    throw new b(paramk, 2000);
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
    if (g == 0L) {
      return -1;
    }
    try
    {
      paramInt1 = ((RandomAccessFile)M.i(e)).read(paramArrayOfByte, paramInt1, (int)Math.min(g, paramInt2));
      if (paramInt1 > 0)
      {
        g -= paramInt1;
        q(paramInt1);
      }
      return paramInt1;
    }
    catch (IOException paramArrayOfByte)
    {
      throw new b(paramArrayOfByte, 2000);
    }
  }
  
  public static final abstract class a
  {
    private static boolean b(Throwable paramThrowable)
    {
      boolean bool;
      if (((paramThrowable instanceof ErrnoException)) && (errno == OsConstants.EACCES)) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
  
  public static class b
    extends h
  {
    public b(String paramString, Throwable paramThrowable, int paramInt)
    {
      super(paramThrowable, paramInt);
    }
    
    public b(Throwable paramThrowable, int paramInt)
    {
      super(paramInt);
    }
  }
}

/* Location:
 * Qualified Name:     i0.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */