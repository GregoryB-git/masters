package t5;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class j0
  implements k
{
  public final k a;
  public long b;
  public Uri c;
  public Map<String, List<String>> d;
  
  public j0(k paramk)
  {
    paramk.getClass();
    a = paramk;
    c = Uri.EMPTY;
    d = Collections.emptyMap();
  }
  
  public final long a(n paramn)
  {
    c = a;
    d = Collections.emptyMap();
    long l = a.a(paramn);
    paramn = l();
    paramn.getClass();
    c = paramn;
    d = h();
    return l;
  }
  
  public final void close()
  {
    a.close();
  }
  
  public final void f(l0 paraml0)
  {
    paraml0.getClass();
    a.f(paraml0);
  }
  
  public final Map<String, List<String>> h()
  {
    return a.h();
  }
  
  public final Uri l()
  {
    return a.l();
  }
  
  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    paramInt1 = a.read(paramArrayOfByte, paramInt1, paramInt2);
    if (paramInt1 != -1) {
      b += paramInt1;
    }
    return paramInt1;
  }
}

/* Location:
 * Qualified Name:     t5.j0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */