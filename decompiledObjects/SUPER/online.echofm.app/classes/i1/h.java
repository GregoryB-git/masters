package i1;

import c1.k;
import g0.M;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class h
  implements k
{
  public final c o;
  public final long[] p;
  public final Map q;
  public final Map r;
  public final Map s;
  
  public h(c paramc, Map paramMap1, Map paramMap2, Map paramMap3)
  {
    o = paramc;
    r = paramMap2;
    s = paramMap3;
    if (paramMap1 != null) {
      paramMap1 = Collections.unmodifiableMap(paramMap1);
    } else {
      paramMap1 = Collections.emptyMap();
    }
    q = paramMap1;
    p = paramc.j();
  }
  
  public int c(long paramLong)
  {
    int i = M.d(p, paramLong, false, false);
    if (i >= p.length) {
      i = -1;
    }
    return i;
  }
  
  public long e(int paramInt)
  {
    return p[paramInt];
  }
  
  public List h(long paramLong)
  {
    return o.h(paramLong, q, r, s);
  }
  
  public int j()
  {
    return p.length;
  }
}

/* Location:
 * Qualified Name:     i1.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */