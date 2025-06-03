package w3;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Arrays;
import v3.c1;
import v3.f1;
import v3.r1;
import v5.h;
import w5.o;
import z3.e;
import z4.q;
import z4.t.b;

public abstract interface b
{
  public abstract void A();
  
  public abstract void A0();
  
  @Deprecated
  public abstract void B();
  
  public abstract void B0();
  
  public abstract void C();
  
  public abstract void C0();
  
  @Deprecated
  public abstract void D();
  
  public abstract void D0();
  
  public abstract void E();
  
  public abstract void E0();
  
  public abstract void F();
  
  @Deprecated
  public abstract void F0();
  
  public abstract void G();
  
  public abstract void G0();
  
  public abstract void H();
  
  @Deprecated
  public abstract void H0();
  
  public abstract void I();
  
  public abstract void I0();
  
  public abstract void J(f1 paramf1, b paramb);
  
  public abstract void K();
  
  public abstract void L();
  
  public abstract void M();
  
  public abstract void N();
  
  public abstract void O();
  
  public abstract void P(a parama, int paramInt, long paramLong);
  
  public abstract void Q();
  
  @Deprecated
  public abstract void R();
  
  public abstract void S();
  
  @Deprecated
  public abstract void T();
  
  public abstract void U();
  
  public abstract void V();
  
  public abstract void W();
  
  public abstract void X();
  
  public abstract void Y();
  
  @Deprecated
  public abstract void Z();
  
  public abstract void a(e parame);
  
  public abstract void a0();
  
  public abstract void b(o paramo);
  
  public abstract void b0();
  
  public abstract void c();
  
  public abstract void c0();
  
  public abstract void d(int paramInt);
  
  @Deprecated
  public abstract void d0();
  
  public abstract void e();
  
  public abstract void e0(c1 paramc1);
  
  @Deprecated
  public abstract void f();
  
  public abstract void f0();
  
  public abstract void g0(q paramq);
  
  public abstract void h();
  
  public abstract void h0();
  
  public abstract void i0();
  
  public abstract void j0();
  
  public abstract void k0();
  
  @Deprecated
  public abstract void l0();
  
  public abstract void m();
  
  public abstract void m0();
  
  public abstract void n0(a parama, q paramq);
  
  @Deprecated
  public abstract void o();
  
  public abstract void o0();
  
  public abstract void p0();
  
  @Deprecated
  public abstract void q();
  
  @Deprecated
  public abstract void q0();
  
  @Deprecated
  public abstract void r0();
  
  public abstract void s0();
  
  public abstract void t0();
  
  public abstract void u0();
  
  public abstract void v0();
  
  public abstract void w0();
  
  @Deprecated
  public abstract void x();
  
  public abstract void x0();
  
  public abstract void y();
  
  public abstract void y0();
  
  @Deprecated
  public abstract void z();
  
  public abstract void z0();
  
  public static final class a
  {
    public final long a;
    public final r1 b;
    public final int c;
    public final t.b d;
    public final long e;
    public final r1 f;
    public final int g;
    public final t.b h;
    public final long i;
    public final long j;
    
    public a(long paramLong1, r1 paramr11, int paramInt1, t.b paramb1, long paramLong2, r1 paramr12, int paramInt2, t.b paramb2, long paramLong3, long paramLong4)
    {
      a = paramLong1;
      b = paramr11;
      c = paramInt1;
      d = paramb1;
      e = paramLong2;
      f = paramr12;
      g = paramInt2;
      h = paramb2;
      i = paramLong3;
      j = paramLong4;
    }
    
    public final boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if ((paramObject != null) && (a.class == paramObject.getClass()))
      {
        paramObject = (a)paramObject;
        if ((a != a) || (c != c) || (e != e) || (g != g) || (i != i) || (j != j) || (!x6.b.Q(b, b)) || (!x6.b.Q(d, d)) || (!x6.b.Q(f, f)) || (!x6.b.Q(h, h))) {
          bool = false;
        }
        return bool;
      }
      return false;
    }
    
    public final int hashCode()
    {
      return Arrays.hashCode(new Object[] { Long.valueOf(a), b, Integer.valueOf(c), d, Long.valueOf(e), f, Integer.valueOf(g), h, Long.valueOf(i), Long.valueOf(j) });
    }
  }
  
  public static final class b
  {
    public final h a;
    public final SparseArray<b.a> b;
    
    public b(h paramh, SparseArray<b.a> paramSparseArray)
    {
      a = paramh;
      SparseArray localSparseArray = new SparseArray(paramh.b());
      for (int i = 0; i < paramh.b(); i++)
      {
        int j = paramh.a(i);
        b.a locala = (b.a)paramSparseArray.get(j);
        locala.getClass();
        localSparseArray.append(j, locala);
      }
      b = localSparseArray;
    }
    
    public final boolean a(int paramInt)
    {
      return a.a.get(paramInt);
    }
  }
}

/* Location:
 * Qualified Name:     w3.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */