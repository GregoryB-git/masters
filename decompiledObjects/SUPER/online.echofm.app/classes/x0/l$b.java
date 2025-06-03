package x0;

import d0.I;
import g0.M;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import k0.a;

public final class l$b
  extends a
{
  public final int h;
  public final int i;
  public final int[] j;
  public final int[] k;
  public final I[] l;
  public final Object[] m;
  public final HashMap n;
  
  public l$b(Collection paramCollection, T paramT, boolean paramBoolean)
  {
    super(paramBoolean, paramT);
    int i1 = paramCollection.size();
    j = new int[i1];
    k = new int[i1];
    l = new I[i1];
    m = new Object[i1];
    n = new HashMap();
    paramCollection = paramCollection.iterator();
    int i2 = 0;
    i1 = 0;
    for (int i3 = i1; paramCollection.hasNext(); i3++)
    {
      Object localObject = (l.e)paramCollection.next();
      l[i3] = a.Z();
      k[i3] = i2;
      j[i3] = i1;
      i2 += l[i3].p();
      i1 += l[i3].i();
      paramT = m;
      localObject = b;
      paramT[i3] = localObject;
      n.put(localObject, Integer.valueOf(i3));
    }
    h = i2;
    i = i1;
  }
  
  public int A(int paramInt)
  {
    return k[paramInt];
  }
  
  public I D(int paramInt)
  {
    return l[paramInt];
  }
  
  public int i()
  {
    return i;
  }
  
  public int p()
  {
    return h;
  }
  
  public int s(Object paramObject)
  {
    paramObject = (Integer)n.get(paramObject);
    int i1;
    if (paramObject == null) {
      i1 = -1;
    } else {
      i1 = ((Integer)paramObject).intValue();
    }
    return i1;
  }
  
  public int t(int paramInt)
  {
    return M.g(j, paramInt + 1, false, false);
  }
  
  public int u(int paramInt)
  {
    return M.g(k, paramInt + 1, false, false);
  }
  
  public Object x(int paramInt)
  {
    return m[paramInt];
  }
  
  public int z(int paramInt)
  {
    return j[paramInt];
  }
}

/* Location:
 * Qualified Name:     x0.l.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */