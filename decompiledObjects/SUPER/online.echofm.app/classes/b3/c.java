package b3;

import W2.i;
import W2.i.b;
import W2.m;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

public abstract class c
  extends d
{
  public static void a(e parame, b paramb, Executor paramExecutor)
  {
    m.j(paramb);
    parame.c(new a(parame, paramb), paramExecutor);
  }
  
  public static Object b(Future paramFuture)
  {
    m.q(paramFuture.isDone(), "Future was expected to be done: %s", paramFuture);
    return g.a(paramFuture);
  }
  
  public static final class a
    implements Runnable
  {
    public final Future o;
    public final b p;
    
    public a(Future paramFuture, b paramb)
    {
      o = paramFuture;
      p = paramb;
    }
    
    /* Error */
    public void run()
    {
      // Byte code:
      //   0: aload_0
      //   1: getfield 20	b3/c$a:o	Ljava/util/concurrent/Future;
      //   4: astore_1
      //   5: aload_1
      //   6: invokestatic 30	b3/c:b	(Ljava/util/concurrent/Future;)Ljava/lang/Object;
      //   9: astore_1
      //   10: aload_0
      //   11: getfield 22	b3/c$a:p	Lb3/b;
      //   14: aload_1
      //   15: invokeinterface 35 2 0
      //   20: return
      //   21: astore_1
      //   22: aload_0
      //   23: getfield 22	b3/c$a:p	Lb3/b;
      //   26: aload_1
      //   27: invokeinterface 39 2 0
      //   32: return
      //   33: astore_1
      //   34: aload_0
      //   35: getfield 22	b3/c$a:p	Lb3/b;
      //   38: aload_1
      //   39: invokevirtual 45	java/lang/Throwable:getCause	()Ljava/lang/Throwable;
      //   42: invokeinterface 39 2 0
      //   47: return
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	48	0	this	a
      //   4	11	1	localObject	Object
      //   21	6	1	localThrowable	Throwable
      //   33	6	1	localExecutionException	java.util.concurrent.ExecutionException
      // Exception table:
      //   from	to	target	type
      //   5	10	21	finally
      //   5	10	33	java/util/concurrent/ExecutionException
    }
    
    public String toString()
    {
      return i.a(this).c(p).toString();
    }
  }
}

/* Location:
 * Qualified Name:     b3.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */