package g9;

import android.content.Context;
import b.m;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import f9.g;
import i9.b0;
import i9.e.a;
import i9.k1;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import m9.c0;
import m9.e0;
import m9.h0;
import m9.j;
import m9.v;
import m9.y;
import m9.z;
import n9.a.b;
import p2.m0;
import v3.x0;
import x6.b;

public final class u
{
  public final h a;
  public final e9.a b;
  public final e9.a c;
  public final n9.a d;
  public final g e;
  public e9.a f;
  public i9.n g;
  public h0 h;
  public j0 i;
  public k j;
  public e.a k;
  public k1 l;
  
  public u(Context paramContext, h paramh, e9.a parama1, e9.a parama2, n9.a parama, z paramz, f paramf)
  {
    a = paramh;
    b = parama1;
    c = parama2;
    d = parama;
    e = new g(new e0(a));
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    paramh = new AtomicBoolean(false);
    parama.a(new p(this, localTaskCompletionSource, paramContext, paramf, paramz));
    parama1.z(new q(this, paramh, localTaskCompletionSource, parama));
    parama2.z(new e0.d(26));
  }
  
  public final void a(Context paramContext, e9.e parame, f paramf, z paramz)
  {
    m0.y(1, "FirestoreClient", "Initializing. user=%s", new Object[] { a });
    n9.a locala = d;
    Object localObject1 = a;
    e9.a locala1 = b;
    Object localObject2 = c;
    parame = new f.a(paramContext, locala, (h)localObject1, parame, locala1, (e9.a)localObject2, paramz);
    c0 localc0 = b;
    localc0.getClass();
    b = new e0(a);
    a = new y(locala, paramContext, (h)localObject1, new m9.n(locala1, (e9.a)localObject2));
    localObject1 = a;
    y localy = a;
    b.a0(localy, "grpcCallProvider not initialized yet", new Object[0]);
    c = new v(locala, locala1, (e9.a)localObject2, (j9.f)localObject1, paramz, localy);
    localObject2 = b;
    b.a0(localObject2, "remoteSerializer not initialized yet", new Object[0]);
    paramz = c;
    b.a0(paramz, "firestoreChannel not initialized yet", new Object[0]);
    d = new j(locala, (e0)localObject2, paramz);
    e = new m9.d(paramContext);
    paramContext = paramf.e(parame);
    c = paramContext;
    paramContext.B();
    d = paramf.d(parame);
    f = paramf.f(parame);
    e = paramf.g(parame);
    g = paramf.a();
    paramContext = d;
    a.o().run();
    a.y("Start IndexManager", new b.d(paramContext, 16));
    a.y("Start MutationQueue", new m(paramContext, 15));
    f.b();
    i = paramf.b(parame);
    h = paramf.c(parame);
    paramContext = c;
    b.a0(paramContext, "persistence not initialized yet", new Object[0]);
    f = paramContext;
    l = i;
    g = paramf.h();
    paramContext = f;
    b.a0(paramContext, "remoteStore not initialized yet", new Object[0]);
    h = paramContext;
    i = paramf.i();
    paramContext = g;
    b.a0(paramContext, "eventManager not initialized yet", new Object[0]);
    j = paramContext;
    parame = h;
    paramContext = l;
    if (paramContext != null) {
      paramContext.start();
    }
    if (parame != null)
    {
      paramContext = a;
      k = paramContext;
      paramContext.start();
    }
  }
  
  public final void b(boolean paramBoolean)
  {
    d();
    d.a(new o(this, paramBoolean));
  }
  
  /* Error */
  public final Task<Void> c()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 35	g9/u:b	Le9/a;
    //   4: invokevirtual 295	e9/a:w	()V
    //   7: aload_0
    //   8: getfield 37	g9/u:c	Le9/a;
    //   11: invokevirtual 295	e9/a:w	()V
    //   14: aload_0
    //   15: getfield 39	g9/u:d	Ln9/a;
    //   18: astore_1
    //   19: new 297	b/k
    //   22: dup
    //   23: aload_0
    //   24: bipush 12
    //   26: invokespecial 298	b/k:<init>	(Ljava/lang/Object;I)V
    //   29: astore_2
    //   30: aload_1
    //   31: getfield 301	n9/a:a	Ln9/a$b;
    //   34: astore_1
    //   35: aload_1
    //   36: monitorenter
    //   37: aload_1
    //   38: monitorenter
    //   39: aload_1
    //   40: getfield 306	n9/a$b:b	Z
    //   43: istore_3
    //   44: aload_1
    //   45: monitorexit
    //   46: iload_3
    //   47: ifeq +24 -> 71
    //   50: new 58	com/google/android/gms/tasks/TaskCompletionSource
    //   53: astore_2
    //   54: aload_2
    //   55: invokespecial 59	com/google/android/gms/tasks/TaskCompletionSource:<init>	()V
    //   58: aload_2
    //   59: aconst_null
    //   60: invokevirtual 310	com/google/android/gms/tasks/TaskCompletionSource:setResult	(Ljava/lang/Object;)V
    //   63: aload_2
    //   64: invokevirtual 313	com/google/android/gms/tasks/TaskCompletionSource:getTask	()Lcom/google/android/gms/tasks/Task;
    //   67: astore_2
    //   68: goto +27 -> 95
    //   71: new 315	m9/w
    //   74: astore 4
    //   76: aload 4
    //   78: aload_2
    //   79: iconst_1
    //   80: invokespecial 316	m9/w:<init>	(Ljava/lang/Object;I)V
    //   83: aload_1
    //   84: aload 4
    //   86: invokevirtual 319	n9/a$b:a	(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;
    //   89: astore_2
    //   90: aload_1
    //   91: iconst_1
    //   92: putfield 306	n9/a$b:b	Z
    //   95: aload_1
    //   96: monitorexit
    //   97: aload_2
    //   98: areturn
    //   99: astore_2
    //   100: goto +8 -> 108
    //   103: astore_2
    //   104: aload_1
    //   105: monitorexit
    //   106: aload_2
    //   107: athrow
    //   108: aload_1
    //   109: monitorexit
    //   110: aload_2
    //   111: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	112	0	this	u
    //   18	91	1	localObject1	Object
    //   29	69	2	localObject2	Object
    //   99	1	2	localObject3	Object
    //   103	8	2	localObject4	Object
    //   43	4	3	bool	boolean
    //   74	11	4	localw	m9.w
    // Exception table:
    //   from	to	target	type
    //   37	39	99	finally
    //   44	46	99	finally
    //   50	68	99	finally
    //   71	95	99	finally
    //   104	108	99	finally
    //   39	44	103	finally
  }
  
  public final void d()
  {
    synchronized (d.a)
    {
      boolean bool = b;
      if (!bool) {
        return;
      }
      throw new IllegalStateException("The client has already been terminated");
    }
  }
  
  public final Task<Void> e(List<k9.f> paramList)
  {
    d();
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    d.a(new x0(this, paramList, localTaskCompletionSource, 6));
    return localTaskCompletionSource.getTask();
  }
}

/* Location:
 * Qualified Name:     g9.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */