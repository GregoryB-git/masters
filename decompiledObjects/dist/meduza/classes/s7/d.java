package s7;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import n7.g;
import n7.g.a;
import n7.g.a.b;
import r4.c;

public final class d
  extends e9.a
{
  /* Error */
  public static <V> V C(Future<V> paramFuture)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 13
    //   3: aload_0
    //   4: invokeinterface 19 1 0
    //   9: invokestatic 25	x6/b:G	(Ljava/lang/Object;Ljava/lang/String;Z)V
    //   12: iconst_0
    //   13: istore_1
    //   14: aload_0
    //   15: invokeinterface 29 1 0
    //   20: astore_2
    //   21: iload_1
    //   22: ifeq +9 -> 31
    //   25: invokestatic 35	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   28: invokevirtual 39	java/lang/Thread:interrupt	()V
    //   31: aload_2
    //   32: areturn
    //   33: astore_0
    //   34: iload_1
    //   35: ifeq +9 -> 44
    //   38: invokestatic 35	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   41: invokevirtual 39	java/lang/Thread:interrupt	()V
    //   44: aload_0
    //   45: athrow
    //   46: astore_2
    //   47: iconst_1
    //   48: istore_1
    //   49: goto -35 -> 14
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	52	0	paramFuture	Future<V>
    //   13	36	1	i	int
    //   20	12	2	localObject	Object
    //   46	1	2	localInterruptedException	InterruptedException
    // Exception table:
    //   from	to	target	type
    //   14	21	33	finally
    //   14	21	46	java/lang/InterruptedException
  }
  
  public static final class a<V>
    implements Runnable
  {
    public final Future<V> a;
    public final c b;
    
    public a(e parame, c paramc)
    {
      a = parame;
      b = paramc;
    }
    
    public final void run()
    {
      Object localObject = a;
      if ((localObject instanceof t7.a))
      {
        localObject = ((t7.a)localObject).a();
        if (localObject != null)
        {
          b.f((Throwable)localObject);
          return;
        }
      }
      try
      {
        try
        {
          localObject = d.C(a);
          b.onSuccess(localObject);
          return;
        }
        catch (Error localError) {}catch (RuntimeException localRuntimeException) {}
        b.f(localRuntimeException);
        return;
      }
      catch (ExecutionException localExecutionException)
      {
        b.f(localExecutionException.getCause());
      }
    }
    
    public final String toString()
    {
      g.a locala = g.b(this);
      c localc = b;
      g.a.b localb = new g.a.b();
      c.c = localb;
      c = localb;
      b = localc;
      return locala.toString();
    }
  }
}

/* Location:
 * Qualified Name:     s7.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */