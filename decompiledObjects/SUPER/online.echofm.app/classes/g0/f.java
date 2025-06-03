package g0;

public class f
{
  public final c a;
  public boolean b;
  
  public f()
  {
    this(c.a);
  }
  
  public f(c paramc)
  {
    a = paramc;
  }
  
  /* Error */
  public void a()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 23	g0/f:b	Z
    //   6: ifne +14 -> 20
    //   9: aload_0
    //   10: invokevirtual 26	java/lang/Object:wait	()V
    //   13: goto -11 -> 2
    //   16: astore_1
    //   17: goto +6 -> 23
    //   20: aload_0
    //   21: monitorexit
    //   22: return
    //   23: aload_0
    //   24: monitorexit
    //   25: aload_1
    //   26: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	27	0	this	f
    //   16	10	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	13	16	finally
  }
  
  public void b()
  {
    int i = 0;
    try
    {
      boolean bool = b;
      if (bool) {}
    }
    finally
    {
      for (;;)
      {
        try
        {
          wait();
        }
        catch (InterruptedException localInterruptedException)
        {
          i = 1;
        }
        localObject = finally;
        break;
      }
      if (i != 0) {
        Thread.currentThread().interrupt();
      }
      return;
    }
  }
  
  public boolean c()
  {
    try
    {
      boolean bool = b;
      b = false;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public boolean d()
  {
    try
    {
      boolean bool = b;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public boolean e()
  {
    try
    {
      boolean bool = b;
      if (bool) {
        return false;
      }
      b = true;
      notifyAll();
      return true;
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     g0.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */