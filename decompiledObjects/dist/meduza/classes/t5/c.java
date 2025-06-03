package t5;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import v5.e0;

public final class c
  extends f
{
  public final AssetManager e;
  public Uri f;
  public InputStream g;
  public long h;
  public boolean i;
  
  public c(Context paramContext)
  {
    super(false);
    e = paramContext.getAssets();
  }
  
  public final long a(n paramn)
  {
    try
    {
      Object localObject = a;
      f = ((Uri)localObject);
      String str = ((Uri)localObject).getPath();
      str.getClass();
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
      q(paramn);
      localObject = e.open((String)localObject, 1);
      g = ((InputStream)localObject);
      if (((InputStream)localObject).skip(f) >= f)
      {
        long l = g;
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
        r(paramn);
        return h;
      }
      paramn = new t5/c$a;
      paramn.<init>(2008, null);
      throw paramn;
    }
    catch (IOException paramn)
    {
      int j;
      if ((paramn instanceof FileNotFoundException)) {
        j = 2005;
      } else {
        j = 2000;
      }
      throw new a(j, paramn);
    }
    catch (a paramn)
    {
      throw paramn;
    }
  }
  
  public final void close()
  {
    f = null;
    try
    {
      InputStream localInputStream = g;
      if (localInputStream != null) {
        localInputStream.close();
      }
      return;
    }
    catch (IOException localIOException)
    {
      a locala = new t5/c$a;
      locala.<init>(2000, localIOException);
      throw locala;
    }
    finally
    {
      g = null;
      if (i)
      {
        i = false;
        p();
      }
    }
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
      InputStream localInputStream = g;
      int j = e0.a;
      paramInt1 = localInputStream.read(paramArrayOfByte, paramInt1, paramInt2);
      if (paramInt1 == -1) {
        return -1;
      }
      l2 = h;
      if (l2 != -1L) {
        h = (l2 - paramInt1);
      }
      o(paramInt1);
      return paramInt1;
    }
    catch (IOException paramArrayOfByte)
    {
      throw new a(2000, paramArrayOfByte);
    }
  }
  
  public static final class a
    extends l
  {
    public a(int paramInt, IOException paramIOException)
    {
      super(paramIOException);
    }
  }
}

/* Location:
 * Qualified Name:     t5.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */