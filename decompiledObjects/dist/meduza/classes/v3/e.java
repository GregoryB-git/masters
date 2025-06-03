package v3;

import android.util.SparseBooleanArray;
import java.util.ArrayList;
import v5.h;
import z4.s;

public abstract class e
  implements f1
{
  public final r1.c a = new r1.c();
  
  public final boolean A()
  {
    d0 locald0 = (d0)this;
    r1 localr1 = locald0.J();
    boolean bool;
    if ((!localr1.p()) && (mFa).p)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean C()
  {
    boolean bool;
    if (e() != -1) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean D()
  {
    d0 locald0 = (d0)this;
    boolean bool;
    if ((locald0.d() == 3) && (locald0.k()) && (locald0.I() == 0)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean G(int paramInt)
  {
    d0 locald0 = (d0)this;
    locald0.u0();
    return N.a.a.get(paramInt);
  }
  
  public final boolean H()
  {
    d0 locald0 = (d0)this;
    r1 localr1 = locald0.J();
    boolean bool;
    if ((!localr1.p()) && (mFa).q)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void M()
  {
    d0 locald0 = (d0)this;
    if ((!locald0.J().p()) && (!locald0.g())) {
      if (C())
      {
        int i = e();
        if (i != -1) {
          if (i == locald0.F()) {
            S(locald0.F(), -9223372036854775807L, true);
          } else {
            U(i, 9);
          }
        }
      }
      else if ((Q()) && (H()))
      {
        U(locald0.F(), 9);
      }
    }
  }
  
  public final void N()
  {
    d0 locald0 = (d0)this;
    locald0.u0();
    V(12, v);
  }
  
  public final void O()
  {
    d0 locald0 = (d0)this;
    locald0.u0();
    V(11, -u);
  }
  
  public final boolean Q()
  {
    d0 locald0 = (d0)this;
    r1 localr1 = locald0.J();
    boolean bool;
    if ((!localr1.p()) && (localr1.m(locald0.F(), a).a())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final int R()
  {
    d0 locald0 = (d0)this;
    r1 localr1 = locald0.J();
    int i;
    if (localr1.p())
    {
      i = -1;
    }
    else
    {
      int j = locald0.F();
      locald0.u0();
      int k = F;
      i = k;
      if (k == 1) {
        i = 0;
      }
      locald0.u0();
      i = localr1.k(j, i, G);
    }
    return i;
  }
  
  public abstract void S(int paramInt, long paramLong, boolean paramBoolean);
  
  public final void T(int paramInt, long paramLong)
  {
    S(((d0)this).F(), paramLong, false);
  }
  
  public final void U(int paramInt1, int paramInt2)
  {
    S(paramInt1, -9223372036854775807L, false);
  }
  
  public final void V(int paramInt, long paramLong)
  {
    d0 locald0 = (d0)this;
    long l1 = locald0.P() + paramLong;
    long l2 = locald0.getDuration();
    paramLong = l1;
    if (l2 != -9223372036854775807L) {
      paramLong = Math.min(l1, l2);
    }
    T(paramInt, Math.max(paramLong, 0L));
  }
  
  public final void W()
  {
    int i = R();
    if (i == -1) {
      return;
    }
    d0 locald0 = (d0)this;
    if (i == locald0.F()) {
      S(locald0.F(), -9223372036854775807L, true);
    } else {
      U(i, 7);
    }
  }
  
  public final void b()
  {
    ((d0)this).m0(true);
  }
  
  public final int e()
  {
    d0 locald0 = (d0)this;
    r1 localr1 = locald0.J();
    int i;
    if (localr1.p())
    {
      i = -1;
    }
    else
    {
      int j = locald0.F();
      locald0.u0();
      int k = F;
      i = k;
      if (k == 1) {
        i = 0;
      }
      locald0.u0();
      i = localr1.e(j, i, G);
    }
    return i;
  }
  
  public final void j(int paramInt, long paramLong)
  {
    S(paramInt, paramLong, false);
  }
  
  public final void l()
  {
    d0 locald0 = (d0)this;
    locald0.u0();
    int i = o.size();
    int j = Math.min(Integer.MAX_VALUE, i);
    if ((i > 0) && (j != 0))
    {
      d1 locald1 = locald0.i0(j);
      locald0.s0(locald1, 0, 1, false, b.a.equals(e0.b.a) ^ true, 4, locald0.a0(locald1), -1, false);
    }
  }
  
  public final o0 m()
  {
    Object localObject = (d0)this;
    r1 localr1 = ((d0)localObject).J();
    if (localr1.p()) {
      localObject = null;
    } else {
      localObject = mFa).c;
    }
    return (o0)localObject;
  }
  
  public final void pause()
  {
    ((d0)this).m0(false);
  }
  
  public final boolean q()
  {
    boolean bool;
    if (R() != -1) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void t()
  {
    d0 locald0 = (d0)this;
    if ((!locald0.J().p()) && (!locald0.g()))
    {
      boolean bool = q();
      if ((Q()) && (!A()))
      {
        if (!bool) {
          return;
        }
      }
      else
      {
        if (!bool) {
          break label79;
        }
        long l = locald0.P();
        locald0.u0();
        if (l > 3000L) {
          break label79;
        }
      }
      W();
      return;
      label79:
      T(7, 0L);
    }
  }
  
  public final void w(int paramInt)
  {
    U(paramInt, 10);
  }
}

/* Location:
 * Qualified Name:     v3.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */