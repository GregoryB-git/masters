package v3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class h1
  extends a
{
  public final int f;
  public final int o;
  public final int[] p;
  public final int[] q;
  public final r1[] r;
  public final Object[] s;
  public final HashMap<Object, Integer> t;
  
  public h1(List paramList, z4.e0 parame0)
  {
    super(false, parame0);
    int j = paramList.size();
    p = new int[j];
    q = new int[j];
    r = new r1[j];
    s = new Object[j];
    t = new HashMap();
    parame0 = paramList.iterator();
    j = 0;
    for (int k = j; parame0.hasNext(); k++)
    {
      paramList = (t0)parame0.next();
      r[k] = paramList.b();
      q[k] = i;
      p[k] = j;
      i += r[k].o();
      j += r[k].h();
      s[k] = paramList.a();
      t.put(s[k], Integer.valueOf(k));
    }
    f = i;
    o = j;
  }
  
  public final int h()
  {
    return o;
  }
  
  public final int o()
  {
    return f;
  }
  
  public final int q(Object paramObject)
  {
    paramObject = (Integer)t.get(paramObject);
    int i;
    if (paramObject == null) {
      i = -1;
    } else {
      i = ((Integer)paramObject).intValue();
    }
    return i;
  }
  
  public final int r(int paramInt)
  {
    return v5.e0.e(p, paramInt + 1, false, false);
  }
  
  public final int s(int paramInt)
  {
    return v5.e0.e(q, paramInt + 1, false, false);
  }
  
  public final Object t(int paramInt)
  {
    return s[paramInt];
  }
  
  public final int u(int paramInt)
  {
    return p[paramInt];
  }
  
  public final int v(int paramInt)
  {
    return q[paramInt];
  }
  
  public final r1 x(int paramInt)
  {
    return r[paramInt];
  }
}

/* Location:
 * Qualified Name:     v3.h1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */