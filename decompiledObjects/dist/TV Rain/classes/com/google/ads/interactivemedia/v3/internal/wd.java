package com.google.ads.interactivemedia.v3.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public final class wd
{
  private static final Comparator<we> a = wc.a;
  private static final Comparator<we> b = wf.a;
  private final int c;
  private final ArrayList<we> d;
  private final we[] e;
  private int f;
  private int g;
  private int h;
  private int i;
  
  public wd(int paramInt)
  {
    c = paramInt;
    e = new we[5];
    d = new ArrayList();
    f = -1;
  }
  
  public final float a(float paramFloat)
  {
    int j = f;
    int k = 0;
    if (j != 0)
    {
      Collections.sort(d, b);
      f = 0;
    }
    paramFloat = h;
    j = 0;
    while (k < d.size())
    {
      localObject = (we)d.get(k);
      j += b;
      if (j >= paramFloat * 0.5F) {
        return c;
      }
      k++;
    }
    if (d.isEmpty()) {
      return NaN.0F;
    }
    Object localObject = d;
    return getsize1c;
  }
  
  public final void a()
  {
    d.clear();
    f = -1;
    g = 0;
    h = 0;
  }
  
  public final void a(int paramInt, float paramFloat)
  {
    if (f != 1)
    {
      Collections.sort(d, a);
      f = 1;
    }
    int j = i;
    Object localObject;
    if (j > 0)
    {
      localObject = e;
      j--;
      i = j;
      localObject = localObject[j];
    }
    else
    {
      localObject = new we((byte)0);
    }
    j = g;
    g = (j + 1);
    a = j;
    b = paramInt;
    c = paramFloat;
    d.add(localObject);
    h += paramInt;
    for (;;)
    {
      paramInt = h;
      j = c;
      if (paramInt <= j) {
        break;
      }
      j = paramInt - j;
      localObject = (we)d.get(0);
      paramInt = b;
      if (paramInt <= j)
      {
        h -= paramInt;
        d.remove(0);
        paramInt = i;
        if (paramInt < 5)
        {
          we[] arrayOfwe = e;
          i = (paramInt + 1);
          arrayOfwe[paramInt] = localObject;
        }
      }
      else
      {
        b = (paramInt - j);
        h -= j;
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.wd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */