package e7;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.BaseBundle;
import android.util.Pair;
import android.util.SparseArray;
import d2.q;
import m6.j;

public final class l1
  extends d3
{
  public static final Pair<String, Long> J = new Pair("", Long.valueOf(0L));
  public final q1 A = new q1(this, "session_id", 0L);
  public boolean B;
  public o1 C;
  public o1 D;
  public q1 E;
  public final r1 F;
  public final r1 G;
  public final q1 H;
  public final n1 I;
  public SharedPreferences d;
  public Object e = new Object();
  public SharedPreferences f;
  public p1 o;
  public final q1 p = new q1(this, "first_open_time", 0L);
  public final r1 q;
  public String r;
  public boolean s;
  public long t;
  public final q1 u = new q1(this, "session_timeout", 1800000L);
  public final o1 v = new o1(this, "start_new_session", true);
  public final r1 w = new r1(this, "non_personalized_ads");
  public final n1 x = new n1(this, "last_received_uri_timestamps_by_source");
  public final o1 y = new o1(this, "allow_remote_dynamite", false);
  public final q1 z = new q1(this, "last_pause_time", 0L);
  
  public l1(j2 paramj2)
  {
    super(paramj2);
    j.e("app_install_time");
    q = new r1(this, "app_instance_id");
    C = new o1(this, "app_backgrounded", false);
    D = new o1(this, "deep_link_retrieval_complete", false);
    E = new q1(this, "deep_link_retrieval_attempts", 0L);
    F = new r1(this, "firebase_feature_rollouts");
    G = new r1(this, "deferred_attribution_cache");
    H = new q1(this, "deferred_attribution_cache_timestamp", 0L);
    I = new n1(this, "default_event_parameters");
  }
  
  public final boolean o()
  {
    return true;
  }
  
  public final void p(Boolean paramBoolean)
  {
    l();
    SharedPreferences.Editor localEditor = v().edit();
    if (paramBoolean != null) {
      localEditor.putBoolean("measurement_enabled", paramBoolean.booleanValue());
    } else {
      localEditor.remove("measurement_enabled");
    }
    localEditor.apply();
  }
  
  public final boolean q(int paramInt)
  {
    return e3.i(paramInt, v().getInt("consent_source", 100));
  }
  
  public final boolean r(long paramLong)
  {
    return paramLong - u.a() > z.a();
  }
  
  public final void s()
  {
    Object localObject = zza().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
    d = ((SharedPreferences)localObject);
    boolean bool = ((SharedPreferences)localObject).getBoolean("has_been_opened", false);
    B = bool;
    if (!bool)
    {
      localObject = d.edit();
      ((SharedPreferences.Editor)localObject).putBoolean("has_been_opened", true);
      ((SharedPreferences.Editor)localObject).apply();
    }
    o = new p1(this, Math.max(0L, ((Long)h0.d.a(null)).longValue()));
  }
  
  public final void t(boolean paramBoolean)
  {
    l();
    zzjw.c("App measurement setting deferred collection", Boolean.valueOf(paramBoolean));
    SharedPreferences.Editor localEditor = v().edit();
    localEditor.putBoolean("deferred_analytics_collection", paramBoolean);
    localEditor.apply();
  }
  
  public final SharedPreferences u()
  {
    l();
    m();
    if (f == null) {
      synchronized (e)
      {
        if (f == null)
        {
          String str = zza().getPackageName();
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          localStringBuilder.append(str);
          localStringBuilder.append("_preferences");
          str = localStringBuilder.toString();
          zzjw.c("Default prefs file", str);
          f = zza().getSharedPreferences(str, 0);
        }
      }
    }
    return f;
  }
  
  public final SharedPreferences v()
  {
    l();
    m();
    j.i(d);
    return d;
  }
  
  public final SparseArray<Long> w()
  {
    Object localObject = x.a();
    int[] arrayOfInt = ((BaseBundle)localObject).getIntArray("uriSources");
    long[] arrayOfLong = ((BaseBundle)localObject).getLongArray("uriTimestamps");
    if ((arrayOfInt != null) && (arrayOfLong != null))
    {
      if (arrayOfInt.length != arrayOfLong.length)
      {
        zzjo.b("Trigger URI source and timestamp array lengths do not match");
        return new SparseArray();
      }
      localObject = new SparseArray();
      for (int i = 0; i < arrayOfInt.length; i++) {
        ((SparseArray)localObject).put(arrayOfInt[i], Long.valueOf(arrayOfLong[i]));
      }
      return (SparseArray<Long>)localObject;
    }
    return new SparseArray();
  }
  
  public final x x()
  {
    l();
    return x.b(v().getString("dma_consent_settings", null));
  }
  
  public final e3 y()
  {
    l();
    String str = v().getString("consent_settings", "G1");
    return e3.c(v().getInt("consent_source", 100), str);
  }
  
  public final Boolean z()
  {
    l();
    if (v().contains("measurement_enabled")) {
      return Boolean.valueOf(v().getBoolean("measurement_enabled", true));
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     e7.l1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */