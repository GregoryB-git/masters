package lc;

import dc.p;
import ec.i;
import ic.f;
import ic.g;
import java.util.Iterator;
import java.util.NoSuchElementException;
import rb.d;

public final class b
  implements kc.b<f>
{
  public final CharSequence a;
  public final int b;
  public final int c;
  public final p<CharSequence, Integer, d<Integer, Integer>> d;
  
  public b(CharSequence paramCharSequence, int paramInt1, int paramInt2, p<? super CharSequence, ? super Integer, d<Integer, Integer>> paramp)
  {
    a = paramCharSequence;
    b = paramInt1;
    c = paramInt2;
    d = paramp;
  }
  
  public final Iterator<f> iterator()
  {
    return new a(this);
  }
  
  public static final class a
    implements Iterator<f>
  {
    public int a = -1;
    public int b;
    public int c;
    public f d;
    public int e;
    
    public a(b paramb)
    {
      int i = b;
      int j = a.length();
      if (j >= 0)
      {
        int k;
        if (i < 0)
        {
          k = 0;
        }
        else
        {
          k = i;
          if (i > j) {
            k = j;
          }
        }
        b = k;
        c = k;
        return;
      }
      paramb = new StringBuilder();
      paramb.append("Cannot coerce value to an empty range: maximum ");
      paramb.append(j);
      paramb.append(" is less than minimum ");
      paramb.append(0);
      paramb.append('.');
      throw new IllegalArgumentException(paramb.toString());
    }
    
    public final void a()
    {
      int i = c;
      int j = 0;
      if (i < 0)
      {
        a = 0;
        d = null;
      }
      else
      {
        Object localObject = f;
        int k = c;
        if (k > 0)
        {
          m = e + 1;
          e = m;
          if (m >= k) {}
        }
        else
        {
          if (i <= a.length()) {
            break label109;
          }
        }
        for (localObject = new f(b, k.p0(f.a));; localObject = new f(b, k.p0(f.a)))
        {
          d = ((f)localObject);
          c = -1;
          break label226;
          label109:
          localObject = f;
          localObject = (d)d.invoke(a, Integer.valueOf(c));
          if (localObject != null) {
            break;
          }
        }
        i = ((Number)a).intValue();
        int m = ((Number)b).intValue();
        d = g.O(b, i);
        i += m;
        b = i;
        if (m == 0) {
          j = 1;
        }
        c = (i + j);
        label226:
        a = 1;
      }
    }
    
    public final boolean hasNext()
    {
      if (a == -1) {
        a();
      }
      int i = a;
      boolean bool = true;
      if (i != 1) {
        bool = false;
      }
      return bool;
    }
    
    public final Object next()
    {
      if (a == -1) {
        a();
      }
      if (a != 0)
      {
        f localf = d;
        i.c(localf, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        d = null;
        a = -1;
        return localf;
      }
      throw new NoSuchElementException();
    }
    
    public final void remove()
    {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
  }
}

/* Location:
 * Qualified Name:     lc.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */