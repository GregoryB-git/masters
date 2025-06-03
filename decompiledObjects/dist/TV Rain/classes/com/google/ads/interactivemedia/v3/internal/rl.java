package com.google.ads.interactivemedia.v3.internal;

import java.util.Map;

final class rl
  extends nv
{
  private final Map<String, fe> a;
  
  public rl(tk paramtk, Map<String, fe> paramMap)
  {
    super(paramtk);
    a = paramMap;
  }
  
  public final void a(bw parambw)
  {
    Object localObject1 = l;
    Object localObject2 = localObject1;
    if (localObject1 != null)
    {
      localObject3 = (fe)a.get(a);
      localObject2 = localObject1;
      if (localObject3 != null) {
        localObject2 = localObject3;
      }
    }
    Object localObject3 = g;
    if (localObject3 == null) {}
    int i;
    int j;
    int m;
    label122:
    do
    {
      localObject3 = null;
      break;
      i = ((kd)localObject3).a();
      j = 0;
      for (k = 0; k < i; k++)
      {
        localObject1 = ((kd)localObject3).a(k);
        if (((localObject1 instanceof lh)) && ("com.apple.streaming.transportStreamTimestamp".equals(a)))
        {
          m = k;
          break label122;
        }
      }
      m = -1;
      if (m == -1) {
        break;
      }
    } while (i == 1);
    localObject1 = new kd.a[i - 1];
    for (int k = j; k < i; k++) {
      if (k != m)
      {
        if (k < m) {
          j = k;
        } else {
          j = k - 1;
        }
        localObject1[j] = ((kd)localObject3).a(k);
      }
    }
    localObject3 = new kd((kd.a[])localObject1);
    super.a(parambw.a((fe)localObject2, (kd)localObject3));
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.rl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */