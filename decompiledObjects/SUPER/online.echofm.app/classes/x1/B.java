package x1;

import G1.f;
import I1.c;
import O1.E;
import O1.H;
import O1.P;
import O1.b;
import O1.b.a;
import O1.n;
import O1.n.a;
import O1.n.b;
import W5.I;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.AsyncTask;
import android.os.BaseBundle;
import java.io.File;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import y1.p;
import y1.p.a;

public final class B
{
  public static final B a = new B();
  public static final String b = B.class.getCanonicalName();
  public static final HashSet c = I.c(new N[] { N.t });
  public static Executor d;
  public static volatile String e;
  public static volatile String f;
  public static volatile String g;
  public static volatile Boolean h;
  public static AtomicLong i = new AtomicLong(65536L);
  public static volatile boolean j;
  public static boolean k;
  public static O1.B l;
  public static Context m;
  public static int n = 64206;
  public static final ReentrantLock o = new ReentrantLock();
  public static String p = H.a();
  public static boolean q;
  public static boolean r;
  public static boolean s;
  public static final AtomicBoolean t = new AtomicBoolean(false);
  public static volatile String u = "instagram.com";
  public static volatile String v = "facebook.com";
  public static a w = new s();
  public static boolean x;
  
  public static final long A()
  {
    O1.Q.l();
    return i.get();
  }
  
  public static final String B()
  {
    return "16.3.0";
  }
  
  public static final F C(a parama, String paramString, JSONObject paramJSONObject, F.b paramb)
  {
    return F.n.A(parama, paramString, paramJSONObject, paramb);
  }
  
  public static final boolean D()
  {
    return j;
  }
  
  public static final boolean E()
  {
    try
    {
      boolean bool = x;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static final boolean F()
  {
    return t.get();
  }
  
  public static final boolean G()
  {
    return k;
  }
  
  public static final boolean H(N paramN)
  {
    Intrinsics.checkNotNullParameter(paramN, "behavior");
    boolean bool;
    synchronized (c)
    {
      if (D())
      {
        bool = ???.contains(paramN);
        if (bool) {
          bool = true;
        }
      }
    }
    return bool;
  }
  
  public static final void I(Context paramContext)
  {
    if (paramContext == null) {
      return;
    }
    try
    {
      ApplicationInfo localApplicationInfo = paramContext.getPackageManager().getApplicationInfo(paramContext.getPackageName(), 128);
      Intrinsics.checkNotNullExpressionValue(localApplicationInfo, "try {\n          context.packageManager.getApplicationInfo(\n              context.packageName, PackageManager.GET_META_DATA)\n        } catch (e: PackageManager.NameNotFoundException) {\n          return\n        }");
      if (metaData == null) {
        return;
      }
      if (e == null)
      {
        paramContext = metaData.get("com.facebook.sdk.ApplicationId");
        if ((paramContext instanceof String))
        {
          String str1 = (String)paramContext;
          paramContext = Locale.ROOT;
          Intrinsics.checkNotNullExpressionValue(paramContext, "ROOT");
          String str2 = str1.toLowerCase(paramContext);
          Intrinsics.checkNotNullExpressionValue(str2, "(this as java.lang.String).toLowerCase(locale)");
          paramContext = str1;
          if (i.s(str2, "fb", false, 2, null))
          {
            paramContext = str1.substring(2);
            Intrinsics.checkNotNullExpressionValue(paramContext, "(this as java.lang.String).substring(startIndex)");
          }
          e = paramContext;
        }
        else if ((paramContext instanceof Number))
        {
          throw new o("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
        }
      }
      if (f == null) {
        f = metaData.getString("com.facebook.sdk.ApplicationName");
      }
      if (g == null) {
        g = metaData.getString("com.facebook.sdk.ClientToken");
      }
      if (n == 64206) {
        n = metaData.getInt("com.facebook.sdk.CallbackOffset", 64206);
      }
      if (h == null) {
        h = Boolean.valueOf(metaData.getBoolean("com.facebook.sdk.CodelessDebugLogEnabled", false));
      }
      return;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      for (;;) {}
    }
  }
  
  public static final void K(Context paramContext, String paramString)
  {
    if (T1.a.d(B.class)) {
      return;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramContext, "context");
      Intrinsics.checkNotNullParameter(paramString, "applicationId");
      Context localContext = paramContext.getApplicationContext();
      if (localContext == null) {
        return;
      }
      paramContext = t();
      A localA = new x1/A;
      localA.<init>(localContext, paramString);
      paramContext.execute(localA);
      paramContext = n.a;
      if ((n.g(n.b.E)) && (c.d())) {
        c.g(paramString, "com.facebook.sdk.attributionTracking");
      }
    }
    finally
    {
      break label88;
    }
    return;
    label88:
    T1.a.b(paramContext, B.class);
  }
  
  public static final void L(Context paramContext, String paramString)
  {
    Intrinsics.checkNotNullParameter(paramContext, "$applicationContext");
    Intrinsics.checkNotNullParameter(paramString, "$applicationId");
    a.J(paramContext, paramString);
  }
  
  public static final void M(Context paramContext)
  {
    try
    {
      Intrinsics.checkNotNullParameter(paramContext, "applicationContext");
      N(paramContext, null);
      return;
    }
    finally
    {
      paramContext = finally;
      throw paramContext;
    }
  }
  
  public static final void N(Context paramContext, b paramb)
  {
    label405:
    try
    {
      Intrinsics.checkNotNullParameter(paramContext, "applicationContext");
      localObject = t;
      if (((AtomicBoolean)localObject).get())
      {
        if (paramb != null) {
          paramb.a();
        }
        return;
      }
    }
    finally
    {
      Object localObject;
      break label405;
      O1.Q.e(paramContext, false);
      O1.Q.f(paramContext, false);
      Context localContext = paramContext.getApplicationContext();
      Intrinsics.checkNotNullExpressionValue(localContext, "applicationContext.applicationContext");
      m = localContext;
      p.b.d(paramContext);
      paramContext = m;
      if (paramContext != null)
      {
        I(paramContext);
        paramContext = e;
        if ((paramContext != null) && (paramContext.length() != 0))
        {
          paramContext = g;
          if ((paramContext != null) && (paramContext.length() != 0))
          {
            ((AtomicBoolean)localObject).set(true);
            if (o()) {
              j();
            }
            paramContext = m;
            if (paramContext != null)
            {
              if (((paramContext instanceof Application)) && (X.f()))
              {
                paramContext = f.a;
                paramContext = m;
                if (paramContext != null)
                {
                  f.x((Application)paramContext, e);
                }
                else
                {
                  Intrinsics.n("applicationContext");
                  throw null;
                }
              }
              O1.v.h();
              E.x();
              localObject = b.b;
              paramContext = m;
              if (paramContext != null)
              {
                ((b.a)localObject).a(paramContext);
                paramContext = new O1/B;
                localObject = new x1/t;
                ((t)localObject).<init>();
                paramContext.<init>((Callable)localObject);
                l = paramContext;
                paramContext = n.a;
                localObject = n.b.I;
                paramContext = new x1/u;
                paramContext.<init>();
                n.a((n.b)localObject, paramContext);
                paramContext = n.b.s;
                localObject = new x1/v;
                ((v)localObject).<init>();
                n.a(paramContext, (n.a)localObject);
                localObject = n.b.T;
                paramContext = new x1/w;
                paramContext.<init>();
                n.a((n.b)localObject, paramContext);
                paramContext = n.b.U;
                localObject = new x1/x;
                ((x)localObject).<init>();
                n.a(paramContext, (n.a)localObject);
                paramContext = n.b.V;
                localObject = new x1/y;
                ((y)localObject).<init>();
                n.a(paramContext, (n.a)localObject);
                localObject = new java/util/concurrent/FutureTask;
                paramContext = new x1/z;
                paramContext.<init>(paramb);
                ((FutureTask)localObject).<init>(paramContext);
                t().execute((Runnable)localObject);
                return;
              }
              Intrinsics.n("applicationContext");
              throw null;
            }
            Intrinsics.n("applicationContext");
            throw null;
          }
          paramContext = new x1/o;
          paramContext.<init>("A valid Facebook app client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk.");
          throw paramContext;
        }
        paramContext = new x1/o;
        paramContext.<init>("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
        throw paramContext;
      }
      Intrinsics.n("applicationContext");
      throw null;
    }
  }
  
  public static final File O()
  {
    Context localContext = m;
    if (localContext != null) {
      return localContext.getCacheDir();
    }
    Intrinsics.n("applicationContext");
    throw null;
  }
  
  public static final void P(boolean paramBoolean)
  {
    if (paramBoolean) {
      Q1.g.d();
    }
  }
  
  public static final void Q(boolean paramBoolean)
  {
    if (paramBoolean) {
      y1.B.a();
    }
  }
  
  public static final void R(boolean paramBoolean)
  {
    if (paramBoolean) {
      q = true;
    }
  }
  
  public static final void S(boolean paramBoolean)
  {
    if (paramBoolean) {
      r = true;
    }
  }
  
  public static final void T(boolean paramBoolean)
  {
    if (paramBoolean) {
      s = true;
    }
  }
  
  public static final Void U(b paramb)
  {
    g.f.e().j();
    Q.d.a().d();
    if (a.z.g())
    {
      localObject = O.v;
      if (((O.b)localObject).b() == null) {
        ((O.b)localObject).a();
      }
    }
    if (paramb != null) {
      paramb.a();
    }
    Object localObject = p.b;
    ((p.a)localObject).g(l(), e);
    X.n();
    paramb = l().getApplicationContext();
    Intrinsics.checkNotNullExpressionValue(paramb, "getApplicationContext().applicationContext");
    ((p.a)localObject).h(paramb).a();
    return null;
  }
  
  public static final void V(boolean paramBoolean)
  {
    X.s(paramBoolean);
    if (paramBoolean)
    {
      Application localApplication = (Application)l();
      f localf = f.a;
      f.x(localApplication, m());
    }
  }
  
  public static final void W(String[] paramArrayOfString, int paramInt1, int paramInt2)
  {
    if (T1.a.d(B.class)) {
      return;
    }
    Object localObject = paramArrayOfString;
    if (paramArrayOfString == null) {
      try
      {
        localObject = new String[0];
      }
      finally {}
    }
    try
    {
      paramArrayOfString = new org/json/JSONObject;
      paramArrayOfString.<init>();
      JSONArray localJSONArray = new org/json/JSONArray;
      localJSONArray.<init>((Collection)W5.g.u((Object[])localObject));
      paramArrayOfString.put("data_processing_options", localJSONArray);
      paramArrayOfString.put("data_processing_options_country", paramInt1);
      paramArrayOfString.put("data_processing_options_state", paramInt2);
      localObject = m;
      if (localObject != null)
      {
        ((Context)localObject).getSharedPreferences("com.facebook.sdk.DataProcessingOptions", 0).edit().putString("data_processing_options", paramArrayOfString.toString()).apply();
        break label135;
      }
      Intrinsics.n("applicationContext");
      throw null;
    }
    catch (JSONException paramArrayOfString)
    {
      for (;;) {}
    }
    T1.a.b(paramArrayOfString, B.class);
    label135:
  }
  
  public static final void j()
  {
    x = true;
  }
  
  public static final boolean k()
  {
    return X.d();
  }
  
  public static final Context l()
  {
    O1.Q.l();
    Context localContext = m;
    if (localContext != null) {
      return localContext;
    }
    Intrinsics.n("applicationContext");
    throw null;
  }
  
  public static final String m()
  {
    O1.Q.l();
    String str = e;
    if (str != null) {
      return str;
    }
    throw new o("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
  }
  
  public static final String n()
  {
    O1.Q.l();
    return f;
  }
  
  public static final boolean o()
  {
    return X.e();
  }
  
  public static final boolean p()
  {
    return X.f();
  }
  
  public static final int q()
  {
    O1.Q.l();
    return n;
  }
  
  public static final String r()
  {
    O1.Q.l();
    String str = g;
    if (str != null) {
      return str;
    }
    throw new o("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
  }
  
  public static final boolean s()
  {
    return X.g();
  }
  
  public static final Executor t()
  {
    Object localObject1 = o;
    ((Lock)localObject1).lock();
    try
    {
      if (d == null) {
        d = AsyncTask.THREAD_POOL_EXECUTOR;
      }
    }
    finally
    {
      break label63;
    }
    V5.t localt = V5.t.a;
    ((Lock)localObject1).unlock();
    localObject1 = d;
    if (localObject1 != null) {
      return (Executor)localObject1;
    }
    throw new IllegalStateException("Required value was null.".toString());
    label63:
    ((Lock)localObject1).unlock();
    throw localt;
  }
  
  public static final String u()
  {
    return v;
  }
  
  public static final String v()
  {
    return "fb.gg";
  }
  
  public static final String w()
  {
    Object localObject1 = P.a;
    localObject1 = b;
    Object localObject2 = kotlin.jvm.internal.x.a;
    localObject2 = String.format("getGraphApiVersion: %s", Arrays.copyOf(new Object[] { p }, 1));
    Intrinsics.checkNotNullExpressionValue(localObject2, "java.lang.String.format(format, *args)");
    P.j0((String)localObject1, (String)localObject2);
    return p;
  }
  
  public static final String x()
  {
    Object localObject = a.z.e();
    if (localObject != null) {
      localObject = ((a)localObject).h();
    } else {
      localObject = null;
    }
    return P.E((String)localObject);
  }
  
  public static final String y()
  {
    return u;
  }
  
  public static final boolean z(Context paramContext)
  {
    Intrinsics.checkNotNullParameter(paramContext, "context");
    O1.Q.l();
    return paramContext.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
  }
  
  /* Error */
  public final void J(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 284	T1/a:d	(Ljava/lang/Object;)Z
    //   4: ifeq +4 -> 8
    //   7: return
    //   8: getstatic 707	O1/a:f	LO1/a$a;
    //   11: aload_1
    //   12: invokevirtual 712	O1/a$a:e	(Landroid/content/Context;)LO1/a;
    //   15: astore_3
    //   16: aload_1
    //   17: ldc_w 324
    //   20: iconst_0
    //   21: invokevirtual 589	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   24: astore 4
    //   26: aload_2
    //   27: ldc_w 714
    //   30: invokestatic 717	kotlin/jvm/internal/Intrinsics:i	(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    //   33: astore 5
    //   35: aload 4
    //   37: aload 5
    //   39: lconst_0
    //   40: invokeinterface 721 4 0
    //   45: lstore 6
    //   47: getstatic 726	G1/h:a	LG1/h;
    //   50: astore 8
    //   52: getstatic 731	G1/h$a:o	LG1/h$a;
    //   55: aload_3
    //   56: getstatic 361	y1/p:b	Ly1/p$a;
    //   59: aload_1
    //   60: invokevirtual 366	y1/p$a:d	(Landroid/content/Context;)Ljava/lang/String;
    //   63: aload_1
    //   64: invokestatic 733	x1/B:z	(Landroid/content/Context;)Z
    //   67: aload_1
    //   68: invokestatic 736	G1/h:a	(LG1/h$a;LO1/a;Ljava/lang/String;ZLandroid/content/Context;)Lorg/json/JSONObject;
    //   71: astore_1
    //   72: getstatic 669	kotlin/jvm/internal/x:a	Lkotlin/jvm/internal/x;
    //   75: astore_3
    //   76: ldc_w 738
    //   79: iconst_1
    //   80: anewarray 4	java/lang/Object
    //   83: dup
    //   84: iconst_0
    //   85: aload_2
    //   86: aastore
    //   87: iconst_1
    //   88: invokestatic 677	java/util/Arrays:copyOf	([Ljava/lang/Object;I)[Ljava/lang/Object;
    //   91: invokestatic 681	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   94: astore_2
    //   95: aload_2
    //   96: ldc_w 683
    //   99: invokestatic 194	kotlin/jvm/internal/Intrinsics:checkNotNullExpressionValue	(Ljava/lang/Object;Ljava/lang/String;)V
    //   102: getstatic 115	x1/B:w	Lx1/B$a;
    //   105: aconst_null
    //   106: aload_2
    //   107: aload_1
    //   108: aconst_null
    //   109: invokeinterface 740 5 0
    //   114: astore_1
    //   115: lload 6
    //   117: lconst_0
    //   118: lcmp
    //   119: ifne +72 -> 191
    //   122: aload_1
    //   123: invokevirtual 743	x1/F:k	()Lx1/K;
    //   126: invokevirtual 748	x1/K:b	()Lx1/r;
    //   129: ifnonnull +62 -> 191
    //   132: aload 4
    //   134: invokeinterface 595 1 0
    //   139: astore_1
    //   140: aload_1
    //   141: aload 5
    //   143: invokestatic 753	java/lang/System:currentTimeMillis	()J
    //   146: invokeinterface 757 4 0
    //   151: pop
    //   152: aload_1
    //   153: invokeinterface 607 1 0
    //   158: goto +33 -> 191
    //   161: astore_1
    //   162: goto +30 -> 192
    //   165: astore_1
    //   166: goto +18 -> 184
    //   169: astore_2
    //   170: new 241	x1/o
    //   173: astore_1
    //   174: aload_1
    //   175: ldc_w 759
    //   178: aload_2
    //   179: invokespecial 762	x1/o:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   182: aload_1
    //   183: athrow
    //   184: ldc_w 764
    //   187: aload_1
    //   188: invokestatic 768	O1/P:i0	(Ljava/lang/String;Ljava/lang/Exception;)V
    //   191: return
    //   192: aload_1
    //   193: aload_0
    //   194: invokestatic 330	T1/a:b	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   197: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	198	0	this	B
    //   0	198	1	paramContext	Context
    //   0	198	2	paramString	String
    //   15	61	3	localObject	Object
    //   24	109	4	localSharedPreferences	SharedPreferences
    //   33	109	5	str	String
    //   45	71	6	l1	long
    //   50	1	8	localh	G1.h
    // Exception table:
    //   from	to	target	type
    //   8	47	161	finally
    //   47	72	161	finally
    //   72	115	161	finally
    //   122	158	161	finally
    //   170	184	161	finally
    //   184	191	161	finally
    //   8	47	165	java/lang/Exception
    //   47	72	165	java/lang/Exception
    //   72	115	165	java/lang/Exception
    //   122	158	165	java/lang/Exception
    //   170	184	165	java/lang/Exception
    //   47	72	169	org/json/JSONException
  }
  
  public static abstract interface a
  {
    public abstract F a(a parama, String paramString, JSONObject paramJSONObject, F.b paramb);
  }
  
  public static abstract interface b
  {
    public abstract void a();
  }
}

/* Location:
 * Qualified Name:     x1.B
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */