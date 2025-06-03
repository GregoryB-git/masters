package S1;

import O1.P;
import Q1.k;
import W5.m;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import l6.d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x1.K;

public final class c$a
{
  public static final int e(Q1.c paramc1, Q1.c paramc2)
  {
    Intrinsics.checkNotNullExpressionValue(paramc2, "o2");
    return paramc1.b(paramc2);
  }
  
  public static final void f(List paramList, K paramK)
  {
    Intrinsics.checkNotNullParameter(paramList, "$validReports");
    Intrinsics.checkNotNullParameter(paramK, "response");
    try
    {
      if (paramK.b() == null)
      {
        paramK = paramK.d();
        if (paramK == null) {
          paramK = null;
        } else {
          paramK = Boolean.valueOf(paramK.getBoolean("success"));
        }
        if (Intrinsics.a(paramK, Boolean.TRUE))
        {
          paramList = ((Iterable)paramList).iterator();
          while (paramList.hasNext()) {
            ((Q1.c)paramList.next()).a();
          }
        }
      }
      return;
    }
    catch (JSONException paramList)
    {
      for (;;) {}
    }
  }
  
  public final void c()
  {
    try
    {
      if (x1.B.p()) {
        d();
      }
    }
    finally
    {
      break label64;
    }
    if (c.a() != null)
    {
      Log.w(c.b(), "Already enabled!");
      return;
    }
    Thread.UncaughtExceptionHandler localUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
    c localc = new S1/c;
    localc.<init>(localUncaughtExceptionHandler, null);
    c.c(localc);
    Thread.setDefaultUncaughtExceptionHandler(c.a());
    return;
    label64:
    throw localUncaughtExceptionHandler;
  }
  
  public final void d()
  {
    if (P.Z()) {
      return;
    }
    Object localObject1 = k.p();
    Object localObject2 = new ArrayList(localObject1.length);
    int i = localObject1.length;
    for (int j = 0; j < i; j++) {
      ((Collection)localObject2).add(Q1.c.a.d(localObject1[j]));
    }
    localObject1 = new ArrayList();
    Object localObject3 = ((Iterable)localObject2).iterator();
    while (((Iterator)localObject3).hasNext())
    {
      localObject2 = ((Iterator)localObject3).next();
      if (((Q1.c)localObject2).f()) {
        ((Collection)localObject1).add(localObject2);
      }
    }
    localObject1 = m.E((Iterable)localObject1, new a());
    localObject2 = new JSONArray();
    localObject3 = d.g(0, Math.min(((List)localObject1).size(), 5)).iterator();
    while (((Iterator)localObject3).hasNext()) {
      ((JSONArray)localObject2).put(((List)localObject1).get(((W5.B)localObject3).b()));
    }
    localObject3 = k.a;
    k.s("crash_reports", (JSONArray)localObject2, new b((List)localObject1));
  }
}

/* Location:
 * Qualified Name:     S1.c.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */