package com.google.ads.interactivemedia.v3.internal;

import a;
import z2;

public final class jn
{
  private final String a;
  private final int b;
  private final int c;
  private int d;
  private String e;
  
  public jn(int paramInt1, int paramInt2)
  {
    this(Integer.MIN_VALUE, 0, 1);
  }
  
  public jn(int paramInt1, int paramInt2, int paramInt3)
  {
    Object localObject;
    if (paramInt1 != Integer.MIN_VALUE)
    {
      localObject = new StringBuilder(12);
      ((StringBuilder)localObject).append(paramInt1);
      ((StringBuilder)localObject).append("/");
      localObject = ((StringBuilder)localObject).toString();
    }
    else
    {
      localObject = "";
    }
    a = ((String)localObject);
    b = paramInt2;
    c = paramInt3;
    d = Integer.MIN_VALUE;
  }
  
  private final void d()
  {
    if (d != Integer.MIN_VALUE) {
      return;
    }
    throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
  }
  
  public final void a()
  {
    int i = d;
    if (i == Integer.MIN_VALUE) {
      i = b;
    } else {
      i += c;
    }
    d = i;
    String str = a;
    e = z2.k(a.b(str, 11), str, i);
  }
  
  public final int b()
  {
    d();
    return d;
  }
  
  public final String c()
  {
    d();
    return e;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.jn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */