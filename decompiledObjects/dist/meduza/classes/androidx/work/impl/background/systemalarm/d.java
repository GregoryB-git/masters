package androidx.work.impl.background.systemalarm;

import a3.b;
import a3.c.a;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager.WakeLock;
import android.text.TextUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import o2.j;
import p2.h0;
import p2.i0;
import p2.k0;
import y2.b0;
import y2.v;

public final class d
  implements p2.d
{
  public static final String t = j.f("SystemAlarmDispatcher");
  public final Context a;
  public final b b;
  public final b0 c;
  public final p2.r d;
  public final k0 e;
  public final a f;
  public final ArrayList o;
  public Intent p;
  public c q;
  public l.l r;
  public final h0 s;
  
  public d(Context paramContext)
  {
    Object localObject = paramContext.getApplicationContext();
    a = ((Context)localObject);
    r = new l.l(2);
    paramContext = k0.d(paramContext);
    e = paramContext;
    f = new a((Context)localObject, b.c, r);
    c = new b0(b.f);
    localObject = f;
    d = ((p2.r)localObject);
    paramContext = d;
    b = paramContext;
    s = new i0((p2.r)localObject, paramContext);
    ((p2.r)localObject).a(this);
    o = new ArrayList();
    p = null;
  }
  
  public static void c()
  {
    if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
      return;
    }
    throw new IllegalStateException("Needs to be invoked on the main thread.");
  }
  
  public final void a(x2.l paraml, boolean paramBoolean)
  {
    c.a locala = b.b();
    Context localContext = a;
    Object localObject = a.f;
    localObject = new Intent(localContext, SystemAlarmService.class);
    ((Intent)localObject).setAction("ACTION_EXECUTION_COMPLETED");
    ((Intent)localObject).putExtra("KEY_NEEDS_RESCHEDULE", paramBoolean);
    a.d((Intent)localObject, paraml);
    locala.execute(new b(0, (Intent)localObject, this));
  }
  
  public final void b(int paramInt, Intent paramIntent)
  {
    j localj = j.d();
    ??? = t;
    Object localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append("Adding command ");
    ((StringBuilder)localObject2).append(paramIntent);
    ((StringBuilder)localObject2).append(" (");
    ((StringBuilder)localObject2).append(paramInt);
    ((StringBuilder)localObject2).append(")");
    localj.a((String)???, ((StringBuilder)localObject2).toString());
    c();
    localObject2 = paramIntent.getAction();
    if (TextUtils.isEmpty((CharSequence)localObject2))
    {
      j.d().g((String)???, "Unknown command. Ignoring");
      return;
    }
    if ("ACTION_CONSTRAINTS_CHANGED".equals(localObject2))
    {
      c();
      synchronized (o)
      {
        localObject2 = o.iterator();
        while (((Iterator)localObject2).hasNext()) {
          if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent)((Iterator)localObject2).next()).getAction()))
          {
            i = 1;
            break label172;
          }
        }
        int i = 0;
        label172:
        if (i != 0) {
          return;
        }
      }
    }
    paramIntent.putExtra("KEY_START_ID", paramInt);
    synchronized (o)
    {
      boolean bool = o.isEmpty();
      o.add(paramIntent);
      if (!(bool ^ true)) {
        d();
      }
      return;
    }
  }
  
  public final void d()
  {
    c();
    PowerManager.WakeLock localWakeLock = v.a(a, "ProcessCommand");
    try
    {
      localWakeLock.acquire();
      b localb = e.d;
      a locala = new androidx/work/impl/background/systemalarm/d$a;
      locala.<init>(this);
      localb.d(locala);
      return;
    }
    finally
    {
      localWakeLock.release();
    }
  }
  
  public final class a
    implements Runnable
  {
    public a() {}
    
    /* Error */
    public final void run()
    {
      // Byte code:
      //   0: aload_0
      //   1: getfield 17	androidx/work/impl/background/systemalarm/d$a:a	Landroidx/work/impl/background/systemalarm/d;
      //   4: getfield 25	androidx/work/impl/background/systemalarm/d:o	Ljava/util/ArrayList;
      //   7: astore_1
      //   8: aload_1
      //   9: monitorenter
      //   10: aload_0
      //   11: getfield 17	androidx/work/impl/background/systemalarm/d$a:a	Landroidx/work/impl/background/systemalarm/d;
      //   14: astore_2
      //   15: aload_2
      //   16: aload_2
      //   17: getfield 25	androidx/work/impl/background/systemalarm/d:o	Ljava/util/ArrayList;
      //   20: iconst_0
      //   21: invokevirtual 31	java/util/ArrayList:get	(I)Ljava/lang/Object;
      //   24: checkcast 33	android/content/Intent
      //   27: putfield 37	androidx/work/impl/background/systemalarm/d:p	Landroid/content/Intent;
      //   30: aload_1
      //   31: monitorexit
      //   32: aload_0
      //   33: getfield 17	androidx/work/impl/background/systemalarm/d$a:a	Landroidx/work/impl/background/systemalarm/d;
      //   36: getfield 37	androidx/work/impl/background/systemalarm/d:p	Landroid/content/Intent;
      //   39: astore_1
      //   40: aload_1
      //   41: ifnull +514 -> 555
      //   44: aload_1
      //   45: invokevirtual 41	android/content/Intent:getAction	()Ljava/lang/String;
      //   48: astore_1
      //   49: aload_0
      //   50: getfield 17	androidx/work/impl/background/systemalarm/d$a:a	Landroidx/work/impl/background/systemalarm/d;
      //   53: getfield 37	androidx/work/impl/background/systemalarm/d:p	Landroid/content/Intent;
      //   56: ldc 43
      //   58: iconst_0
      //   59: invokevirtual 47	android/content/Intent:getIntExtra	(Ljava/lang/String;I)I
      //   62: istore_3
      //   63: invokestatic 52	o2/j:d	()Lo2/j;
      //   66: astore 4
      //   68: getstatic 56	androidx/work/impl/background/systemalarm/d:t	Ljava/lang/String;
      //   71: astore 5
      //   73: ldc 58
      //   75: invokestatic 64	f:l	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   78: astore_2
      //   79: aload_2
      //   80: aload_0
      //   81: getfield 17	androidx/work/impl/background/systemalarm/d$a:a	Landroidx/work/impl/background/systemalarm/d;
      //   84: getfield 37	androidx/work/impl/background/systemalarm/d:p	Landroid/content/Intent;
      //   87: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      //   90: pop
      //   91: aload_2
      //   92: ldc 72
      //   94: invokevirtual 74	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   97: pop
      //   98: aload_2
      //   99: iload_3
      //   100: invokevirtual 77	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
      //   103: pop
      //   104: aload 4
      //   106: aload 5
      //   108: aload_2
      //   109: invokevirtual 80	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   112: invokevirtual 83	o2/j:a	(Ljava/lang/String;Ljava/lang/String;)V
      //   115: aload_0
      //   116: getfield 17	androidx/work/impl/background/systemalarm/d$a:a	Landroidx/work/impl/background/systemalarm/d;
      //   119: getfield 86	androidx/work/impl/background/systemalarm/d:a	Landroid/content/Context;
      //   122: astore_2
      //   123: new 66	java/lang/StringBuilder
      //   126: dup
      //   127: invokespecial 87	java/lang/StringBuilder:<init>	()V
      //   130: astore 4
      //   132: aload 4
      //   134: aload_1
      //   135: invokevirtual 74	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   138: pop
      //   139: aload 4
      //   141: ldc 89
      //   143: invokevirtual 74	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   146: pop
      //   147: aload 4
      //   149: iload_3
      //   150: invokevirtual 77	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
      //   153: pop
      //   154: aload 4
      //   156: ldc 91
      //   158: invokevirtual 74	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   161: pop
      //   162: aload_2
      //   163: aload 4
      //   165: invokevirtual 80	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   168: invokestatic 96	y2/v:a	(Landroid/content/Context;Ljava/lang/String;)Landroid/os/PowerManager$WakeLock;
      //   171: astore_2
      //   172: invokestatic 52	o2/j:d	()Lo2/j;
      //   175: astore 6
      //   177: new 66	java/lang/StringBuilder
      //   180: astore 4
      //   182: aload 4
      //   184: invokespecial 87	java/lang/StringBuilder:<init>	()V
      //   187: aload 4
      //   189: ldc 98
      //   191: invokevirtual 74	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   194: pop
      //   195: aload 4
      //   197: aload_1
      //   198: invokevirtual 74	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   201: pop
      //   202: aload 4
      //   204: ldc 100
      //   206: invokevirtual 74	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   209: pop
      //   210: aload 4
      //   212: aload_2
      //   213: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      //   216: pop
      //   217: aload 6
      //   219: aload 5
      //   221: aload 4
      //   223: invokevirtual 80	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   226: invokevirtual 83	o2/j:a	(Ljava/lang/String;Ljava/lang/String;)V
      //   229: aload_2
      //   230: invokevirtual 105	android/os/PowerManager$WakeLock:acquire	()V
      //   233: aload_0
      //   234: getfield 17	androidx/work/impl/background/systemalarm/d$a:a	Landroidx/work/impl/background/systemalarm/d;
      //   237: astore 4
      //   239: aload 4
      //   241: getfield 108	androidx/work/impl/background/systemalarm/d:f	Landroidx/work/impl/background/systemalarm/a;
      //   244: iload_3
      //   245: aload 4
      //   247: getfield 37	androidx/work/impl/background/systemalarm/d:p	Landroid/content/Intent;
      //   250: aload 4
      //   252: invokevirtual 114	androidx/work/impl/background/systemalarm/a:b	(ILandroid/content/Intent;Landroidx/work/impl/background/systemalarm/d;)V
      //   255: invokestatic 52	o2/j:d	()Lo2/j;
      //   258: astore 6
      //   260: new 66	java/lang/StringBuilder
      //   263: dup
      //   264: invokespecial 87	java/lang/StringBuilder:<init>	()V
      //   267: astore 4
      //   269: aload 4
      //   271: ldc 116
      //   273: invokevirtual 74	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   276: pop
      //   277: aload 4
      //   279: aload_1
      //   280: invokevirtual 74	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   283: pop
      //   284: aload 4
      //   286: ldc 100
      //   288: invokevirtual 74	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   291: pop
      //   292: aload 4
      //   294: aload_2
      //   295: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      //   298: pop
      //   299: aload 6
      //   301: aload 5
      //   303: aload 4
      //   305: invokevirtual 80	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   308: invokevirtual 83	o2/j:a	(Ljava/lang/String;Ljava/lang/String;)V
      //   311: aload_2
      //   312: invokevirtual 119	android/os/PowerManager$WakeLock:release	()V
      //   315: aload_0
      //   316: getfield 17	androidx/work/impl/background/systemalarm/d$a:a	Landroidx/work/impl/background/systemalarm/d;
      //   319: getfield 122	androidx/work/impl/background/systemalarm/d:b	La3/b;
      //   322: invokeinterface 127 1 0
      //   327: astore_1
      //   328: new 129	androidx/work/impl/background/systemalarm/d$d
      //   331: dup
      //   332: aload_0
      //   333: getfield 17	androidx/work/impl/background/systemalarm/d$a:a	Landroidx/work/impl/background/systemalarm/d;
      //   336: invokespecial 131	androidx/work/impl/background/systemalarm/d$d:<init>	(Landroidx/work/impl/background/systemalarm/d;)V
      //   339: astore_2
      //   340: goto +111 -> 451
      //   343: astore 6
      //   345: invokestatic 52	o2/j:d	()Lo2/j;
      //   348: astore 4
      //   350: getstatic 56	androidx/work/impl/background/systemalarm/d:t	Ljava/lang/String;
      //   353: astore 5
      //   355: aload 4
      //   357: aload 5
      //   359: ldc -123
      //   361: aload 6
      //   363: invokevirtual 137	o2/j:c	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
      //   366: invokestatic 52	o2/j:d	()Lo2/j;
      //   369: astore 4
      //   371: new 66	java/lang/StringBuilder
      //   374: dup
      //   375: invokespecial 87	java/lang/StringBuilder:<init>	()V
      //   378: astore 6
      //   380: aload 6
      //   382: ldc 116
      //   384: invokevirtual 74	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   387: pop
      //   388: aload 6
      //   390: aload_1
      //   391: invokevirtual 74	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   394: pop
      //   395: aload 6
      //   397: ldc 100
      //   399: invokevirtual 74	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   402: pop
      //   403: aload 6
      //   405: aload_2
      //   406: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      //   409: pop
      //   410: aload 4
      //   412: aload 5
      //   414: aload 6
      //   416: invokevirtual 80	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   419: invokevirtual 83	o2/j:a	(Ljava/lang/String;Ljava/lang/String;)V
      //   422: aload_2
      //   423: invokevirtual 119	android/os/PowerManager$WakeLock:release	()V
      //   426: aload_0
      //   427: getfield 17	androidx/work/impl/background/systemalarm/d$a:a	Landroidx/work/impl/background/systemalarm/d;
      //   430: getfield 122	androidx/work/impl/background/systemalarm/d:b	La3/b;
      //   433: invokeinterface 127 1 0
      //   438: astore_1
      //   439: new 129	androidx/work/impl/background/systemalarm/d$d
      //   442: dup
      //   443: aload_0
      //   444: getfield 17	androidx/work/impl/background/systemalarm/d$a:a	Landroidx/work/impl/background/systemalarm/d;
      //   447: invokespecial 131	androidx/work/impl/background/systemalarm/d$d:<init>	(Landroidx/work/impl/background/systemalarm/d;)V
      //   450: astore_2
      //   451: aload_1
      //   452: aload_2
      //   453: invokevirtual 143	a3/c$a:execute	(Ljava/lang/Runnable;)V
      //   456: goto +99 -> 555
      //   459: astore 4
      //   461: invokestatic 52	o2/j:d	()Lo2/j;
      //   464: astore 5
      //   466: getstatic 56	androidx/work/impl/background/systemalarm/d:t	Ljava/lang/String;
      //   469: astore 6
      //   471: new 66	java/lang/StringBuilder
      //   474: dup
      //   475: invokespecial 87	java/lang/StringBuilder:<init>	()V
      //   478: astore 7
      //   480: aload 7
      //   482: ldc 116
      //   484: invokevirtual 74	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   487: pop
      //   488: aload 7
      //   490: aload_1
      //   491: invokevirtual 74	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   494: pop
      //   495: aload 7
      //   497: ldc 100
      //   499: invokevirtual 74	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   502: pop
      //   503: aload 7
      //   505: aload_2
      //   506: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      //   509: pop
      //   510: aload 5
      //   512: aload 6
      //   514: aload 7
      //   516: invokevirtual 80	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   519: invokevirtual 83	o2/j:a	(Ljava/lang/String;Ljava/lang/String;)V
      //   522: aload_2
      //   523: invokevirtual 119	android/os/PowerManager$WakeLock:release	()V
      //   526: aload_0
      //   527: getfield 17	androidx/work/impl/background/systemalarm/d$a:a	Landroidx/work/impl/background/systemalarm/d;
      //   530: getfield 122	androidx/work/impl/background/systemalarm/d:b	La3/b;
      //   533: invokeinterface 127 1 0
      //   538: new 129	androidx/work/impl/background/systemalarm/d$d
      //   541: dup
      //   542: aload_0
      //   543: getfield 17	androidx/work/impl/background/systemalarm/d$a:a	Landroidx/work/impl/background/systemalarm/d;
      //   546: invokespecial 131	androidx/work/impl/background/systemalarm/d$d:<init>	(Landroidx/work/impl/background/systemalarm/d;)V
      //   549: invokevirtual 143	a3/c$a:execute	(Ljava/lang/Runnable;)V
      //   552: aload 4
      //   554: athrow
      //   555: return
      //   556: astore_2
      //   557: aload_1
      //   558: monitorexit
      //   559: aload_2
      //   560: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	561	0	this	a
      //   7	551	1	localObject1	Object
      //   14	509	2	localObject2	Object
      //   556	4	2	localObject3	Object
      //   62	183	3	i	int
      //   66	345	4	localObject4	Object
      //   459	94	4	localObject5	Object
      //   71	440	5	localObject6	Object
      //   175	125	6	localj	j
      //   343	19	6	localThrowable	Throwable
      //   378	135	6	localObject7	Object
      //   478	37	7	localStringBuilder	StringBuilder
      // Exception table:
      //   from	to	target	type
      //   172	255	343	finally
      //   345	366	459	finally
      //   10	32	556	finally
      //   557	559	556	finally
    }
  }
  
  public static final class b
    implements Runnable
  {
    public final d a;
    public final Intent b;
    public final int c;
    
    public b(int paramInt, Intent paramIntent, d paramd)
    {
      a = paramd;
      b = paramIntent;
      c = paramInt;
    }
    
    public final void run()
    {
      d locald = a;
      Intent localIntent = b;
      locald.b(c, localIntent);
    }
  }
  
  public static abstract interface c {}
  
  public static final class d
    implements Runnable
  {
    public final d a;
    
    public d(d paramd)
    {
      a = paramd;
    }
    
    public final void run()
    {
      d locald = a;
      locald.getClass();
      ??? = j.d();
      Object localObject2 = d.t;
      ((j)???).a((String)localObject2, "Checking if commands are complete.");
      d.c();
      synchronized (o)
      {
        if (p != null)
        {
          localObject6 = j.d();
          ??? = new java/lang/StringBuilder;
          ((StringBuilder)???).<init>();
          ((StringBuilder)???).append("Removing command ");
          ((StringBuilder)???).append(p);
          ((j)localObject6).a((String)localObject2, ((StringBuilder)???).toString());
          if (((Intent)o.remove(0)).equals(p))
          {
            p = null;
          }
          else
          {
            localObject2 = new java/lang/IllegalStateException;
            ((IllegalStateException)localObject2).<init>("Dequeue-d command is not the first.");
            throw ((Throwable)localObject2);
          }
        }
        Object localObject6 = b.c();
        a locala = f;
        synchronized (c)
        {
          boolean bool = b.isEmpty();
          if ((!(bool ^ true)) && (o.isEmpty())) {
            synchronized (d)
            {
              bool = a.isEmpty();
              if (!(bool ^ true))
              {
                j.d().a((String)localObject2, "No more commands & intents.");
                localObject2 = q;
                if (localObject2 == null) {
                  break label262;
                }
                ((SystemAlarmService)localObject2).a();
              }
            }
          }
          if (!o.isEmpty()) {
            locald.d();
          }
          label262:
          return;
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.background.systemalarm.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */