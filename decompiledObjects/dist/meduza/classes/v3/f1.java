package v3;

import android.os.Looper;
import android.util.SparseBooleanArray;
import h5.c;
import java.util.Arrays;
import java.util.List;
import v5.e0;
import v5.h;
import v5.h.a;
import w5.o;
import x3.d;
import x6.b;

public abstract interface f1
{
  public abstract boolean A();
  
  public abstract s1 B();
  
  public abstract boolean C();
  
  public abstract boolean D();
  
  public abstract int E();
  
  public abstract int F();
  
  public abstract boolean G(int paramInt);
  
  public abstract boolean H();
  
  public abstract int I();
  
  public abstract r1 J();
  
  public abstract Looper K();
  
  public abstract boolean L();
  
  public abstract void M();
  
  public abstract void N();
  
  public abstract void O();
  
  public abstract long P();
  
  public abstract boolean Q();
  
  public abstract void a();
  
  public abstract void b();
  
  public abstract void c(e1 parame1);
  
  public abstract int d();
  
  public abstract e1 f();
  
  public abstract boolean g();
  
  public abstract long getDuration();
  
  public abstract void h(c paramc);
  
  public abstract long i();
  
  public abstract void j(int paramInt, long paramLong);
  
  public abstract boolean k();
  
  public abstract void l();
  
  public abstract o0 m();
  
  public abstract void n(boolean paramBoolean);
  
  @Deprecated
  public abstract void o(boolean paramBoolean);
  
  public abstract int p();
  
  public abstract void pause();
  
  public abstract boolean q();
  
  public abstract int r();
  
  public abstract void s(c paramc);
  
  public abstract void stop();
  
  public abstract void t();
  
  public abstract void u(int paramInt);
  
  public abstract c1 v();
  
  public abstract void w(int paramInt);
  
  public abstract int x();
  
  public abstract long y();
  
  public abstract long z();
  
  public static final class a
    implements g
  {
    public final h a;
    
    static
    {
      SparseBooleanArray localSparseBooleanArray = new SparseBooleanArray();
      b.H(0x0 ^ 0x1);
      new h(localSparseBooleanArray);
      e0.E(0);
    }
    
    public a(h paramh)
    {
      a = paramh;
    }
    
    public final boolean equals(Object paramObject)
    {
      if (this == paramObject) {
        return true;
      }
      if (!(paramObject instanceof a)) {
        return false;
      }
      paramObject = (a)paramObject;
      return a.equals(a);
    }
    
    public final int hashCode()
    {
      return a.hashCode();
    }
    
    public static final class a
    {
      public final h.a a = new h.a();
      
      public final void a(int paramInt, boolean paramBoolean)
      {
        h.a locala = a;
        if (paramBoolean) {
          locala.a(paramInt);
        } else {
          locala.getClass();
        }
      }
    }
  }
  
  public static final class b
  {
    public final h a;
    
    public b(h paramh)
    {
      a = paramh;
    }
    
    public final boolean a(int... paramVarArgs)
    {
      h localh = a;
      localh.getClass();
      int i = paramVarArgs.length;
      boolean bool1 = false;
      boolean bool2;
      for (int j = 0;; j++)
      {
        bool2 = bool1;
        if (j >= i) {
          break;
        }
        int k = paramVarArgs[j];
        if (a.get(k))
        {
          bool2 = true;
          break;
        }
      }
      return bool2;
    }
    
    public final boolean equals(Object paramObject)
    {
      if (this == paramObject) {
        return true;
      }
      if (!(paramObject instanceof b)) {
        return false;
      }
      paramObject = (b)paramObject;
      return a.equals(a);
    }
    
    public final int hashCode()
    {
      return a.hashCode();
    }
  }
  
  public static abstract interface c
  {
    @Deprecated
    public abstract void D(boolean paramBoolean);
    
    public abstract void F(f1.a parama);
    
    public abstract void G(int paramInt, f1.d paramd1, f1.d paramd2);
    
    public abstract void I(boolean paramBoolean);
    
    public abstract void K(int paramInt, boolean paramBoolean);
    
    public abstract void L(float paramFloat);
    
    public abstract void N(int paramInt);
    
    public abstract void R(p0 paramp0);
    
    public abstract void T(boolean paramBoolean);
    
    public abstract void W(int paramInt, boolean paramBoolean);
    
    public abstract void X(n paramn);
    
    public abstract void Y(r1 paramr1, int paramInt);
    
    public abstract void Z(s1 params1);
    
    public abstract void a0(n paramn);
    
    public abstract void b(o paramo);
    
    @Deprecated
    public abstract void b0(int paramInt, boolean paramBoolean);
    
    public abstract void c0(e1 parame1);
    
    @Deprecated
    public abstract void d(int paramInt);
    
    public abstract void d0(d paramd);
    
    public abstract void e0(f1 paramf1, f1.b paramb);
    
    @Deprecated
    public abstract void f();
    
    public abstract void j(c paramc);
    
    public abstract void k0(o0 paramo0, int paramInt);
    
    public abstract void l0(m paramm);
    
    public abstract void m();
    
    public abstract void m0(int paramInt1, int paramInt2);
    
    public abstract void o(boolean paramBoolean);
    
    public abstract void p0(boolean paramBoolean);
    
    public abstract void q(int paramInt);
    
    @Deprecated
    public abstract void r(List<h5.a> paramList);
    
    public abstract void w(p4.a parama);
    
    public abstract void x(int paramInt);
  }
  
  public static final class d
    implements g
  {
    public final Object a;
    public final int b;
    public final o0 c;
    public final Object d;
    public final int e;
    public final long f;
    public final long o;
    public final int p;
    public final int q;
    
    static
    {
      e0.E(0);
      e0.E(1);
      e0.E(2);
      e0.E(3);
      e0.E(4);
      e0.E(5);
      e0.E(6);
    }
    
    public d(Object paramObject1, int paramInt1, o0 paramo0, Object paramObject2, int paramInt2, long paramLong1, long paramLong2, int paramInt3, int paramInt4)
    {
      a = paramObject1;
      b = paramInt1;
      c = paramo0;
      d = paramObject2;
      e = paramInt2;
      f = paramLong1;
      o = paramLong2;
      p = paramInt3;
      q = paramInt4;
    }
    
    public final boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if ((paramObject != null) && (d.class == paramObject.getClass()))
      {
        paramObject = (d)paramObject;
        if ((b != b) || (e != e) || (f != f) || (o != o) || (p != p) || (q != q) || (!b.Q(a, a)) || (!b.Q(d, d)) || (!b.Q(c, c))) {
          bool = false;
        }
        return bool;
      }
      return false;
    }
    
    public final int hashCode()
    {
      return Arrays.hashCode(new Object[] { a, Integer.valueOf(b), c, d, Integer.valueOf(e), Long.valueOf(f), Long.valueOf(o), Integer.valueOf(p), Integer.valueOf(q) });
    }
  }
}

/* Location:
 * Qualified Name:     v3.f1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */