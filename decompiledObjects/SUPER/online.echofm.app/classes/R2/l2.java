package R2;

import A2.n;
import E2.e;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.internal.measurement.u6;
import s2.a;
import s2.a.a;

public final class l2
  extends l3
{
  public static final Pair z = new Pair("", Long.valueOf(0L));
  public SharedPreferences c;
  public p2 d;
  public final q2 e = new q2(this, "first_open_time", 0L);
  public final q2 f = new q2(this, "app_install_time", 0L);
  public final r2 g = new r2(this, "app_instance_id", null);
  public String h;
  public boolean i;
  public long j;
  public final q2 k = new q2(this, "session_timeout", 1800000L);
  public final o2 l = new o2(this, "start_new_session", true);
  public final r2 m = new r2(this, "non_personalized_ads", null);
  public final n2 n = new n2(this, "last_received_uri_timestamps_by_source", null);
  public final o2 o = new o2(this, "allow_remote_dynamite", false);
  public final q2 p = new q2(this, "last_pause_time", 0L);
  public final q2 q = new q2(this, "session_id", 0L);
  public boolean r;
  public o2 s = new o2(this, "app_backgrounded", false);
  public o2 t = new o2(this, "deep_link_retrieval_complete", false);
  public q2 u = new q2(this, "deep_link_retrieval_attempts", 0L);
  public final r2 v = new r2(this, "firebase_feature_rollouts", null);
  public final r2 w = new r2(this, "deferred_attribution_cache", null);
  public final q2 x = new q2(this, "deferred_attribution_cache_timestamp", 0L);
  public final n2 y = new n2(this, "default_event_parameters", null);
  
  public l2(N2 paramN2)
  {
    super(paramN2);
  }
  
  public final boolean A(q3 paramq3)
  {
    n();
    int i1 = paramq3.b();
    if (x(i1))
    {
      SharedPreferences.Editor localEditor = F().edit();
      localEditor.putString("consent_settings", paramq3.v());
      localEditor.putInt("consent_source", i1);
      localEditor.apply();
      return true;
    }
    return false;
  }
  
  public final boolean B()
  {
    SharedPreferences localSharedPreferences = c;
    if (localSharedPreferences == null) {
      return false;
    }
    return localSharedPreferences.contains("deferred_analytics_collection");
  }
  
  public final void C(Boolean paramBoolean)
  {
    n();
    SharedPreferences.Editor localEditor = F().edit();
    if (paramBoolean != null) {
      localEditor.putBoolean("measurement_enabled_from_api", paramBoolean.booleanValue());
    } else {
      localEditor.remove("measurement_enabled_from_api");
    }
    localEditor.apply();
  }
  
  public final void D(String paramString)
  {
    n();
    SharedPreferences.Editor localEditor = F().edit();
    localEditor.putString("admob_app_id", paramString);
    localEditor.apply();
  }
  
  public final void E(boolean paramBoolean)
  {
    n();
    j().K().b("App measurement setting deferred collection", Boolean.valueOf(paramBoolean));
    SharedPreferences.Editor localEditor = F().edit();
    localEditor.putBoolean("deferred_analytics_collection", paramBoolean);
    localEditor.apply();
  }
  
  public final SharedPreferences F()
  {
    n();
    o();
    n.i(c);
    return c;
  }
  
  public final void G(String paramString)
  {
    n();
    SharedPreferences.Editor localEditor = F().edit();
    localEditor.putString("gmp_app_id", paramString);
    localEditor.apply();
  }
  
  public final SparseArray H()
  {
    Object localObject = n.a();
    if (localObject == null) {
      return new SparseArray();
    }
    int[] arrayOfInt = ((BaseBundle)localObject).getIntArray("uriSources");
    long[] arrayOfLong = ((BaseBundle)localObject).getLongArray("uriTimestamps");
    if ((arrayOfInt != null) && (arrayOfLong != null))
    {
      if (arrayOfInt.length != arrayOfLong.length)
      {
        j().G().a("Trigger URI source and timestamp array lengths do not match");
        return new SparseArray();
      }
      localObject = new SparseArray();
      for (int i1 = 0; i1 < arrayOfInt.length; i1++) {
        ((SparseArray)localObject).put(arrayOfInt[i1], Long.valueOf(arrayOfLong[i1]));
      }
      return (SparseArray)localObject;
    }
    return new SparseArray();
  }
  
  public final z I()
  {
    n();
    return z.c(F().getString("dma_consent_settings", null));
  }
  
  public final q3 J()
  {
    n();
    return q3.f(F().getString("consent_settings", "G1"), F().getInt("consent_source", 100));
  }
  
  public final Boolean K()
  {
    n();
    if (!F().contains("use_service")) {
      return null;
    }
    return Boolean.valueOf(F().getBoolean("use_service", false));
  }
  
  public final Boolean L()
  {
    n();
    if (F().contains("measurement_enabled_from_api")) {
      return Boolean.valueOf(F().getBoolean("measurement_enabled_from_api", true));
    }
    return null;
  }
  
  public final Boolean M()
  {
    n();
    if (F().contains("measurement_enabled")) {
      return Boolean.valueOf(F().getBoolean("measurement_enabled", true));
    }
    return null;
  }
  
  public final String N()
  {
    n();
    String str1 = F().getString("previous_os_version", null);
    g().o();
    String str2 = Build.VERSION.RELEASE;
    if ((!TextUtils.isEmpty(str2)) && (!str2.equals(str1)))
    {
      SharedPreferences.Editor localEditor = F().edit();
      localEditor.putString("previous_os_version", str2);
      localEditor.apply();
    }
    return str1;
  }
  
  public final String O()
  {
    n();
    return F().getString("admob_app_id", null);
  }
  
  public final String P()
  {
    n();
    return F().getString("gmp_app_id", null);
  }
  
  public final void Q()
  {
    n();
    Boolean localBoolean = M();
    SharedPreferences.Editor localEditor = F().edit();
    localEditor.clear();
    localEditor.apply();
    if (localBoolean != null) {
      v(localBoolean);
    }
  }
  
  public final boolean s()
  {
    return true;
  }
  
  public final void t()
  {
    Object localObject = a().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
    c = ((SharedPreferences)localObject);
    boolean bool = ((SharedPreferences)localObject).getBoolean("has_been_opened", false);
    r = bool;
    if (!bool)
    {
      localObject = c.edit();
      ((SharedPreferences.Editor)localObject).putBoolean("has_been_opened", true);
      ((SharedPreferences.Editor)localObject).apply();
    }
    d = new p2(this, "health_monitor", Math.max(0L, ((Long)K.e.a(null)).longValue()), null);
  }
  
  public final Pair u(String paramString)
  {
    n();
    if ((u6.a()) && (f().s(K.R0)) && (!J().l(q3.a.p))) {
      return new Pair("", Boolean.FALSE);
    }
    long l1 = b().b();
    if ((h != null) && (l1 < j)) {
      return new Pair(h, Boolean.valueOf(i));
    }
    j = (l1 + f().C(paramString));
    a.b(true);
    try
    {
      paramString = a.a(a());
      h = "";
      String str = paramString.a();
      if (str != null) {
        h = str;
      }
    }
    catch (Exception paramString)
    {
      break label161;
    }
    i = paramString.b();
    break label181;
    label161:
    j().F().b("Unable to get advertising id", paramString);
    h = "";
    label181:
    a.b(false);
    return new Pair(h, Boolean.valueOf(i));
  }
  
  public final void v(Boolean paramBoolean)
  {
    n();
    SharedPreferences.Editor localEditor = F().edit();
    if (paramBoolean != null) {
      localEditor.putBoolean("measurement_enabled", paramBoolean.booleanValue());
    } else {
      localEditor.remove("measurement_enabled");
    }
    localEditor.apply();
  }
  
  public final void w(boolean paramBoolean)
  {
    n();
    SharedPreferences.Editor localEditor = F().edit();
    localEditor.putBoolean("use_service", paramBoolean);
    localEditor.apply();
  }
  
  public final boolean x(int paramInt)
  {
    return q3.k(paramInt, F().getInt("consent_source", 100));
  }
  
  public final boolean y(long paramLong)
  {
    return paramLong - k.a() > p.a();
  }
  
  public final boolean z(z paramz)
  {
    n();
    Object localObject = I();
    if (q3.k(paramz.a(), ((z)localObject).a()))
    {
      localObject = F().edit();
      ((SharedPreferences.Editor)localObject).putString("dma_consent_settings", paramz.i());
      ((SharedPreferences.Editor)localObject).apply();
      return true;
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     R2.l2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */