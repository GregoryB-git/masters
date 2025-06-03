package e7;

import android.os.BaseBundle;
import android.os.Bundle;
import android.os.SystemClock;
import b.z;
import com.google.android.gms.internal.measurement.zzeb;
import d2.q;
import i6.p;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import m6.j;

public final class s4
  extends j0
{
  public volatile q4 d;
  public volatile q4 e;
  public q4 f;
  public final ConcurrentHashMap o = new ConcurrentHashMap();
  public zzeb p;
  public volatile boolean q;
  public volatile q4 r;
  public q4 s;
  public boolean t;
  public final Object u = new Object();
  
  public s4(j2 paramj2)
  {
    super(paramj2);
  }
  
  public final q4 A(zzeb paramzzeb)
  {
    j.i(paramzzeb);
    q4 localq4 = (q4)o.get(Integer.valueOf(zza));
    Object localObject = localq4;
    if (localq4 == null)
    {
      localObject = b(zzb, "Activity");
      localObject = new q4(k().y0(), null, (String)localObject);
      o.put(Integer.valueOf(zza), localObject);
    }
    if (r != null) {
      return r;
    }
    return (q4)localObject;
  }
  
  public final String b(String paramString1, String paramString2)
  {
    if (paramString1 == null) {
      return "Activity";
    }
    paramString1 = paramString1.split("\\.");
    if (paramString1.length > 0) {
      paramString1 = paramString1[(paramString1.length - 1)];
    } else {
      paramString1 = "";
    }
    paramString2 = paramString1;
    if (paramString1.length() > h().n(null, false)) {
      paramString2 = paramString1.substring(0, h().n(null, false));
    }
    return paramString2;
  }
  
  public final boolean s()
  {
    return false;
  }
  
  public final q4 v(boolean paramBoolean)
  {
    t();
    l();
    if (!paramBoolean) {
      return f;
    }
    q4 localq4 = f;
    if (localq4 != null) {
      return localq4;
    }
    return s;
  }
  
  public final void w(zzeb paramzzeb, Bundle paramBundle)
  {
    if (!h().A()) {
      return;
    }
    if (paramBundle == null) {
      return;
    }
    Bundle localBundle = paramBundle.getBundle("com.google.app_measurement.screen_service");
    if (localBundle == null) {
      return;
    }
    String str = localBundle.getString("name");
    paramBundle = localBundle.getString("referrer_name");
    paramBundle = new q4(localBundle.getLong("id"), str, paramBundle);
    o.put(Integer.valueOf(zza), paramBundle);
  }
  
  public final void x(q4 paramq41, q4 paramq42, long paramLong, boolean paramBoolean, Bundle paramBundle)
  {
    l();
    int i = 0;
    int j;
    if ((paramq42 != null) && (c == c) && (Objects.equals(b, b)) && (Objects.equals(a, a))) {
      j = 0;
    } else {
      j = 1;
    }
    int k = i;
    if (paramBoolean)
    {
      k = i;
      if (f != null) {
        k = 1;
      }
    }
    if (j != 0)
    {
      Bundle localBundle = new android/os/Bundle;
      if (paramBundle != null) {
        localBundle.<init>(paramBundle);
      } else {
        localBundle.<init>();
      }
      r6.L(paramq41, localBundle, true);
      if (paramq42 != null)
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
      if (k != 0)
      {
        paramq42 = ro;
        l1 = paramLong - b;
        b = paramLong;
        if (l1 > 0L) {
          k().C(localBundle, l1);
        }
      }
      if (!h().A()) {
        localBundle.putLong("_mst", 1L);
      }
      if (e) {
        paramq42 = "app";
      } else {
        paramq42 = "auto";
      }
      ((z)zzb()).getClass();
      long l2 = System.currentTimeMillis();
      if (e)
      {
        l1 = f;
        if (l1 != 0L) {}
      }
      else
      {
        l1 = l2;
      }
      o().D(paramq42, "_vs", localBundle, l1);
    }
    if (k != 0) {
      y(f, true, paramLong);
    }
    f = paramq41;
    if (e) {
      s = paramq41;
    }
    paramq42 = q();
    paramq42.l();
    paramq42.t();
    paramq42.x(new p(paramq42, paramq41, 7));
  }
  
  public final void y(q4 paramq4, boolean paramBoolean, long paramLong)
  {
    a locala = b).y;
    if (locala != null)
    {
      ((z)zzb()).getClass();
      locala.s(SystemClock.elapsedRealtime());
      boolean bool;
      if ((paramq4 != null) && (d)) {
        bool = true;
      } else {
        bool = false;
      }
      if ((ro.a(paramLong, bool, paramBoolean)) && (paramq4 != null)) {
        d = false;
      }
      return;
    }
    throw new IllegalStateException("Component not created");
  }
  
  public final void z(String paramString, q4 paramq4, boolean paramBoolean)
  {
    q4 localq4;
    if (d == null) {
      localq4 = e;
    } else {
      localq4 = d;
    }
    if (b == null)
    {
      if (paramString != null) {
        paramString = b(paramString, "Activity");
      } else {
        paramString = null;
      }
      paramq4 = new q4(a, paramString, c, e, f);
    }
    e = d;
    d = paramq4;
    ((z)zzb()).getClass();
    long l = SystemClock.elapsedRealtime();
    zzl().u(new u4(this, paramq4, localq4, l, paramBoolean));
  }
}

/* Location:
 * Qualified Name:     e7.s4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */