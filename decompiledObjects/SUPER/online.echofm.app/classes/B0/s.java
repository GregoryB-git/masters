package B0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class s
{
  public static final Comparator h = new q();
  public static final Comparator i = new r();
  public final int a;
  public final ArrayList b;
  public final b[] c;
  public int d;
  public int e;
  public int f;
  public int g;
  
  public s(int paramInt)
  {
    a = paramInt;
    c = new b[5];
    b = new ArrayList();
    d = -1;
  }
  
  public void c(int paramInt, float paramFloat)
  {
    d();
    int j = g;
    Object localObject;
    if (j > 0)
    {
      localObject = c;
      j--;
      g = j;
      localObject = localObject[j];
    }
    else
    {
      localObject = new b(null);
    }
    j = e;
    e = (j + 1);
    a = j;
    b = paramInt;
    c = paramFloat;
    b.add(localObject);
    for (paramInt = f + paramInt;; paramInt = f - j)
    {
      f = paramInt;
      b localb;
      for (;;)
      {
        j = f;
        paramInt = a;
        if (j <= paramInt) {
          return;
        }
        j -= paramInt;
        localb = (b)b.get(0);
        paramInt = b;
        if (paramInt > j) {
          break;
        }
        f -= paramInt;
        b.remove(0);
        paramInt = g;
        if (paramInt < 5)
        {
          localObject = c;
          g = (paramInt + 1);
          localObject[paramInt] = localb;
        }
      }
      b = (paramInt - j);
    }
  }
  
  public final void d()
  {
    if (d != 1)
    {
      Collections.sort(b, h);
      d = 1;
    }
  }
  
  public final void e()
  {
    if (d != 0)
    {
      Collections.sort(b, i);
      d = 0;
    }
  }
  
  public float f(float paramFloat)
  {
    e();
    float f1 = f;
    int j = 0;
    int k = 0;
    Object localObject;
    while (j < b.size())
    {
      localObject = (b)b.get(j);
      k += b;
      if (k >= paramFloat * f1) {
        return c;
      }
      j++;
    }
    if (b.isEmpty())
    {
      paramFloat = NaN.0F;
    }
    else
    {
      localObject = b;
      paramFloat = getsize1c;
    }
    return paramFloat;
  }
  
  public void i()
  {
    b.clear();
    d = -1;
    e = 0;
    f = 0;
  }
  
  public static class b
  {
    public int a;
    public int b;
    public float c;
  }
}

/* Location:
 * Qualified Name:     B0.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */