package t5;

import android.net.Uri;
import android.util.Base64;
import g;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import n7.d;
import v3.a1;
import v5.e0;
import x6.b;

public final class i
  extends f
{
  public n e;
  public byte[] f;
  public int g;
  public int h;
  
  public i()
  {
    super(false);
  }
  
  public final long a(n paramn)
  {
    q(paramn);
    e = paramn;
    Object localObject1 = a;
    Object localObject2 = ((Uri)localObject1).getScheme();
    boolean bool = "data".equals(localObject2);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Unsupported scheme: ");
    localStringBuilder.append((String)localObject2);
    b.o(localStringBuilder.toString(), bool);
    localObject2 = ((Uri)localObject1).getSchemeSpecificPart();
    int i = e0.a;
    localObject2 = ((String)localObject2).split(",", -1);
    if (localObject2.length == 2)
    {
      localObject1 = localObject2[1];
      if (localObject2[0].contains(";base64")) {
        try
        {
          f = Base64.decode((String)localObject1, 0);
        }
        catch (IllegalArgumentException paramn)
        {
          throw new a1(g.d("Error while parsing Base64 encoded string: ", (String)localObject1), paramn, true, 0);
        }
      } else {
        f = e0.B(URLDecoder.decode((String)localObject1, d.a.name()));
      }
      long l = f;
      localObject1 = f;
      if (l <= localObject1.length)
      {
        i = (int)l;
        g = i;
        i = localObject1.length - i;
        h = i;
        l = g;
        if (l != -1L) {
          h = ((int)Math.min(i, l));
        }
        r(paramn);
        l = g;
        if (l == -1L) {
          l = h;
        }
        return l;
      }
      f = null;
      throw new l(2008);
    }
    paramn = new StringBuilder();
    paramn.append("Unexpected URI format: ");
    paramn.append(localObject1);
    throw new a1(paramn.toString(), null, true, 0);
  }
  
  public final void close()
  {
    if (f != null)
    {
      f = null;
      p();
    }
    e = null;
  }
  
  public final Uri l()
  {
    Object localObject = e;
    if (localObject != null) {
      localObject = a;
    } else {
      localObject = null;
    }
    return (Uri)localObject;
  }
  
  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0) {
      return 0;
    }
    int i = h;
    if (i == 0) {
      return -1;
    }
    i = Math.min(paramInt2, i);
    byte[] arrayOfByte = f;
    paramInt2 = e0.a;
    System.arraycopy(arrayOfByte, g, paramArrayOfByte, paramInt1, i);
    g += i;
    h -= i;
    o(i);
    return i;
  }
}

/* Location:
 * Qualified Name:     t5.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */