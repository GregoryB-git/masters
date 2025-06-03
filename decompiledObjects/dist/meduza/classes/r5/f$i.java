package r5;

import java.util.AbstractCollection;
import java.util.List;
import o7.j0;
import o7.k0;
import o7.n;
import o7.n.a;
import o7.o0;
import v5.e0;

public final class f$i
  extends f.h<i>
{
  public final boolean e;
  public final f.c f;
  public final boolean o;
  public final boolean p;
  public final int q;
  public final int r;
  public final int s;
  public final int t;
  public final boolean u;
  public final boolean v;
  public final int w;
  public final boolean x;
  public final boolean y;
  public final int z;
  
  public f$i(int paramInt1, z4.i0 parami0, int paramInt2, f.c paramc, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    super(paramInt1, paramInt2, parami0);
    f = paramc;
    int i;
    if (l0) {
      i = 24;
    } else {
      i = 16;
    }
    boolean bool = k0;
    int j = 0;
    if ((bool) && ((paramInt4 & i) != 0)) {
      bool = true;
    } else {
      bool = false;
    }
    v = bool;
    float f1;
    if (paramBoolean)
    {
      parami0 = d;
      paramInt1 = y;
      if ((paramInt1 == -1) || (paramInt1 <= a))
      {
        paramInt1 = z;
        if ((paramInt1 == -1) || (paramInt1 <= b))
        {
          f1 = A;
          if ((f1 == -1.0F) || (f1 <= c))
          {
            paramInt1 = p;
            if ((paramInt1 == -1) || (paramInt1 <= d))
            {
              bool = true;
              break label172;
            }
          }
        }
      }
    }
    bool = false;
    label172:
    e = bool;
    if (paramBoolean)
    {
      parami0 = d;
      paramInt1 = y;
      if ((paramInt1 == -1) || (paramInt1 >= e))
      {
        paramInt1 = z;
        if ((paramInt1 == -1) || (paramInt1 >= f))
        {
          f1 = A;
          if ((f1 == -1.0F) || (f1 >= o))
          {
            paramInt1 = p;
            if ((paramInt1 == -1) || (paramInt1 >= p))
            {
              paramBoolean = true;
              break label280;
            }
          }
        }
      }
    }
    paramBoolean = false;
    label280:
    o = paramBoolean;
    p = f.i(paramInt3, false);
    parami0 = d;
    q = p;
    paramInt2 = y;
    if (paramInt2 != -1)
    {
      paramInt1 = z;
      if (paramInt1 != -1)
      {
        paramInt1 = paramInt2 * paramInt1;
        break label341;
      }
    }
    paramInt1 = -1;
    label341:
    r = paramInt1;
    paramInt1 = e;
    paramInt2 = u;
    paramInt4 = Integer.MAX_VALUE;
    if ((paramInt1 != 0) && (paramInt1 == paramInt2)) {
      paramInt1 = Integer.MAX_VALUE;
    } else {
      paramInt1 = Integer.bitCount(paramInt1 & paramInt2);
    }
    t = paramInt1;
    paramInt1 = d.e;
    if ((paramInt1 != 0) && ((paramInt1 & 0x1) == 0)) {
      paramBoolean = false;
    } else {
      paramBoolean = true;
    }
    u = paramBoolean;
    for (paramInt1 = 0;; paramInt1++)
    {
      paramInt2 = paramInt4;
      if (paramInt1 >= t.size()) {
        break;
      }
      parami0 = d.t;
      if ((parami0 != null) && (parami0.equals(t.get(paramInt1))))
      {
        paramInt2 = paramInt1;
        break;
      }
    }
    s = paramInt2;
    if ((paramInt3 & 0x180) == 128) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    }
    x = paramBoolean;
    if ((paramInt3 & 0x40) == 64) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    }
    y = paramBoolean;
    paramc = d;
    parami0 = t;
    paramInt2 = 3;
    if (parami0 != null)
    {
      switch (parami0.hashCode())
      {
      }
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
                paramInt1 = -1;
                break;
              } while (!parami0.equals("video/x-vnd.on2.vp9"));
              paramInt1 = 4;
              break;
            } while (!parami0.equals("video/avc"));
            paramInt1 = 3;
            break;
          } while (!parami0.equals("video/hevc"));
          paramInt1 = 2;
          break;
        } while (!parami0.equals("video/av01"));
        paramInt1 = 1;
        break;
      } while (!parami0.equals("video/dolby-vision"));
      paramInt1 = 0;
    }
    switch (paramInt1)
    {
    default: 
      paramInt2 = 0;
      break;
    case 4: 
      paramInt2 = 2;
      break;
    case 3: 
      paramInt2 = 1;
      break;
    case 1: 
      paramInt2 = 4;
      break;
    case 0: 
      paramInt2 = 5;
    }
    z = paramInt2;
    if ((e & 0x4000) != 0)
    {
      paramInt1 = j;
    }
    else if (!f.i(paramInt3, f.t0))
    {
      paramInt1 = j;
    }
    else if ((!e) && (!f.j0))
    {
      paramInt1 = j;
    }
    else
    {
      if ((f.i(paramInt3, false)) && (o) && (e) && (d.p != -1))
      {
        parami0 = f;
        if ((!F) && (!E) && ((i & paramInt3) != 0))
        {
          paramInt1 = 2;
          break label897;
        }
      }
      paramInt1 = 1;
    }
    label897:
    w = paramInt1;
  }
  
  public static int h(i parami1, i parami2)
  {
    Object localObject = n.a.c(p, p).a(t, t).c(u, u).c(e, e).c(o, o);
    int i = s;
    int j = s;
    j0.a.getClass();
    n localn = ((n)localObject).b(Integer.valueOf(i), Integer.valueOf(j), o0.a).c(x, x).c(y, y);
    localObject = localn;
    if (x)
    {
      localObject = localn;
      if (y) {
        localObject = localn.a(z, z);
      }
    }
    return ((n)localObject).e();
  }
  
  public static int i(i parami1, i parami2)
  {
    k0 localk01;
    if ((e) && (p)) {
      localk01 = f.j;
    } else {
      localk01 = f.j.a();
    }
    n.a locala = n.a;
    int i = q;
    int j = q;
    k0 localk02;
    if (f.E) {
      localk02 = f.j.a();
    } else {
      localk02 = f.k;
    }
    return locala.b(Integer.valueOf(i), Integer.valueOf(j), localk02).b(Integer.valueOf(r), Integer.valueOf(r), localk01).b(Integer.valueOf(q), Integer.valueOf(q), localk01).e();
  }
  
  public final int f()
  {
    return w;
  }
  
  public final boolean g(f.h paramh)
  {
    paramh = (i)paramh;
    boolean bool;
    if (((!v) && (!e0.a(d.t, d.t))) || ((!f.m0) && ((x != x) || (y != y)))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     r5.f.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */