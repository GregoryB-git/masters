package W2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class q
{
  public final d a;
  public final boolean b;
  public final c c;
  public final int d;
  
  public q(c paramc)
  {
    this(paramc, false, d.f(), Integer.MAX_VALUE);
  }
  
  public q(c paramc, boolean paramBoolean, d paramd, int paramInt)
  {
    c = paramc;
    b = paramBoolean;
    a = paramd;
    d = paramInt;
  }
  
  public static q d(char paramChar)
  {
    return e(d.d(paramChar));
  }
  
  public static q e(d paramd)
  {
    m.j(paramd);
    return new q(new a());
  }
  
  public List f(CharSequence paramCharSequence)
  {
    m.j(paramCharSequence);
    Iterator localIterator = g(paramCharSequence);
    paramCharSequence = new ArrayList();
    while (localIterator.hasNext()) {
      paramCharSequence.add((String)localIterator.next());
    }
    return Collections.unmodifiableList(paramCharSequence);
  }
  
  public final Iterator g(CharSequence paramCharSequence)
  {
    return c.a(this, paramCharSequence);
  }
  
  public class a
    implements q.c
  {
    public a() {}
    
    public q.b b(q paramq, CharSequence paramCharSequence)
    {
      return new a(paramq, paramCharSequence);
    }
    
    public class a
      extends q.b
    {
      public a(q paramq, CharSequence paramCharSequence)
      {
        super(paramCharSequence);
      }
      
      public int g(int paramInt)
      {
        return paramInt + 1;
      }
      
      public int h(int paramInt)
      {
        return c(q, paramInt);
      }
    }
  }
  
  public static abstract class b
    extends b
  {
    public final CharSequence q;
    public final d r;
    public final boolean s;
    public int t = 0;
    public int u;
    
    public b(q paramq, CharSequence paramCharSequence)
    {
      r = q.a(paramq);
      s = q.b(paramq);
      u = q.c(paramq);
      q = paramCharSequence;
    }
    
    public String f()
    {
      int i;
      int m;
      do
      {
        i = t;
        for (;;)
        {
          j = t;
          if (j == -1) {
            break label271;
          }
          j = h(j);
          if (j == -1)
          {
            j = q.length();
            t = -1;
          }
          else
          {
            t = g(j);
          }
          int k = t;
          m = i;
          if (k != i) {
            break;
          }
          j = k + 1;
          t = j;
          if (j > q.length()) {
            t = -1;
          }
        }
        for (;;)
        {
          i = j;
          if (m >= j) {
            break;
          }
          i = j;
          if (!r.e(q.charAt(m))) {
            break;
          }
          m++;
        }
        while ((i > m) && (r.e(q.charAt(i - 1)))) {
          i--;
        }
      } while ((s) && (m == i));
      int j = u;
      if (j == 1)
      {
        j = q.length();
        t = -1;
        for (;;)
        {
          i = j;
          if (j <= m) {
            break;
          }
          i = j;
          if (!r.e(q.charAt(j - 1))) {
            break;
          }
          j--;
        }
      }
      u = (j - 1);
      return q.subSequence(m, i).toString();
      label271:
      return (String)d();
    }
    
    public abstract int g(int paramInt);
    
    public abstract int h(int paramInt);
  }
  
  public static abstract interface c
  {
    public abstract Iterator a(q paramq, CharSequence paramCharSequence);
  }
}

/* Location:
 * Qualified Name:     W2.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */