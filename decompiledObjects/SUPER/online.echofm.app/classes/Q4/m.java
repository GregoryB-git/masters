package Q4;

import android.content.Context;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import s4.i;

public class m
{
  public final Set a;
  public final com.google.firebase.remoteconfig.internal.e b;
  public final com.google.firebase.remoteconfig.internal.c c;
  public final s3.e d;
  public final i e;
  public final e f;
  public final Context g;
  public final String h;
  public final com.google.firebase.remoteconfig.internal.d i;
  public final ScheduledExecutorService j;
  
  public m(s3.e parame, i parami, com.google.firebase.remoteconfig.internal.c paramc, e parame1, Context paramContext, String paramString, com.google.firebase.remoteconfig.internal.d paramd, ScheduledExecutorService paramScheduledExecutorService)
  {
    LinkedHashSet localLinkedHashSet = new LinkedHashSet();
    a = localLinkedHashSet;
    b = new com.google.firebase.remoteconfig.internal.e(parame, parami, paramc, parame1, paramContext, paramString, localLinkedHashSet, paramd, paramScheduledExecutorService);
    d = parame;
    c = paramc;
    e = parami;
    f = parame1;
    g = paramContext;
    h = paramString;
    i = paramd;
    j = paramScheduledExecutorService;
  }
  
  public P4.d b(P4.c paramc)
  {
    try
    {
      a.add(paramc);
      c();
      paramc = new a(paramc);
      return paramc;
    }
    finally
    {
      paramc = finally;
      throw paramc;
    }
  }
  
  /* Error */
  public final void c()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 36	Q4/m:a	Ljava/util/Set;
    //   6: invokeinterface 79 1 0
    //   11: ifne +17 -> 28
    //   14: aload_0
    //   15: getfield 43	Q4/m:b	Lcom/google/firebase/remoteconfig/internal/e;
    //   18: invokevirtual 82	com/google/firebase/remoteconfig/internal/e:C	()V
    //   21: goto +7 -> 28
    //   24: astore_1
    //   25: goto +6 -> 31
    //   28: aload_0
    //   29: monitorexit
    //   30: return
    //   31: aload_0
    //   32: monitorexit
    //   33: aload_1
    //   34: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	35	0	this	m
    //   24	10	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	21	24	finally
  }
  
  public final void d(P4.c paramc)
  {
    try
    {
      a.remove(paramc);
      return;
    }
    finally
    {
      paramc = finally;
      throw paramc;
    }
  }
  
  public void e(boolean paramBoolean)
  {
    try
    {
      b.z(paramBoolean);
      if (!paramBoolean) {
        c();
      }
    }
    finally
    {
      break label28;
    }
    return;
    label28:
    throw ((Throwable)localObject);
  }
  
  public class a
    implements P4.d
  {
    public final P4.c a;
    
    public a(P4.c paramc)
    {
      a = paramc;
    }
    
    public void remove()
    {
      m.a(m.this, a);
    }
  }
}

/* Location:
 * Qualified Name:     Q4.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */