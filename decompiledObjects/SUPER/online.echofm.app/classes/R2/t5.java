package R2;

import E2.e;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.os.BaseBundle;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.s7;
import com.google.android.gms.internal.measurement.t6;

public final class t5
{
  public t5(l5 paraml5) {}
  
  public final void a()
  {
    a.n();
    if (a.i().y(a.b().a()))
    {
      a.i().l.a(true);
      ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
      ActivityManager.getMyMemoryState(localRunningAppProcessInfo);
      if (importance == 100)
      {
        a.j().K().a("Detected application was in foreground");
        c(a.b().a(), false);
      }
    }
  }
  
  public final void b(long paramLong, boolean paramBoolean)
  {
    a.n();
    l5.H(a);
    if (a.i().y(paramLong))
    {
      a.i().l.a(true);
      if ((s7.a()) && (a.f().s(K.x0))) {
        a.p().I();
      }
    }
    a.i().p.b(paramLong);
    if (a.i().l.b()) {
      c(paramLong, paramBoolean);
    }
  }
  
  public final void c(long paramLong, boolean paramBoolean)
  {
    a.n();
    if (!a.a.p()) {
      return;
    }
    a.i().p.b(paramLong);
    long l = a.b().b();
    a.j().K().b("Session started, time", Long.valueOf(l));
    l = paramLong / 1000L;
    a.r().a0("auto", "_sid", Long.valueOf(l), paramLong);
    a.i().q.b(l);
    a.i().l.a(false);
    Bundle localBundle = new Bundle();
    localBundle.putLong("_sid", l);
    if ((a.f().s(K.m0)) && (paramBoolean)) {
      localBundle.putLong("_aib", 1L);
    }
    a.r().U("auto", "_s", paramLong, localBundle);
    if ((t6.a()) && (a.f().s(K.p0)))
    {
      String str = a.i().v.a();
      if (!TextUtils.isEmpty(str))
      {
        localBundle = new Bundle();
        localBundle.putString("_ffr", str);
        a.r().U("auto", "_ssr", paramLong, localBundle);
      }
    }
  }
}

/* Location:
 * Qualified Name:     R2.t5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */