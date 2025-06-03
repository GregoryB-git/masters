package i6;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import l.l;

public final class c
{
  public static int h;
  public static PendingIntent i;
  public static final Pattern j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
  public final r.h a = new r.h();
  public final Context b;
  public final a0 c;
  public final ScheduledThreadPoolExecutor d;
  public final Messenger e;
  public Messenger f;
  public k g;
  
  public c(Context paramContext)
  {
    b = paramContext;
    c = new a0(paramContext);
    e = new Messenger(new h(this, Looper.getMainLooper()));
    paramContext = new ScheduledThreadPoolExecutor(1);
    paramContext.setKeepAliveTime(60L, TimeUnit.SECONDS);
    paramContext.allowCoreThreadTimeOut(true);
    d = paramContext;
  }
  
  public final Task<Bundle> a(Bundle paramBundle)
  {
    if (c.a() < 12000000)
    {
      if (c.b() != 0) {
        paramBundle = b(paramBundle).continueWithTask(b0.a, new l(3, this, paramBundle));
      } else {
        paramBundle = Tasks.forException(new IOException("MISSING_INSTANCEID_SERVICE"));
      }
      return paramBundle;
    }
    synchronized (z.a(b))
    {
      int k = d;
      d = (k + 1);
      return ???.b(new y(k, 1, paramBundle)).continueWith(b0.a, b.z.f);
    }
  }
  
  /* Error */
  public final Task b(Bundle paramBundle)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 163	i6/c:h	I
    //   6: istore_2
    //   7: iload_2
    //   8: iconst_1
    //   9: iadd
    //   10: putstatic 163	i6/c:h	I
    //   13: iload_2
    //   14: invokestatic 169	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   17: astore_3
    //   18: ldc 2
    //   20: monitorexit
    //   21: new 171	com/google/android/gms/tasks/TaskCompletionSource
    //   24: dup
    //   25: invokespecial 172	com/google/android/gms/tasks/TaskCompletionSource:<init>	()V
    //   28: astore 4
    //   30: aload_0
    //   31: getfield 45	i6/c:a	Lr/h;
    //   34: astore 5
    //   36: aload 5
    //   38: monitorenter
    //   39: aload_0
    //   40: getfield 45	i6/c:a	Lr/h;
    //   43: aload_3
    //   44: aload 4
    //   46: invokevirtual 176	r/h:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   49: pop
    //   50: aload 5
    //   52: monitorexit
    //   53: new 178	android/content/Intent
    //   56: dup
    //   57: invokespecial 179	android/content/Intent:<init>	()V
    //   60: astore 6
    //   62: aload 6
    //   64: ldc -75
    //   66: invokevirtual 185	android/content/Intent:setPackage	(Ljava/lang/String;)Landroid/content/Intent;
    //   69: pop
    //   70: aload_0
    //   71: getfield 53	i6/c:c	Li6/a0;
    //   74: invokevirtual 103	i6/a0:b	()I
    //   77: iconst_2
    //   78: if_icmpne +10 -> 88
    //   81: ldc -69
    //   83: astore 5
    //   85: goto +7 -> 92
    //   88: ldc -67
    //   90: astore 5
    //   92: aload 6
    //   94: aload 5
    //   96: invokevirtual 192	android/content/Intent:setAction	(Ljava/lang/String;)Landroid/content/Intent;
    //   99: pop
    //   100: aload 6
    //   102: aload_1
    //   103: invokevirtual 196	android/content/Intent:putExtras	(Landroid/os/Bundle;)Landroid/content/Intent;
    //   106: pop
    //   107: aload_0
    //   108: getfield 47	i6/c:b	Landroid/content/Context;
    //   111: astore 5
    //   113: ldc 2
    //   115: monitorenter
    //   116: getstatic 198	i6/c:i	Landroid/app/PendingIntent;
    //   119: ifnonnull +31 -> 150
    //   122: new 178	android/content/Intent
    //   125: astore_1
    //   126: aload_1
    //   127: invokespecial 179	android/content/Intent:<init>	()V
    //   130: aload_1
    //   131: ldc -56
    //   133: invokevirtual 185	android/content/Intent:setPackage	(Ljava/lang/String;)Landroid/content/Intent;
    //   136: pop
    //   137: aload 5
    //   139: iconst_0
    //   140: aload_1
    //   141: getstatic 205	com/google/android/gms/internal/cloudmessaging/zza:zza	I
    //   144: invokestatic 211	android/app/PendingIntent:getBroadcast	(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
    //   147: putstatic 198	i6/c:i	Landroid/app/PendingIntent;
    //   150: aload 6
    //   152: ldc -43
    //   154: getstatic 198	i6/c:i	Landroid/app/PendingIntent;
    //   157: invokevirtual 217	android/content/Intent:putExtra	(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
    //   160: pop
    //   161: ldc 2
    //   163: monitorexit
    //   164: new 219	java/lang/StringBuilder
    //   167: dup
    //   168: invokespecial 220	java/lang/StringBuilder:<init>	()V
    //   171: astore_1
    //   172: aload_1
    //   173: ldc -34
    //   175: invokevirtual 226	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   178: pop
    //   179: aload_1
    //   180: aload_3
    //   181: invokevirtual 226	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   184: pop
    //   185: aload_1
    //   186: ldc -28
    //   188: invokevirtual 226	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   191: pop
    //   192: aload 6
    //   194: ldc -26
    //   196: aload_1
    //   197: invokevirtual 233	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   200: invokevirtual 236	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   203: pop
    //   204: ldc -18
    //   206: iconst_3
    //   207: invokestatic 244	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   210: ifeq +22 -> 232
    //   213: ldc -18
    //   215: ldc -10
    //   217: aload 6
    //   219: invokevirtual 250	android/content/Intent:getExtras	()Landroid/os/Bundle;
    //   222: invokestatic 256	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   225: invokevirtual 260	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   228: invokestatic 263	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   231: pop
    //   232: aload 6
    //   234: ldc_w 265
    //   237: aload_0
    //   238: getfield 71	i6/c:e	Landroid/os/Messenger;
    //   241: invokevirtual 217	android/content/Intent:putExtra	(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
    //   244: pop
    //   245: aload_0
    //   246: getfield 267	i6/c:f	Landroid/os/Messenger;
    //   249: ifnonnull +10 -> 259
    //   252: aload_0
    //   253: getfield 269	i6/c:g	Li6/k;
    //   256: ifnull +76 -> 332
    //   259: invokestatic 275	android/os/Message:obtain	()Landroid/os/Message;
    //   262: astore_1
    //   263: aload_1
    //   264: aload 6
    //   266: putfield 279	android/os/Message:obj	Ljava/lang/Object;
    //   269: aload_0
    //   270: getfield 267	i6/c:f	Landroid/os/Messenger;
    //   273: astore 5
    //   275: aload 5
    //   277: ifnull +12 -> 289
    //   280: aload 5
    //   282: aload_1
    //   283: invokevirtual 283	android/os/Messenger:send	(Landroid/os/Message;)V
    //   286: goto +79 -> 365
    //   289: aload_0
    //   290: getfield 269	i6/c:g	Li6/k;
    //   293: getfield 287	i6/k:a	Landroid/os/Messenger;
    //   296: astore 5
    //   298: aload 5
    //   300: invokevirtual 291	java/lang/Object:getClass	()Ljava/lang/Class;
    //   303: pop
    //   304: aload 5
    //   306: aload_1
    //   307: invokevirtual 283	android/os/Messenger:send	(Landroid/os/Message;)V
    //   310: goto +55 -> 365
    //   313: astore_1
    //   314: ldc -18
    //   316: iconst_3
    //   317: invokestatic 244	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   320: ifeq +12 -> 332
    //   323: ldc -18
    //   325: ldc_w 293
    //   328: invokestatic 263	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   331: pop
    //   332: aload_0
    //   333: getfield 53	i6/c:c	Li6/a0;
    //   336: invokevirtual 103	i6/a0:b	()I
    //   339: iconst_2
    //   340: if_icmpne +15 -> 355
    //   343: aload_0
    //   344: getfield 47	i6/c:b	Landroid/content/Context;
    //   347: aload 6
    //   349: invokevirtual 299	android/content/Context:sendBroadcast	(Landroid/content/Intent;)V
    //   352: goto +13 -> 365
    //   355: aload_0
    //   356: getfield 47	i6/c:b	Landroid/content/Context;
    //   359: aload 6
    //   361: invokevirtual 303	android/content/Context:startService	(Landroid/content/Intent;)Landroid/content/ComponentName;
    //   364: pop
    //   365: aload_0
    //   366: getfield 96	i6/c:d	Ljava/util/concurrent/ScheduledThreadPoolExecutor;
    //   369: new 305	i6/f
    //   372: dup
    //   373: aload 4
    //   375: iconst_0
    //   376: invokespecial 308	i6/f:<init>	(Ljava/lang/Object;I)V
    //   379: ldc2_w 309
    //   382: getstatic 84	java/util/concurrent/TimeUnit:SECONDS	Ljava/util/concurrent/TimeUnit;
    //   385: invokevirtual 314	java/util/concurrent/ScheduledThreadPoolExecutor:schedule	(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    //   388: astore_1
    //   389: aload 4
    //   391: invokevirtual 318	com/google/android/gms/tasks/TaskCompletionSource:getTask	()Lcom/google/android/gms/tasks/Task;
    //   394: getstatic 110	i6/b0:a	Li6/b0;
    //   397: new 320	i6/g
    //   400: dup
    //   401: aload_0
    //   402: aload_3
    //   403: aload_1
    //   404: invokespecial 323	i6/g:<init>	(Li6/c;Ljava/lang/String;Ljava/util/concurrent/ScheduledFuture;)V
    //   407: invokevirtual 327	com/google/android/gms/tasks/Task:addOnCompleteListener	(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;
    //   410: pop
    //   411: aload 4
    //   413: invokevirtual 318	com/google/android/gms/tasks/TaskCompletionSource:getTask	()Lcom/google/android/gms/tasks/Task;
    //   416: areturn
    //   417: astore_1
    //   418: ldc 2
    //   420: monitorexit
    //   421: aload_1
    //   422: athrow
    //   423: astore_1
    //   424: aload 5
    //   426: monitorexit
    //   427: aload_1
    //   428: athrow
    //   429: astore_1
    //   430: ldc 2
    //   432: monitorexit
    //   433: aload_1
    //   434: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	435	0	this	c
    //   0	435	1	paramBundle	Bundle
    //   6	8	2	k	int
    //   17	386	3	str	String
    //   28	384	4	localTaskCompletionSource	TaskCompletionSource
    //   60	300	6	localIntent	android.content.Intent
    // Exception table:
    //   from	to	target	type
    //   269	275	313	android/os/RemoteException
    //   280	286	313	android/os/RemoteException
    //   289	310	313	android/os/RemoteException
    //   116	150	417	finally
    //   150	161	417	finally
    //   39	53	423	finally
    //   424	427	423	finally
    //   3	18	429	finally
  }
  
  public final void c(Bundle paramBundle, String paramString)
  {
    synchronized (a)
    {
      TaskCompletionSource localTaskCompletionSource = (TaskCompletionSource)a.remove(paramString);
      if (localTaskCompletionSource == null)
      {
        paramBundle = new java/lang/StringBuilder;
        paramBundle.<init>();
        paramBundle.append("Missing callback for ");
        paramBundle.append(paramString);
        Log.w("Rpc", paramBundle.toString());
        return;
      }
      localTaskCompletionSource.setResult(paramBundle);
      return;
    }
  }
}

/* Location:
 * Qualified Name:     i6.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */