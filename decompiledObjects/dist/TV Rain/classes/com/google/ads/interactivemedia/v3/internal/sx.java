package com.google.ads.interactivemedia.v3.internal;

public final class sx
  implements Comparable<sx>
{
  public final boolean a;
  private final boolean b;
  private final boolean c;
  private final boolean d;
  private final int e;
  private final int f;
  
  public sx(bw parambw, su paramsu, int paramInt, String paramString)
  {
    boolean bool1 = false;
    b = sp.a(paramInt, false);
    paramInt = c & z;
    boolean bool2;
    if ((paramInt & 0x1) != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    c = bool2;
    if ((paramInt & 0x2) != 0) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    int i = sp.a(parambw, x, y);
    e = i;
    boolean bool3;
    if (((i > 0) && (paramInt == 0)) || ((i == 0) && (paramInt != 0))) {
      bool3 = true;
    } else {
      bool3 = false;
    }
    d = bool3;
    if (sp.a(paramString) == null) {
      bool3 = true;
    } else {
      bool3 = false;
    }
    int j = sp.a(parambw, paramString, bool3);
    f = j;
    if ((i <= 0) && (!bool2))
    {
      bool2 = bool1;
      if (paramInt != 0)
      {
        bool2 = bool1;
        if (j <= 0) {}
      }
    }
    else
    {
      bool2 = true;
    }
    a = bool2;
  }
  
  public final int a(sx paramsx)
  {
    boolean bool = b;
    if (bool != b)
    {
      if (bool) {
        return 1;
      }
      return -1;
    }
    int i = e;
    int j = e;
    if (i != j) {
      return sp.a(i, j);
    }
    bool = c;
    if (bool != c)
    {
      if (bool) {
        return 1;
      }
      return -1;
    }
    bool = d;
    if (bool != d)
    {
      if (bool) {
        return 1;
      }
      return -1;
    }
    return sp.a(f, f);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.sx
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */