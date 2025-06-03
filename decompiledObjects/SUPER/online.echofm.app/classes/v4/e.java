package v4;

import java.util.concurrent.TimeUnit;
import s4.q;

public class e
{
  public static final long d = TimeUnit.HOURS.toMillis(24L);
  public static final long e = TimeUnit.MINUTES.toMillis(30L);
  public final q a = q.c();
  public long b;
  public int c;
  
  public static boolean c(int paramInt)
  {
    boolean bool;
    if ((paramInt != 429) && ((paramInt < 500) || (paramInt >= 600))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static boolean d(int paramInt)
  {
    boolean bool;
    if (((paramInt < 200) || (paramInt >= 300)) && (paramInt != 401) && (paramInt != 404)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public final long a(int paramInt)
  {
    label59:
    try
    {
      if (!c(paramInt))
      {
        l = d;
        return l;
      }
    }
    finally
    {
      break label59;
      double d1 = Math.min(Math.pow(2.0D, c) + a.e(), e);
      long l = d1;
      return l;
    }
  }
  
  /* Error */
  public boolean b()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 54	v4/e:c	I
    //   6: ifeq +36 -> 42
    //   9: aload_0
    //   10: getfield 46	v4/e:a	Ls4/q;
    //   13: invokevirtual 69	s4/q:a	()J
    //   16: lstore_1
    //   17: aload_0
    //   18: getfield 71	v4/e:b	J
    //   21: lstore_3
    //   22: lload_1
    //   23: lload_3
    //   24: lcmp
    //   25: ifle +6 -> 31
    //   28: goto +14 -> 42
    //   31: iconst_0
    //   32: istore 5
    //   34: goto +11 -> 45
    //   37: astore 6
    //   39: goto +11 -> 50
    //   42: iconst_1
    //   43: istore 5
    //   45: aload_0
    //   46: monitorexit
    //   47: iload 5
    //   49: ireturn
    //   50: aload_0
    //   51: monitorexit
    //   52: aload 6
    //   54: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	55	0	this	e
    //   16	7	1	l1	long
    //   21	3	3	l2	long
    //   32	16	5	bool	boolean
    //   37	16	6	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	22	37	finally
  }
  
  public final void e()
  {
    try
    {
      c = 0;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void f(int paramInt)
  {
    label52:
    try
    {
      if (d(paramInt))
      {
        e();
        return;
      }
    }
    finally
    {
      break label52;
      c += 1;
      long l = a(paramInt);
      b = (a.a() + l);
      return;
    }
  }
}

/* Location:
 * Qualified Name:     v4.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */