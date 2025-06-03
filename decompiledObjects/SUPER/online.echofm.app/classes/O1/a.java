package O1;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.lang.reflect.Method;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import x1.B;

public final class a
{
  public static final a f = new a(null);
  public static final String g = a.class.getCanonicalName();
  public static a h;
  public String a;
  public long b;
  public String c;
  public String d;
  public boolean e;
  
  public final String h()
  {
    String str;
    if ((B.F()) && (B.k())) {
      str = a;
    } else {
      str = null;
    }
    return str;
  }
  
  public final String i()
  {
    return d;
  }
  
  public final String j()
  {
    return c;
  }
  
  public final boolean k()
  {
    return e;
  }
  
  public static final class a
  {
    public final a a(a parama)
    {
      a.f(parama, System.currentTimeMillis());
      a.h = parama;
      return parama;
    }
    
    public final a b(Context paramContext)
    {
      a locala = c(paramContext);
      Object localObject = locala;
      if (locala == null)
      {
        paramContext = d(paramContext);
        localObject = paramContext;
        if (paramContext == null) {
          localObject = new a();
        }
      }
      return (a)localObject;
    }
    
    public final a c(Context paramContext)
    {
      boolean bool = false;
      try
      {
        if (!g(paramContext)) {
          return null;
        }
        Object localObject1 = P.L("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", new Class[] { Context.class });
        if (localObject1 == null) {
          return null;
        }
        Object localObject2 = P.T(null, (Method)localObject1, new Object[] { paramContext });
        if (localObject2 == null) {
          return null;
        }
        Method localMethod = P.K(localObject2.getClass(), "getId", new Class[0]);
        localObject1 = P.K(localObject2.getClass(), "isLimitAdTrackingEnabled", new Class[0]);
        if ((localMethod != null) && (localObject1 != null))
        {
          paramContext = new O1/a;
          paramContext.<init>();
          a.c(paramContext, (String)P.T(localObject2, localMethod, new Object[0]));
          localObject1 = (Boolean)P.T(localObject2, (Method)localObject1, new Object[0]);
          if (localObject1 != null) {
            bool = ((Boolean)localObject1).booleanValue();
          }
          a.g(paramContext, bool);
          return paramContext;
        }
      }
      catch (Exception paramContext)
      {
        break label165;
        return null;
        label165:
        P.i0("android_id", paramContext);
      }
      return null;
    }
    
    /* Error */
    public final a d(Context paramContext)
    {
      // Byte code:
      //   0: aload_0
      //   1: aload_1
      //   2: invokevirtual 44	O1/a$a:g	(Landroid/content/Context;)Z
      //   5: ifne +5 -> 10
      //   8: aconst_null
      //   9: areturn
      //   10: new 98	O1/a$c
      //   13: dup
      //   14: invokespecial 99	O1/a$c:<init>	()V
      //   17: astore_2
      //   18: new 101	android/content/Intent
      //   21: dup
      //   22: ldc 103
      //   24: invokespecial 106	android/content/Intent:<init>	(Ljava/lang/String;)V
      //   27: astore_3
      //   28: aload_3
      //   29: ldc 108
      //   31: invokevirtual 112	android/content/Intent:setPackage	(Ljava/lang/String;)Landroid/content/Intent;
      //   34: pop
      //   35: aload_1
      //   36: aload_3
      //   37: aload_2
      //   38: iconst_1
      //   39: invokevirtual 116	android/content/Context:bindService	(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
      //   42: istore 4
      //   44: iload 4
      //   46: ifeq +76 -> 122
      //   49: new 118	O1/a$b
      //   52: astore 5
      //   54: aload 5
      //   56: aload_2
      //   57: invokevirtual 121	O1/a$c:a	()Landroid/os/IBinder;
      //   60: invokespecial 124	O1/a$b:<init>	(Landroid/os/IBinder;)V
      //   63: new 6	O1/a
      //   66: astore_3
      //   67: aload_3
      //   68: invokespecial 38	O1/a:<init>	()V
      //   71: aload_3
      //   72: aload 5
      //   74: invokevirtual 128	O1/a$b:n	()Ljava/lang/String;
      //   77: invokestatic 79	O1/a:c	(LO1/a;Ljava/lang/String;)V
      //   80: aload_3
      //   81: aload 5
      //   83: invokevirtual 131	O1/a$b:o	()Z
      //   86: invokestatic 88	O1/a:g	(LO1/a;Z)V
      //   89: aload_1
      //   90: aload_2
      //   91: invokevirtual 135	android/content/Context:unbindService	(Landroid/content/ServiceConnection;)V
      //   94: aload_3
      //   95: areturn
      //   96: astore_3
      //   97: goto +18 -> 115
      //   100: astore_3
      //   101: ldc 90
      //   103: aload_3
      //   104: invokestatic 94	O1/P:i0	(Ljava/lang/String;Ljava/lang/Exception;)V
      //   107: aload_1
      //   108: aload_2
      //   109: invokevirtual 135	android/content/Context:unbindService	(Landroid/content/ServiceConnection;)V
      //   112: goto +10 -> 122
      //   115: aload_1
      //   116: aload_2
      //   117: invokevirtual 135	android/content/Context:unbindService	(Landroid/content/ServiceConnection;)V
      //   120: aload_3
      //   121: athrow
      //   122: aconst_null
      //   123: areturn
      //   124: astore_1
      //   125: goto -3 -> 122
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	128	0	this	a
      //   0	128	1	paramContext	Context
      //   17	100	2	localc	a.c
      //   27	68	3	localObject1	Object
      //   96	1	3	localObject2	Object
      //   100	21	3	localException	Exception
      //   42	3	4	bool	boolean
      //   52	30	5	localb	a.b
      // Exception table:
      //   from	to	target	type
      //   49	89	96	finally
      //   101	107	96	finally
      //   49	89	100	java/lang/Exception
      //   35	44	124	java/lang/SecurityException
    }
    
    /* Error */
    public final a e(Context paramContext)
    {
      // Byte code:
      //   0: aload_1
      //   1: ldc -118
      //   3: invokestatic 144	kotlin/jvm/internal/Intrinsics:checkNotNullParameter	(Ljava/lang/Object;Ljava/lang/String;)V
      //   6: aload_0
      //   7: aload_1
      //   8: invokevirtual 146	O1/a$a:b	(Landroid/content/Context;)LO1/a;
      //   11: astore_2
      //   12: aconst_null
      //   13: astore_3
      //   14: invokestatic 152	android/os/Looper:myLooper	()Landroid/os/Looper;
      //   17: invokestatic 155	android/os/Looper:getMainLooper	()Landroid/os/Looper;
      //   20: invokestatic 158	kotlin/jvm/internal/Intrinsics:a	(Ljava/lang/Object;Ljava/lang/Object;)Z
      //   23: ifne +371 -> 394
      //   26: getstatic 29	O1/a:h	LO1/a;
      //   29: astore 4
      //   31: aload 4
      //   33: ifnull +36 -> 69
      //   36: invokestatic 21	java/lang/System:currentTimeMillis	()J
      //   39: aload 4
      //   41: invokestatic 161	O1/a:a	(LO1/a;)J
      //   44: lsub
      //   45: ldc2_w 162
      //   48: lcmp
      //   49: ifge +20 -> 69
      //   52: aload 4
      //   54: areturn
      //   55: astore 4
      //   57: aload_3
      //   58: astore_1
      //   59: goto +383 -> 442
      //   62: astore 4
      //   64: aconst_null
      //   65: astore_1
      //   66: goto +341 -> 407
      //   69: aload_1
      //   70: invokevirtual 167	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
      //   73: ldc -87
      //   75: iconst_0
      //   76: invokevirtual 175	android/content/pm/PackageManager:resolveContentProvider	(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;
      //   79: astore 5
      //   81: aload_1
      //   82: invokevirtual 167	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
      //   85: ldc -79
      //   87: iconst_0
      //   88: invokevirtual 175	android/content/pm/PackageManager:resolveContentProvider	(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;
      //   91: astore 4
      //   93: aload 5
      //   95: ifnull +45 -> 140
      //   98: getstatic 182	O1/k:a	LO1/k;
      //   101: astore 6
      //   103: aload 5
      //   105: getfield 188	android/content/pm/ProviderInfo:packageName	Ljava/lang/String;
      //   108: astore 5
      //   110: aload 5
      //   112: ldc -66
      //   114: invokestatic 193	kotlin/jvm/internal/Intrinsics:checkNotNullExpressionValue	(Ljava/lang/Object;Ljava/lang/String;)V
      //   117: aload_1
      //   118: aload 5
      //   120: invokestatic 196	O1/k:a	(Landroid/content/Context;Ljava/lang/String;)Z
      //   123: ifeq +17 -> 140
      //   126: ldc -58
      //   128: astore 4
      //   130: aload 4
      //   132: invokestatic 204	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
      //   135: astore 4
      //   137: goto +46 -> 183
      //   140: aload 4
      //   142: ifnull +38 -> 180
      //   145: getstatic 182	O1/k:a	LO1/k;
      //   148: astore 5
      //   150: aload 4
      //   152: getfield 188	android/content/pm/ProviderInfo:packageName	Ljava/lang/String;
      //   155: astore 4
      //   157: aload 4
      //   159: ldc -50
      //   161: invokestatic 193	kotlin/jvm/internal/Intrinsics:checkNotNullExpressionValue	(Ljava/lang/Object;Ljava/lang/String;)V
      //   164: aload_1
      //   165: aload 4
      //   167: invokestatic 196	O1/k:a	(Landroid/content/Context;Ljava/lang/String;)Z
      //   170: ifeq +10 -> 180
      //   173: ldc -48
      //   175: astore 4
      //   177: goto -47 -> 130
      //   180: aconst_null
      //   181: astore 4
      //   183: aload_0
      //   184: aload_1
      //   185: invokevirtual 211	O1/a$a:f	(Landroid/content/Context;)Ljava/lang/String;
      //   188: astore 5
      //   190: aload 5
      //   192: ifnull +9 -> 201
      //   195: aload_2
      //   196: aload 5
      //   198: invokestatic 213	O1/a:d	(LO1/a;Ljava/lang/String;)V
      //   201: aload 4
      //   203: ifnonnull +9 -> 212
      //   206: aload_0
      //   207: aload_2
      //   208: invokevirtual 215	O1/a$a:a	(LO1/a;)LO1/a;
      //   211: areturn
      //   212: aload_1
      //   213: invokevirtual 219	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
      //   216: aload 4
      //   218: iconst_3
      //   219: anewarray 76	java/lang/String
      //   222: dup
      //   223: iconst_0
      //   224: ldc -35
      //   226: aastore
      //   227: dup
      //   228: iconst_1
      //   229: ldc -33
      //   231: aastore
      //   232: dup
      //   233: iconst_2
      //   234: ldc -31
      //   236: aastore
      //   237: aconst_null
      //   238: aconst_null
      //   239: aconst_null
      //   240: invokevirtual 231	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
      //   243: astore_1
      //   244: aload_1
      //   245: ifnull +126 -> 371
      //   248: aload_1
      //   249: invokeinterface 236 1 0
      //   254: ifne +6 -> 260
      //   257: goto +114 -> 371
      //   260: aload_1
      //   261: ldc -35
      //   263: invokeinterface 240 2 0
      //   268: istore 7
      //   270: aload_1
      //   271: ldc -33
      //   273: invokeinterface 240 2 0
      //   278: istore 8
      //   280: aload_1
      //   281: ldc -31
      //   283: invokeinterface 240 2 0
      //   288: istore 9
      //   290: aload_2
      //   291: aload_1
      //   292: iload 7
      //   294: invokeinterface 244 2 0
      //   299: invokestatic 246	O1/a:e	(LO1/a;Ljava/lang/String;)V
      //   302: iload 8
      //   304: ifle +55 -> 359
      //   307: iload 9
      //   309: ifle +50 -> 359
      //   312: aload_2
      //   313: invokevirtual 248	O1/a:h	()Ljava/lang/String;
      //   316: ifnonnull +43 -> 359
      //   319: aload_2
      //   320: aload_1
      //   321: iload 8
      //   323: invokeinterface 244 2 0
      //   328: invokestatic 79	O1/a:c	(LO1/a;Ljava/lang/String;)V
      //   331: aload_2
      //   332: aload_1
      //   333: iload 9
      //   335: invokeinterface 244 2 0
      //   340: invokestatic 252	java/lang/Boolean:parseBoolean	(Ljava/lang/String;)Z
      //   343: invokestatic 88	O1/a:g	(LO1/a;Z)V
      //   346: goto +13 -> 359
      //   349: astore 4
      //   351: goto +91 -> 442
      //   354: astore 4
      //   356: goto +51 -> 407
      //   359: aload_1
      //   360: invokeinterface 255 1 0
      //   365: aload_0
      //   366: aload_2
      //   367: invokevirtual 215	O1/a$a:a	(LO1/a;)LO1/a;
      //   370: areturn
      //   371: aload_0
      //   372: aload_2
      //   373: invokevirtual 215	O1/a$a:a	(LO1/a;)LO1/a;
      //   376: astore 4
      //   378: aload_1
      //   379: ifnonnull +6 -> 385
      //   382: goto +9 -> 391
      //   385: aload_1
      //   386: invokeinterface 255 1 0
      //   391: aload 4
      //   393: areturn
      //   394: new 257	x1/o
      //   397: astore_1
      //   398: aload_1
      //   399: ldc_w 259
      //   402: invokespecial 260	x1/o:<init>	(Ljava/lang/String;)V
      //   405: aload_1
      //   406: athrow
      //   407: getstatic 263	O1/P:a	LO1/P;
      //   410: astore_3
      //   411: invokestatic 265	O1/a:b	()Ljava/lang/String;
      //   414: ldc_w 267
      //   417: aload 4
      //   419: invokestatic 271	kotlin/jvm/internal/Intrinsics:i	(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
      //   422: invokestatic 275	O1/P:j0	(Ljava/lang/String;Ljava/lang/String;)V
      //   425: aload_1
      //   426: ifnonnull +6 -> 432
      //   429: goto +9 -> 438
      //   432: aload_1
      //   433: invokeinterface 255 1 0
      //   438: aconst_null
      //   439: areturn
      //   440: astore 4
      //   442: aload_1
      //   443: ifnonnull +6 -> 449
      //   446: goto +9 -> 455
      //   449: aload_1
      //   450: invokeinterface 255 1 0
      //   455: aload 4
      //   457: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	458	0	this	a
      //   0	458	1	paramContext	Context
      //   11	362	2	locala1	a
      //   13	398	3	localP	P
      //   29	24	4	locala2	a
      //   55	1	4	localObject1	Object
      //   62	1	4	localException1	Exception
      //   91	126	4	localObject2	Object
      //   349	1	4	localObject3	Object
      //   354	1	4	localException2	Exception
      //   376	42	4	locala3	a
      //   440	16	4	localObject4	Object
      //   79	118	5	localObject5	Object
      //   101	1	6	localk	k
      //   268	25	7	i	int
      //   278	44	8	j	int
      //   288	46	9	k	int
      // Exception table:
      //   from	to	target	type
      //   14	31	55	finally
      //   36	52	55	finally
      //   69	93	55	finally
      //   98	126	55	finally
      //   130	137	55	finally
      //   145	173	55	finally
      //   183	190	55	finally
      //   195	201	55	finally
      //   206	212	55	finally
      //   212	244	55	finally
      //   394	407	55	finally
      //   14	31	62	java/lang/Exception
      //   36	52	62	java/lang/Exception
      //   69	93	62	java/lang/Exception
      //   98	126	62	java/lang/Exception
      //   130	137	62	java/lang/Exception
      //   145	173	62	java/lang/Exception
      //   183	190	62	java/lang/Exception
      //   195	201	62	java/lang/Exception
      //   206	212	62	java/lang/Exception
      //   212	244	62	java/lang/Exception
      //   394	407	62	java/lang/Exception
      //   248	257	349	finally
      //   260	302	349	finally
      //   312	346	349	finally
      //   371	378	349	finally
      //   248	257	354	java/lang/Exception
      //   260	302	354	java/lang/Exception
      //   312	346	354	java/lang/Exception
      //   371	378	354	java/lang/Exception
      //   407	425	440	finally
    }
    
    public final String f(Context paramContext)
    {
      PackageManager localPackageManager = paramContext.getPackageManager();
      if (localPackageManager == null) {
        paramContext = null;
      } else {
        paramContext = localPackageManager.getInstallerPackageName(paramContext.getPackageName());
      }
      return paramContext;
    }
    
    public final boolean g(Context paramContext)
    {
      boolean bool = true;
      Method localMethod = P.L("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", new Class[] { Context.class });
      if (localMethod == null) {
        return false;
      }
      paramContext = P.T(null, localMethod, new Object[] { paramContext });
      if ((!(paramContext instanceof Integer)) || (!Intrinsics.a(paramContext, Integer.valueOf(0)))) {
        bool = false;
      }
      return bool;
    }
    
    public final boolean h(Context paramContext)
    {
      Intrinsics.checkNotNullParameter(paramContext, "context");
      paramContext = e(paramContext);
      boolean bool;
      if ((paramContext != null) && (paramContext.k())) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
  
  public static final class b
    implements IInterface
  {
    public static final a c = new a(null);
    public final IBinder b;
    
    public b(IBinder paramIBinder)
    {
      b = paramIBinder;
    }
    
    public IBinder asBinder()
    {
      return b;
    }
    
    public final String n()
    {
      Parcel localParcel1 = Parcel.obtain();
      Intrinsics.checkNotNullExpressionValue(localParcel1, "obtain()");
      Parcel localParcel2 = Parcel.obtain();
      Intrinsics.checkNotNullExpressionValue(localParcel2, "obtain()");
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        b.transact(1, localParcel1, localParcel2, 0);
        localParcel2.readException();
        String str = localParcel2.readString();
        return str;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
    
    public final boolean o()
    {
      Parcel localParcel1 = Parcel.obtain();
      Intrinsics.checkNotNullExpressionValue(localParcel1, "obtain()");
      Parcel localParcel2 = Parcel.obtain();
      Intrinsics.checkNotNullExpressionValue(localParcel2, "obtain()");
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        boolean bool = true;
        localParcel1.writeInt(1);
        b.transact(2, localParcel1, localParcel2, 0);
        localParcel2.readException();
        int i = localParcel2.readInt();
        if (i == 0) {
          bool = false;
        }
        return bool;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
    
    public static final class a {}
  }
  
  public static final class c
    implements ServiceConnection
  {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final BlockingQueue b = new LinkedBlockingDeque();
    
    public final IBinder a()
    {
      if ((a.compareAndSet(true, true) ^ true))
      {
        Object localObject = b.take();
        Intrinsics.checkNotNullExpressionValue(localObject, "queue.take()");
        return (IBinder)localObject;
      }
      throw new IllegalStateException("Binder already consumed".toString());
    }
    
    public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
    {
      if (paramIBinder != null) {}
      try
      {
        b.put(paramIBinder);
        return;
      }
      catch (InterruptedException paramComponentName)
      {
        for (;;) {}
      }
    }
    
    public void onServiceDisconnected(ComponentName paramComponentName) {}
  }
}

/* Location:
 * Qualified Name:     O1.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */