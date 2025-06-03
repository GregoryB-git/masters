package i0;

import android.net.Uri;
import android.util.Base64;
import d0.A;
import g0.M;
import g0.a;
import java.net.URLDecoder;
import java.nio.charset.Charset;

public final class e
  extends b
{
  public k e;
  public byte[] f;
  public int g;
  public int h;
  
  public e()
  {
    super(false);
  }
  
  public void close()
  {
    if (f != null)
    {
      f = null;
      r();
    }
    e = null;
  }
  
  public long e(k paramk)
  {
    s(paramk);
    e = paramk;
    Object localObject1 = a.normalizeScheme();
    String str = ((Uri)localObject1).getScheme();
    boolean bool = "data".equals(str);
    Object localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append("Unsupported scheme: ");
    ((StringBuilder)localObject2).append(str);
    a.b(bool, ((StringBuilder)localObject2).toString());
    localObject2 = M.b1(((Uri)localObject1).getSchemeSpecificPart(), ",");
    if (localObject2.length == 2)
    {
      localObject1 = localObject2[1];
      if (localObject2[0].contains(";base64")) {
        try
        {
          f = Base64.decode((String)localObject1, 0);
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
          paramk = new StringBuilder();
          paramk.append("Error while parsing Base64 encoded string: ");
          paramk.append((String)localObject1);
          throw A.b(paramk.toString(), localIllegalArgumentException);
        }
      } else {
        f = M.r0(URLDecoder.decode((String)localObject1, W2.e.a.name()));
      }
      long l = g;
      localObject1 = f;
      if (l <= localObject1.length)
      {
        int i = (int)l;
        g = i;
        i = localObject1.length - i;
        h = i;
        l = h;
        if (l != -1L) {
          h = ((int)Math.min(i, l));
        }
        t(paramk);
        l = h;
        if (l == -1L) {
          l = h;
        }
        return l;
      }
      f = null;
      throw new h(2008);
    }
    paramk = new StringBuilder();
    paramk.append("Unexpected URI format: ");
    paramk.append(localObject1);
    throw A.b(paramk.toString(), null);
  }
  
  public Uri k()
  {
    Object localObject = e;
    if (localObject != null) {
      localObject = a;
    } else {
      localObject = null;
    }
    return (Uri)localObject;
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0) {
      return 0;
    }
    int i = h;
    if (i == 0) {
      return -1;
    }
    paramInt2 = Math.min(paramInt2, i);
    System.arraycopy(M.i(f), g, paramArrayOfByte, paramInt1, paramInt2);
    g += paramInt2;
    h -= paramInt2;
    q(paramInt2);
    return paramInt2;
  }
}

/* Location:
 * Qualified Name:     i0.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */