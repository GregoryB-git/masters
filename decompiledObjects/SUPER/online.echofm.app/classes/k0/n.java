package k0;

import d0.I;
import d0.q;
import d0.q.b;
import g0.M;
import g0.c;
import j0.i;
import l0.y1;
import x0.Q;
import x0.x.b;

public abstract class n
  implements Y0, a1
{
  public long A;
  public boolean B;
  public boolean C;
  public I D;
  public a1.a E;
  public final Object o = new Object();
  public final int p;
  public final v0 q;
  public b1 r;
  public int s;
  public y1 t;
  public c u;
  public int v;
  public Q w;
  public q[] x;
  public long y;
  public long z;
  
  public n(int paramInt)
  {
    p = paramInt;
    q = new v0();
    A = Long.MIN_VALUE;
    D = I.a;
  }
  
  public final boolean A()
  {
    return B;
  }
  
  public A0 B()
  {
    return null;
  }
  
  public final void C(b1 paramb1, q[] paramArrayOfq, Q paramQ, long paramLong1, boolean paramBoolean1, boolean paramBoolean2, long paramLong2, long paramLong3, x.b paramb)
  {
    boolean bool;
    if (v == 0) {
      bool = true;
    } else {
      bool = false;
    }
    g0.a.f(bool);
    r = paramb1;
    v = 1;
    U(paramBoolean1, paramBoolean2);
    F(paramArrayOfq, paramQ, paramLong2, paramLong3, paramb);
    f0(paramLong2, paramBoolean1);
  }
  
  public final void D(int paramInt, y1 paramy1, c paramc)
  {
    s = paramInt;
    t = paramy1;
    u = paramc;
    V();
  }
  
  public final void E(I paramI)
  {
    if (!M.c(D, paramI))
    {
      D = paramI;
      d0(paramI);
    }
  }
  
  public final void F(q[] paramArrayOfq, Q paramQ, long paramLong1, long paramLong2, x.b paramb)
  {
    g0.a.f(B ^ true);
    w = paramQ;
    if (A == Long.MIN_VALUE) {
      A = paramLong1;
    }
    x = paramArrayOfq;
    y = paramLong2;
    c0(paramArrayOfq, paramLong1, paramLong2, paramb);
  }
  
  public final a1 G()
  {
    return this;
  }
  
  public final u J(Throwable paramThrowable, q paramq, int paramInt)
  {
    return K(paramThrowable, paramq, false, paramInt);
  }
  
  /* Error */
  public final u K(Throwable paramThrowable, q paramq, boolean paramBoolean, int paramInt)
  {
    // Byte code:
    //   0: aload_2
    //   1: ifnull +50 -> 51
    //   4: aload_0
    //   5: getfield 137	k0/n:C	Z
    //   8: ifne +43 -> 51
    //   11: aload_0
    //   12: iconst_1
    //   13: putfield 137	k0/n:C	Z
    //   16: aload_0
    //   17: aload_2
    //   18: invokeinterface 140 2 0
    //   23: invokestatic 146	k0/Z0:h	(I)I
    //   26: istore 5
    //   28: aload_0
    //   29: iconst_0
    //   30: putfield 137	k0/n:C	Z
    //   33: goto +24 -> 57
    //   36: astore_1
    //   37: aload_0
    //   38: iconst_0
    //   39: putfield 137	k0/n:C	Z
    //   42: aload_1
    //   43: athrow
    //   44: astore 6
    //   46: aload_0
    //   47: iconst_0
    //   48: putfield 137	k0/n:C	Z
    //   51: iconst_4
    //   52: istore 5
    //   54: goto -21 -> 33
    //   57: aload_1
    //   58: aload_0
    //   59: invokeinterface 150 1 0
    //   64: aload_0
    //   65: invokevirtual 154	k0/n:O	()I
    //   68: aload_2
    //   69: iload 5
    //   71: iload_3
    //   72: iload 4
    //   74: invokestatic 158	k0/u:b	(Ljava/lang/Throwable;Ljava/lang/String;ILd0/q;IZI)Lk0/u;
    //   77: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	78	0	this	n
    //   0	78	1	paramThrowable	Throwable
    //   0	78	2	paramq	q
    //   0	78	3	paramBoolean	boolean
    //   0	78	4	paramInt	int
    //   26	44	5	i	int
    //   44	1	6	localu	u
    // Exception table:
    //   from	to	target	type
    //   16	28	36	finally
    //   16	28	44	k0/u
  }
  
  public final c L()
  {
    return (c)g0.a.e(u);
  }
  
  public final b1 M()
  {
    return (b1)g0.a.e(r);
  }
  
  public final v0 N()
  {
    q.a();
    return q;
  }
  
  public final int O()
  {
    return s;
  }
  
  public final long P()
  {
    return z;
  }
  
  public final y1 Q()
  {
    return (y1)g0.a.e(t);
  }
  
  public final q[] R()
  {
    return (q[])g0.a.e(x);
  }
  
  public final boolean S()
  {
    boolean bool;
    if (p()) {
      bool = B;
    } else {
      bool = ((Q)g0.a.e(w)).e();
    }
    return bool;
  }
  
  public abstract void T();
  
  public void U(boolean paramBoolean1, boolean paramBoolean2) {}
  
  public void V() {}
  
  public abstract void W(long paramLong, boolean paramBoolean);
  
  public void X() {}
  
  public final void Y()
  {
    synchronized (o)
    {
      a1.a locala = E;
      if (locala != null) {
        locala.a(this);
      }
      return;
    }
  }
  
  public void Z() {}
  
  public void a0() {}
  
  public final void b()
  {
    boolean bool;
    if (v == 0) {
      bool = true;
    } else {
      bool = false;
    }
    g0.a.f(bool);
    q.a();
    Z();
  }
  
  public void b0() {}
  
  public void c0(q[] paramArrayOfq, long paramLong1, long paramLong2, x.b paramb) {}
  
  public void d0(I paramI) {}
  
  public final int e0(v0 paramv0, i parami, int paramInt)
  {
    int i = ((Q)g0.a.e(w)).j(paramv0, parami, paramInt);
    paramInt = -4;
    if (i == -4)
    {
      if (parami.p())
      {
        A = Long.MIN_VALUE;
        if (!B) {
          paramInt = -3;
        }
        return paramInt;
      }
      long l = t + y;
      t = l;
      A = Math.max(A, l);
    }
    else if (i == -5)
    {
      parami = (q)g0.a.e(b);
      if (s != Long.MAX_VALUE) {
        b = parami.a().s0(s + y).K();
      }
    }
    return i;
  }
  
  public final void f0(long paramLong, boolean paramBoolean)
  {
    B = false;
    z = paramLong;
    A = paramLong;
    W(paramLong, paramBoolean);
  }
  
  public final void g()
  {
    int i = v;
    boolean bool = true;
    if (i != 1) {
      bool = false;
    }
    g0.a.f(bool);
    q.a();
    v = 0;
    w = null;
    x = null;
    B = false;
    T();
  }
  
  public int g0(long paramLong)
  {
    return ((Q)g0.a.e(w)).m(paramLong - y);
  }
  
  public final int getState()
  {
    return v;
  }
  
  public final Q i()
  {
    return w;
  }
  
  public final int l()
  {
    return p;
  }
  
  public final void o()
  {
    synchronized (o)
    {
      E = null;
      return;
    }
  }
  
  public final boolean p()
  {
    boolean bool;
    if (A == Long.MIN_VALUE) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void release()
  {
    boolean bool;
    if (v == 0) {
      bool = true;
    } else {
      bool = false;
    }
    g0.a.f(bool);
    X();
  }
  
  public int s()
  {
    return 0;
  }
  
  public final void start()
  {
    int i = v;
    boolean bool = true;
    if (i != 1) {
      bool = false;
    }
    g0.a.f(bool);
    v = 2;
    a0();
  }
  
  public final void stop()
  {
    boolean bool;
    if (v == 2) {
      bool = true;
    } else {
      bool = false;
    }
    g0.a.f(bool);
    v = 1;
    b0();
  }
  
  public void t(int paramInt, Object paramObject) {}
  
  public final void u()
  {
    B = true;
  }
  
  public final void v()
  {
    ((Q)g0.a.e(w)).a();
  }
  
  public final long w()
  {
    return A;
  }
  
  public final void x(a1.a parama)
  {
    synchronized (o)
    {
      E = parama;
      return;
    }
  }
  
  public final void z(long paramLong)
  {
    f0(paramLong, false);
  }
}

/* Location:
 * Qualified Name:     k0.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */