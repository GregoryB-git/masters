package y1;

import A1.d;
import A1.g;
import O1.C.a;
import O1.v;
import android.os.BaseBundle;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.x;
import org.json.JSONArray;
import org.json.JSONException;
import x1.B;
import x1.F.b;
import x1.F.c;
import x1.K;
import x1.N;

public final class n
{
  public static final n a = new n();
  public static final String b = n.class.getName();
  public static final int c = 100;
  public static volatile f d = new f();
  public static final ScheduledExecutorService e = Executors.newSingleThreadScheduledExecutor();
  public static ScheduledFuture f;
  public static final Runnable g = new h();
  
  public static final void g(a parama, e parame)
  {
    if (T1.a.d(n.class)) {
      return;
    }
    try
    {
      Intrinsics.checkNotNullParameter(parama, "accessTokenAppId");
      Intrinsics.checkNotNullParameter(parame, "appEvent");
      ScheduledExecutorService localScheduledExecutorService = e;
      i locali = new y1/i;
      locali.<init>(parama, parame);
      localScheduledExecutorService.execute(locali);
      return;
    }
    finally
    {
      T1.a.b(parama, n.class);
    }
  }
  
  public static final void h(a parama, e parame)
  {
    if (T1.a.d(n.class)) {
      return;
    }
    try
    {
      Intrinsics.checkNotNullParameter(parama, "$accessTokenAppId");
      Intrinsics.checkNotNullParameter(parame, "$appEvent");
      d.a(parama, parame);
      if ((p.b.e() != p.b.p) && (d.d() > c)) {
        n(C.s);
      }
    }
    finally
    {
      break label93;
    }
    if (f == null) {
      f = e.schedule(g, 15L, TimeUnit.SECONDS);
    }
    return;
    label93:
    T1.a.b(parama, n.class);
  }
  
  public static final x1.F i(a parama, H paramH, boolean paramBoolean, E paramE)
  {
    boolean bool = false;
    if (T1.a.d(n.class)) {
      return null;
    }
    Object localObject1;
    O1.r localr;
    try
    {
      Intrinsics.checkNotNullParameter(parama, "accessTokenAppId");
      Intrinsics.checkNotNullParameter(paramH, "appEvents");
      Intrinsics.checkNotNullParameter(paramE, "flushState");
      localObject1 = parama.b();
      localr = v.q((String)localObject1, false);
      localObject2 = x1.F.n;
      localObject3 = x.a;
      localObject3 = String.format("%s/activities", Arrays.copyOf(new Object[] { localObject1 }, 1));
      Intrinsics.checkNotNullExpressionValue(localObject3, "java.lang.String.format(format, *args)");
      localObject1 = ((F.c)localObject2).A(null, (String)localObject3, null, null);
      ((x1.F)localObject1).D(true);
      localObject3 = ((x1.F)localObject1).u();
      localObject2 = localObject3;
      if (localObject3 == null)
      {
        localObject2 = new android/os/Bundle;
        ((Bundle)localObject2).<init>();
      }
    }
    finally
    {
      break label264;
    }
    ((BaseBundle)localObject2).putString("access_token", parama.a());
    Object localObject3 = F.b.d();
    if (localObject3 != null) {
      ((BaseBundle)localObject2).putString("device_token", (String)localObject3);
    }
    localObject3 = s.c.k();
    if (localObject3 != null) {
      ((BaseBundle)localObject2).putString("install_referrer", (String)localObject3);
    }
    ((x1.F)localObject1).G((Bundle)localObject2);
    if (localr != null) {
      bool = localr.n();
    }
    int i = paramH.e((x1.F)localObject1, B.l(), bool, paramBoolean);
    if (i == 0) {
      return null;
    }
    paramE.c(paramE.a() + i);
    Object localObject2 = new y1/k;
    ((k)localObject2).<init>(parama, (x1.F)localObject1, paramH, paramE);
    ((x1.F)localObject1).C((F.b)localObject2);
    return (x1.F)localObject1;
    label264:
    T1.a.b(parama, n.class);
    return null;
  }
  
  public static final void j(a parama, x1.F paramF, H paramH, E paramE, K paramK)
  {
    if (T1.a.d(n.class)) {
      return;
    }
    try
    {
      Intrinsics.checkNotNullParameter(parama, "$accessTokenAppId");
      Intrinsics.checkNotNullParameter(paramF, "$postRequest");
      Intrinsics.checkNotNullParameter(paramH, "$appEvents");
      Intrinsics.checkNotNullParameter(paramE, "$flushState");
      Intrinsics.checkNotNullParameter(paramK, "response");
      q(parama, paramF, paramK, paramH, paramE);
      return;
    }
    finally
    {
      T1.a.b(parama, n.class);
    }
  }
  
  public static final List k(f paramf, E paramE)
  {
    if (T1.a.d(n.class)) {
      return null;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramf, "appEventCollection");
      Intrinsics.checkNotNullParameter(paramE, "flushResults");
      boolean bool = B.z(B.l());
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      Iterator localIterator = paramf.f().iterator();
      for (;;)
      {
        if (!localIterator.hasNext()) {
          break label145;
        }
        Object localObject = (a)localIterator.next();
        H localH = paramf.c((a)localObject);
        if (localH == null) {
          break;
        }
        localObject = i((a)localObject, localH, bool, paramE);
        if (localObject != null)
        {
          localArrayList.add(localObject);
          if (d.a.f()) {
            g.l((x1.F)localObject);
          }
        }
      }
      label145:
      label147:
      return null;
    }
    finally
    {
      break label147;
      paramf = new java/lang/IllegalStateException;
      paramf.<init>("Required value was null.".toString());
      throw paramf;
      return localArrayList;
      T1.a.b(paramf, n.class);
    }
  }
  
  public static final void l(C paramC)
  {
    if (T1.a.d(n.class)) {
      return;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramC, "reason");
      ScheduledExecutorService localScheduledExecutorService = e;
      j localj = new y1/j;
      localj.<init>(paramC);
      localScheduledExecutorService.execute(localj);
      return;
    }
    finally
    {
      T1.a.b(paramC, n.class);
    }
  }
  
  public static final void m(C paramC)
  {
    if (T1.a.d(n.class)) {
      return;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramC, "$reason");
      n(paramC);
      return;
    }
    finally
    {
      T1.a.b(paramC, n.class);
    }
  }
  
  /* Error */
  public static final void n(C paramC)
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 82	T1/a:d	(Ljava/lang/Object;)Z
    //   5: ifeq +4 -> 9
    //   8: return
    //   9: aload_0
    //   10: ldc_w 359
    //   13: invokestatic 90	kotlin/jvm/internal/Intrinsics:checkNotNullParameter	(Ljava/lang/Object;Ljava/lang/String;)V
    //   16: invokestatic 372	y1/g:a	()Ly1/G;
    //   19: astore_1
    //   20: getstatic 40	y1/n:d	Ly1/f;
    //   23: aload_1
    //   24: invokevirtual 375	y1/f:b	(Ly1/G;)V
    //   27: aload_0
    //   28: getstatic 40	y1/n:d	Ly1/f;
    //   31: invokestatic 378	y1/n:u	(Ly1/C;Ly1/f;)Ly1/E;
    //   34: astore_0
    //   35: aload_0
    //   36: ifnull +56 -> 92
    //   39: new 380	android/content/Intent
    //   42: astore_1
    //   43: aload_1
    //   44: ldc_w 382
    //   47: invokespecial 383	android/content/Intent:<init>	(Ljava/lang/String;)V
    //   50: aload_1
    //   51: ldc_w 385
    //   54: aload_0
    //   55: invokevirtual 274	y1/E:a	()I
    //   58: invokevirtual 389	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
    //   61: pop
    //   62: aload_1
    //   63: ldc_w 391
    //   66: aload_0
    //   67: invokevirtual 394	y1/E:b	()Ly1/D;
    //   70: invokevirtual 397	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;
    //   73: pop
    //   74: invokestatic 265	x1/B:l	()Landroid/content/Context;
    //   77: invokestatic 402	Z/a:b	(Landroid/content/Context;)LZ/a;
    //   80: aload_1
    //   81: invokevirtual 405	Z/a:d	(Landroid/content/Intent;)Z
    //   84: pop
    //   85: goto +7 -> 92
    //   88: astore_0
    //   89: goto +17 -> 106
    //   92: return
    //   93: astore_0
    //   94: getstatic 33	y1/n:b	Ljava/lang/String;
    //   97: ldc_w 407
    //   100: aload_0
    //   101: invokestatic 413	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   104: pop
    //   105: return
    //   106: aload_0
    //   107: ldc 2
    //   109: invokestatic 105	T1/a:b	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   112: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	113	0	paramC	C
    //   19	62	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   9	27	88	finally
    //   27	35	88	finally
    //   39	85	88	finally
    //   94	105	88	finally
    //   27	35	93	java/lang/Exception
  }
  
  /* Error */
  public static final void o()
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 82	T1/a:d	(Ljava/lang/Object;)Z
    //   5: ifeq +4 -> 9
    //   8: return
    //   9: aconst_null
    //   10: putstatic 141	y1/n:f	Ljava/util/concurrent/ScheduledFuture;
    //   13: getstatic 116	y1/p:b	Ly1/p$a;
    //   16: invokevirtual 121	y1/p$a:e	()Ly1/p$b;
    //   19: getstatic 127	y1/p$b:p	Ly1/p$b;
    //   22: if_acmpeq +16 -> 38
    //   25: getstatic 415	y1/C:p	Ly1/C;
    //   28: invokestatic 139	y1/n:n	(Ly1/C;)V
    //   31: goto +7 -> 38
    //   34: astore_0
    //   35: goto +4 -> 39
    //   38: return
    //   39: aload_0
    //   40: ldc 2
    //   42: invokestatic 105	T1/a:b	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   45: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   34	6	0	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   9	31	34	finally
  }
  
  public static final Set p()
  {
    if (T1.a.d(n.class)) {
      return null;
    }
    try
    {
      Set localSet = d.f();
      return localSet;
    }
    finally
    {
      T1.a.b(localThrowable, n.class);
    }
    return null;
  }
  
  public static final void q(a parama, x1.F paramF, K paramK, H paramH, E paramE)
  {
    if (T1.a.d(n.class)) {
      return;
    }
    x1.r localr;
    boolean bool;
    try
    {
      Intrinsics.checkNotNullParameter(parama, "accessTokenAppId");
      Intrinsics.checkNotNullParameter(paramF, "request");
      Intrinsics.checkNotNullParameter(paramK, "response");
      Intrinsics.checkNotNullParameter(paramH, "appEvents");
      Intrinsics.checkNotNullParameter(paramE, "flushState");
      localr = paramK.b();
      localObject1 = "Success";
      localObject2 = D.o;
      bool = true;
      if (localr == null) {
        break label140;
      }
      if (localr.b() == -1)
      {
        localObject1 = "Failed: No Connectivity";
        localObject2 = D.q;
      }
    }
    finally
    {
      break label327;
    }
    Object localObject2 = x.a;
    Object localObject1 = String.format("Failed:\n  Response: %s\n  Error %s", Arrays.copyOf(new Object[] { paramK.toString(), localr.toString() }, 2));
    Intrinsics.checkNotNullExpressionValue(localObject1, "java.lang.String.format(format, *args)");
    localObject2 = D.p;
    label140:
    paramK = B.a;
    if (B.H(N.s))
    {
      Object localObject3 = (String)paramF.w();
      try
      {
        paramK = new org/json/JSONArray;
        paramK.<init>((String)localObject3);
        paramK = paramK.toString(2);
        Intrinsics.checkNotNullExpressionValue(paramK, "{\n            val jsonArray = JSONArray(eventsJsonString)\n            jsonArray.toString(2)\n          }");
      }
      catch (JSONException paramK)
      {
        paramK = "<Can't encode events for debug logging>";
      }
      C.a locala = O1.C.e;
      localObject3 = N.s;
      String str = b;
      Intrinsics.checkNotNullExpressionValue(str, "TAG");
      locala.c((N)localObject3, str, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", new Object[] { String.valueOf(paramF.q()), localObject1, paramK });
    }
    if (localr == null) {
      bool = false;
    }
    paramH.b(bool);
    localObject1 = D.q;
    if (localObject2 == localObject1)
    {
      paramK = B.t();
      paramF = new y1/m;
      paramF.<init>(parama, paramH);
      paramK.execute(paramF);
    }
    if ((localObject2 != D.o) && (paramE.b() != localObject1)) {
      paramE.d((D)localObject2);
    }
    return;
    label327:
    T1.a.b(parama, n.class);
  }
  
  public static final void r(a parama, H paramH)
  {
    if (T1.a.d(n.class)) {
      return;
    }
    try
    {
      Intrinsics.checkNotNullParameter(parama, "$accessTokenAppId");
      Intrinsics.checkNotNullParameter(paramH, "$appEvents");
      o.a(parama, paramH);
      return;
    }
    finally
    {
      T1.a.b(parama, n.class);
    }
  }
  
  public static final void s()
  {
    if (T1.a.d(n.class)) {
      return;
    }
    try
    {
      ScheduledExecutorService localScheduledExecutorService = e;
      l locall = new y1/l;
      locall.<init>();
      localScheduledExecutorService.execute(locall);
      return;
    }
    finally
    {
      T1.a.b(localThrowable, n.class);
    }
  }
  
  public static final void t()
  {
    if (T1.a.d(n.class)) {
      return;
    }
    try
    {
      Object localObject = o.a;
      o.b(d);
      localObject = new y1/f;
      ((f)localObject).<init>();
      d = (f)localObject;
      return;
    }
    finally
    {
      T1.a.b(localThrowable, n.class);
    }
  }
  
  public static final E u(C paramC, f paramf)
  {
    if (T1.a.d(n.class)) {
      return null;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramC, "reason");
      Intrinsics.checkNotNullParameter(paramf, "appEventCollection");
      E localE = new y1/E;
      localE.<init>();
      List localList = k(paramf, localE);
      if ((((Collection)localList).isEmpty() ^ true))
      {
        C.a locala = O1.C.e;
        paramf = N.s;
        String str = b;
        Intrinsics.checkNotNullExpressionValue(str, "TAG");
        locala.c(paramf, str, "Flushing %d events due to %s.", new Object[] { Integer.valueOf(localE.a()), paramC.toString() });
        paramC = localList.iterator();
        while (paramC.hasNext()) {
          ((x1.F)paramC.next()).k();
        }
      }
      label146:
      return null;
    }
    finally
    {
      break label146;
      return localE;
      return null;
      T1.a.b(paramC, n.class);
    }
  }
}

/* Location:
 * Qualified Name:     y1.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */