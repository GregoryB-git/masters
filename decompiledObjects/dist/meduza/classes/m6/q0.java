package m6;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public final class q0
  implements ServiceConnection, t0
{
  public final HashMap a;
  public int b;
  public boolean c;
  public IBinder d;
  public final p0 e;
  public ComponentName f;
  
  public q0(s0 params0, p0 paramp0)
  {
    e = paramp0;
    a = new HashMap();
    b = 2;
  }
  
  /* Error */
  public static j6.b a(q0 paramq0, String paramString, java.util.concurrent.Executor paramExecutor)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 31	m6/q0:e	Lm6/p0;
    //   4: aload_0
    //   5: getfield 26	m6/q0:o	Lm6/s0;
    //   8: getfield 49	m6/s0:e	Landroid/content/Context;
    //   11: invokevirtual 54	m6/p0:a	(Landroid/content/Context;)Landroid/content/Intent;
    //   14: astore_3
    //   15: aload_0
    //   16: iconst_3
    //   17: putfield 38	m6/q0:b	I
    //   20: invokestatic 60	android/os/StrictMode:getVmPolicy	()Landroid/os/StrictMode$VmPolicy;
    //   23: astore 4
    //   25: getstatic 65	android/os/Build$VERSION:SDK_INT	I
    //   28: bipush 31
    //   30: if_icmplt +9 -> 39
    //   33: iconst_1
    //   34: istore 5
    //   36: goto +6 -> 42
    //   39: iconst_0
    //   40: istore 5
    //   42: iload 5
    //   44: ifeq +21 -> 65
    //   47: new 67	android/os/StrictMode$VmPolicy$Builder
    //   50: dup
    //   51: aload 4
    //   53: invokespecial 70	android/os/StrictMode$VmPolicy$Builder:<init>	(Landroid/os/StrictMode$VmPolicy;)V
    //   56: invokestatic 75	v6/j:a	(Landroid/os/StrictMode$VmPolicy$Builder;)Landroid/os/StrictMode$VmPolicy$Builder;
    //   59: invokevirtual 78	android/os/StrictMode$VmPolicy$Builder:build	()Landroid/os/StrictMode$VmPolicy;
    //   62: invokestatic 81	android/os/StrictMode:setVmPolicy	(Landroid/os/StrictMode$VmPolicy;)V
    //   65: aload_0
    //   66: getfield 26	m6/q0:o	Lm6/s0;
    //   69: astore 6
    //   71: aload 6
    //   73: getfield 85	m6/s0:g	Lu6/a;
    //   76: aload 6
    //   78: getfield 49	m6/s0:e	Landroid/content/Context;
    //   81: aload_1
    //   82: aload_3
    //   83: aload_0
    //   84: sipush 4225
    //   87: aload_2
    //   88: invokevirtual 90	u6/a:d	(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;Landroid/content/ServiceConnection;ILjava/util/concurrent/Executor;)Z
    //   91: istore 7
    //   93: aload_0
    //   94: iload 7
    //   96: putfield 92	m6/q0:c	Z
    //   99: iload 7
    //   101: ifeq +45 -> 146
    //   104: aload_0
    //   105: getfield 26	m6/q0:o	Lm6/s0;
    //   108: getfield 95	m6/s0:f	Lcom/google/android/gms/internal/common/zzh;
    //   111: iconst_1
    //   112: aload_0
    //   113: getfield 31	m6/q0:e	Lm6/p0;
    //   116: invokevirtual 101	android/os/Handler:obtainMessage	(ILjava/lang/Object;)Landroid/os/Message;
    //   119: astore_1
    //   120: aload_0
    //   121: getfield 26	m6/q0:o	Lm6/s0;
    //   124: getfield 95	m6/s0:f	Lcom/google/android/gms/internal/common/zzh;
    //   127: aload_1
    //   128: aload_0
    //   129: getfield 26	m6/q0:o	Lm6/s0;
    //   132: getfield 105	m6/s0:i	J
    //   135: invokevirtual 109	android/os/Handler:sendMessageDelayed	(Landroid/os/Message;J)Z
    //   138: pop
    //   139: getstatic 114	j6/b:e	Lj6/b;
    //   142: astore_0
    //   143: goto +35 -> 178
    //   146: aload_0
    //   147: iconst_2
    //   148: putfield 38	m6/q0:b	I
    //   151: aload_0
    //   152: getfield 26	m6/q0:o	Lm6/s0;
    //   155: astore_1
    //   156: aload_1
    //   157: getfield 85	m6/s0:g	Lu6/a;
    //   160: aload_1
    //   161: getfield 49	m6/s0:e	Landroid/content/Context;
    //   164: aload_0
    //   165: invokevirtual 117	u6/a:c	(Landroid/content/Context;Landroid/content/ServiceConnection;)V
    //   168: new 111	j6/b
    //   171: dup
    //   172: bipush 16
    //   174: invokespecial 120	j6/b:<init>	(I)V
    //   177: astore_0
    //   178: aload 4
    //   180: invokestatic 81	android/os/StrictMode:setVmPolicy	(Landroid/os/StrictMode$VmPolicy;)V
    //   183: goto +17 -> 200
    //   186: astore_0
    //   187: aload 4
    //   189: invokestatic 81	android/os/StrictMode:setVmPolicy	(Landroid/os/StrictMode$VmPolicy;)V
    //   192: aload_0
    //   193: athrow
    //   194: astore_0
    //   195: aload_0
    //   196: getfield 122	m6/g0:a	Lj6/b;
    //   199: astore_0
    //   200: aload_0
    //   201: areturn
    //   202: astore_0
    //   203: goto -35 -> 168
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	206	0	paramq0	q0
    //   0	206	1	paramString	String
    //   0	206	2	paramExecutor	java.util.concurrent.Executor
    //   14	69	3	localIntent	android.content.Intent
    //   23	165	4	localVmPolicy	android.os.StrictMode.VmPolicy
    //   34	9	5	i	int
    //   69	8	6	locals0	s0
    //   91	9	7	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   65	99	186	finally
    //   104	143	186	finally
    //   146	151	186	finally
    //   151	168	186	finally
    //   168	178	186	finally
    //   0	15	194	m6/g0
    //   151	168	202	java/lang/IllegalArgumentException
  }
  
  public final void onBindingDied(ComponentName paramComponentName)
  {
    onServiceDisconnected(paramComponentName);
  }
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    synchronized (o.d)
    {
      o.f.removeMessages(1, e);
      d = paramIBinder;
      f = paramComponentName;
      Iterator localIterator = a.values().iterator();
      while (localIterator.hasNext()) {
        ((ServiceConnection)localIterator.next()).onServiceConnected(paramComponentName, paramIBinder);
      }
      b = 1;
      return;
    }
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    synchronized (o.d)
    {
      o.f.removeMessages(1, e);
      d = null;
      f = paramComponentName;
      Iterator localIterator = a.values().iterator();
      while (localIterator.hasNext()) {
        ((ServiceConnection)localIterator.next()).onServiceDisconnected(paramComponentName);
      }
      b = 2;
      return;
    }
  }
}

/* Location:
 * Qualified Name:     m6.q0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */