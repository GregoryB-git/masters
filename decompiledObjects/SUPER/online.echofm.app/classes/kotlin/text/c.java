package kotlin.text;

import V5.m;
import g6.p;
import h6.a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import l6.d;
import n6.b;

public final class c
  implements b
{
  public final CharSequence a;
  public final int b;
  public final int c;
  public final p d;
  
  public c(CharSequence paramCharSequence, int paramInt1, int paramInt2, p paramp)
  {
    a = paramCharSequence;
    b = paramInt1;
    c = paramInt2;
    d = paramp;
  }
  
  public Iterator iterator()
  {
    return new a(this);
  }
  
  public static final class a
    implements Iterator, a
  {
    public int o = -1;
    public int p;
    public int q;
    public l6.c r;
    public int s;
    
    public a(c paramc)
    {
      int i = d.d(c.d(paramc), 0, c.b(paramc).length());
      p = i;
      q = i;
    }
    
    public final void b()
    {
      int i = q;
      int j = 0;
      if (i < 0)
      {
        o = 0;
        r = null;
      }
      else
      {
        int k = c.c(t);
        i = -1;
        if (k > 0)
        {
          k = s + 1;
          s = k;
          if (k >= c.c(t)) {}
        }
        else
        {
          if (q <= c.b(t).length()) {
            break label119;
          }
        }
        Object localObject = new l6.c(p, s.x(c.b(t)));
        r = ((l6.c)localObject);
        for (j = i;; j = k + j)
        {
          q = j;
          break label239;
          label119:
          localObject = (m)c.a(t).invoke(c.b(t), Integer.valueOf(q));
          if (localObject == null)
          {
            localObject = new l6.c(p, s.x(c.b(t)));
            break;
          }
          k = ((Number)((m)localObject).a()).intValue();
          i = ((Number)((m)localObject).b()).intValue();
          r = d.g(p, k);
          k += i;
          p = k;
          if (i == 0) {
            j = 1;
          }
        }
        label239:
        o = 1;
      }
    }
    
    public l6.c d()
    {
      if (o == -1) {
        b();
      }
      if (o != 0)
      {
        l6.c localc = r;
        Intrinsics.c(localc, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        r = null;
        o = -1;
        return localc;
      }
      throw new NoSuchElementException();
    }
    
    public boolean hasNext()
    {
      if (o == -1) {
        b();
      }
      int i = o;
      boolean bool = true;
      if (i != 1) {
        bool = false;
      }
      return bool;
    }
    
    public void remove()
    {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
  }
}

/* Location:
 * Qualified Name:     kotlin.text.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */