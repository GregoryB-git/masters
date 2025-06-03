package k0;

import d0.I;
import d0.I.b;
import d0.I.c;
import g0.M;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import x0.T;
import x0.p;

public final class W0
  extends a
{
  public final int h;
  public final int i;
  public final int[] j;
  public final int[] k;
  public final I[] l;
  public final Object[] m;
  public final HashMap n;
  
  public W0(Collection paramCollection, T paramT)
  {
    this(G(paramCollection), H(paramCollection), paramT);
  }
  
  public W0(I[] paramArrayOfI, Object[] paramArrayOfObject, T paramT)
  {
    super(false, paramT);
    int i2 = paramArrayOfI.length;
    l = paramArrayOfI;
    j = new int[i2];
    k = new int[i2];
    m = paramArrayOfObject;
    n = new HashMap();
    int i3 = paramArrayOfI.length;
    int i4 = 0;
    i2 = i4;
    for (int i5 = i2; i1 < i3; i5++)
    {
      paramT = paramArrayOfI[i1];
      l[i5] = paramT;
      k[i5] = i4;
      j[i5] = i2;
      i4 += paramT.p();
      i2 += l[i5].i();
      n.put(paramArrayOfObject[i5], Integer.valueOf(i5));
      i1++;
    }
    h = i4;
    i = i2;
  }
  
  public static I[] G(Collection paramCollection)
  {
    I[] arrayOfI = new I[paramCollection.size()];
    paramCollection = paramCollection.iterator();
    for (int i1 = 0; paramCollection.hasNext(); i1++) {
      arrayOfI[i1] = ((F0)paramCollection.next()).b();
    }
    return arrayOfI;
  }
  
  public static Object[] H(Collection paramCollection)
  {
    Object[] arrayOfObject = new Object[paramCollection.size()];
    paramCollection = paramCollection.iterator();
    for (int i1 = 0; paramCollection.hasNext(); i1++) {
      arrayOfObject[i1] = ((F0)paramCollection.next()).a();
    }
    return arrayOfObject;
  }
  
  public int A(int paramInt)
  {
    return k[paramInt];
  }
  
  public I D(int paramInt)
  {
    return l[paramInt];
  }
  
  public W0 E(T paramT)
  {
    I[] arrayOfI1 = new I[l.length];
    for (int i1 = 0;; i1++)
    {
      I[] arrayOfI2 = l;
      if (i1 >= arrayOfI2.length) {
        break;
      }
      arrayOfI1[i1] = new a(arrayOfI2[i1]);
    }
    return new W0(arrayOfI1, m, paramT);
  }
  
  public List F()
  {
    return Arrays.asList(l);
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
  
  public class a
    extends p
  {
    public final I.c f = new I.c();
    
    public a(I paramI)
    {
      super();
    }
    
    public I.b g(int paramInt, I.b paramb, boolean paramBoolean)
    {
      I.b localb = super.g(paramInt, paramb, paramBoolean);
      if (super.n(c, f).f()) {
        localb.t(a, b, c, d, e, d0.a.g, true);
      } else {
        f = true;
      }
      return localb;
    }
  }
}

/* Location:
 * Qualified Name:     k0.W0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */