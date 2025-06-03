package p2;

import a3.b;
import android.content.Context;
import android.os.PowerManager.WakeLock;
import androidx.work.impl.WorkDatabase;
import b.a0;
import f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import o2.j;
import y2.v;
import z2.a.b;

public final class r
  implements w2.a
{
  public static final String l = j.f("Processor");
  public PowerManager.WakeLock a;
  public Context b;
  public androidx.work.a c;
  public b d;
  public WorkDatabase e;
  public HashMap f;
  public HashMap g;
  public HashMap h;
  public HashSet i;
  public final ArrayList j;
  public final Object k;
  
  public r(Context paramContext, androidx.work.a parama, b paramb, WorkDatabase paramWorkDatabase)
  {
    b = paramContext;
    c = parama;
    d = paramb;
    e = paramWorkDatabase;
    g = new HashMap();
    f = new HashMap();
    i = new HashSet();
    j = new ArrayList();
    a = null;
    k = new Object();
    h = new HashMap();
  }
  
  public static boolean d(String paramString, q0 paramq0, int paramInt)
  {
    if (paramq0 != null)
    {
      y = paramInt;
      paramq0.i();
      x.cancel(true);
      if ((d != null) && ((x.a instanceof a.b)))
      {
        d.i(paramInt);
      }
      else
      {
        localObject1 = f.l("WorkSpec ");
        ((StringBuilder)localObject1).append(c);
        ((StringBuilder)localObject1).append(" is already done. Not interrupting.");
        paramq0 = ((StringBuilder)localObject1).toString();
        j.d().a(q0.z, paramq0);
      }
      localObject2 = j.d();
      localObject1 = l;
      paramq0 = new StringBuilder();
      paramq0.append("WorkerWrapper interrupted for ");
      paramq0.append(paramString);
      ((j)localObject2).a((String)localObject1, paramq0.toString());
      return true;
    }
    Object localObject1 = j.d();
    paramq0 = l;
    Object localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append("WorkerWrapper could not be found for ");
    ((StringBuilder)localObject2).append(paramString);
    ((j)localObject1).a(paramq0, ((StringBuilder)localObject2).toString());
    return false;
  }
  
  public final void a(d paramd)
  {
    synchronized (k)
    {
      j.add(paramd);
      return;
    }
  }
  
  /* Error */
  public final q0 b(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 59	p2/r:f	Ljava/util/HashMap;
    //   4: aload_1
    //   5: invokevirtual 154	java/util/HashMap:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   8: checkcast 78	p2/q0
    //   11: astore_2
    //   12: aload_2
    //   13: ifnull +8 -> 21
    //   16: iconst_1
    //   17: istore_3
    //   18: goto +5 -> 23
    //   21: iconst_0
    //   22: istore_3
    //   23: iload_3
    //   24: ifne +15 -> 39
    //   27: aload_0
    //   28: getfield 57	p2/r:g	Ljava/util/HashMap;
    //   31: aload_1
    //   32: invokevirtual 154	java/util/HashMap:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   35: checkcast 78	p2/q0
    //   38: astore_2
    //   39: aload_0
    //   40: getfield 75	p2/r:h	Ljava/util/HashMap;
    //   43: aload_1
    //   44: invokevirtual 154	java/util/HashMap:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   47: pop
    //   48: iload_3
    //   49: ifeq +114 -> 163
    //   52: aload_0
    //   53: getfield 73	p2/r:k	Ljava/lang/Object;
    //   56: astore_1
    //   57: aload_1
    //   58: monitorenter
    //   59: iconst_1
    //   60: aload_0
    //   61: getfield 59	p2/r:f	Ljava/util/HashMap;
    //   64: invokevirtual 157	java/util/HashMap:isEmpty	()Z
    //   67: ixor
    //   68: ifne +85 -> 153
    //   71: aload_0
    //   72: getfield 46	p2/r:b	Landroid/content/Context;
    //   75: astore 4
    //   77: getstatic 162	androidx/work/impl/foreground/a:r	Ljava/lang/String;
    //   80: astore 5
    //   82: new 164	android/content/Intent
    //   85: astore 5
    //   87: aload 5
    //   89: aload 4
    //   91: ldc -90
    //   93: invokespecial 169	android/content/Intent:<init>	(Landroid/content/Context;Ljava/lang/Class;)V
    //   96: aload 5
    //   98: ldc -85
    //   100: invokevirtual 175	android/content/Intent:setAction	(Ljava/lang/String;)Landroid/content/Intent;
    //   103: pop
    //   104: aload_0
    //   105: getfield 46	p2/r:b	Landroid/content/Context;
    //   108: aload 5
    //   110: invokevirtual 181	android/content/Context:startService	(Landroid/content/Intent;)Landroid/content/ComponentName;
    //   113: pop
    //   114: goto +18 -> 132
    //   117: astore 4
    //   119: invokestatic 133	o2/j:d	()Lo2/j;
    //   122: getstatic 39	p2/r:l	Ljava/lang/String;
    //   125: ldc -73
    //   127: aload 4
    //   129: invokevirtual 186	o2/j:c	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   132: aload_0
    //   133: getfield 71	p2/r:a	Landroid/os/PowerManager$WakeLock;
    //   136: astore 4
    //   138: aload 4
    //   140: ifnull +13 -> 153
    //   143: aload 4
    //   145: invokevirtual 191	android/os/PowerManager$WakeLock:release	()V
    //   148: aload_0
    //   149: aconst_null
    //   150: putfield 71	p2/r:a	Landroid/os/PowerManager$WakeLock;
    //   153: aload_1
    //   154: monitorexit
    //   155: goto +8 -> 163
    //   158: astore_2
    //   159: aload_1
    //   160: monitorexit
    //   161: aload_2
    //   162: athrow
    //   163: aload_2
    //   164: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	165	0	this	r
    //   0	165	1	paramString	String
    //   11	28	2	localq01	q0
    //   158	6	2	localq02	q0
    //   17	32	3	m	int
    //   75	15	4	localContext	Context
    //   117	11	4	localThrowable	Throwable
    //   136	8	4	localWakeLock	PowerManager.WakeLock
    //   80	29	5	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   104	114	117	finally
    //   59	104	158	finally
    //   119	132	158	finally
    //   132	138	158	finally
    //   143	153	158	finally
    //   153	155	158	finally
    //   159	161	158	finally
  }
  
  public final q0 c(String paramString)
  {
    q0 localq01 = (q0)f.get(paramString);
    q0 localq02 = localq01;
    if (localq01 == null) {
      localq02 = (q0)g.get(paramString);
    }
    return localq02;
  }
  
  public final void e(String paramString, o2.d paramd)
  {
    synchronized (k)
    {
      Object localObject2 = j.d();
      String str = l;
      Object localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      ((StringBuilder)localObject3).append("Moving WorkSpec (");
      ((StringBuilder)localObject3).append(paramString);
      ((StringBuilder)localObject3).append(") to the foreground");
      ((j)localObject2).e(str, ((StringBuilder)localObject3).toString());
      localObject2 = (q0)g.remove(paramString);
      if (localObject2 != null)
      {
        if (a == null)
        {
          localObject3 = v.a(b, "ProcessorForegroundLck");
          a = ((PowerManager.WakeLock)localObject3);
          ((PowerManager.WakeLock)localObject3).acquire();
        }
        f.put(paramString, localObject2);
        paramString = androidx.work.impl.foreground.a.c(b, a0.s(c), paramd);
        v.a.startForegroundService(b, paramString);
      }
      return;
    }
  }
  
  /* Error */
  public final boolean f(x paramx, androidx.work.WorkerParameters.a parama)
  {
    // Byte code:
    //   0: aload_1
    //   1: getfield 236	p2/x:a	Lx2/l;
    //   4: astore_3
    //   5: aload_3
    //   6: getfield 240	x2/l:a	Ljava/lang/String;
    //   9: astore 4
    //   11: new 66	java/util/ArrayList
    //   14: dup
    //   15: invokespecial 67	java/util/ArrayList:<init>	()V
    //   18: astore 5
    //   20: aload_0
    //   21: getfield 52	p2/r:e	Landroidx/work/impl/WorkDatabase;
    //   24: new 242	p2/p
    //   27: dup
    //   28: aload_0
    //   29: aload 5
    //   31: aload 4
    //   33: invokespecial 245	p2/p:<init>	(Lp2/r;Ljava/util/ArrayList;Ljava/lang/String;)V
    //   36: invokevirtual 251	p1/j:m	(Ljava/util/concurrent/Callable;)Ljava/lang/Object;
    //   39: checkcast 253	x2/s
    //   42: astore 6
    //   44: aload 6
    //   46: ifnonnull +66 -> 112
    //   49: invokestatic 133	o2/j:d	()Lo2/j;
    //   52: astore 7
    //   54: getstatic 39	p2/r:l	Ljava/lang/String;
    //   57: astore_2
    //   58: new 118	java/lang/StringBuilder
    //   61: dup
    //   62: invokespecial 140	java/lang/StringBuilder:<init>	()V
    //   65: astore_1
    //   66: aload_1
    //   67: ldc -1
    //   69: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   72: pop
    //   73: aload_1
    //   74: aload_3
    //   75: invokevirtual 122	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   78: pop
    //   79: aload 7
    //   81: aload_2
    //   82: aload_1
    //   83: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   86: invokevirtual 257	o2/j:g	(Ljava/lang/String;Ljava/lang/String;)V
    //   89: aload_0
    //   90: getfield 50	p2/r:d	La3/b;
    //   93: invokeinterface 262 1 0
    //   98: new 264	p2/q
    //   101: dup
    //   102: aload_0
    //   103: aload_3
    //   104: invokespecial 267	p2/q:<init>	(Lp2/r;Lx2/l;)V
    //   107: invokevirtual 273	a3/c$a:execute	(Ljava/lang/Runnable;)V
    //   110: iconst_0
    //   111: ireturn
    //   112: aload_0
    //   113: getfield 73	p2/r:k	Ljava/lang/Object;
    //   116: astore 7
    //   118: aload 7
    //   120: monitorenter
    //   121: aload_0
    //   122: getfield 73	p2/r:k	Ljava/lang/Object;
    //   125: astore 8
    //   127: aload 8
    //   129: monitorenter
    //   130: aload_0
    //   131: aload 4
    //   133: invokevirtual 275	p2/r:c	(Ljava/lang/String;)Lp2/q0;
    //   136: ifnull +9 -> 145
    //   139: iconst_1
    //   140: istore 9
    //   142: goto +6 -> 148
    //   145: iconst_0
    //   146: istore 9
    //   148: aload 8
    //   150: monitorexit
    //   151: iload 9
    //   153: ifeq +137 -> 290
    //   156: aload_0
    //   157: getfield 75	p2/r:h	Ljava/util/HashMap;
    //   160: aload 4
    //   162: invokevirtual 194	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   165: checkcast 277	java/util/Set
    //   168: astore_2
    //   169: aload_2
    //   170: invokeinterface 281 1 0
    //   175: invokeinterface 287 1 0
    //   180: checkcast 233	p2/x
    //   183: getfield 236	p2/x:a	Lx2/l;
    //   186: getfield 289	x2/l:b	I
    //   189: aload_3
    //   190: getfield 289	x2/l:b	I
    //   193: if_icmpne +63 -> 256
    //   196: aload_2
    //   197: aload_1
    //   198: invokeinterface 290 2 0
    //   203: pop
    //   204: invokestatic 133	o2/j:d	()Lo2/j;
    //   207: astore_2
    //   208: getstatic 39	p2/r:l	Ljava/lang/String;
    //   211: astore 4
    //   213: new 118	java/lang/StringBuilder
    //   216: astore_1
    //   217: aload_1
    //   218: invokespecial 140	java/lang/StringBuilder:<init>	()V
    //   221: aload_1
    //   222: ldc_w 292
    //   225: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   228: pop
    //   229: aload_1
    //   230: aload_3
    //   231: invokevirtual 122	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   234: pop
    //   235: aload_1
    //   236: ldc_w 294
    //   239: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   242: pop
    //   243: aload_2
    //   244: aload 4
    //   246: aload_1
    //   247: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   250: invokevirtual 139	o2/j:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   253: goto +28 -> 281
    //   256: aload_0
    //   257: getfield 50	p2/r:d	La3/b;
    //   260: invokeinterface 262 1 0
    //   265: astore_2
    //   266: new 264	p2/q
    //   269: astore_1
    //   270: aload_1
    //   271: aload_0
    //   272: aload_3
    //   273: invokespecial 267	p2/q:<init>	(Lp2/r;Lx2/l;)V
    //   276: aload_2
    //   277: aload_1
    //   278: invokevirtual 273	a3/c$a:execute	(Ljava/lang/Runnable;)V
    //   281: aload 7
    //   283: monitorexit
    //   284: iconst_0
    //   285: ireturn
    //   286: astore_1
    //   287: goto +248 -> 535
    //   290: aload 6
    //   292: getfield 297	x2/s:t	I
    //   295: aload_3
    //   296: getfield 289	x2/l:b	I
    //   299: if_icmpeq +33 -> 332
    //   302: aload_0
    //   303: getfield 50	p2/r:d	La3/b;
    //   306: invokeinterface 262 1 0
    //   311: astore_1
    //   312: new 264	p2/q
    //   315: astore_2
    //   316: aload_2
    //   317: aload_0
    //   318: aload_3
    //   319: invokespecial 267	p2/q:<init>	(Lp2/r;Lx2/l;)V
    //   322: aload_1
    //   323: aload_2
    //   324: invokevirtual 273	a3/c$a:execute	(Ljava/lang/Runnable;)V
    //   327: aload 7
    //   329: monitorexit
    //   330: iconst_0
    //   331: ireturn
    //   332: new 299	p2/q0$a
    //   335: astore 8
    //   337: aload 8
    //   339: aload_0
    //   340: getfield 46	p2/r:b	Landroid/content/Context;
    //   343: aload_0
    //   344: getfield 48	p2/r:c	Landroidx/work/a;
    //   347: aload_0
    //   348: getfield 50	p2/r:d	La3/b;
    //   351: aload_0
    //   352: aload_0
    //   353: getfield 52	p2/r:e	Landroidx/work/impl/WorkDatabase;
    //   356: aload 6
    //   358: aload 5
    //   360: invokespecial 302	p2/q0$a:<init>	(Landroid/content/Context;Landroidx/work/a;La3/b;Lw2/a;Landroidx/work/impl/WorkDatabase;Lx2/s;Ljava/util/ArrayList;)V
    //   363: aload_2
    //   364: ifnull +9 -> 373
    //   367: aload 8
    //   369: aload_2
    //   370: putfield 305	p2/q0$a:h	Landroidx/work/WorkerParameters$a;
    //   373: new 78	p2/q0
    //   376: astore_2
    //   377: aload_2
    //   378: aload 8
    //   380: invokespecial 308	p2/q0:<init>	(Lp2/q0$a;)V
    //   383: aload_2
    //   384: getfield 311	p2/q0:w	Lz2/c;
    //   387: astore 5
    //   389: new 313	t0/d
    //   392: astore 8
    //   394: aload 8
    //   396: aload_0
    //   397: aload 5
    //   399: aload_2
    //   400: iconst_3
    //   401: invokespecial 316	t0/d:<init>	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    //   404: aload 5
    //   406: aload 8
    //   408: aload_0
    //   409: getfield 50	p2/r:d	La3/b;
    //   412: invokeinterface 262 1 0
    //   417: invokevirtual 319	z2/a:f	(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    //   420: aload_0
    //   421: getfield 57	p2/r:g	Ljava/util/HashMap;
    //   424: aload 4
    //   426: aload_2
    //   427: invokevirtual 215	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   430: pop
    //   431: new 61	java/util/HashSet
    //   434: astore 8
    //   436: aload 8
    //   438: invokespecial 62	java/util/HashSet:<init>	()V
    //   441: aload 8
    //   443: aload_1
    //   444: invokevirtual 320	java/util/HashSet:add	(Ljava/lang/Object;)Z
    //   447: pop
    //   448: aload_0
    //   449: getfield 75	p2/r:h	Ljava/util/HashMap;
    //   452: aload 4
    //   454: aload 8
    //   456: invokevirtual 215	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   459: pop
    //   460: aload 7
    //   462: monitorexit
    //   463: aload_0
    //   464: getfield 50	p2/r:d	La3/b;
    //   467: invokeinterface 323 1 0
    //   472: aload_2
    //   473: invokevirtual 326	y2/r:execute	(Ljava/lang/Runnable;)V
    //   476: invokestatic 133	o2/j:d	()Lo2/j;
    //   479: astore 7
    //   481: getstatic 39	p2/r:l	Ljava/lang/String;
    //   484: astore_2
    //   485: new 118	java/lang/StringBuilder
    //   488: dup
    //   489: invokespecial 140	java/lang/StringBuilder:<init>	()V
    //   492: astore_1
    //   493: aload_1
    //   494: ldc 2
    //   496: invokevirtual 331	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   499: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   502: pop
    //   503: aload_1
    //   504: ldc_w 333
    //   507: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   510: pop
    //   511: aload_1
    //   512: aload_3
    //   513: invokevirtual 122	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   516: pop
    //   517: aload 7
    //   519: aload_2
    //   520: aload_1
    //   521: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   524: invokevirtual 139	o2/j:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   527: iconst_1
    //   528: ireturn
    //   529: astore_1
    //   530: aload 8
    //   532: monitorexit
    //   533: aload_1
    //   534: athrow
    //   535: aload 7
    //   537: monitorexit
    //   538: aload_1
    //   539: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	540	0	this	r
    //   0	540	1	paramx	x
    //   0	540	2	parama	androidx.work.WorkerParameters.a
    //   4	509	3	locall	x2.l
    //   9	444	4	str	String
    //   18	387	5	localObject1	Object
    //   42	315	6	locals	x2.s
    //   52	484	7	localObject2	Object
    //   140	12	9	m	int
    // Exception table:
    //   from	to	target	type
    //   121	130	286	finally
    //   156	253	286	finally
    //   256	281	286	finally
    //   281	284	286	finally
    //   290	330	286	finally
    //   332	363	286	finally
    //   367	373	286	finally
    //   373	463	286	finally
    //   533	535	286	finally
    //   535	538	286	finally
    //   130	139	529	finally
    //   148	151	529	finally
    //   530	533	529	finally
  }
}

/* Location:
 * Qualified Name:     p2.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */