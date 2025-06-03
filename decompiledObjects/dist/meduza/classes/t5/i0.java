package t5;

import b0.d;
import java.util.ArrayList;
import java.util.Collections;
import r5.c;

public final class i0
{
  public static final d h = new d(7);
  public static final c i = new c(4);
  public final int a;
  public final ArrayList<a> b;
  public final a[] c;
  public int d;
  public int e;
  public int f;
  public int g;
  
  public i0(int paramInt)
  {
    a = paramInt;
    c = new a[5];
    b = new ArrayList();
    d = -1;
  }
  
  public final void a(float paramFloat, int paramInt)
  {
    if (d != 1)
    {
      Collections.sort(b, h);
      d = 1;
    }
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
      localObject = new a();
    }
    j = e;
    e = (j + 1);
    a = j;
    b = paramInt;
    c = paramFloat;
    b.add(localObject);
    f += paramInt;
    for (;;)
    {
      j = f;
      paramInt = a;
      if (j <= paramInt) {
        break;
      }
      j -= paramInt;
      a locala = (a)b.get(0);
      paramInt = b;
      if (paramInt <= j)
      {
        f -= paramInt;
        b.remove(0);
        paramInt = g;
        if (paramInt < 5)
        {
          localObject = c;
          g = (paramInt + 1);
          localObject[paramInt] = locala;
        }
      }
      else
      {
        b = (paramInt - j);
        f -= j;
      }
    }
  }
  
  public final float b()
  {
    int j = d;
    int k = 0;
    if (j != 0)
    {
      Collections.sort(b, i);
      d = 0;
    }
    float f1 = f;
    j = 0;
    Object localObject;
    while (k < b.size())
    {
      localObject = (a)b.get(k);
      j += b;
      if (j >= 0.5F * f1) {
        return c;
      }
      k++;
    }
    if (b.isEmpty())
    {
      f1 = NaN.0F;
    }
    else
    {
      localObject = b;
      f1 = getsize1c;
    }
    return f1;
  }
  
  public static final class a
  {
    public int a;
    public int b;
    public float c;
  }
}

/* Location:
 * Qualified Name:     t5.i0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */