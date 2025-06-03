package e9;

import c8.b;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import d9.g;
import n9.f;
import n9.j;

public final class d
  extends a
{
  public final c b = new c(this);
  public b c;
  public j<e> d;
  public int e;
  public boolean f;
  
  public d(t9.a<b> parama)
  {
    parama.a(new d(this, 10));
  }
  
  public final Task<String> s()
  {
    try
    {
      Object localObject1 = c;
      if (localObject1 == null)
      {
        localObject1 = new u7/c;
        ((u7.c)localObject1).<init>("auth is not available");
        localObject1 = Tasks.forException((Exception)localObject1);
        return (Task<String>)localObject1;
      }
      localObject1 = ((b)localObject1).d(f);
      f = false;
      int i = e;
      m.a locala = f.b;
      g localg = new d9/g;
      localg.<init>(this, i);
      localObject1 = ((Task)localObject1).continueWithTask(locala, localg);
      return (Task<String>)localObject1;
    }
    finally {}
  }
  
  public final void t()
  {
    try
    {
      f = true;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void w()
  {
    try
    {
      d = null;
      b localb = c;
      if (localb != null) {
        localb.c(b);
      }
      return;
    }
    finally {}
  }
  
  /* Error */
  public final void z(j<e> paramj)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: putfield 86	e9/d:d	Ln9/j;
    //   7: aload_0
    //   8: monitorenter
    //   9: aload_0
    //   10: getfield 45	e9/d:c	Lc8/b;
    //   13: astore_2
    //   14: aload_2
    //   15: ifnonnull +8 -> 23
    //   18: aconst_null
    //   19: astore_2
    //   20: goto +10 -> 30
    //   23: aload_2
    //   24: invokeinterface 94 1 0
    //   29: astore_2
    //   30: aload_2
    //   31: ifnull +17 -> 48
    //   34: new 96	e9/e
    //   37: astore_3
    //   38: aload_3
    //   39: aload_2
    //   40: invokespecial 97	e9/e:<init>	(Ljava/lang/String;)V
    //   43: aload_3
    //   44: astore_2
    //   45: goto +7 -> 52
    //   48: getstatic 100	e9/e:b	Le9/e;
    //   51: astore_2
    //   52: aload_0
    //   53: monitorexit
    //   54: aload_1
    //   55: aload_2
    //   56: invokeinterface 105 2 0
    //   61: aload_0
    //   62: monitorexit
    //   63: return
    //   64: astore_1
    //   65: aload_0
    //   66: monitorexit
    //   67: aload_1
    //   68: athrow
    //   69: astore_1
    //   70: aload_0
    //   71: monitorexit
    //   72: aload_1
    //   73: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	74	0	this	d
    //   0	74	1	paramj	j<e>
    //   13	43	2	localObject	Object
    //   37	7	3	locale	e
    // Exception table:
    //   from	to	target	type
    //   9	14	64	finally
    //   23	30	64	finally
    //   34	43	64	finally
    //   48	52	64	finally
    //   2	9	69	finally
    //   52	61	69	finally
    //   65	69	69	finally
  }
}

/* Location:
 * Qualified Name:     e9.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */