package R2;

import A2.n;
import E2.e;
import android.app.Activity;
import android.os.BaseBundle;
import android.os.Bundle;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class v4
  extends f1
{
  public volatile w4 c;
  public volatile w4 d;
  public w4 e;
  public final Map f = new ConcurrentHashMap();
  public Activity g;
  public volatile boolean h;
  public volatile w4 i;
  public w4 j;
  public boolean k;
  public final Object l = new Object();
  
  public v4(N2 paramN2)
  {
    super(paramN2);
  }
  
  public final boolean A()
  {
    return false;
  }
  
  public final w4 C(boolean paramBoolean)
  {
    v();
    n();
    if (!paramBoolean) {
      return e;
    }
    w4 localw4 = e;
    if (localw4 != null) {
      return localw4;
    }
    return j;
  }
  
  public final String D(Class paramClass, String paramString)
  {
    paramClass = paramClass.getCanonicalName();
    if (paramClass == null) {
      return paramString;
    }
    paramClass = paramClass.split("\\.");
    if (paramClass.length > 0) {
      paramClass = paramClass[(paramClass.length - 1)];
    } else {
      paramClass = "";
    }
    paramString = paramClass;
    if (paramClass.length() > f().t(null)) {
      paramString = paramClass.substring(0, f().t(null));
    }
    return paramString;
  }
  
  public final void I(w4 paramw41, w4 paramw42, long paramLong, boolean paramBoolean, Bundle paramBundle)
  {
    n();
    int m = 0;
    int n;
    if ((paramw42 != null) && (c == c) && (y4.a(b, b)) && (y4.a(a, a))) {
      n = 0;
    } else {
      n = 1;
    }
    int i1 = m;
    if (paramBoolean)
    {
      i1 = m;
      if (e != null) {
        i1 = 1;
      }
    }
    if (n != 0)
    {
      Bundle localBundle = new android/os/Bundle;
      if (paramBundle != null) {
        localBundle.<init>(paramBundle);
      }
      for (;;)
      {
        break;
        localBundle.<init>();
      }
      S5.L(paramw41, localBundle, true);
      if (paramw42 != null)
      {
        paramBundle = a;
        if (paramBundle != null) {
          localBundle.putString("_pn", paramBundle);
        }
        paramBundle = b;
        if (paramBundle != null) {
          localBundle.putString("_pc", paramBundle);
        }
        localBundle.putLong("_pi", c);
      }
      long l1;
      if (i1 != 0)
      {
        l1 = uf.a(paramLong);
        if (l1 > 0L) {
          k().P(localBundle, l1);
        }
      }
      if (!f().Q()) {
        localBundle.putLong("_mst", 1L);
      }
      if (e) {}
      for (paramw42 = "app";; paramw42 = "auto") {
        break;
      }
      long l2 = b().a();
      if (e)
      {
        l1 = f;
        if (l1 != 0L) {}
      }
      else
      {
        l1 = l2;
      }
      r().U(paramw42, "_vs", l1, localBundle);
    }
    if (i1 != 0) {
      J(e, true, paramLong);
    }
    e = paramw41;
    if (e) {
      j = paramw41;
    }
    t().G(paramw41);
  }
  
  public final void J(w4 paramw4, boolean paramBoolean, long paramLong)
  {
    o().v(b().b());
    boolean bool;
    if ((paramw4 != null) && (d)) {
      bool = true;
    } else {
      bool = false;
    }
    if ((u().E(bool, paramBoolean, paramLong)) && (paramw4 != null)) {
      d = false;
    }
  }
  
  public final void K(Activity paramActivity)
  {
    synchronized (l)
    {
      if (paramActivity == g) {
        g = null;
      }
    }
    if (!f().Q()) {
      return;
    }
    f.remove(paramActivity);
  }
  
  public final void L(Activity paramActivity, w4 paramw4, boolean paramBoolean)
  {
    if (c == null) {}
    for (w4 localw4 = d;; localw4 = c) {
      break;
    }
    if (b == null)
    {
      if (paramActivity != null) {}
      for (paramActivity = D(paramActivity.getClass(), "Activity");; paramActivity = null) {
        break;
      }
      paramw4 = new w4(a, paramActivity, c, e, f);
    }
    d = c;
    c = paramw4;
    long l1 = b().b();
    e().D(new A4(this, paramw4, localw4, l1, paramBoolean));
  }
  
  public final void M(Activity paramActivity, Bundle paramBundle)
  {
    if (!f().Q()) {
      return;
    }
    if (paramBundle == null) {
      return;
    }
    paramBundle = paramBundle.getBundle("com.google.app_measurement.screen_service");
    if (paramBundle == null) {
      return;
    }
    paramBundle = new w4(paramBundle.getString("name"), paramBundle.getString("referrer_name"), paramBundle.getLong("id"));
    f.put(paramActivity, paramBundle);
  }
  
  public final void N(Activity paramActivity, String paramString1, String paramString2)
  {
    if (!f().Q())
    {
      j().M().a("setCurrentScreen cannot be called while screen reporting is disabled.");
      return;
    }
    Object localObject = c;
    if (localObject == null)
    {
      j().M().a("setCurrentScreen cannot be called while no activity active");
      return;
    }
    if (f.get(paramActivity) == null)
    {
      j().M().a("setCurrentScreen must be called with an activity in the activity lifecycle");
      return;
    }
    String str = paramString2;
    if (paramString2 == null) {
      str = D(paramActivity.getClass(), "Activity");
    }
    boolean bool1 = y4.a(b, str);
    boolean bool2 = y4.a(a, paramString1);
    if ((bool1) && (bool2))
    {
      j().M().a("setCurrentScreen cannot be called with the same class and name");
      return;
    }
    if ((paramString1 != null) && ((paramString1.length() <= 0) || (paramString1.length() > f().t(null))))
    {
      j().M().b("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(paramString1.length()));
      return;
    }
    if ((str != null) && ((str.length() <= 0) || (str.length() > f().t(null))))
    {
      j().M().b("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
      return;
    }
    localObject = j().K();
    if (paramString1 == null) {
      paramString2 = "null";
    } else {
      paramString2 = paramString1;
    }
    ((a2)localObject).c("Setting current screen to name, class", paramString2, str);
    paramString1 = new w4(paramString1, str, k().P0());
    f.put(paramActivity, paramString1);
    L(paramActivity, paramString1, true);
  }
  
  public final void O(Bundle paramBundle, long paramLong)
  {
    Object localObject2;
    String str;
    Object localObject3;
    boolean bool1;
    boolean bool2;
    a2 locala2;
    synchronized (l)
    {
      if (!k)
      {
        j().M().a("Cannot log screen view event when the app is in the background.");
        return;
      }
    }
  }
  
  public final w4 P()
  {
    return c;
  }
  
  public final void Q(Activity paramActivity)
  {
    synchronized (l)
    {
      k = false;
      h = true;
      long l1 = b().b();
      if (!f().Q())
      {
        c = null;
        e().D(new C4(this, l1));
        return;
      }
      paramActivity = T(paramActivity);
      d = c;
      c = null;
      e().D(new B4(this, paramActivity, l1));
      return;
    }
  }
  
  public final void R(Activity paramActivity, Bundle paramBundle)
  {
    if (!f().Q()) {
      return;
    }
    if (paramBundle == null) {
      return;
    }
    paramActivity = (w4)f.get(paramActivity);
    if (paramActivity == null) {
      return;
    }
    Bundle localBundle = new Bundle();
    localBundle.putLong("id", c);
    localBundle.putString("name", a);
    localBundle.putString("referrer_name", b);
    paramBundle.putBundle("com.google.app_measurement.screen_service", localBundle);
  }
  
  /* Error */
  public final void S(Activity paramActivity)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 30	R2/v4:l	Ljava/lang/Object;
    //   4: astore_2
    //   5: aload_2
    //   6: monitorenter
    //   7: aload_0
    //   8: iconst_1
    //   9: putfield 364	R2/v4:k	Z
    //   12: aload_1
    //   13: aload_0
    //   14: getfield 246	R2/v4:g	Landroid/app/Activity;
    //   17: if_acmpeq +71 -> 88
    //   20: aload_0
    //   21: getfield 30	R2/v4:l	Ljava/lang/Object;
    //   24: astore_3
    //   25: aload_3
    //   26: monitorenter
    //   27: aload_0
    //   28: aload_1
    //   29: putfield 246	R2/v4:g	Landroid/app/Activity;
    //   32: aload_0
    //   33: iconst_0
    //   34: putfield 372	R2/v4:h	Z
    //   37: aload_3
    //   38: monitorexit
    //   39: aload_0
    //   40: invokevirtual 115	R2/m3:f	()LR2/g;
    //   43: invokevirtual 188	R2/g:Q	()Z
    //   46: ifeq +42 -> 88
    //   49: aload_0
    //   50: aconst_null
    //   51: putfield 378	R2/v4:i	LR2/w4;
    //   54: aload_0
    //   55: invokevirtual 270	R2/m3:e	()LR2/G2;
    //   58: astore_3
    //   59: new 405	R2/E4
    //   62: astore 4
    //   64: aload 4
    //   66: aload_0
    //   67: invokespecial 408	R2/E4:<init>	(LR2/v4;)V
    //   70: aload_3
    //   71: aload 4
    //   73: invokevirtual 280	R2/G2:D	(Ljava/lang/Runnable;)V
    //   76: goto +12 -> 88
    //   79: astore_1
    //   80: goto +89 -> 169
    //   83: astore_1
    //   84: aload_3
    //   85: monitorexit
    //   86: aload_1
    //   87: athrow
    //   88: aload_2
    //   89: monitorexit
    //   90: aload_0
    //   91: invokevirtual 115	R2/m3:f	()LR2/g;
    //   94: invokevirtual 188	R2/g:Q	()Z
    //   97: ifne +27 -> 124
    //   100: aload_0
    //   101: aload_0
    //   102: getfield 378	R2/v4:i	LR2/w4;
    //   105: putfield 254	R2/v4:c	LR2/w4;
    //   108: aload_0
    //   109: invokevirtual 270	R2/m3:e	()LR2/G2;
    //   112: new 410	R2/z4
    //   115: dup
    //   116: aload_0
    //   117: invokespecial 411	R2/z4:<init>	(LR2/v4;)V
    //   120: invokevirtual 280	R2/G2:D	(Ljava/lang/Runnable;)V
    //   123: return
    //   124: aload_0
    //   125: aload_1
    //   126: aload_0
    //   127: aload_1
    //   128: invokevirtual 392	R2/v4:T	(Landroid/app/Activity;)LR2/w4;
    //   131: iconst_0
    //   132: invokevirtual 361	R2/v4:L	(Landroid/app/Activity;LR2/w4;Z)V
    //   135: aload_0
    //   136: invokevirtual 230	R2/G1:o	()LR2/B;
    //   139: astore_1
    //   140: aload_1
    //   141: invokevirtual 199	R2/m3:b	()LE2/e;
    //   144: invokeinterface 232 1 0
    //   149: lstore 5
    //   151: aload_1
    //   152: invokevirtual 270	R2/m3:e	()LR2/G2;
    //   155: new 413	R2/d0
    //   158: dup
    //   159: aload_1
    //   160: lload 5
    //   162: invokespecial 416	R2/d0:<init>	(LR2/B;J)V
    //   165: invokevirtual 280	R2/G2:D	(Ljava/lang/Runnable;)V
    //   168: return
    //   169: aload_2
    //   170: monitorexit
    //   171: aload_1
    //   172: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	173	0	this	v4
    //   0	173	1	paramActivity	Activity
    //   4	166	2	localObject1	Object
    //   62	10	4	localE4	E4
    //   149	12	5	l1	long
    // Exception table:
    //   from	to	target	type
    //   7	27	79	finally
    //   39	76	79	finally
    //   86	88	79	finally
    //   88	90	79	finally
    //   169	171	79	finally
    //   27	39	83	finally
    //   84	86	83	finally
  }
  
  public final w4 T(Activity paramActivity)
  {
    n.i(paramActivity);
    w4 localw41 = (w4)f.get(paramActivity);
    w4 localw42 = localw41;
    if (localw41 == null)
    {
      localw42 = new w4(null, D(paramActivity.getClass(), "Activity"), k().P0());
      f.put(paramActivity, localw42);
    }
    if (i != null) {
      return i;
    }
    return localw42;
  }
}

/* Location:
 * Qualified Name:     R2.v4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */