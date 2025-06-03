package q0;

import B0.b;
import F0.T.a;
import d0.q;
import d0.q.b;
import d0.x.b;
import java.util.Map;
import p0.v.a;
import x0.P;

public final class s$d
  extends P
{
  public final Map H;
  public d0.m I;
  
  public s$d(b paramb, p0.x paramx, v.a parama, Map paramMap)
  {
    super(paramb, paramx, parama);
    H = paramMap;
  }
  
  public void b(long paramLong, int paramInt1, int paramInt2, int paramInt3, T.a parama)
  {
    super.b(paramLong, paramInt1, paramInt2, paramInt3, parama);
  }
  
  public final d0.x i0(d0.x paramx)
  {
    if (paramx == null) {
      return null;
    }
    int i = paramx.e();
    int j = 0;
    for (int k = 0; k < i; k++)
    {
      localObject = paramx.d(k);
      if (((localObject instanceof T0.m)) && ("com.apple.streaming.transportStreamTimestamp".equals(p)))
      {
        m = k;
        break label70;
      }
    }
    int m = -1;
    label70:
    if (m == -1) {
      return paramx;
    }
    if (i == 1) {
      return null;
    }
    Object localObject = new x.b[i - 1];
    for (k = j; k < i; k++) {
      if (k != m)
      {
        if (k < m) {
          j = k;
        } else {
          j = k - 1;
        }
        localObject[j] = paramx.d(k);
      }
    }
    return new d0.x((x.b[])localObject);
  }
  
  public void j0(d0.m paramm)
  {
    I = paramm;
    J();
  }
  
  public void k0(j paramj)
  {
    g0(k);
  }
  
  public q x(q paramq)
  {
    Object localObject1 = I;
    if (localObject1 == null) {
      localObject1 = r;
    }
    Object localObject2 = localObject1;
    if (localObject1 != null)
    {
      localObject3 = (d0.m)H.get(q);
      localObject2 = localObject1;
      if (localObject3 != null) {
        localObject2 = localObject3;
      }
    }
    Object localObject3 = i0(k);
    if (localObject2 == r)
    {
      localObject1 = paramq;
      if (localObject3 == k) {}
    }
    else
    {
      localObject1 = paramq.a().U((d0.m)localObject2).h0((d0.x)localObject3).K();
    }
    return super.x((q)localObject1);
  }
}

/* Location:
 * Qualified Name:     q0.s.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */