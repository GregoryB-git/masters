package B1;

import O1.P;
import O1.a.a;
import O1.r;
import O1.v;
import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.BaseBundle;
import android.os.Build;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.x;
import org.json.JSONArray;
import org.json.JSONObject;
import x1.B;
import x1.F;
import x1.F.c;
import x1.K;

public final class e
{
  public static final e a = new e();
  public static final m b = new m();
  public static SensorManager c;
  public static l d;
  public static String e;
  public static final AtomicBoolean f = new AtomicBoolean(true);
  public static final AtomicBoolean g = new AtomicBoolean(false);
  public static volatile boolean h;
  
  public static final void d(String paramString)
  {
    boolean bool = true;
    Object localObject1 = "0";
    if (T1.a.d(e.class)) {
      return;
    }
    Bundle localBundle;
    JSONArray localJSONArray;
    try
    {
      localBundle = new android/os/Bundle;
      localBundle.<init>();
      localObject2 = B.l();
      O1.a locala = O1.a.f.e((Context)localObject2);
      localJSONArray = new org/json/JSONArray;
      localJSONArray.<init>();
      localObject2 = Build.MODEL;
      if (localObject2 == null) {
        localObject2 = "";
      }
      localJSONArray.put(localObject2);
      if (locala == null) {
        localObject2 = null;
      } else {
        localObject2 = locala.h();
      }
      if (localObject2 != null) {
        localJSONArray.put(locala.h());
      }
    }
    finally
    {
      break label348;
    }
    localJSONArray.put("");
    localJSONArray.put("0");
    Object localObject2 = localObject1;
    if (G1.g.f()) {
      localObject2 = "1";
    }
    localJSONArray.put(localObject2);
    localObject2 = P.A();
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    ((StringBuilder)localObject1).append(((Locale)localObject2).getLanguage());
    ((StringBuilder)localObject1).append('_');
    ((StringBuilder)localObject1).append(((Locale)localObject2).getCountry());
    localJSONArray.put(((StringBuilder)localObject1).toString());
    localObject2 = localJSONArray.toString();
    Intrinsics.checkNotNullExpressionValue(localObject2, "extInfoArray.toString()");
    localBundle.putString("device_session_id", g());
    localBundle.putString("extinfo", (String)localObject2);
    localObject2 = F.n;
    localObject1 = x.a;
    paramString = String.format(Locale.US, "%s/app_indexing_session", Arrays.copyOf(new Object[] { paramString }, 1));
    Intrinsics.checkNotNullExpressionValue(paramString, "java.lang.String.format(locale, format, *args)");
    localObject2 = ((F.c)localObject2).B(null, paramString, localBundle, null).k().c();
    paramString = g;
    if ((localObject2 == null) || (!((JSONObject)localObject2).optBoolean("is_app_indexing_enabled", false))) {
      bool = false;
    }
    paramString.set(bool);
    if (!paramString.get())
    {
      e = null;
    }
    else
    {
      paramString = d;
      if (paramString != null) {
        paramString.h();
      }
    }
    h = false;
    return;
    label348:
    T1.a.b(paramString, e.class);
  }
  
  public static final void e()
  {
    if (T1.a.d(e.class)) {
      return;
    }
    try
    {
      f.set(false);
      return;
    }
    finally
    {
      T1.a.b(localThrowable, e.class);
    }
  }
  
  public static final void f()
  {
    if (T1.a.d(e.class)) {
      return;
    }
    try
    {
      f.set(true);
      return;
    }
    finally
    {
      T1.a.b(localThrowable, e.class);
    }
  }
  
  public static final String g()
  {
    if (T1.a.d(e.class)) {
      return null;
    }
    try
    {
      if (e == null) {
        e = UUID.randomUUID().toString();
      }
    }
    finally
    {
      break label54;
    }
    Object localObject2 = e;
    if (localObject2 != null) {
      return (String)localObject2;
    }
    localObject2 = new java/lang/NullPointerException;
    ((NullPointerException)localObject2).<init>("null cannot be cast to non-null type kotlin.String");
    throw ((Throwable)localObject2);
    label54:
    T1.a.b((Throwable)localObject2, e.class);
    return null;
  }
  
  public static final boolean h()
  {
    if (T1.a.d(e.class)) {
      return false;
    }
    try
    {
      boolean bool = g.get();
      return bool;
    }
    finally
    {
      T1.a.b(localThrowable, e.class);
    }
    return false;
  }
  
  public static final void j(Activity paramActivity)
  {
    if (T1.a.d(e.class)) {
      return;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramActivity, "activity");
      g.f.a().f(paramActivity);
      return;
    }
    finally
    {
      T1.a.b(paramActivity, e.class);
    }
  }
  
  public static final void k(Activity paramActivity)
  {
    if (T1.a.d(e.class)) {
      return;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramActivity, "activity");
      if (!f.get()) {
        return;
      }
      g.f.a().h(paramActivity);
      paramActivity = d;
      if (paramActivity != null) {
        paramActivity.l();
      }
      paramActivity = c;
      if (paramActivity != null) {
        paramActivity.unregisterListener(b);
      }
      return;
    }
    finally
    {
      T1.a.b(paramActivity, e.class);
    }
  }
  
  public static final void l(Activity paramActivity)
  {
    if (T1.a.d(e.class)) {
      return;
    }
    String str;
    r localr;
    try
    {
      Intrinsics.checkNotNullParameter(paramActivity, "activity");
      if (!f.get()) {
        return;
      }
      g.f.a().e(paramActivity);
      localObject1 = paramActivity.getApplicationContext();
      str = B.m();
      localr = v.f(str);
      if (localr == null) {
        localObject2 = null;
      } else {
        localObject2 = Boolean.valueOf(localr.b());
      }
      if (!Intrinsics.a(localObject2, Boolean.TRUE)) {
        if (!a.i()) {
          break label186;
        }
      }
    }
    finally
    {
      break label212;
    }
    Object localObject2 = (SensorManager)((Context)localObject1).getSystemService("sensor");
    if (localObject2 == null) {
      return;
    }
    c = (SensorManager)localObject2;
    Sensor localSensor = ((SensorManager)localObject2).getDefaultSensor(1);
    Object localObject1 = new B1/l;
    ((l)localObject1).<init>(paramActivity);
    d = (l)localObject1;
    m localm = b;
    paramActivity = new B1/c;
    paramActivity.<init>(localr, str);
    localm.a(paramActivity);
    ((SensorManager)localObject2).registerListener(localm, localSensor, 2);
    if ((localr != null) && (localr.b())) {
      ((l)localObject1).h();
    }
    label186:
    paramActivity = a;
    if ((paramActivity.i()) && (!g.get())) {
      paramActivity.c(str);
    }
    return;
    label212:
    T1.a.b(paramActivity, e.class);
  }
  
  public static final void m(r paramr, String paramString)
  {
    if (T1.a.d(e.class)) {
      return;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramString, "$appId");
      if ((paramr != null) && (paramr.b())) {
        i = 1;
      }
    }
    finally
    {
      break label58;
    }
    int i = 0;
    boolean bool = B.s();
    if ((i != 0) && (bool)) {
      a.c(paramString);
    }
    return;
    label58:
    T1.a.b(paramr, e.class);
  }
  
  public static final void n(boolean paramBoolean)
  {
    if (T1.a.d(e.class)) {
      return;
    }
    try
    {
      g.set(paramBoolean);
      return;
    }
    finally
    {
      T1.a.b(localThrowable, e.class);
    }
  }
  
  public final void c(String paramString)
  {
    if (T1.a.d(this)) {
      return;
    }
    try
    {
      if (h) {
        return;
      }
      h = true;
      Executor localExecutor = B.t();
      d locald = new B1/d;
      locald.<init>(paramString);
      localExecutor.execute(locald);
      return;
    }
    finally
    {
      T1.a.b(paramString, this);
    }
  }
  
  public final boolean i()
  {
    T1.a.d(this);
    return false;
  }
}

/* Location:
 * Qualified Name:     B1.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */