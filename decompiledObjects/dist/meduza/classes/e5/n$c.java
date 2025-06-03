package e5;

import a4.d;
import a4.g.a;
import a4.h;
import c4.v.a;
import java.util.Map;
import p4.a;
import p4.a.b;
import t5.b;
import u4.k;
import v3.i0;
import v3.i0.a;
import z4.b0;

public final class n$c
  extends b0
{
  public final Map<String, d> H;
  public d I;
  
  public n$c() {}
  
  public n$c(b paramb, h paramh, g.a parama, Map paramMap)
  {
    super(paramb, paramh, parama);
    H = paramMap;
  }
  
  public final void c(long paramLong, int paramInt1, int paramInt2, int paramInt3, v.a parama)
  {
    super.c(paramLong, paramInt1, paramInt2, paramInt3, parama);
  }
  
  public final i0 l(i0 parami0)
  {
    Object localObject1 = I;
    if (localObject1 == null) {
      localObject1 = w;
    }
    Object localObject2 = localObject1;
    if (localObject1 != null)
    {
      localObject3 = (d)H.get(c);
      localObject2 = localObject1;
      if (localObject3 != null) {
        localObject2 = localObject3;
      }
    }
    localObject1 = r;
    if (localObject1 == null) {}
    int i;
    int j;
    int m;
    label134:
    do
    {
      localObject1 = null;
      break;
      i = a.length;
      j = 0;
      for (k = 0; k < i; k++)
      {
        localObject3 = a[k];
        if (((localObject3 instanceof k)) && ("com.apple.streaming.transportStreamTimestamp".equals(b)))
        {
          m = k;
          break label134;
        }
      }
      m = -1;
      if (m == -1) {
        break;
      }
    } while (i == 1);
    Object localObject3 = new a.b[i - 1];
    for (int k = j; k < i; k++) {
      if (k != m)
      {
        if (k < m) {
          j = k;
        } else {
          j = k - 1;
        }
        localObject3[j] = a[k];
      }
    }
    localObject1 = new a((a.b[])localObject3);
    if (localObject2 == w)
    {
      localObject3 = parami0;
      if (localObject1 == r) {}
    }
    else
    {
      parami0 = parami0.a();
      n = ((d)localObject2);
      i = ((a)localObject1);
      localObject3 = parami0.a();
    }
    return super.l((i0)localObject3);
  }
}

/* Location:
 * Qualified Name:     e5.n.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */