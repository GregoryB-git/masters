package aa;

import android.content.Context;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import r.b;
import r.h;
import u.a;

public final class j0
{
  public static final long i = TimeUnit.HOURS.toSeconds(8L);
  public final Context a;
  public final r b;
  public final o c;
  public final FirebaseMessaging d;
  public final b e = new b();
  public final ScheduledExecutorService f;
  public boolean g = false;
  public final h0 h;
  
  public j0(FirebaseMessaging paramFirebaseMessaging, r paramr, h0 paramh0, o paramo, Context paramContext, ScheduledExecutorService paramScheduledExecutorService)
  {
    d = paramFirebaseMessaging;
    b = paramr;
    h = paramh0;
    c = paramo;
    a = paramContext;
    f = paramScheduledExecutorService;
  }
  
  public static <T> void a(Task<T> paramTask)
  {
    try
    {
      try
      {
        Tasks.await(paramTask, 30L, TimeUnit.SECONDS);
        return;
      }
      catch (TimeoutException paramTask) {}catch (InterruptedException paramTask) {}
      throw new IOException("SERVICE_NOT_AVAILABLE", paramTask);
    }
    catch (ExecutionException paramTask)
    {
      Throwable localThrowable = paramTask.getCause();
      if (!(localThrowable instanceof IOException))
      {
        if ((localThrowable instanceof RuntimeException)) {
          throw ((RuntimeException)localThrowable);
        }
        throw new IOException(paramTask);
      }
      throw ((IOException)localThrowable);
    }
  }
  
  public static boolean d()
  {
    boolean bool;
    if ((!Log.isLoggable("FirebaseMessaging", 3)) && ((Build.VERSION.SDK_INT != 23) || (!Log.isLoggable("FirebaseMessaging", 3)))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public final void b(String paramString)
  {
    o localo = c;
    String str = d.a();
    localo.getClass();
    Bundle localBundle = new Bundle();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("/topics/");
    localStringBuilder.append(paramString);
    localBundle.putString("gcm.topic", localStringBuilder.toString());
    localStringBuilder = new StringBuilder();
    localStringBuilder.append("/topics/");
    localStringBuilder.append(paramString);
    a(localo.a(localo.c(str, localStringBuilder.toString(), localBundle)));
  }
  
  public final void c(String paramString)
  {
    o localo = c;
    String str = d.a();
    localo.getClass();
    Bundle localBundle = new Bundle();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("/topics/");
    localStringBuilder.append(paramString);
    localBundle.putString("gcm.topic", localStringBuilder.toString());
    localBundle.putString("delete", "1");
    localStringBuilder = new StringBuilder();
    localStringBuilder.append("/topics/");
    localStringBuilder.append(paramString);
    a(localo.a(localo.c(str, localStringBuilder.toString(), localBundle)));
  }
  
  public final Task<Void> e(g0 paramg0)
  {
    synchronized (h)
    {
      Object localObject2 = a;
      Object localObject3 = c;
      localObject2.getClass();
      if ((!TextUtils.isEmpty((CharSequence)localObject3)) && (!((String)localObject3).contains(c))) {
        synchronized (d)
        {
          if (d.add(localObject3))
          {
            Executor localExecutor = e;
            localObject3 = new u/a;
            ((a)localObject3).<init>(localObject2, 15);
            localExecutor.execute((Runnable)localObject3);
          }
        }
      }
      ??? = new TaskCompletionSource();
      synchronized (e)
      {
        localObject2 = c;
        if (e.containsKey(localObject2)) {
          paramg0 = (ArrayDeque)e.getOrDefault(localObject2, null);
        }
      }
      paramg0 = new java/util/ArrayDeque;
      paramg0.<init>();
      e.put(localObject2, paramg0);
      paramg0.add(???);
      return ((TaskCompletionSource)???).getTask();
      throw paramg0;
    }
  }
  
  /* Error */
  public final void f()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 59	aa/j0:h	Laa/h0;
    //   4: invokevirtual 236	aa/h0:a	()Laa/g0;
    //   7: ifnull +8 -> 15
    //   10: iconst_1
    //   11: istore_1
    //   12: goto +5 -> 17
    //   15: iconst_0
    //   16: istore_1
    //   17: iload_1
    //   18: ifeq +29 -> 47
    //   21: aload_0
    //   22: monitorenter
    //   23: aload_0
    //   24: getfield 53	aa/j0:g	Z
    //   27: istore_2
    //   28: aload_0
    //   29: monitorexit
    //   30: iload_2
    //   31: ifne +16 -> 47
    //   34: aload_0
    //   35: lconst_0
    //   36: invokevirtual 239	aa/j0:h	(J)V
    //   39: goto +8 -> 47
    //   42: astore_3
    //   43: aload_0
    //   44: monitorexit
    //   45: aload_3
    //   46: athrow
    //   47: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	48	0	this	j0
    //   11	7	1	k	int
    //   27	4	2	bool	boolean
    //   42	4	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   23	28	42	finally
  }
  
  /* Error */
  public final boolean g()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 59	aa/j0:h	Laa/h0;
    //   6: invokevirtual 236	aa/h0:a	()Laa/g0;
    //   9: astore_1
    //   10: iconst_1
    //   11: istore_2
    //   12: aload_1
    //   13: ifnonnull +21 -> 34
    //   16: invokestatic 241	aa/j0:d	()Z
    //   19: ifeq +11 -> 30
    //   22: ldc 106
    //   24: ldc -13
    //   26: invokestatic 246	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   29: pop
    //   30: aload_0
    //   31: monitorexit
    //   32: iconst_1
    //   33: ireturn
    //   34: aload_0
    //   35: monitorexit
    //   36: aload_1
    //   37: getfield 248	aa/g0:b	Ljava/lang/String;
    //   40: astore_3
    //   41: iconst_m1
    //   42: istore 4
    //   44: aload_3
    //   45: invokevirtual 252	java/lang/String:hashCode	()I
    //   48: istore 5
    //   50: iload 5
    //   52: bipush 83
    //   54: if_icmpeq +28 -> 82
    //   57: iload 5
    //   59: bipush 85
    //   61: if_icmpeq +6 -> 67
    //   64: goto +35 -> 99
    //   67: aload_3
    //   68: ldc -2
    //   70: invokevirtual 257	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   73: ifeq +26 -> 99
    //   76: iconst_1
    //   77: istore 4
    //   79: goto +20 -> 99
    //   82: aload_3
    //   83: ldc_w 259
    //   86: invokevirtual 257	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   89: istore 6
    //   91: iload 6
    //   93: ifeq +6 -> 99
    //   96: iconst_0
    //   97: istore 4
    //   99: iload 4
    //   101: ifeq +105 -> 206
    //   104: iload 4
    //   106: iconst_1
    //   107: if_icmpeq +50 -> 157
    //   110: iload_2
    //   111: istore 4
    //   113: invokestatic 241	aa/j0:d	()Z
    //   116: ifeq +262 -> 378
    //   119: new 132	java/lang/StringBuilder
    //   122: astore_3
    //   123: aload_3
    //   124: invokespecial 133	java/lang/StringBuilder:<init>	()V
    //   127: aload_3
    //   128: ldc_w 261
    //   131: invokevirtual 139	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   134: pop
    //   135: aload_3
    //   136: aload_1
    //   137: invokevirtual 264	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   140: pop
    //   141: aload_3
    //   142: ldc_w 266
    //   145: invokevirtual 139	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   148: pop
    //   149: aload_3
    //   150: invokevirtual 144	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   153: astore_3
    //   154: goto +107 -> 261
    //   157: aload_0
    //   158: aload_1
    //   159: getfield 268	aa/g0:a	Ljava/lang/String;
    //   162: invokevirtual 270	aa/j0:c	(Ljava/lang/String;)V
    //   165: iload_2
    //   166: istore 4
    //   168: invokestatic 241	aa/j0:d	()Z
    //   171: ifeq +207 -> 378
    //   174: new 132	java/lang/StringBuilder
    //   177: astore_3
    //   178: aload_3
    //   179: invokespecial 133	java/lang/StringBuilder:<init>	()V
    //   182: aload_3
    //   183: ldc_w 272
    //   186: invokevirtual 139	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   189: pop
    //   190: aload_1
    //   191: getfield 268	aa/g0:a	Ljava/lang/String;
    //   194: astore 7
    //   196: aload_3
    //   197: aload 7
    //   199: invokevirtual 139	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   202: pop
    //   203: goto +45 -> 248
    //   206: aload_0
    //   207: aload_1
    //   208: getfield 268	aa/g0:a	Ljava/lang/String;
    //   211: invokevirtual 274	aa/j0:b	(Ljava/lang/String;)V
    //   214: iload_2
    //   215: istore 4
    //   217: invokestatic 241	aa/j0:d	()Z
    //   220: ifeq +158 -> 378
    //   223: new 132	java/lang/StringBuilder
    //   226: astore_3
    //   227: aload_3
    //   228: invokespecial 133	java/lang/StringBuilder:<init>	()V
    //   231: aload_3
    //   232: ldc_w 276
    //   235: invokevirtual 139	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   238: pop
    //   239: aload_1
    //   240: getfield 268	aa/g0:a	Ljava/lang/String;
    //   243: astore 7
    //   245: goto -49 -> 196
    //   248: aload_3
    //   249: ldc_w 278
    //   252: invokevirtual 139	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   255: pop
    //   256: aload_3
    //   257: invokevirtual 144	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   260: astore_3
    //   261: ldc 106
    //   263: aload_3
    //   264: invokestatic 246	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   267: pop
    //   268: iload_2
    //   269: istore 4
    //   271: goto +107 -> 378
    //   274: astore 7
    //   276: ldc 87
    //   278: aload 7
    //   280: invokevirtual 281	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   283: invokevirtual 257	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   286: ifne +52 -> 338
    //   289: ldc_w 283
    //   292: aload 7
    //   294: invokevirtual 281	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   297: invokevirtual 257	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   300: ifne +38 -> 338
    //   303: ldc_w 285
    //   306: aload 7
    //   308: invokevirtual 281	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   311: invokevirtual 257	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   314: ifeq +6 -> 320
    //   317: goto +21 -> 338
    //   320: aload 7
    //   322: invokevirtual 281	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   325: ifnonnull +10 -> 335
    //   328: ldc_w 287
    //   331: astore_3
    //   332: goto +36 -> 368
    //   335: aload 7
    //   337: athrow
    //   338: ldc_w 289
    //   341: invokestatic 293	f:l	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   344: astore_3
    //   345: aload_3
    //   346: aload 7
    //   348: invokevirtual 281	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   351: invokevirtual 139	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   354: pop
    //   355: aload_3
    //   356: ldc_w 295
    //   359: invokevirtual 139	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   362: pop
    //   363: aload_3
    //   364: invokevirtual 144	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   367: astore_3
    //   368: ldc 106
    //   370: aload_3
    //   371: invokestatic 297	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   374: pop
    //   375: iconst_0
    //   376: istore 4
    //   378: iload 4
    //   380: ifne +5 -> 385
    //   383: iconst_0
    //   384: ireturn
    //   385: aload_0
    //   386: getfield 59	aa/j0:h	Laa/h0;
    //   389: astore_3
    //   390: aload_3
    //   391: monitorenter
    //   392: aload_3
    //   393: getfield 170	aa/h0:a	Laa/e0;
    //   396: astore 8
    //   398: aload_1
    //   399: getfield 175	aa/g0:c	Ljava/lang/String;
    //   402: astore 9
    //   404: aload 8
    //   406: getfield 192	aa/e0:d	Ljava/util/ArrayDeque;
    //   409: astore 7
    //   411: aload 7
    //   413: monitorenter
    //   414: aload 8
    //   416: getfield 192	aa/e0:d	Ljava/util/ArrayDeque;
    //   419: aload 9
    //   421: invokevirtual 300	java/util/ArrayDeque:remove	(Ljava/lang/Object;)Z
    //   424: ifeq +33 -> 457
    //   427: aload 8
    //   429: getfield 201	aa/e0:e	Ljava/util/concurrent/Executor;
    //   432: astore 9
    //   434: new 203	u/a
    //   437: astore 10
    //   439: aload 10
    //   441: aload 8
    //   443: bipush 15
    //   445: invokespecial 206	u/a:<init>	(Ljava/lang/Object;I)V
    //   448: aload 9
    //   450: aload 10
    //   452: invokeinterface 212 2 0
    //   457: aload 7
    //   459: monitorexit
    //   460: aload_3
    //   461: monitorexit
    //   462: aload_0
    //   463: getfield 51	aa/j0:e	Lr/b;
    //   466: astore_3
    //   467: aload_3
    //   468: monitorenter
    //   469: aload_1
    //   470: getfield 175	aa/g0:c	Ljava/lang/String;
    //   473: astore_1
    //   474: aload_0
    //   475: getfield 51	aa/j0:e	Lr/b;
    //   478: aload_1
    //   479: invokevirtual 220	r/h:containsKey	(Ljava/lang/Object;)Z
    //   482: ifne +6 -> 488
    //   485: goto +55 -> 540
    //   488: aload_0
    //   489: getfield 51	aa/j0:e	Lr/b;
    //   492: aload_1
    //   493: aconst_null
    //   494: invokevirtual 224	r/h:getOrDefault	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   497: checkcast 194	java/util/ArrayDeque
    //   500: astore 8
    //   502: aload 8
    //   504: invokevirtual 304	java/util/ArrayDeque:poll	()Ljava/lang/Object;
    //   507: checkcast 214	com/google/android/gms/tasks/TaskCompletionSource
    //   510: astore 7
    //   512: aload 7
    //   514: ifnull +9 -> 523
    //   517: aload 7
    //   519: aconst_null
    //   520: invokevirtual 308	com/google/android/gms/tasks/TaskCompletionSource:setResult	(Ljava/lang/Object;)V
    //   523: aload 8
    //   525: invokevirtual 310	java/util/ArrayDeque:isEmpty	()Z
    //   528: ifeq +12 -> 540
    //   531: aload_0
    //   532: getfield 51	aa/j0:e	Lr/b;
    //   535: aload_1
    //   536: invokevirtual 313	r/h:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   539: pop
    //   540: aload_3
    //   541: monitorexit
    //   542: goto -542 -> 0
    //   545: astore 7
    //   547: aload_3
    //   548: monitorexit
    //   549: aload 7
    //   551: athrow
    //   552: astore_1
    //   553: aload 7
    //   555: monitorexit
    //   556: aload_1
    //   557: athrow
    //   558: astore 7
    //   560: aload_3
    //   561: monitorexit
    //   562: aload 7
    //   564: athrow
    //   565: astore_3
    //   566: aload_0
    //   567: monitorexit
    //   568: aload_3
    //   569: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	570	0	this	j0
    //   9	527	1	localObject1	Object
    //   552	5	1	localObject2	Object
    //   11	258	2	k	int
    //   565	4	3	localObject4	Object
    //   42	337	4	m	int
    //   48	14	5	n	int
    //   89	3	6	bool	boolean
    //   194	50	7	str	String
    //   274	73	7	localIOException	IOException
    //   545	9	7	localObject6	Object
    //   558	5	7	localObject7	Object
    //   396	128	8	localObject8	Object
    //   402	47	9	localObject9	Object
    //   437	14	10	locala	a
    // Exception table:
    //   from	to	target	type
    //   36	41	274	java/io/IOException
    //   44	50	274	java/io/IOException
    //   67	76	274	java/io/IOException
    //   82	91	274	java/io/IOException
    //   113	154	274	java/io/IOException
    //   157	165	274	java/io/IOException
    //   168	196	274	java/io/IOException
    //   196	203	274	java/io/IOException
    //   206	214	274	java/io/IOException
    //   217	245	274	java/io/IOException
    //   248	261	274	java/io/IOException
    //   261	268	274	java/io/IOException
    //   469	485	545	finally
    //   488	512	545	finally
    //   517	523	545	finally
    //   523	540	545	finally
    //   540	542	545	finally
    //   547	549	545	finally
    //   414	457	552	finally
    //   457	460	552	finally
    //   553	556	552	finally
    //   392	414	558	finally
    //   556	558	558	finally
    //   2	10	565	finally
    //   16	30	565	finally
    //   30	32	565	finally
    //   34	36	565	finally
    //   566	568	565	finally
  }
  
  public final void h(long paramLong)
  {
    long l = Math.min(Math.max(30L, 2L * paramLong), i);
    k0 localk0 = new k0(this, a, b, l);
    f.schedule(localk0, paramLong, TimeUnit.SECONDS);
    try
    {
      g = true;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}

/* Location:
 * Qualified Name:     aa.j0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */