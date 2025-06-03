package I1;

import O1.k;
import T1.a;
import W5.m;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import x1.B;

public final class e
{
  public static final e a = new e();
  public static final String b = e.class.getSimpleName();
  public static Boolean c;
  
  public static final boolean b()
  {
    boolean bool1 = a.d(e.class);
    boolean bool2 = false;
    if (bool1) {
      return false;
    }
    try
    {
      if (c == null)
      {
        Context localContext = B.l();
        if (a.a(localContext) != null) {
          bool1 = true;
        } else {
          bool1 = false;
        }
        c = Boolean.valueOf(bool1);
      }
    }
    finally
    {
      break label75;
    }
    Boolean localBoolean = c;
    if (localBoolean == null) {
      bool1 = bool2;
    } else {
      bool1 = localBoolean.booleanValue();
    }
    return bool1;
    label75:
    a.b(localBoolean, e.class);
    return false;
  }
  
  public static final c c(String paramString, List paramList)
  {
    if (a.d(e.class)) {
      return null;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramString, "applicationId");
      Intrinsics.checkNotNullParameter(paramList, "appEvents");
      paramString = a.d(a.q, paramString, paramList);
      return paramString;
    }
    finally
    {
      a.b(paramString, e.class);
    }
    return null;
  }
  
  public static final c e(String paramString)
  {
    if (a.d(e.class)) {
      return null;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramString, "applicationId");
      paramString = a.d(a.p, paramString, m.f());
      return paramString;
    }
    finally
    {
      a.b(paramString, e.class);
    }
    return null;
  }
  
  public final Intent a(Context paramContext)
  {
    if (a.d(this)) {
      return null;
    }
    try
    {
      localPackageManager = paramContext.getPackageManager();
      if (localPackageManager != null)
      {
        localIntent = new android/content/Intent;
        localIntent.<init>("ReceiverService");
        localIntent.setPackage("com.facebook.katana");
        if ((localPackageManager.resolveService(localIntent, 0) != null) && (k.a(paramContext, "com.facebook.katana"))) {
          return localIntent;
        }
      }
    }
    finally
    {
      PackageManager localPackageManager;
      break label102;
      Intent localIntent = new android/content/Intent;
      localIntent.<init>("ReceiverService");
      localIntent.setPackage("com.facebook.wakizashi");
      if (localPackageManager.resolveService(localIntent, 0) != null)
      {
        boolean bool = k.a(paramContext, "com.facebook.wakizashi");
        if (bool) {
          return localIntent;
        }
      }
      return null;
      label102:
      a.b(paramContext, this);
    }
    return null;
  }
  
  /* Error */
  public final c d(a parama, String paramString, List paramList)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 40	T1/a:d	(Ljava/lang/Object;)Z
    //   4: ifeq +5 -> 9
    //   7: aconst_null
    //   8: areturn
    //   9: getstatic 131	I1/e$c:p	LI1/e$c;
    //   12: astore 4
    //   14: invokestatic 135	G1/g:b	()V
    //   17: invokestatic 48	x1/B:l	()Landroid/content/Context;
    //   20: astore 5
    //   22: aload_0
    //   23: aload 5
    //   25: invokevirtual 51	I1/e:a	(Landroid/content/Context;)Landroid/content/Intent;
    //   28: astore 6
    //   30: aload 4
    //   32: astore 7
    //   34: aload 6
    //   36: ifnull +223 -> 259
    //   39: new 9	I1/e$b
    //   42: astore 8
    //   44: aload 8
    //   46: invokespecial 136	I1/e$b:<init>	()V
    //   49: aload 5
    //   51: aload 6
    //   53: aload 8
    //   55: iconst_1
    //   56: invokevirtual 140	android/content/Context:bindService	(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    //   59: istore 9
    //   61: iload 9
    //   63: ifeq +191 -> 254
    //   66: aload 8
    //   68: invokevirtual 143	I1/e$b:a	()Landroid/os/IBinder;
    //   71: astore 6
    //   73: aload 4
    //   75: astore 7
    //   77: aload 6
    //   79: ifnull +66 -> 145
    //   82: aload 6
    //   84: invokestatic 149	Z1/a$a:n	(Landroid/os/IBinder;)LZ1/a;
    //   87: astore 7
    //   89: aload_1
    //   90: aload_2
    //   91: aload_3
    //   92: invokestatic 154	I1/d:a	(LI1/e$a;Ljava/lang/String;Ljava/util/List;)Landroid/os/Bundle;
    //   95: astore_1
    //   96: aload_1
    //   97: ifnull +43 -> 140
    //   100: aload 7
    //   102: aload_1
    //   103: invokeinterface 160 2 0
    //   108: pop
    //   109: getstatic 165	O1/P:a	LO1/P;
    //   112: astore_2
    //   113: getstatic 31	I1/e:b	Ljava/lang/String;
    //   116: ldc -89
    //   118: aload_1
    //   119: invokestatic 171	kotlin/jvm/internal/Intrinsics:i	(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    //   122: invokestatic 175	O1/P:j0	(Ljava/lang/String;Ljava/lang/String;)V
    //   125: goto +15 -> 140
    //   128: astore_1
    //   129: goto +104 -> 233
    //   132: astore_2
    //   133: goto +38 -> 171
    //   136: astore_2
    //   137: goto +68 -> 205
    //   140: getstatic 178	I1/e$c:o	LI1/e$c;
    //   143: astore 7
    //   145: aload 5
    //   147: aload 8
    //   149: invokevirtual 182	android/content/Context:unbindService	(Landroid/content/ServiceConnection;)V
    //   152: getstatic 165	O1/P:a	LO1/P;
    //   155: astore_1
    //   156: getstatic 31	I1/e:b	Ljava/lang/String;
    //   159: ldc -72
    //   161: invokestatic 175	O1/P:j0	(Ljava/lang/String;Ljava/lang/String;)V
    //   164: goto +95 -> 259
    //   167: astore_1
    //   168: goto +94 -> 262
    //   171: getstatic 186	I1/e$c:q	LI1/e$c;
    //   174: astore 7
    //   176: getstatic 165	O1/P:a	LO1/P;
    //   179: astore_1
    //   180: getstatic 31	I1/e:b	Ljava/lang/String;
    //   183: astore_1
    //   184: aload_1
    //   185: aload_2
    //   186: invokestatic 190	O1/P:i0	(Ljava/lang/String;Ljava/lang/Exception;)V
    //   189: aload 5
    //   191: aload 8
    //   193: invokevirtual 182	android/content/Context:unbindService	(Landroid/content/ServiceConnection;)V
    //   196: aload_1
    //   197: ldc -72
    //   199: invokestatic 175	O1/P:j0	(Ljava/lang/String;Ljava/lang/String;)V
    //   202: goto +57 -> 259
    //   205: getstatic 186	I1/e$c:q	LI1/e$c;
    //   208: astore 7
    //   210: getstatic 165	O1/P:a	LO1/P;
    //   213: astore_1
    //   214: getstatic 31	I1/e:b	Ljava/lang/String;
    //   217: astore_1
    //   218: aload_1
    //   219: aload_2
    //   220: invokestatic 190	O1/P:i0	(Ljava/lang/String;Ljava/lang/Exception;)V
    //   223: aload 5
    //   225: aload 8
    //   227: invokevirtual 182	android/content/Context:unbindService	(Landroid/content/ServiceConnection;)V
    //   230: goto -34 -> 196
    //   233: aload 5
    //   235: aload 8
    //   237: invokevirtual 182	android/content/Context:unbindService	(Landroid/content/ServiceConnection;)V
    //   240: getstatic 165	O1/P:a	LO1/P;
    //   243: astore_2
    //   244: getstatic 31	I1/e:b	Ljava/lang/String;
    //   247: ldc -72
    //   249: invokestatic 175	O1/P:j0	(Ljava/lang/String;Ljava/lang/String;)V
    //   252: aload_1
    //   253: athrow
    //   254: getstatic 186	I1/e$c:q	LI1/e$c;
    //   257: astore 7
    //   259: aload 7
    //   261: areturn
    //   262: aload_1
    //   263: aload_0
    //   264: invokestatic 63	T1/a:b	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   267: aconst_null
    //   268: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	269	0	this	e
    //   0	269	1	parama	a
    //   0	269	2	paramString	String
    //   0	269	3	paramList	List
    //   12	62	4	localc	c
    //   20	214	5	localContext	Context
    //   28	55	6	localObject1	Object
    //   32	228	7	localObject2	Object
    //   42	194	8	localb	b
    //   59	3	9	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   66	73	128	finally
    //   82	96	128	finally
    //   100	125	128	finally
    //   140	145	128	finally
    //   171	189	128	finally
    //   205	223	128	finally
    //   66	73	132	android/os/RemoteException
    //   82	96	132	android/os/RemoteException
    //   100	125	132	android/os/RemoteException
    //   140	145	132	android/os/RemoteException
    //   66	73	136	java/lang/InterruptedException
    //   82	96	136	java/lang/InterruptedException
    //   100	125	136	java/lang/InterruptedException
    //   140	145	136	java/lang/InterruptedException
    //   9	30	167	finally
    //   39	61	167	finally
    //   145	164	167	finally
    //   189	196	167	finally
    //   196	202	167	finally
    //   223	230	167	finally
    //   233	254	167	finally
    //   254	259	167	finally
  }
  
  public static enum a
  {
    public final String o;
    
    public a(String paramString1)
    {
      o = paramString1;
    }
    
    public String toString()
    {
      return o;
    }
  }
  
  public static final class b
    implements ServiceConnection
  {
    public final CountDownLatch a = new CountDownLatch(1);
    public IBinder b;
    
    public final IBinder a()
    {
      a.await(5L, TimeUnit.SECONDS);
      return b;
    }
    
    public void onNullBinding(ComponentName paramComponentName)
    {
      Intrinsics.checkNotNullParameter(paramComponentName, "name");
      a.countDown();
    }
    
    public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
    {
      Intrinsics.checkNotNullParameter(paramComponentName, "name");
      Intrinsics.checkNotNullParameter(paramIBinder, "serviceBinder");
      b = paramIBinder;
      a.countDown();
    }
    
    public void onServiceDisconnected(ComponentName paramComponentName)
    {
      Intrinsics.checkNotNullParameter(paramComponentName, "name");
    }
  }
  
  public static enum c {}
}

/* Location:
 * Qualified Name:     I1.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */