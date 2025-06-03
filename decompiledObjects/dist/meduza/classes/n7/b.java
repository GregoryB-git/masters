package n7;

import java.util.Iterator;
import java.util.NoSuchElementException;
import q0.g;

public abstract class b<T>
  implements Iterator<T>
{
  public int a = 2;
  public String b;
  
  public final boolean hasNext()
  {
    int i = a;
    boolean bool1 = true;
    if (i != 4) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    x6.b.J(bool2);
    i = g.c(a);
    boolean bool2 = bool1;
    if (i != 0)
    {
      if (i != 2)
      {
        a = 4;
        Object localObject1 = (o.a)this;
        int j;
        Object localObject2;
        int k;
        int m;
        Object localObject3;
        do
        {
          j = f;
          for (;;)
          {
            i = f;
            if (i == -1) {
              break label402;
            }
            localObject2 = (m)localObject1;
            i = p.a.a(i, c);
            if (i == -1)
            {
              i = c.length();
              f = -1;
            }
            else
            {
              f = (i + 1);
            }
            k = f;
            m = j;
            if (k != j) {
              break;
            }
            i = k + 1;
            f = i;
            if (i > c.length()) {
              f = -1;
            }
          }
          for (;;)
          {
            j = i;
            if (m >= i) {
              break;
            }
            j = i;
            if (!d.b(c.charAt(m))) {
              break;
            }
            m++;
          }
          while (j > m)
          {
            localObject2 = d;
            localObject3 = c;
            i = j - 1;
            if (!((c)localObject2).b(((CharSequence)localObject3).charAt(i))) {
              break;
            }
            j = i;
          }
        } while ((e) && (m == j));
        i = o;
        if (i == 1)
        {
          i = c.length();
          f = -1;
          for (;;)
          {
            j = i;
            if (i <= m) {
              break;
            }
            localObject3 = d;
            localObject2 = c;
            k = i - 1;
            j = i;
            if (!((c)localObject3).b(((CharSequence)localObject2).charAt(k))) {
              break;
            }
            i = k;
          }
        }
        o = (i - 1);
        localObject1 = c.subSequence(m, j).toString();
        break label411;
        label402:
        a = 3;
        localObject1 = null;
        label411:
        b = ((String)localObject1);
        if (a != 3)
        {
          a = 1;
          return bool1;
        }
      }
      bool2 = false;
    }
    return bool2;
  }
  
  public final T next()
  {
    if (hasNext())
    {
      a = 2;
      String str = b;
      b = null;
      return str;
    }
    throw new NoSuchElementException();
  }
  
  public final void remove()
  {
    throw new UnsupportedOperationException();
  }
}

/* Location:
 * Qualified Name:     n7.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */