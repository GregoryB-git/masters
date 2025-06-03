package B0;

import d0.A;
import i0.h;
import i0.q;
import i0.t;
import java.io.FileNotFoundException;
import java.io.IOException;

public class k
  implements m
{
  public final int a;
  
  public k()
  {
    this(-1);
  }
  
  public k(int paramInt)
  {
    a = paramInt;
  }
  
  public m.b b(m.a parama, m.c paramc)
  {
    if (!e(c)) {
      return null;
    }
    if (parama.a(1)) {
      return new m.b(1, 300000L);
    }
    if (parama.a(2)) {
      return new m.b(2, 60000L);
    }
    return null;
  }
  
  public long c(m.c paramc)
  {
    IOException localIOException = c;
    long l;
    if ((!(localIOException instanceof A)) && (!(localIOException instanceof FileNotFoundException)) && (!(localIOException instanceof q)) && (!(localIOException instanceof n.h)) && (!h.a(localIOException))) {
      l = Math.min((d - 1) * 1000, 5000);
    } else {
      l = -9223372036854775807L;
    }
    return l;
  }
  
  public int d(int paramInt)
  {
    int i = a;
    if (i == -1)
    {
      if (paramInt == 7) {
        paramInt = 6;
      } else {
        paramInt = 3;
      }
      return paramInt;
    }
    return i;
  }
  
  public boolean e(IOException paramIOException)
  {
    boolean bool1 = paramIOException instanceof t;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    int i = r;
    if ((i == 403) || (i == 404) || (i == 410) || (i == 416) || (i == 500) || (i == 503)) {
      bool2 = true;
    }
    return bool2;
  }
}

/* Location:
 * Qualified Name:     B0.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */