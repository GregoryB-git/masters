package q9;

import a0.o;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Set;
import java.util.concurrent.Executor;
import y2.h;

public final class c
  implements e, f
{
  public final t9.b<g> a;
  public final Context b;
  public final t9.b<ca.f> c;
  public final Set<d> d;
  public final Executor e;
  
  public c() {}
  
  public c(Context paramContext, String paramString, Set<d> paramSet, t9.b<ca.f> paramb, Executor paramExecutor)
  {
    a = paramString;
    d = paramSet;
    e = paramExecutor;
    c = paramb;
    b = paramContext;
  }
  
  public final Task<String> a()
  {
    if ((o.a(b) ^ true)) {
      return Tasks.forResult("");
    }
    return Tasks.call(e, new b(this));
  }
  
  /* Error */
  public final int b()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: invokestatic 74	java/lang/System:currentTimeMillis	()J
    //   5: lstore_1
    //   6: aload_0
    //   7: getfield 33	q9/c:a	Lt9/b;
    //   10: invokeinterface 80 1 0
    //   15: checkcast 82	q9/g
    //   18: astore_3
    //   19: aload_3
    //   20: monitorenter
    //   21: aload_3
    //   22: lload_1
    //   23: invokevirtual 86	q9/g:g	(J)Z
    //   26: istore 4
    //   28: aload_3
    //   29: monitorexit
    //   30: iload 4
    //   32: ifeq +57 -> 89
    //   35: aload_3
    //   36: monitorenter
    //   37: aload_3
    //   38: invokestatic 74	java/lang/System:currentTimeMillis	()J
    //   41: invokevirtual 89	q9/g:d	(J)Ljava/lang/String;
    //   44: astore 5
    //   46: aload_3
    //   47: getfield 92	q9/g:a	Landroid/content/SharedPreferences;
    //   50: invokeinterface 98 1 0
    //   55: ldc 100
    //   57: aload 5
    //   59: invokeinterface 106 3 0
    //   64: invokeinterface 110 1 0
    //   69: pop
    //   70: aload_3
    //   71: aload 5
    //   73: invokevirtual 114	q9/g:f	(Ljava/lang/String;)V
    //   76: aload_3
    //   77: monitorexit
    //   78: aload_0
    //   79: monitorexit
    //   80: iconst_3
    //   81: ireturn
    //   82: astore 5
    //   84: aload_3
    //   85: monitorexit
    //   86: aload 5
    //   88: athrow
    //   89: aload_0
    //   90: monitorexit
    //   91: iconst_1
    //   92: ireturn
    //   93: astore 5
    //   95: aload_3
    //   96: monitorexit
    //   97: aload 5
    //   99: athrow
    //   100: astore_3
    //   101: aload_0
    //   102: monitorexit
    //   103: aload_3
    //   104: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	105	0	this	c
    //   5	18	1	l	long
    //   100	4	3	localObject1	Object
    //   26	5	4	bool	boolean
    //   44	28	5	str	String
    //   82	5	5	localObject2	Object
    //   93	5	5	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   37	76	82	finally
    //   21	28	93	finally
    //   2	21	100	finally
    //   28	30	100	finally
    //   35	37	100	finally
    //   76	78	100	finally
    //   84	89	100	finally
    //   95	100	100	finally
  }
  
  public final void c()
  {
    if (d.size() <= 0)
    {
      Tasks.forResult(null);
      return;
    }
    if ((o.a(b) ^ true))
    {
      Tasks.forResult(null);
      return;
    }
    Tasks.call(e, new h(this, 3));
  }
}

/* Location:
 * Qualified Name:     q9.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */