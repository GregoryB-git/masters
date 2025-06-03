package z4;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import v3.a;
import v3.r1;

public final class h$a
  extends a
{
  public final int f;
  public final int o;
  public final int[] p;
  public final int[] q;
  public final r1[] r;
  public final Object[] s;
  public final HashMap<Object, Integer> t;
  
  public h$a(List paramList, e0 parame0, boolean paramBoolean)
  {
    super(paramBoolean, parame0);
    int i = paramList.size();
    p = new int[i];
    q = new int[i];
    r = new r1[i];
    s = new Object[i];
    t = new HashMap();
    paramList = paramList.iterator();
    int j = 0;
    i = 0;
    for (int k = i; paramList.hasNext(); k++)
    {
      parame0 = (h.d)paramList.next();
      r1[] arrayOfr1 = r;
      Object localObject = a.w;
      arrayOfr1[k] = localObject;
      q[k] = j;
      p[k] = i;
      j += ((l)localObject).o();
      i += r[k].h();
      localObject = s;
      parame0 = b;
      localObject[k] = parame0;
      t.put(parame0, Integer.valueOf(k));
    }
    f = j;
    o = i;
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
 * Qualified Name:     z4.h.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */