package com.google.ads.interactivemedia.v3.internal;

import a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class hd
  extends ha
{
  public final long b;
  public final List<hc> c;
  public final List<hd> d;
  
  public hd(int paramInt, long paramLong)
  {
    super(paramInt);
    b = paramLong;
    c = new ArrayList();
    d = new ArrayList();
  }
  
  public final void a(hc paramhc)
  {
    c.add(paramhc);
  }
  
  public final void a(hd paramhd)
  {
    d.add(paramhd);
  }
  
  public final hc c(int paramInt)
  {
    int i = c.size();
    for (int j = 0; j < i; j++)
    {
      hc localhc = (hc)c.get(j);
      if (a == paramInt) {
        return localhc;
      }
    }
    return null;
  }
  
  public final hd d(int paramInt)
  {
    int i = d.size();
    for (int j = 0; j < i; j++)
    {
      hd localhd = (hd)d.get(j);
      if (a == paramInt) {
        return localhd;
      }
    }
    return null;
  }
  
  public final String toString()
  {
    String str1 = ha.b(a);
    Object localObject = Arrays.toString(c.toArray());
    String str2 = Arrays.toString(d.toArray());
    localObject = a.q(a.b(str2, a.b((String)localObject, a.b(str1, 22))), str1, " leaves: ", (String)localObject, " containers: ");
    ((StringBuilder)localObject).append(str2);
    return ((StringBuilder)localObject).toString();
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.hd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */