package e7;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import b.z;
import d2.q;

public final class v5
{
  public v5(q5 paramq5) {}
  
  public final void a()
  {
    a.l();
    Object localObject = a.j();
    ((z)a.zzb()).getClass();
    if (((l1)localObject).r(System.currentTimeMillis()))
    {
      a.j().v.a(true);
      localObject = new ActivityManager.RunningAppProcessInfo();
      ActivityManager.getMyMemoryState((ActivityManager.RunningAppProcessInfo)localObject);
      if (importance == 100)
      {
        a.zzj().w.b("Detected application was in foreground");
        ((z)a.zzb()).getClass();
        c(System.currentTimeMillis());
      }
    }
  }
  
  public final void b(long paramLong, boolean paramBoolean)
  {
    a.l();
    a.v();
    if (a.j().r(paramLong))
    {
      a.j().v.a(true);
      a.m().x();
    }
    a.j().z.b(paramLong);
    if (a.j().v.b()) {
      c(paramLong);
    }
  }
  
  public final void c(long paramLong)
  {
    a.l();
    if (!((j2)a.b).d()) {
      return;
    }
    a.j().z.b(paramLong);
    ((z)a.zzb()).getClass();
    long l = SystemClock.elapsedRealtime();
    a.zzj().w.c("Session started, time", Long.valueOf(l));
    Object localObject = Long.valueOf(paramLong / 1000L);
    a.o().F("auto", "_sid", localObject, paramLong);
    a.j().A.b(((Long)localObject).longValue());
    a.j().v.a(false);
    Bundle localBundle = new Bundle();
    localBundle.putLong("_sid", ((Long)localObject).longValue());
    a.o().D("auto", "_s", localBundle, paramLong);
    localObject = a.j().F.a();
    if (!TextUtils.isEmpty((CharSequence)localObject))
    {
      localBundle = new Bundle();
      localBundle.putString("_ffr", (String)localObject);
      a.o().D("auto", "_ssr", localBundle, paramLong);
    }
  }
}

/* Location:
 * Qualified Name:     e7.v5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */