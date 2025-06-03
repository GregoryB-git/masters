package x2;

import A2.P;
import A2.n;
import H2.b;
import android.content.Context;
import android.os.RemoteException;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.DynamiteModule.a;

public abstract class E
{
  public static final C a = new w(A.v("0\005È0\003° \003\002\001\002\002\024\020e\bsù/Qí"));
  public static final C b = new x(A.v("0\006\0040\003ì \003\002\001\002\002\024\003£²­×árÊkì"));
  public static final C c = new y(A.v("0\004C0\003+ \003\002\001\002\002\t\000ÂàFdJ00"));
  public static final C d = new z(A.v("0\004¨0\003 \003\002\001\002\002\t\000Õ¸l}ÓNõ0"));
  public static volatile P e;
  public static final Object f = new Object();
  public static Context g;
  
  public static O a(String paramString, A paramA, boolean paramBoolean1, boolean paramBoolean2)
  {
    StrictMode.ThreadPolicy localThreadPolicy = StrictMode.allowThreadDiskReads();
    try
    {
      paramString = f(paramString, paramA, paramBoolean1, paramBoolean2);
      return paramString;
    }
    finally
    {
      StrictMode.setThreadPolicy(localThreadPolicy);
    }
  }
  
  public static O b(String paramString, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    return g(paramString, paramBoolean1, false, false, true);
  }
  
  public static void d(Context paramContext)
  {
    label44:
    try
    {
      if (g == null) {
        if (paramContext != null)
        {
          g = paramContext.getApplicationContext();
          return;
        }
      }
    }
    finally
    {
      break label44;
      return;
      Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
      return;
    }
  }
  
  /* Error */
  public static boolean e()
  {
    // Byte code:
    //   0: invokestatic 66	android/os/StrictMode:allowThreadDiskReads	()Landroid/os/StrictMode$ThreadPolicy;
    //   3: astore_0
    //   4: invokestatic 157	x2/E:h	()V
    //   7: getstatic 159	x2/E:e	LA2/P;
    //   10: invokeinterface 163 1 0
    //   15: istore_1
    //   16: aload_0
    //   17: invokestatic 72	android/os/StrictMode:setThreadPolicy	(Landroid/os/StrictMode$ThreadPolicy;)V
    //   20: iload_1
    //   21: ireturn
    //   22: astore_2
    //   23: goto +23 -> 46
    //   26: astore_2
    //   27: goto +4 -> 31
    //   30: astore_2
    //   31: ldc -115
    //   33: ldc -91
    //   35: aload_2
    //   36: invokestatic 168	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   39: pop
    //   40: aload_0
    //   41: invokestatic 72	android/os/StrictMode:setThreadPolicy	(Landroid/os/StrictMode$ThreadPolicy;)V
    //   44: iconst_0
    //   45: ireturn
    //   46: aload_0
    //   47: invokestatic 72	android/os/StrictMode:setThreadPolicy	(Landroid/os/StrictMode$ThreadPolicy;)V
    //   50: aload_2
    //   51: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   3	44	0	localThreadPolicy	StrictMode.ThreadPolicy
    //   15	6	1	bool	boolean
    //   22	1	2	localObject	Object
    //   26	1	2	localRemoteException	RemoteException
    //   30	21	2	locala	DynamiteModule.a
    // Exception table:
    //   from	to	target	type
    //   4	16	22	finally
    //   31	40	22	finally
    //   4	16	26	android/os/RemoteException
    //   4	16	30	com/google/android/gms/dynamite/DynamiteModule$a
  }
  
  public static O f(String paramString, A paramA, boolean paramBoolean1, boolean paramBoolean2)
  {
    try
    {
      h();
      n.i(g);
      J localJ = new J(paramString, paramA, paramBoolean1, paramBoolean2);
      try
      {
        paramBoolean2 = e.e0(localJ, b.Z0(g.getPackageManager()));
        if (paramBoolean2) {
          return O.b();
        }
        return new M(new v(paramBoolean1, paramString, paramA), null);
      }
      catch (RemoteException paramString)
      {
        Log.e("GoogleCertificates", "Failed to get Google certificates from remote", paramString);
        return O.d("module call", paramString);
      }
      return O.d("module init: ".concat(String.valueOf(paramString.getMessage())), paramString);
    }
    catch (DynamiteModule.a paramString)
    {
      Log.e("GoogleCertificates", "Failed to get Google certificates from remote", paramString);
    }
  }
  
  /* Error */
  public static O g(String paramString, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    // Byte code:
    //   0: invokestatic 66	android/os/StrictMode:allowThreadDiskReads	()Landroid/os/StrictMode$ThreadPolicy;
    //   3: astore 5
    //   5: getstatic 133	x2/E:g	Landroid/content/Context;
    //   8: invokestatic 99	A2/n:i	(Ljava/lang/Object;)Ljava/lang/Object;
    //   11: pop
    //   12: invokestatic 157	x2/E:h	()V
    //   15: new 221	x2/F
    //   18: astore 6
    //   20: aload 6
    //   22: aload_0
    //   23: iload_1
    //   24: iconst_0
    //   25: getstatic 133	x2/E:g	Landroid/content/Context;
    //   28: invokestatic 182	H2/b:Z0	(Ljava/lang/Object;)LH2/a;
    //   31: iconst_0
    //   32: invokespecial 224	x2/F:<init>	(Ljava/lang/String;ZZLandroid/os/IBinder;Z)V
    //   35: iload 4
    //   37: ifeq +26 -> 63
    //   40: getstatic 159	x2/E:e	LA2/P;
    //   43: aload 6
    //   45: invokeinterface 228 2 0
    //   50: astore_0
    //   51: goto +23 -> 74
    //   54: astore_0
    //   55: goto +158 -> 213
    //   58: astore 6
    //   60: goto +94 -> 154
    //   63: getstatic 159	x2/E:e	LA2/P;
    //   66: aload 6
    //   68: invokeinterface 231 2 0
    //   73: astore_0
    //   74: aload_0
    //   75: invokevirtual 235	x2/H:d	()Z
    //   78: ifeq +14 -> 92
    //   81: aload_0
    //   82: invokevirtual 238	x2/H:f	()I
    //   85: invokestatic 241	x2/O:f	(I)Lx2/O;
    //   88: astore_0
    //   89: goto +117 -> 206
    //   92: aload_0
    //   93: invokevirtual 243	x2/H:a	()Ljava/lang/String;
    //   96: astore 7
    //   98: aload_0
    //   99: invokevirtual 245	x2/H:g	()I
    //   102: iconst_4
    //   103: if_icmpne +16 -> 119
    //   106: new 247	android/content/pm/PackageManager$NameNotFoundException
    //   109: astore 6
    //   111: aload 6
    //   113: invokespecial 248	android/content/pm/PackageManager$NameNotFoundException:<init>	()V
    //   116: goto +6 -> 122
    //   119: aconst_null
    //   120: astore 6
    //   122: aload 7
    //   124: astore 8
    //   126: aload 7
    //   128: ifnonnull +7 -> 135
    //   131: ldc -6
    //   133: astore 8
    //   135: aload_0
    //   136: invokevirtual 238	x2/H:f	()I
    //   139: aload_0
    //   140: invokevirtual 245	x2/H:g	()I
    //   143: aload 8
    //   145: aload 6
    //   147: invokestatic 253	x2/O:g	(IILjava/lang/String;Ljava/lang/Throwable;)Lx2/O;
    //   150: astore_0
    //   151: goto +55 -> 206
    //   154: ldc -115
    //   156: ldc -91
    //   158: aload 6
    //   160: invokestatic 168	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   163: pop
    //   164: ldc -55
    //   166: astore_0
    //   167: aload_0
    //   168: aload 6
    //   170: invokestatic 204	x2/O:d	(Ljava/lang/String;Ljava/lang/Throwable;)Lx2/O;
    //   173: astore_0
    //   174: goto +32 -> 206
    //   177: astore 6
    //   179: ldc -115
    //   181: ldc -91
    //   183: aload 6
    //   185: invokestatic 168	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   188: pop
    //   189: ldc -50
    //   191: aload 6
    //   193: invokevirtual 212	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   196: invokestatic 215	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   199: invokevirtual 219	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   202: astore_0
    //   203: goto -36 -> 167
    //   206: aload 5
    //   208: invokestatic 72	android/os/StrictMode:setThreadPolicy	(Landroid/os/StrictMode$ThreadPolicy;)V
    //   211: aload_0
    //   212: areturn
    //   213: aload 5
    //   215: invokestatic 72	android/os/StrictMode:setThreadPolicy	(Landroid/os/StrictMode$ThreadPolicy;)V
    //   218: aload_0
    //   219: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	220	0	paramString	String
    //   0	220	1	paramBoolean1	boolean
    //   0	220	2	paramBoolean2	boolean
    //   0	220	3	paramBoolean3	boolean
    //   0	220	4	paramBoolean4	boolean
    //   3	211	5	localThreadPolicy	StrictMode.ThreadPolicy
    //   18	26	6	localF	F
    //   58	9	6	localRemoteException	RemoteException
    //   109	60	6	localNameNotFoundException	android.content.pm.PackageManager.NameNotFoundException
    //   177	15	6	locala	DynamiteModule.a
    //   96	31	7	str1	String
    //   124	20	8	str2	String
    // Exception table:
    //   from	to	target	type
    //   5	12	54	finally
    //   12	15	54	finally
    //   15	35	54	finally
    //   40	51	54	finally
    //   63	74	54	finally
    //   74	89	54	finally
    //   92	116	54	finally
    //   135	151	54	finally
    //   154	164	54	finally
    //   167	174	54	finally
    //   179	203	54	finally
    //   40	51	58	android/os/RemoteException
    //   63	74	58	android/os/RemoteException
    //   12	15	177	com/google/android/gms/dynamite/DynamiteModule$a
  }
  
  public static void h()
  {
    if (e != null) {
      return;
    }
    n.i(g);
    synchronized (f)
    {
      if (e == null) {
        e = A2.O.o(DynamiteModule.d(g, DynamiteModule.f, "com.google.android.gms.googlecertificates").c("com.google.android.gms.common.GoogleCertificatesImpl"));
      }
    }
    return;
    throw ((Throwable)localObject2);
  }
}

/* Location:
 * Qualified Name:     x2.E
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */