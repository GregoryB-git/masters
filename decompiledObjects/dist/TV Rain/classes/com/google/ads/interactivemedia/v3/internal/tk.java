package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;

public class tk
{
  private final boolean a;
  private final int b;
  private final byte[] c;
  private final tl[] d;
  private int e;
  private int f;
  private int g;
  private tl[] h;
  
  public tk(boolean paramBoolean, int paramInt)
  {
    this(true, 65536, 0);
  }
  
  public tk(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    boolean bool;
    if (paramInt1 > 0) {
      bool = true;
    } else {
      bool = false;
    }
    rp.b(bool);
    rp.b(true);
    a = paramBoolean;
    b = paramInt1;
    g = 0;
    h = new tl[100];
    c = null;
    d = new tl[1];
  }
  
  public tl a()
  {
    try
    {
      f += 1;
      int i = g;
      tl localtl;
      if (i > 0)
      {
        tl[] arrayOftl = h;
        i--;
        g = i;
        localtl = arrayOftl[i];
        arrayOftl[i] = null;
      }
      else
      {
        localtl = new tl(new byte[b], 0);
      }
      return localtl;
    }
    finally {}
  }
  
  public void a(int paramInt)
  {
    try
    {
      int i;
      if (paramInt < e) {
        i = 1;
      } else {
        i = 0;
      }
      e = paramInt;
      if (i != 0) {
        b();
      }
      return;
    }
    finally {}
  }
  
  public void a(tl paramtl)
  {
    try
    {
      tl[] arrayOftl = d;
      arrayOftl[0] = paramtl;
      a(arrayOftl);
      return;
    }
    finally {}
  }
  
  public void a(tl[] paramArrayOftl)
  {
    try
    {
      int i = g;
      int j = paramArrayOftl.length;
      Object localObject = h;
      if (j + i >= localObject.length) {
        h = ((tl[])Arrays.copyOf((Object[])localObject, Math.max(localObject.length << 1, i + paramArrayOftl.length)));
      }
      i = paramArrayOftl.length;
      for (j = 0; j < i; j++)
      {
        localObject = paramArrayOftl[j];
        tl[] arrayOftl = h;
        int k = g;
        g = (k + 1);
        arrayOftl[k] = localObject;
      }
      f -= paramArrayOftl.length;
      notifyAll();
      return;
    }
    finally {}
  }
  
  public void b()
  {
    try
    {
      int i = wl.a(e, b);
      int j = f;
      int k = 0;
      int m = Math.max(0, i - j);
      i = g;
      if (m >= i) {
        return;
      }
      j = m;
      if (c != null)
      {
        i--;
        j = k;
        while (j <= i)
        {
          tl[] arrayOftl = h;
          tl localtl = arrayOftl[j];
          Object localObject2 = a;
          byte[] arrayOfByte = c;
          if (localObject2 == arrayOfByte)
          {
            j++;
          }
          else
          {
            localObject2 = arrayOftl[i];
            if (a != arrayOfByte)
            {
              i--;
            }
            else
            {
              arrayOftl[j] = localObject2;
              arrayOftl[i] = localtl;
              i--;
              j++;
            }
          }
        }
        i = Math.max(m, j);
        m = g;
        j = i;
        if (i >= m) {
          return;
        }
      }
      Arrays.fill(h, j, g, null);
      g = j;
      return;
    }
    finally {}
  }
  
  public int c()
  {
    return b;
  }
  
  public void d()
  {
    try
    {
      if (a) {
        a(0);
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public int e()
  {
    try
    {
      int i = f;
      int j = b;
      return i * j;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.tk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */