package v3;

import l3.l;
import o4.p.b;
import v5.o;
import w3.a0;
import x6.b;
import z3.a;
import z3.g;
import z4.c0;

public abstract class f
  implements j1, k1
{
  public final int a;
  public final l b;
  public l1 c;
  public int d;
  public a0 e;
  public int f;
  public c0 o;
  public i0[] p;
  public long q;
  public long r;
  public boolean s;
  public boolean t;
  
  public f(int paramInt)
  {
    a = paramInt;
    b = new l(1);
    r = Long.MIN_VALUE;
  }
  
  public final n A(p.b paramb, i0 parami0)
  {
    return z(4002, parami0, paramb, false);
  }
  
  public abstract void B();
  
  public void C(boolean paramBoolean1, boolean paramBoolean2) {}
  
  public abstract void D(long paramLong, boolean paramBoolean);
  
  public void E() {}
  
  public void F() {}
  
  public void G() {}
  
  public abstract void H(i0[] paramArrayOfi0, long paramLong1, long paramLong2);
  
  public final int I(l paraml, g paramg, int paramInt)
  {
    Object localObject = o;
    localObject.getClass();
    int i = ((c0)localObject).r(paraml, paramg, paramInt);
    paramInt = -4;
    if (i == -4)
    {
      if (paramg.m(4))
      {
        r = Long.MIN_VALUE;
        if (!s) {
          paramInt = -3;
        }
        return paramInt;
      }
      long l = e + q;
      e = l;
      r = Math.max(r, l);
    }
    else if (i == -5)
    {
      localObject = (i0)b;
      localObject.getClass();
      if (x != Long.MAX_VALUE)
      {
        paramg = ((i0)localObject).a();
        o = (x + q);
        b = paramg.a();
      }
    }
    return i;
  }
  
  public final int e()
  {
    return f;
  }
  
  public final void g()
  {
    int i = f;
    boolean bool = true;
    if (i != 1) {
      bool = false;
    }
    b.H(bool);
    l locall = b;
    a = null;
    b = null;
    f = 0;
    o = null;
    p = null;
    s = false;
    B();
  }
  
  public final boolean h()
  {
    boolean bool;
    if (r == Long.MIN_VALUE) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void i(int paramInt, a0 parama0)
  {
    d = paramInt;
    e = parama0;
  }
  
  public final void j()
  {
    s = true;
  }
  
  public final f k()
  {
    return this;
  }
  
  public final void n(i0[] paramArrayOfi0, c0 paramc0, long paramLong1, long paramLong2)
  {
    b.H(s ^ true);
    o = paramc0;
    if (r == Long.MIN_VALUE) {
      r = paramLong1;
    }
    p = paramArrayOfi0;
    q = paramLong2;
    H(paramArrayOfi0, paramLong1, paramLong2);
  }
  
  public int o()
  {
    return 0;
  }
  
  public void q(int paramInt, Object paramObject) {}
  
  public final c0 r()
  {
    return o;
  }
  
  public final void reset()
  {
    boolean bool;
    if (f == 0) {
      bool = true;
    } else {
      bool = false;
    }
    b.H(bool);
    l locall = b;
    a = null;
    b = null;
    E();
  }
  
  public final void s()
  {
    c0 localc0 = o;
    localc0.getClass();
    localc0.a();
  }
  
  public final void start()
  {
    int i = f;
    boolean bool = true;
    if (i != 1) {
      bool = false;
    }
    b.H(bool);
    f = 2;
    F();
  }
  
  public final void stop()
  {
    boolean bool;
    if (f == 2) {
      bool = true;
    } else {
      bool = false;
    }
    b.H(bool);
    f = 1;
    G();
  }
  
  public final long t()
  {
    return r;
  }
  
  public final void u(long paramLong)
  {
    s = false;
    r = paramLong;
    D(paramLong, false);
  }
  
  public final boolean v()
  {
    return s;
  }
  
  public o w()
  {
    return null;
  }
  
  public final int x()
  {
    return a;
  }
  
  public final void y(l1 paraml1, i0[] paramArrayOfi0, c0 paramc0, long paramLong1, boolean paramBoolean1, boolean paramBoolean2, long paramLong2, long paramLong3)
  {
    boolean bool;
    if (f == 0) {
      bool = true;
    } else {
      bool = false;
    }
    b.H(bool);
    c = paraml1;
    f = 1;
    C(paramBoolean1, paramBoolean2);
    n(paramArrayOfi0, paramc0, paramLong2, paramLong3);
    s = false;
    r = paramLong1;
    D(paramLong1, paramBoolean1);
  }
  
  /* Error */
  public final n z(int paramInt, i0 parami0, Exception paramException, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_2
    //   1: ifnull +54 -> 55
    //   4: aload_0
    //   5: getfield 177	v3/f:t	Z
    //   8: ifne +47 -> 55
    //   11: aload_0
    //   12: iconst_1
    //   13: putfield 177	v3/f:t	Z
    //   16: aload_0
    //   17: aload_2
    //   18: invokeinterface 180 2 0
    //   23: istore 5
    //   25: iload 5
    //   27: bipush 7
    //   29: iand
    //   30: istore 5
    //   32: aload_0
    //   33: iconst_0
    //   34: putfield 177	v3/f:t	Z
    //   37: goto +21 -> 58
    //   40: astore_2
    //   41: aload_0
    //   42: iconst_0
    //   43: putfield 177	v3/f:t	Z
    //   46: aload_2
    //   47: athrow
    //   48: astore 6
    //   50: aload_0
    //   51: iconst_0
    //   52: putfield 177	v3/f:t	Z
    //   55: iconst_4
    //   56: istore 5
    //   58: aload_0
    //   59: invokeinterface 184 1 0
    //   64: astore 6
    //   66: aload_0
    //   67: getfield 134	v3/f:d	I
    //   70: istore 7
    //   72: aload_2
    //   73: ifnonnull +9 -> 82
    //   76: iconst_4
    //   77: istore 5
    //   79: goto +3 -> 82
    //   82: new 175	v3/n
    //   85: dup
    //   86: iconst_1
    //   87: aload_3
    //   88: iload_1
    //   89: aload 6
    //   91: iload 7
    //   93: aload_2
    //   94: iload 5
    //   96: iload 4
    //   98: invokespecial 187	v3/n:<init>	(ILjava/lang/Throwable;ILjava/lang/String;ILv3/i0;IZ)V
    //   101: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	102	0	this	f
    //   0	102	1	paramInt	int
    //   0	102	2	parami0	i0
    //   0	102	3	paramException	Exception
    //   0	102	4	paramBoolean	boolean
    //   23	72	5	i	int
    //   48	1	6	localn	n
    //   64	26	6	str	String
    //   70	22	7	j	int
    // Exception table:
    //   from	to	target	type
    //   16	25	40	finally
    //   16	25	48	v3/n
  }
}

/* Location:
 * Qualified Name:     v3.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */