package k0;

import android.os.Looper;
import d0.I;
import g0.a;
import g0.c;

public final class V0
{
  public final b a;
  public final a b;
  public final c c;
  public final I d;
  public int e;
  public Object f;
  public Looper g;
  public int h;
  public long i;
  public boolean j;
  public boolean k;
  public boolean l;
  public boolean m;
  public boolean n;
  
  public V0(a parama, b paramb, I paramI, int paramInt, c paramc, Looper paramLooper)
  {
    b = parama;
    a = paramb;
    d = paramI;
    g = paramLooper;
    c = paramc;
    h = paramInt;
    i = -9223372036854775807L;
    j = true;
  }
  
  /* Error */
  public boolean a(long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 58	k0/V0:k	Z
    //   6: invokestatic 63	g0/a:f	(Z)V
    //   9: aload_0
    //   10: getfield 44	k0/V0:g	Landroid/os/Looper;
    //   13: invokevirtual 69	android/os/Looper:getThread	()Ljava/lang/Thread;
    //   16: invokestatic 74	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   19: if_acmpeq +8 -> 27
    //   22: iconst_1
    //   23: istore_3
    //   24: goto +5 -> 29
    //   27: iconst_0
    //   28: istore_3
    //   29: iload_3
    //   30: invokestatic 63	g0/a:f	(Z)V
    //   33: aload_0
    //   34: getfield 46	k0/V0:c	Lg0/c;
    //   37: invokeinterface 79 1 0
    //   42: lstore 4
    //   44: lload_1
    //   45: lstore 6
    //   47: aload_0
    //   48: getfield 81	k0/V0:m	Z
    //   51: istore_3
    //   52: iload_3
    //   53: ifne +49 -> 102
    //   56: lload 6
    //   58: lconst_0
    //   59: lcmp
    //   60: ifle +42 -> 102
    //   63: aload_0
    //   64: getfield 46	k0/V0:c	Lg0/c;
    //   67: invokeinterface 83 1 0
    //   72: aload_0
    //   73: lload 6
    //   75: invokevirtual 87	java/lang/Object:wait	(J)V
    //   78: lload 4
    //   80: lload_1
    //   81: ladd
    //   82: aload_0
    //   83: getfield 46	k0/V0:c	Lg0/c;
    //   86: invokeinterface 79 1 0
    //   91: lsub
    //   92: lstore 6
    //   94: goto -47 -> 47
    //   97: astore 8
    //   99: goto +31 -> 130
    //   102: iload_3
    //   103: ifeq +12 -> 115
    //   106: aload_0
    //   107: getfield 89	k0/V0:l	Z
    //   110: istore_3
    //   111: aload_0
    //   112: monitorexit
    //   113: iload_3
    //   114: ireturn
    //   115: new 91	java/util/concurrent/TimeoutException
    //   118: astore 8
    //   120: aload 8
    //   122: ldc 93
    //   124: invokespecial 96	java/util/concurrent/TimeoutException:<init>	(Ljava/lang/String;)V
    //   127: aload 8
    //   129: athrow
    //   130: aload_0
    //   131: monitorexit
    //   132: aload 8
    //   134: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	135	0	this	V0
    //   0	135	1	paramLong	long
    //   23	91	3	bool	boolean
    //   42	37	4	l1	long
    //   45	48	6	l2	long
    //   97	1	8	localObject	Object
    //   118	15	8	localTimeoutException	java.util.concurrent.TimeoutException
    // Exception table:
    //   from	to	target	type
    //   2	22	97	finally
    //   29	44	97	finally
    //   47	52	97	finally
    //   63	94	97	finally
    //   106	111	97	finally
    //   115	130	97	finally
  }
  
  public boolean b()
  {
    return j;
  }
  
  public Looper c()
  {
    return g;
  }
  
  public int d()
  {
    return h;
  }
  
  public Object e()
  {
    return f;
  }
  
  public long f()
  {
    return i;
  }
  
  public b g()
  {
    return a;
  }
  
  public I h()
  {
    return d;
  }
  
  public int i()
  {
    return e;
  }
  
  public boolean j()
  {
    try
    {
      boolean bool = n;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void k(boolean paramBoolean)
  {
    try
    {
      l = (paramBoolean | l);
      m = true;
      notifyAll();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public V0 l()
  {
    a.f(k ^ true);
    if (i == -9223372036854775807L) {
      a.a(j);
    }
    k = true;
    b.c(this);
    return this;
  }
  
  public V0 m(Object paramObject)
  {
    a.f(k ^ true);
    f = paramObject;
    return this;
  }
  
  public V0 n(int paramInt)
  {
    a.f(k ^ true);
    e = paramInt;
    return this;
  }
  
  public static abstract interface a
  {
    public abstract void c(V0 paramV0);
  }
  
  public static abstract interface b
  {
    public abstract void t(int paramInt, Object paramObject);
  }
}

/* Location:
 * Qualified Name:     k0.V0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */