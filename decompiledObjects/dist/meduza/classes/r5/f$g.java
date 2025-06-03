package r5;

import java.util.AbstractCollection;
import java.util.Comparator;
import java.util.List;
import o7.j0;
import o7.n;
import o7.n.a;
import o7.o0;
import o7.t;

public final class f$g
  extends f.h<g>
  implements Comparable<g>
{
  public final int e;
  public final boolean f;
  public final boolean o;
  public final boolean p;
  public final int q;
  public final int r;
  public final int s;
  public final int t;
  public final boolean u;
  
  public f$g(int paramInt1, z4.i0 parami0, int paramInt2, f.c paramc, int paramInt3, String paramString)
  {
    super(paramInt1, paramInt2, parami0);
    int i = 0;
    f = f.i(paramInt3, false);
    paramInt1 = d.d & C;
    boolean bool;
    if ((paramInt1 & 0x1) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    o = bool;
    if ((paramInt1 & 0x2) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    p = bool;
    if (A.isEmpty()) {
      parami0 = t.t("");
    } else {
      parami0 = A;
    }
    for (paramInt1 = 0;; paramInt1++)
    {
      paramInt2 = parami0.size();
      j = Integer.MAX_VALUE;
      if (paramInt1 >= paramInt2) {
        break;
      }
      paramInt2 = f.g(d, (String)parami0.get(paramInt1), D);
      if (paramInt2 > 0) {
        break label159;
      }
    }
    paramInt2 = 0;
    paramInt1 = Integer.MAX_VALUE;
    label159:
    q = paramInt1;
    r = paramInt2;
    paramInt1 = d.e;
    int k = B;
    if ((paramInt1 != 0) && (paramInt1 == k)) {
      paramInt1 = j;
    } else {
      paramInt1 = Integer.bitCount(paramInt1 & k);
    }
    s = paramInt1;
    if ((d.e & 0x440) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    u = bool;
    if (f.k(paramString) == null) {
      bool = true;
    } else {
      bool = false;
    }
    int j = f.g(d, paramString, bool);
    t = j;
    if ((paramInt2 <= 0) && ((!A.isEmpty()) || (paramInt1 <= 0)) && (!o) && ((!p) || (j <= 0))) {
      paramInt2 = 0;
    } else {
      paramInt2 = 1;
    }
    paramInt1 = i;
    if (f.i(paramInt3, t0))
    {
      paramInt1 = i;
      if (paramInt2 != 0) {
        paramInt1 = 1;
      }
    }
    e = paramInt1;
  }
  
  public final int f()
  {
    return e;
  }
  
  public final int h(g paramg)
  {
    n localn = n.a.c(f, f);
    int i = q;
    int j = q;
    Object localObject1 = j0.a;
    localObject1.getClass();
    Object localObject2 = o0.a;
    localn = localn.b(Integer.valueOf(i), Integer.valueOf(j), (Comparator)localObject2).a(r, r).a(s, s).c(o, o);
    boolean bool1 = p;
    boolean bool2 = p;
    if (r == 0) {
      localObject2 = localObject1;
    }
    localObject1 = localn.b(Boolean.valueOf(bool1), Boolean.valueOf(bool2), (Comparator)localObject2).a(t, t);
    localObject2 = localObject1;
    if (s == 0) {
      localObject2 = ((n)localObject1).d(u, u);
    }
    return ((n)localObject2).e();
  }
}

/* Location:
 * Qualified Name:     r5.f.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */