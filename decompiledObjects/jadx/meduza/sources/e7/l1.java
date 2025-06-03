package e7;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;

/* loaded from: classes.dex */
public final class l1 extends d3 {
    public static final Pair<String, Long> J = new Pair<>("", 0L);
    public final q1 A;
    public boolean B;
    public o1 C;
    public o1 D;
    public q1 E;
    public final r1 F;
    public final r1 G;
    public final q1 H;
    public final n1 I;

    /* renamed from: d, reason: collision with root package name */
    public SharedPreferences f4454d;

    /* renamed from: e, reason: collision with root package name */
    public Object f4455e;
    public SharedPreferences f;

    /* renamed from: o, reason: collision with root package name */
    public p1 f4456o;

    /* renamed from: p, reason: collision with root package name */
    public final q1 f4457p;

    /* renamed from: q, reason: collision with root package name */
    public final r1 f4458q;

    /* renamed from: r, reason: collision with root package name */
    public String f4459r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f4460s;
    public long t;

    /* renamed from: u, reason: collision with root package name */
    public final q1 f4461u;

    /* renamed from: v, reason: collision with root package name */
    public final o1 f4462v;

    /* renamed from: w, reason: collision with root package name */
    public final r1 f4463w;

    /* renamed from: x, reason: collision with root package name */
    public final n1 f4464x;

    /* renamed from: y, reason: collision with root package name */
    public final o1 f4465y;

    /* renamed from: z, reason: collision with root package name */
    public final q1 f4466z;

    public l1(j2 j2Var) {
        super(j2Var);
        this.f4455e = new Object();
        this.f4461u = new q1(this, "session_timeout", 1800000L);
        this.f4462v = new o1(this, "start_new_session", true);
        this.f4466z = new q1(this, "last_pause_time", 0L);
        this.A = new q1(this, "session_id", 0L);
        this.f4463w = new r1(this, "non_personalized_ads");
        this.f4464x = new n1(this, "last_received_uri_timestamps_by_source");
        this.f4465y = new o1(this, "allow_remote_dynamite", false);
        this.f4457p = new q1(this, "first_open_time", 0L);
        m6.j.e("app_install_time");
        this.f4458q = new r1(this, "app_instance_id");
        this.C = new o1(this, "app_backgrounded", false);
        this.D = new o1(this, "deep_link_retrieval_complete", false);
        this.E = new q1(this, "deep_link_retrieval_attempts", 0L);
        this.F = new r1(this, "firebase_feature_rollouts");
        this.G = new r1(this, "deferred_attribution_cache");
        this.H = new q1(this, "deferred_attribution_cache_timestamp", 0L);
        this.I = new n1(this, "default_event_parameters");
    }

    @Override // e7.d3
    public final boolean o() {
        return true;
    }

    public final void p(Boolean bool) {
        l();
        SharedPreferences.Editor edit = v().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    public final boolean q(int i10) {
        return e3.i(i10, v().getInt("consent_source", 100));
    }

    public final boolean r(long j10) {
        return j10 - this.f4461u.a() > this.f4466z.a();
    }

    public final void s() {
        SharedPreferences sharedPreferences = zza().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f4454d = sharedPreferences;
        boolean z10 = sharedPreferences.getBoolean("has_been_opened", false);
        this.B = z10;
        if (!z10) {
            SharedPreferences.Editor edit = this.f4454d.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.f4456o = new p1(this, Math.max(0L, h0.f4239d.a(null).longValue()));
    }

    public final void t(boolean z10) {
        l();
        zzj().f4067w.c("App measurement setting deferred collection", Boolean.valueOf(z10));
        SharedPreferences.Editor edit = v().edit();
        edit.putBoolean("deferred_analytics_collection", z10);
        edit.apply();
    }

    public final SharedPreferences u() {
        l();
        m();
        if (this.f == null) {
            synchronized (this.f4455e) {
                if (this.f == null) {
                    String str = zza().getPackageName() + "_preferences";
                    zzj().f4067w.c("Default prefs file", str);
                    this.f = zza().getSharedPreferences(str, 0);
                }
            }
        }
        return this.f;
    }

    public final SharedPreferences v() {
        l();
        m();
        m6.j.i(this.f4454d);
        return this.f4454d;
    }

    public final SparseArray<Long> w() {
        Bundle a10 = this.f4464x.a();
        int[] intArray = a10.getIntArray("uriSources");
        long[] longArray = a10.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray<>();
        }
        if (intArray.length != longArray.length) {
            zzj().f4060o.b("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray<>();
        }
        SparseArray<Long> sparseArray = new SparseArray<>();
        for (int i10 = 0; i10 < intArray.length; i10++) {
            sparseArray.put(intArray[i10], Long.valueOf(longArray[i10]));
        }
        return sparseArray;
    }

    public final x x() {
        l();
        return x.b(v().getString("dma_consent_settings", null));
    }

    public final e3 y() {
        l();
        return e3.c(v().getInt("consent_source", 100), v().getString("consent_settings", "G1"));
    }

    public final Boolean z() {
        l();
        if (v().contains("measurement_enabled")) {
            return Boolean.valueOf(v().getBoolean("measurement_enabled", true));
        }
        return null;
    }
}
