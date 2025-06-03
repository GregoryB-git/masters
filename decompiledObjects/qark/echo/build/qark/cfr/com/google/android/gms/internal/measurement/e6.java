/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.google.android.gms.internal.measurement.P2;
import com.google.android.gms.internal.measurement.S2;
import com.google.android.gms.internal.measurement.a3;
import com.google.android.gms.internal.measurement.f6;

public final class e6
implements f6 {
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
        a3 a32 = new a3(P2.a("com.google.android.gms.measurement")).f().e();
        a = a32.b("measurement.ad_id_cache_time", 10000L);
        b = a32.b("measurement.app_uninstalled_additional_ad_id_cache_time", 3600000L);
        c = a32.b("measurement.max_bundles_per_iteration", 100L);
        d = a32.b("measurement.config.cache_time", 86400000L);
        e = a32.c("measurement.log_tag", "FA");
        f = a32.c("measurement.config.url_authority", "app-measurement.com");
        g = a32.c("measurement.config.url_scheme", "https");
        h = a32.b("measurement.upload.debug_upload_interval", 1000L);
        i = a32.c("measurement.rb.attribution.event_params", "value|currency");
        j = a32.b("measurement.lifetimevalue.max_currency_tracked", 4L);
        k = a32.b("measurement.upload.max_event_parameter_value_length", 100L);
        l = a32.b("measurement.store.max_stored_events_per_app", 100000L);
        m = a32.b("measurement.experiment.max_ids", 50L);
        n = a32.b("measurement.audience.filter_result_max_count", 200L);
        o = a32.b("measurement.upload.max_item_scoped_custom_parameters", 27L);
        p = a32.b("measurement.rb.attribution.client.min_ad_services_version", 7L);
        q = a32.b("measurement.alarm_manager.minimum_interval", 60000L);
        r = a32.b("measurement.upload.minimum_delay", 500L);
        s = a32.b("measurement.monitoring.sample_period_millis", 86400000L);
        t = a32.c("measurement.rb.attribution.app_allowlist", "");
        u = a32.b("measurement.upload.realtime_upload_interval", 10000L);
        v = a32.b("measurement.upload.refresh_blacklisted_config_interval", 604800000L);
        w = a32.b("measurement.config.cache_time.service", 3600000L);
        x = a32.b("measurement.service_client.idle_disconnect_millis", 5000L);
        y = a32.c("measurement.log_tag.service", "FA-SVC");
        z = a32.b("measurement.upload.stale_data_deletion_interval", 86400000L);
        A = a32.c("measurement.rb.attribution.uri_authority", "google-analytics.com");
        B = a32.c("measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion");
        C = a32.c("measurement.rb.attribution.query_parameters_to_remove", "");
        D = a32.c("measurement.rb.attribution.uri_scheme", "https");
        E = a32.b("measurement.sdk.attribution.cache.ttl", 604800000L);
        F = a32.b("measurement.redaction.app_instance_id.ttl", 7200000L);
        G = a32.b("measurement.upload.backoff_period", 43200000L);
        H = a32.b("measurement.upload.initial_upload_delay_time", 15000L);
        I = a32.b("measurement.upload.interval", 3600000L);
        J = a32.b("measurement.upload.max_bundle_size", 65536L);
        K = a32.b("measurement.upload.max_bundles", 100L);
        L = a32.b("measurement.upload.max_conversions_per_day", 500L);
        M = a32.b("measurement.upload.max_error_events_per_day", 1000L);
        N = a32.b("measurement.upload.max_events_per_bundle", 1000L);
        O = a32.b("measurement.upload.max_events_per_day", 100000L);
        P = a32.b("measurement.upload.max_public_events_per_day", 50000L);
        Q = a32.b("measurement.upload.max_queue_time", 2419200000L);
        R = a32.b("measurement.upload.max_realtime_events_per_day", 10L);
        S = a32.b("measurement.upload.max_batch_size", 65536L);
        T = a32.b("measurement.upload.retry_count", 6L);
        U = a32.b("measurement.upload.retry_time", 1800000L);
        V = a32.c("measurement.upload.url", "https://app-measurement.com/a");
        W = a32.b("measurement.upload.window_interval", 3600000L);
        X = a32.c("measurement.rb.attribution.user_properties", "_npa,npa");
    }

    @Override
    public final String A() {
        return (String)X.f();
    }

    @Override
    public final long B() {
        return (Long)x.f();
    }

    @Override
    public final long C() {
        return (Long)S.f();
    }

    @Override
    public final long D() {
        return (Long)U.f();
    }

    @Override
    public final long E() {
        return (Long)r.f();
    }

    @Override
    public final String F() {
        return (String)i.f();
    }

    @Override
    public final long G() {
        return (Long)L.f();
    }

    @Override
    public final long H() {
        return (Long)H.f();
    }

    @Override
    public final String I() {
        return (String)C.f();
    }

    @Override
    public final long J() {
        return (Long)P.f();
    }

    @Override
    public final long K() {
        return (Long)z.f();
    }

    @Override
    public final long L() {
        return (Long)T.f();
    }

    @Override
    public final long M() {
        return (Long)s.f();
    }

    @Override
    public final long N() {
        return (Long)W.f();
    }

    @Override
    public final long O() {
        return (Long)o.f();
    }

    @Override
    public final String P() {
        return (String)t.f();
    }

    @Override
    public final long Q() {
        return (Long)M.f();
    }

    @Override
    public final String R() {
        return (String)D.f();
    }

    @Override
    public final long S() {
        return (Long)I.f();
    }

    @Override
    public final long T() {
        return (Long)Q.f();
    }

    @Override
    public final long U() {
        return (Long)E.f();
    }

    @Override
    public final long a() {
        return (Long)a.f();
    }

    @Override
    public final long b() {
        return (Long)b.f();
    }

    @Override
    public final long c() {
        return (Long)c.f();
    }

    @Override
    public final long d() {
        return (Long)d.f();
    }

    @Override
    public final long e() {
        return (Long)p.f();
    }

    @Override
    public final long f() {
        return (Long)h.f();
    }

    @Override
    public final long g() {
        return (Long)j.f();
    }

    @Override
    public final long h() {
        return (Long)m.f();
    }

    @Override
    public final long i() {
        return (Long)N.f();
    }

    @Override
    public final long j() {
        return (Long)n.f();
    }

    @Override
    public final long k() {
        return (Long)l.f();
    }

    @Override
    public final String l() {
        return (String)f.f();
    }

    @Override
    public final long m() {
        return (Long)k.f();
    }

    @Override
    public final long n() {
        return (Long)u.f();
    }

    @Override
    public final String o() {
        return (String)A.f();
    }

    @Override
    public final long p() {
        return (Long)J.f();
    }

    @Override
    public final String q() {
        return (String)V.f();
    }

    @Override
    public final long r() {
        return (Long)R.f();
    }

    @Override
    public final long s() {
        return (Long)F.f();
    }

    @Override
    public final long t() {
        return (Long)v.f();
    }

    @Override
    public final String u() {
        return (String)g.f();
    }

    @Override
    public final long v() {
        return (Long)K.f();
    }

    @Override
    public final long w() {
        return (Long)q.f();
    }

    @Override
    public final String x() {
        return (String)B.f();
    }

    @Override
    public final long y() {
        return (Long)G.f();
    }

    @Override
    public final long z() {
        return (Long)O.f();
    }
}

