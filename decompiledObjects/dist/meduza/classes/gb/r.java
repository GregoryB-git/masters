package gb;

import eb.e.a;
import eb.e1;
import eb.s0;

public final class r
  extends z
{
  public r(q.b paramb, e1 parame1, s0 params0)
  {
    super(c.f);
  }
  
  /* Error */
  public final void a()
  {
    // Byte code:
    //   0: invokestatic 39	pb/b:c	()V
    //   3: aload_0
    //   4: getfield 14	gb/r:d	Lgb/q$b;
    //   7: getfield 23	gb/q$b:c	Lgb/q;
    //   10: getfield 42	gb/q:b	Lpb/c;
    //   13: astore_1
    //   14: invokestatic 44	pb/b:a	()V
    //   17: getstatic 47	pb/b:a	Lpb/a;
    //   20: astore_1
    //   21: aload_1
    //   22: invokevirtual 53	java/lang/Object:getClass	()Ljava/lang/Class;
    //   25: pop
    //   26: aload_0
    //   27: invokevirtual 55	gb/r:b	()V
    //   30: aload_1
    //   31: invokevirtual 53	java/lang/Object:getClass	()Ljava/lang/Class;
    //   34: pop
    //   35: return
    //   36: astore_2
    //   37: getstatic 47	pb/b:a	Lpb/a;
    //   40: invokevirtual 53	java/lang/Object:getClass	()Ljava/lang/Class;
    //   43: pop
    //   44: goto +9 -> 53
    //   47: astore_1
    //   48: aload_2
    //   49: aload_1
    //   50: invokevirtual 61	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   53: aload_2
    //   54: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	55	0	this	r
    //   13	18	1	localObject1	Object
    //   47	3	1	localThrowable	Throwable
    //   36	18	2	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   3	30	36	finally
    //   37	44	47	finally
  }
  
  public final void b()
  {
    Object localObject1 = b;
    Object localObject2 = c;
    Object localObject4 = d.b;
    if (localObject4 != null)
    {
      localObject2 = new s0();
      localObject1 = localObject4;
    }
    d.c.k = true;
    try
    {
      Object localObject5 = d;
      localObject4 = c;
      localObject5 = a;
      localObject4.getClass();
      ((e.a)localObject5).a((s0)localObject2, (e1)localObject1);
      return;
    }
    finally
    {
      d.c.g();
      localObject4 = d.c.e;
      if (((e1)localObject1).e()) {
        localObject1 = c;
      } else {
        localObject1 = d;
      }
      ((q1)localObject1).b();
    }
  }
}

/* Location:
 * Qualified Name:     gb.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */