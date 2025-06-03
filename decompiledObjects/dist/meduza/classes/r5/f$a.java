package r5;

import android.text.TextUtils;
import java.util.AbstractCollection;
import java.util.Comparator;
import java.util.List;
import o7.j0;
import o7.k0;
import o7.n;
import o7.n.a;
import o7.o0;
import v5.e0;

public final class f$a
  extends f.h<a>
  implements Comparable<a>
{
  public final int A;
  public final int B;
  public final boolean C;
  public final boolean D;
  public final int e;
  public final boolean f;
  public final String o;
  public final f.c p;
  public final boolean q;
  public final int r;
  public final int s;
  public final int t;
  public final boolean u;
  public final int v;
  public final int w;
  public final boolean x;
  public final int y;
  public final int z;
  
  public f$a(int paramInt1, z4.i0 parami0, int paramInt2, f.c paramc, int paramInt3, boolean paramBoolean, e parame)
  {
    super(paramInt1, paramInt2, parami0);
    p = paramc;
    o = f.k(d.c);
    int i = 0;
    q = f.i(paramInt3, false);
    int j;
    for (paramInt1 = 0;; paramInt1++)
    {
      paramInt2 = v.size();
      j = Integer.MAX_VALUE;
      if (paramInt1 >= paramInt2) {
        break;
      }
      int k = f.g(d, (String)v.get(paramInt1), false);
      if (k > 0)
      {
        paramInt2 = paramInt1;
        paramInt1 = k;
        break label108;
      }
    }
    paramInt1 = 0;
    paramInt2 = Integer.MAX_VALUE;
    label108:
    s = paramInt2;
    r = paramInt1;
    paramInt1 = d.e;
    paramInt2 = w;
    if ((paramInt1 != 0) && (paramInt1 == paramInt2)) {
      paramInt1 = Integer.MAX_VALUE;
    } else {
      paramInt1 = Integer.bitCount(paramInt1 & paramInt2);
    }
    t = paramInt1;
    parami0 = d;
    paramInt1 = e;
    boolean bool;
    if ((paramInt1 != 0) && ((paramInt1 & 0x1) == 0)) {
      bool = false;
    } else {
      bool = true;
    }
    u = bool;
    if ((d & 0x1) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    x = bool;
    paramInt1 = G;
    y = paramInt1;
    z = H;
    paramInt2 = p;
    A = paramInt2;
    if (((paramInt2 == -1) || (paramInt2 <= y)) && ((paramInt1 == -1) || (paramInt1 <= x)) && (parame.apply(parami0))) {
      bool = true;
    } else {
      bool = false;
    }
    f = bool;
    parami0 = e0.z();
    for (paramInt1 = 0; paramInt1 < parami0.length; paramInt1++)
    {
      paramInt2 = f.g(d, parami0[paramInt1], false);
      if (paramInt2 > 0) {
        break label343;
      }
    }
    paramInt2 = 0;
    paramInt1 = Integer.MAX_VALUE;
    label343:
    v = paramInt1;
    w = paramInt2;
    for (paramInt1 = 0;; paramInt1++)
    {
      paramInt2 = j;
      if (paramInt1 >= z.size()) {
        break;
      }
      parami0 = d.t;
      if ((parami0 != null) && (parami0.equals(z.get(paramInt1))))
      {
        paramInt2 = paramInt1;
        break;
      }
    }
    B = paramInt2;
    if ((paramInt3 & 0x180) == 128) {
      bool = true;
    } else {
      bool = false;
    }
    C = bool;
    if ((paramInt3 & 0x40) == 64) {
      bool = true;
    } else {
      bool = false;
    }
    D = bool;
    if (!f.i(paramInt3, p.t0))
    {
      paramInt1 = i;
    }
    else if ((!f) && (!p.n0))
    {
      paramInt1 = i;
    }
    else
    {
      if ((f.i(paramInt3, false)) && (f) && (d.p != -1))
      {
        parami0 = p;
        if ((!F) && (!E) && ((v0) || (!paramBoolean)))
        {
          paramInt1 = 2;
          break label577;
        }
      }
      paramInt1 = 1;
    }
    label577:
    e = paramInt1;
  }
  
  public final int f()
  {
    return e;
  }
  
  public final boolean g(f.h paramh)
  {
    paramh = (a)paramh;
    Object localObject = p;
    int i;
    if (!q0)
    {
      i = d.G;
      if ((i == -1) || (i != d.G)) {}
    }
    else if (!o0)
    {
      localObject = d.t;
      if ((localObject == null) || (!TextUtils.equals((CharSequence)localObject, d.t))) {}
    }
    else
    {
      localObject = p;
      if (!p0)
      {
        i = d.H;
        if ((i == -1) || (i != d.H)) {}
      }
      else
      {
        if ((r0) || ((C == C) && (D == D))) {
          break label148;
        }
      }
    }
    boolean bool = false;
    break label151;
    label148:
    bool = true;
    label151:
    return bool;
  }
  
  public final int h(a parama)
  {
    k0 localk0;
    if ((f) && (q)) {
      localk0 = f.j;
    } else {
      localk0 = f.j.a();
    }
    Object localObject1 = n.a.c(q, q);
    int i = s;
    int j = s;
    j0.a.getClass();
    Object localObject2 = o0.a;
    localObject2 = ((n)localObject1).b(Integer.valueOf(i), Integer.valueOf(j), (Comparator)localObject2).a(r, r).a(t, t).c(x, x).c(u, u).b(Integer.valueOf(v), Integer.valueOf(v), (Comparator)localObject2).a(w, w).c(f, f).b(Integer.valueOf(B), Integer.valueOf(B), (Comparator)localObject2);
    i = A;
    j = A;
    if (p.E) {
      localObject1 = f.j.a();
    } else {
      localObject1 = f.k;
    }
    localObject1 = ((n)localObject2).b(Integer.valueOf(i), Integer.valueOf(j), (Comparator)localObject1).c(C, C).c(D, D).b(Integer.valueOf(y), Integer.valueOf(y), localk0).b(Integer.valueOf(z), Integer.valueOf(z), localk0);
    j = A;
    i = A;
    if (!e0.a(o, o)) {
      localk0 = f.k;
    }
    return ((n)localObject1).b(Integer.valueOf(j), Integer.valueOf(i), localk0).e();
  }
}

/* Location:
 * Qualified Name:     r5.f.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */