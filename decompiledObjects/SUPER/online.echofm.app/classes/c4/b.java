package c4;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class b
  implements d
{
  public final Set a;
  public final d.a b;
  
  public b(d.a parama, List paramList)
  {
    if (paramList != null) {
      a = new HashSet(paramList);
    } else {
      a = null;
    }
    b = parama;
  }
  
  public void a(d.a parama, String paramString1, String paramString2, long paramLong)
  {
    if (g(parama, paramString1))
    {
      paramString2 = c(parama, paramString1, paramString2, paramLong);
      int i = a.a[parama.ordinal()];
      if (i != 1)
      {
        if (i != 2)
        {
          if (i != 3)
          {
            if (i == 4) {
              d(paramString1, paramString2);
            } else {
              throw new RuntimeException("Should not reach here!");
            }
          }
          else {
            f(paramString1, paramString2);
          }
        }
        else {
          h(paramString1, paramString2);
        }
      }
      else {
        e(paramString1, paramString2);
      }
    }
  }
  
  public d.a b()
  {
    return b;
  }
  
  public abstract String c(d.a parama, String paramString1, String paramString2, long paramLong);
  
  public abstract void d(String paramString1, String paramString2);
  
  public abstract void e(String paramString1, String paramString2);
  
  public abstract void f(String paramString1, String paramString2);
  
  public boolean g(d.a parama, String paramString)
  {
    boolean bool;
    if ((parama.ordinal() >= b.ordinal()) && ((a == null) || (parama.ordinal() > d.a.o.ordinal()) || (a.contains(paramString)))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public abstract void h(String paramString1, String paramString2);
}

/* Location:
 * Qualified Name:     c4.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */