package i0;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import g0.M;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public final class a
  extends b
{
  public final AssetManager e;
  public Uri f;
  public InputStream g;
  public long h;
  public boolean i;
  
  public a(Context paramContext)
  {
    super(false);
    e = paramContext.getAssets();
  }
  
  /* Error */
  public void close()
  {
    // Byte code:
    //   0: aload_0
    //   1: aconst_null
    //   2: putfield 37	i0/a:f	Landroid/net/Uri;
    //   5: aload_0
    //   6: getfield 39	i0/a:g	Ljava/io/InputStream;
    //   9: astore_1
    //   10: aload_1
    //   11: ifnull +18 -> 29
    //   14: aload_1
    //   15: invokevirtual 43	java/io/InputStream:close	()V
    //   18: goto +11 -> 29
    //   21: astore_1
    //   22: goto +43 -> 65
    //   25: astore_2
    //   26: goto +25 -> 51
    //   29: aload_0
    //   30: aconst_null
    //   31: putfield 39	i0/a:g	Ljava/io/InputStream;
    //   34: aload_0
    //   35: getfield 45	i0/a:i	Z
    //   38: ifeq +12 -> 50
    //   41: aload_0
    //   42: iconst_0
    //   43: putfield 45	i0/a:i	Z
    //   46: aload_0
    //   47: invokevirtual 48	i0/b:r	()V
    //   50: return
    //   51: new 6	i0/a$a
    //   54: astore_1
    //   55: aload_1
    //   56: aload_2
    //   57: sipush 2000
    //   60: invokespecial 51	i0/a$a:<init>	(Ljava/lang/Throwable;I)V
    //   63: aload_1
    //   64: athrow
    //   65: aload_0
    //   66: aconst_null
    //   67: putfield 39	i0/a:g	Ljava/io/InputStream;
    //   70: aload_0
    //   71: getfield 45	i0/a:i	Z
    //   74: ifeq +12 -> 86
    //   77: aload_0
    //   78: iconst_0
    //   79: putfield 45	i0/a:i	Z
    //   82: aload_0
    //   83: invokevirtual 48	i0/b:r	()V
    //   86: aload_1
    //   87: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	88	0	this	a
    //   9	6	1	localInputStream	InputStream
    //   21	1	1	localObject	Object
    //   54	33	1	locala	a
    //   25	32	2	localIOException	IOException
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
    String str;
    try
    {
      localObject = a;
      f = ((Uri)localObject);
      str = (String)g0.a.e(((Uri)localObject).getPath());
      if (str.startsWith("/android_asset/")) {
        localObject = str.substring(15);
      }
    }
    catch (IOException paramk)
    {
      break label186;
    }
    catch (a paramk)
    {
      break label217;
    }
    Object localObject = str;
    if (str.startsWith("/")) {
      localObject = str.substring(1);
    }
    s(paramk);
    localObject = e.open((String)localObject, 1);
    g = ((InputStream)localObject);
    if (((InputStream)localObject).skip(g) >= g)
    {
      long l = h;
      if (l != -1L)
      {
        h = l;
      }
      else
      {
        l = g.available();
        h = l;
        if (l == 2147483647L) {
          h = -1L;
        }
      }
      i = true;
      t(paramk);
      return h;
    }
    paramk = new i0/a$a;
    paramk.<init>(null, 2008);
    throw paramk;
    label186:
    int j;
    if ((paramk instanceof FileNotFoundException)) {
      j = 2005;
    } else {
      j = 2000;
    }
    throw new a(paramk, j);
    label217:
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
    long l1 = h;
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
      paramInt1 = ((InputStream)M.i(g)).read(paramArrayOfByte, paramInt1, paramInt2);
      if (paramInt1 == -1) {
        return -1;
      }
      l1 = h;
      if (l1 != -1L) {
        h = (l1 - paramInt1);
      }
      q(paramInt1);
      return paramInt1;
    }
    catch (IOException paramArrayOfByte)
    {
      throw new a(paramArrayOfByte, 2000);
    }
  }
  
  public static final class a
    extends h
  {
    public a(Throwable paramThrowable, int paramInt)
    {
      super(paramInt);
    }
  }
}

/* Location:
 * Qualified Name:     i0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */