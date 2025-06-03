package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class xz
{
  private zn a = zn.a;
  private yo b = yo.a;
  private xr c = xm.a;
  private final Map<Type, yc<?>> d = new HashMap();
  private final List<yp> e = new ArrayList();
  private final List<yp> f = new ArrayList();
  private boolean g = false;
  private int h = 2;
  private int i = 2;
  private boolean j = false;
  private boolean k = false;
  private boolean l = true;
  private boolean m = false;
  private boolean n = false;
  private boolean o = false;
  
  public final xu a()
  {
    int i1 = e.size();
    ArrayList localArrayList = new ArrayList(f.size() + i1 + 3);
    localArrayList.addAll(e);
    Collections.reverse(localArrayList);
    Object localObject = new ArrayList(f);
    Collections.reverse((List)localObject);
    localArrayList.addAll((Collection)localObject);
    i1 = h;
    int i2 = i;
    if ((i1 != 2) && (i2 != 2))
    {
      localObject = new xh(java.util.Date.class, i1, i2);
      xh localxh1 = new xh(Timestamp.class, i1, i2);
      xh localxh2 = new xh(java.sql.Date.class, i1, i2);
      localArrayList.add(abi.a(java.util.Date.class, (yn)localObject));
      localArrayList.add(abi.a(Timestamp.class, localxh1));
      localArrayList.add(abi.a(java.sql.Date.class, localxh2));
    }
    return new xu(a, c, d, false, false, false, l, false, false, false, b, null, h, i, e, f, localArrayList);
  }
  
  public final xz a(xk paramxk)
  {
    a = a.a(paramxk, true, false);
    return this;
  }
  
  public final xz a(yp paramyp)
  {
    e.add(paramyp);
    return this;
  }
  
  public final xz a(Type paramType, Object paramObject)
  {
    boolean bool1 = paramObject instanceof ym;
    boolean bool2;
    if ((!bool1) && (!(paramObject instanceof ye)) && (!(paramObject instanceof yc)) && (!(paramObject instanceof yn))) {
      bool2 = false;
    } else {
      bool2 = true;
    }
    uw.a(bool2);
    if ((paramObject instanceof yc)) {
      d.put(paramType, (yc)paramObject);
    }
    if ((bool1) || ((paramObject instanceof ye)))
    {
      acx localacx = acx.a(paramType);
      e.add(abe.a(localacx, paramObject));
    }
    if ((paramObject instanceof yn)) {
      e.add(abi.a(acx.a(paramType), (yn)paramObject));
    }
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.xz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */