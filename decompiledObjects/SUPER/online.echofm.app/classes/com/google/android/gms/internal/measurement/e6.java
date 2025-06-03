package com.google.android.gms.internal.measurement;

public final class e6
  implements f6
{
  public static final S2 A;
  public static final S2 B;
  public static final S2 C;
  public static final S2 D;
  public static final S2 E;
  public static final S2 F;
  public static final S2 G;
  public static final S2 H;
  public static final S2 I;
  public static final S2 J;
  public static final S2 K;
  public static final S2 L;
  public static final S2 M;
  public static final S2 N;
  public static final S2 O;
  public static final S2 P;
  public static final S2 Q;
  public static final S2 R;
  public static final S2 S;
  public static final S2 T;
  public static final S2 U;
  public static final S2 V;
  public static final S2 W;
  public static final S2 X;
  public static final S2 a;
  public static final S2 b;
  public static final S2 c;
  public static final S2 d;
  public static final S2 e;
  public static final S2 f;
  public static final S2 g;
  public static final S2 h;
  public static final S2 i;
  public static final S2 j;
  public static final S2 k;
  public static final S2 l;
  public static final S2 m;
  public static final S2 n;
  public static final S2 o;
  public static final S2 p;
  public static final S2 q;
  public static final S2 r;
  public static final S2 s;
  public static final S2 t;
  public static final S2 u;
  public static final S2 v;
  public static final S2 w;
  public static final S2 x;
  public static final S2 y;
  public static final S2 z;
  
  static
  {
    a3 locala3 = new a3(P2.a("com.google.android.gms.measurement")).f().e();
    a = locala3.b("measurement.ad_id_cache_time", 10000L);
    b = locala3.b("measurement.app_uninstalled_additional_ad_id_cache_time", 3600000L);
    c = locala3.b("measurement.max_bundles_per_iteration", 100L);
    d = locala3.b("measurement.config.cache_time", 86400000L);
    e = locala3.c("measurement.log_tag", "FA");
    f = locala3.c("measurement.config.url_authority", "app-measurement.com");
    g = locala3.c("measurement.config.url_scheme", "https");
    h = locala3.b("measurement.upload.debug_upload_interval", 1000L);
    i = locala3.c("measurement.rb.attribution.event_params", "value|currency");
    j = locala3.b("measurement.lifetimevalue.max_currency_tracked", 4L);
    k = locala3.b("measurement.upload.max_event_parameter_value_length", 100L);
    l = locala3.b("measurement.store.max_stored_events_per_app", 100000L);
    m = locala3.b("measurement.experiment.max_ids", 50L);
    n = locala3.b("measurement.audience.filter_result_max_count", 200L);
    o = locala3.b("measurement.upload.max_item_scoped_custom_parameters", 27L);
    p = locala3.b("measurement.rb.attribution.client.min_ad_services_version", 7L);
    q = locala3.b("measurement.alarm_manager.minimum_interval", 60000L);
    r = locala3.b("measurement.upload.minimum_delay", 500L);
    s = locala3.b("measurement.monitoring.sample_period_millis", 86400000L);
    t = locala3.c("measurement.rb.attribution.app_allowlist", "");
    u = locala3.b("measurement.upload.realtime_upload_interval", 10000L);
    v = locala3.b("measurement.upload.refresh_blacklisted_config_interval", 604800000L);
    w = locala3.b("measurement.config.cache_time.service", 3600000L);
    x = locala3.b("measurement.service_client.idle_disconnect_millis", 5000L);
    y = locala3.c("measurement.log_tag.service", "FA-SVC");
    z = locala3.b("measurement.upload.stale_data_deletion_interval", 86400000L);
    A = locala3.c("measurement.rb.attribution.uri_authority", "google-analytics.com");
    B = locala3.c("measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion");
    C = locala3.c("measurement.rb.attribution.query_parameters_to_remove", "");
    D = locala3.c("measurement.rb.attribution.uri_scheme", "https");
    E = locala3.b("measurement.sdk.attribution.cache.ttl", 604800000L);
    F = locala3.b("measurement.redaction.app_instance_id.ttl", 7200000L);
    G = locala3.b("measurement.upload.backoff_period", 43200000L);
    H = locala3.b("measurement.upload.initial_upload_delay_time", 15000L);
    I = locala3.b("measurement.upload.interval", 3600000L);
    J = locala3.b("measurement.upload.max_bundle_size", 65536L);
    K = locala3.b("measurement.upload.max_bundles", 100L);
    L = locala3.b("measurement.upload.max_conversions_per_day", 500L);
    M = locala3.b("measurement.upload.max_error_events_per_day", 1000L);
    N = locala3.b("measurement.upload.max_events_per_bundle", 1000L);
    O = locala3.b("measurement.upload.max_events_per_day", 100000L);
    P = locala3.b("measurement.upload.max_public_events_per_day", 50000L);
    Q = locala3.b("measurement.upload.max_queue_time", 2419200000L);
    R = locala3.b("measurement.upload.max_realtime_events_per_day", 10L);
    S = locala3.b("measurement.upload.max_batch_size", 65536L);
    T = locala3.b("measurement.upload.retry_count", 6L);
    U = locala3.b("measurement.upload.retry_time", 1800000L);
    V = locala3.c("measurement.upload.url", "https://app-measurement.com/a");
    W = locala3.b("measurement.upload.window_interval", 3600000L);
    X = locala3.c("measurement.rb.attribution.user_properties", "_npa,npa");
  }
  
  public final String A()
  {
    return (String)X.f();
  }
  
  public final long B()
  {
    return ((Long)x.f()).longValue();
  }
  
  public final long C()
  {
    return ((Long)S.f()).longValue();
  }
  
  public final long D()
  {
    return ((Long)U.f()).longValue();
  }
  
  public final long E()
  {
    return ((Long)r.f()).longValue();
  }
  
  public final String F()
  {
    return (String)i.f();
  }
  
  public final long G()
  {
    return ((Long)L.f()).longValue();
  }
  
  public final long H()
  {
    return ((Long)H.f()).longValue();
  }
  
  public final String I()
  {
    return (String)C.f();
  }
  
  public final long J()
  {
    return ((Long)P.f()).longValue();
  }
  
  public final long K()
  {
    return ((Long)z.f()).longValue();
  }
  
  public final long L()
  {
    return ((Long)T.f()).longValue();
  }
  
  public final long M()
  {
    return ((Long)s.f()).longValue();
  }
  
  public final long N()
  {
    return ((Long)W.f()).longValue();
  }
  
  public final long O()
  {
    return ((Long)o.f()).longValue();
  }
  
  public final String P()
  {
    return (String)t.f();
  }
  
  public final long Q()
  {
    return ((Long)M.f()).longValue();
  }
  
  public final String R()
  {
    return (String)D.f();
  }
  
  public final long S()
  {
    return ((Long)I.f()).longValue();
  }
  
  public final long T()
  {
    return ((Long)Q.f()).longValue();
  }
  
  public final long U()
  {
    return ((Long)E.f()).longValue();
  }
  
  public final long a()
  {
    return ((Long)a.f()).longValue();
  }
  
  public final long b()
  {
    return ((Long)b.f()).longValue();
  }
  
  public final long c()
  {
    return ((Long)c.f()).longValue();
  }
  
  public final long d()
  {
    return ((Long)d.f()).longValue();
  }
  
  public final long e()
  {
    return ((Long)p.f()).longValue();
  }
  
  public final long f()
  {
    return ((Long)h.f()).longValue();
  }
  
  public final long g()
  {
    return ((Long)j.f()).longValue();
  }
  
  public final long h()
  {
    return ((Long)m.f()).longValue();
  }
  
  public final long i()
  {
    return ((Long)N.f()).longValue();
  }
  
  public final long j()
  {
    return ((Long)n.f()).longValue();
  }
  
  public final long k()
  {
    return ((Long)l.f()).longValue();
  }
  
  public final String l()
  {
    return (String)f.f();
  }
  
  public final long m()
  {
    return ((Long)k.f()).longValue();
  }
  
  public final long n()
  {
    return ((Long)u.f()).longValue();
  }
  
  public final String o()
  {
    return (String)A.f();
  }
  
  public final long p()
  {
    return ((Long)J.f()).longValue();
  }
  
  public final String q()
  {
    return (String)V.f();
  }
  
  public final long r()
  {
    return ((Long)R.f()).longValue();
  }
  
  public final long s()
  {
    return ((Long)F.f()).longValue();
  }
  
  public final long t()
  {
    return ((Long)v.f()).longValue();
  }
  
  public final String u()
  {
    return (String)g.f();
  }
  
  public final long v()
  {
    return ((Long)K.f()).longValue();
  }
  
  public final long w()
  {
    return ((Long)q.f()).longValue();
  }
  
  public final String x()
  {
    return (String)B.f();
  }
  
  public final long y()
  {
    return ((Long)G.f()).longValue();
  }
  
  public final long z()
  {
    return ((Long)O.f()).longValue();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.e6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */