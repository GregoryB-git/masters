// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

public final class e6 implements f6
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
    
    static {
        final a3 e2 = new a3(P2.a("com.google.android.gms.measurement")).f().e();
        a = e2.b("measurement.ad_id_cache_time", 10000L);
        b = e2.b("measurement.app_uninstalled_additional_ad_id_cache_time", 3600000L);
        c = e2.b("measurement.max_bundles_per_iteration", 100L);
        d = e2.b("measurement.config.cache_time", 86400000L);
        e = e2.c("measurement.log_tag", "FA");
        f = e2.c("measurement.config.url_authority", "app-measurement.com");
        g = e2.c("measurement.config.url_scheme", "https");
        h = e2.b("measurement.upload.debug_upload_interval", 1000L);
        i = e2.c("measurement.rb.attribution.event_params", "value|currency");
        j = e2.b("measurement.lifetimevalue.max_currency_tracked", 4L);
        k = e2.b("measurement.upload.max_event_parameter_value_length", 100L);
        l = e2.b("measurement.store.max_stored_events_per_app", 100000L);
        m = e2.b("measurement.experiment.max_ids", 50L);
        n = e2.b("measurement.audience.filter_result_max_count", 200L);
        o = e2.b("measurement.upload.max_item_scoped_custom_parameters", 27L);
        p = e2.b("measurement.rb.attribution.client.min_ad_services_version", 7L);
        q = e2.b("measurement.alarm_manager.minimum_interval", 60000L);
        r = e2.b("measurement.upload.minimum_delay", 500L);
        s = e2.b("measurement.monitoring.sample_period_millis", 86400000L);
        t = e2.c("measurement.rb.attribution.app_allowlist", "");
        u = e2.b("measurement.upload.realtime_upload_interval", 10000L);
        v = e2.b("measurement.upload.refresh_blacklisted_config_interval", 604800000L);
        w = e2.b("measurement.config.cache_time.service", 3600000L);
        x = e2.b("measurement.service_client.idle_disconnect_millis", 5000L);
        y = e2.c("measurement.log_tag.service", "FA-SVC");
        z = e2.b("measurement.upload.stale_data_deletion_interval", 86400000L);
        A = e2.c("measurement.rb.attribution.uri_authority", "google-analytics.com");
        B = e2.c("measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion");
        C = e2.c("measurement.rb.attribution.query_parameters_to_remove", "");
        D = e2.c("measurement.rb.attribution.uri_scheme", "https");
        E = e2.b("measurement.sdk.attribution.cache.ttl", 604800000L);
        F = e2.b("measurement.redaction.app_instance_id.ttl", 7200000L);
        G = e2.b("measurement.upload.backoff_period", 43200000L);
        H = e2.b("measurement.upload.initial_upload_delay_time", 15000L);
        I = e2.b("measurement.upload.interval", 3600000L);
        J = e2.b("measurement.upload.max_bundle_size", 65536L);
        K = e2.b("measurement.upload.max_bundles", 100L);
        L = e2.b("measurement.upload.max_conversions_per_day", 500L);
        M = e2.b("measurement.upload.max_error_events_per_day", 1000L);
        N = e2.b("measurement.upload.max_events_per_bundle", 1000L);
        O = e2.b("measurement.upload.max_events_per_day", 100000L);
        P = e2.b("measurement.upload.max_public_events_per_day", 50000L);
        Q = e2.b("measurement.upload.max_queue_time", 2419200000L);
        R = e2.b("measurement.upload.max_realtime_events_per_day", 10L);
        S = e2.b("measurement.upload.max_batch_size", 65536L);
        T = e2.b("measurement.upload.retry_count", 6L);
        U = e2.b("measurement.upload.retry_time", 1800000L);
        V = e2.c("measurement.upload.url", "https://app-measurement.com/a");
        W = e2.b("measurement.upload.window_interval", 3600000L);
        X = e2.c("measurement.rb.attribution.user_properties", "_npa,npa");
    }
    
    @Override
    public final String A() {
        return (String)e6.X.f();
    }
    
    @Override
    public final long B() {
        return (long)e6.x.f();
    }
    
    @Override
    public final long C() {
        return (long)e6.S.f();
    }
    
    @Override
    public final long D() {
        return (long)e6.U.f();
    }
    
    @Override
    public final long E() {
        return (long)e6.r.f();
    }
    
    @Override
    public final String F() {
        return (String)e6.i.f();
    }
    
    @Override
    public final long G() {
        return (long)e6.L.f();
    }
    
    @Override
    public final long H() {
        return (long)e6.H.f();
    }
    
    @Override
    public final String I() {
        return (String)e6.C.f();
    }
    
    @Override
    public final long J() {
        return (long)e6.P.f();
    }
    
    @Override
    public final long K() {
        return (long)e6.z.f();
    }
    
    @Override
    public final long L() {
        return (long)e6.T.f();
    }
    
    @Override
    public final long M() {
        return (long)e6.s.f();
    }
    
    @Override
    public final long N() {
        return (long)e6.W.f();
    }
    
    @Override
    public final long O() {
        return (long)e6.o.f();
    }
    
    @Override
    public final String P() {
        return (String)e6.t.f();
    }
    
    @Override
    public final long Q() {
        return (long)e6.M.f();
    }
    
    @Override
    public final String R() {
        return (String)e6.D.f();
    }
    
    @Override
    public final long S() {
        return (long)e6.I.f();
    }
    
    @Override
    public final long T() {
        return (long)e6.Q.f();
    }
    
    @Override
    public final long U() {
        return (long)e6.E.f();
    }
    
    @Override
    public final long a() {
        return (long)e6.a.f();
    }
    
    @Override
    public final long b() {
        return (long)e6.b.f();
    }
    
    @Override
    public final long c() {
        return (long)e6.c.f();
    }
    
    @Override
    public final long d() {
        return (long)e6.d.f();
    }
    
    @Override
    public final long e() {
        return (long)e6.p.f();
    }
    
    @Override
    public final long f() {
        return (long)e6.h.f();
    }
    
    @Override
    public final long g() {
        return (long)e6.j.f();
    }
    
    @Override
    public final long h() {
        return (long)e6.m.f();
    }
    
    @Override
    public final long i() {
        return (long)e6.N.f();
    }
    
    @Override
    public final long j() {
        return (long)e6.n.f();
    }
    
    @Override
    public final long k() {
        return (long)e6.l.f();
    }
    
    @Override
    public final String l() {
        return (String)e6.f.f();
    }
    
    @Override
    public final long m() {
        return (long)e6.k.f();
    }
    
    @Override
    public final long n() {
        return (long)e6.u.f();
    }
    
    @Override
    public final String o() {
        return (String)e6.A.f();
    }
    
    @Override
    public final long p() {
        return (long)e6.J.f();
    }
    
    @Override
    public final String q() {
        return (String)e6.V.f();
    }
    
    @Override
    public final long r() {
        return (long)e6.R.f();
    }
    
    @Override
    public final long s() {
        return (long)e6.F.f();
    }
    
    @Override
    public final long t() {
        return (long)e6.v.f();
    }
    
    @Override
    public final String u() {
        return (String)e6.g.f();
    }
    
    @Override
    public final long v() {
        return (long)e6.K.f();
    }
    
    @Override
    public final long w() {
        return (long)e6.q.f();
    }
    
    @Override
    public final String x() {
        return (String)e6.B.f();
    }
    
    @Override
    public final long y() {
        return (long)e6.G.f();
    }
    
    @Override
    public final long z() {
        return (long)e6.O.f();
    }
}
