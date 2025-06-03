package R2;

import A2.AbstractC0328n;
import R2.C0585q3;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.internal.measurement.C1041u6;
import s2.C1939a;

/* renamed from: R2.l2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0549l2 extends AbstractC0550l3 {

    /* renamed from: z, reason: collision with root package name */
    public static final Pair f5385z = new Pair("", 0L);

    /* renamed from: c, reason: collision with root package name */
    public SharedPreferences f5386c;

    /* renamed from: d, reason: collision with root package name */
    public C0577p2 f5387d;

    /* renamed from: e, reason: collision with root package name */
    public final C0584q2 f5388e;

    /* renamed from: f, reason: collision with root package name */
    public final C0584q2 f5389f;

    /* renamed from: g, reason: collision with root package name */
    public final C0590r2 f5390g;

    /* renamed from: h, reason: collision with root package name */
    public String f5391h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f5392i;

    /* renamed from: j, reason: collision with root package name */
    public long f5393j;

    /* renamed from: k, reason: collision with root package name */
    public final C0584q2 f5394k;

    /* renamed from: l, reason: collision with root package name */
    public final C0570o2 f5395l;

    /* renamed from: m, reason: collision with root package name */
    public final C0590r2 f5396m;

    /* renamed from: n, reason: collision with root package name */
    public final C0563n2 f5397n;

    /* renamed from: o, reason: collision with root package name */
    public final C0570o2 f5398o;

    /* renamed from: p, reason: collision with root package name */
    public final C0584q2 f5399p;

    /* renamed from: q, reason: collision with root package name */
    public final C0584q2 f5400q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f5401r;

    /* renamed from: s, reason: collision with root package name */
    public C0570o2 f5402s;

    /* renamed from: t, reason: collision with root package name */
    public C0570o2 f5403t;

    /* renamed from: u, reason: collision with root package name */
    public C0584q2 f5404u;

    /* renamed from: v, reason: collision with root package name */
    public final C0590r2 f5405v;

    /* renamed from: w, reason: collision with root package name */
    public final C0590r2 f5406w;

    /* renamed from: x, reason: collision with root package name */
    public final C0584q2 f5407x;

    /* renamed from: y, reason: collision with root package name */
    public final C0563n2 f5408y;

    public C0549l2(N2 n22) {
        super(n22);
        this.f5394k = new C0584q2(this, "session_timeout", 1800000L);
        this.f5395l = new C0570o2(this, "start_new_session", true);
        this.f5399p = new C0584q2(this, "last_pause_time", 0L);
        this.f5400q = new C0584q2(this, "session_id", 0L);
        this.f5396m = new C0590r2(this, "non_personalized_ads", null);
        this.f5397n = new C0563n2(this, "last_received_uri_timestamps_by_source", null);
        this.f5398o = new C0570o2(this, "allow_remote_dynamite", false);
        this.f5388e = new C0584q2(this, "first_open_time", 0L);
        this.f5389f = new C0584q2(this, "app_install_time", 0L);
        this.f5390g = new C0590r2(this, "app_instance_id", null);
        this.f5402s = new C0570o2(this, "app_backgrounded", false);
        this.f5403t = new C0570o2(this, "deep_link_retrieval_complete", false);
        this.f5404u = new C0584q2(this, "deep_link_retrieval_attempts", 0L);
        this.f5405v = new C0590r2(this, "firebase_feature_rollouts", null);
        this.f5406w = new C0590r2(this, "deferred_attribution_cache", null);
        this.f5407x = new C0584q2(this, "deferred_attribution_cache_timestamp", 0L);
        this.f5408y = new C0563n2(this, "default_event_parameters", null);
    }

    public final boolean A(C0585q3 c0585q3) {
        n();
        int b7 = c0585q3.b();
        if (!x(b7)) {
            return false;
        }
        SharedPreferences.Editor edit = F().edit();
        edit.putString("consent_settings", c0585q3.v());
        edit.putInt("consent_source", b7);
        edit.apply();
        return true;
    }

    public final boolean B() {
        SharedPreferences sharedPreferences = this.f5386c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    public final void C(Boolean bool) {
        n();
        SharedPreferences.Editor edit = F().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled_from_api");
        }
        edit.apply();
    }

    public final void D(String str) {
        n();
        SharedPreferences.Editor edit = F().edit();
        edit.putString("admob_app_id", str);
        edit.apply();
    }

    public final void E(boolean z7) {
        n();
        j().K().b("App measurement setting deferred collection", Boolean.valueOf(z7));
        SharedPreferences.Editor edit = F().edit();
        edit.putBoolean("deferred_analytics_collection", z7);
        edit.apply();
    }

    public final SharedPreferences F() {
        n();
        o();
        AbstractC0328n.i(this.f5386c);
        return this.f5386c;
    }

    public final void G(String str) {
        n();
        SharedPreferences.Editor edit = F().edit();
        edit.putString("gmp_app_id", str);
        edit.apply();
    }

    public final SparseArray H() {
        Bundle a7 = this.f5397n.a();
        if (a7 == null) {
            return new SparseArray();
        }
        int[] intArray = a7.getIntArray("uriSources");
        long[] longArray = a7.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            j().G().a("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i7 = 0; i7 < intArray.length; i7++) {
            sparseArray.put(intArray[i7], Long.valueOf(longArray[i7]));
        }
        return sparseArray;
    }

    public final C0643z I() {
        n();
        return C0643z.c(F().getString("dma_consent_settings", null));
    }

    public final C0585q3 J() {
        n();
        return C0585q3.f(F().getString("consent_settings", "G1"), F().getInt("consent_source", 100));
    }

    public final Boolean K() {
        n();
        if (F().contains("use_service")) {
            return Boolean.valueOf(F().getBoolean("use_service", false));
        }
        return null;
    }

    public final Boolean L() {
        n();
        if (F().contains("measurement_enabled_from_api")) {
            return Boolean.valueOf(F().getBoolean("measurement_enabled_from_api", true));
        }
        return null;
    }

    public final Boolean M() {
        n();
        if (F().contains("measurement_enabled")) {
            return Boolean.valueOf(F().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    public final String N() {
        n();
        String string = F().getString("previous_os_version", null);
        g().o();
        String str = Build.VERSION.RELEASE;
        if (!TextUtils.isEmpty(str) && !str.equals(string)) {
            SharedPreferences.Editor edit = F().edit();
            edit.putString("previous_os_version", str);
            edit.apply();
        }
        return string;
    }

    public final String O() {
        n();
        return F().getString("admob_app_id", null);
    }

    public final String P() {
        n();
        return F().getString("gmp_app_id", null);
    }

    public final void Q() {
        n();
        Boolean M6 = M();
        SharedPreferences.Editor edit = F().edit();
        edit.clear();
        edit.apply();
        if (M6 != null) {
            v(M6);
        }
    }

    @Override // R2.AbstractC0550l3
    public final boolean s() {
        return true;
    }

    @Override // R2.AbstractC0550l3
    public final void t() {
        SharedPreferences sharedPreferences = a().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f5386c = sharedPreferences;
        boolean z7 = sharedPreferences.getBoolean("has_been_opened", false);
        this.f5401r = z7;
        if (!z7) {
            SharedPreferences.Editor edit = this.f5386c.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.f5387d = new C0577p2(this, "health_monitor", Math.max(0L, ((Long) K.f4828e.a(null)).longValue()));
    }

    public final Pair u(String str) {
        n();
        if (C1041u6.a() && f().s(K.f4801R0) && !J().l(C0585q3.a.AD_STORAGE)) {
            return new Pair("", Boolean.FALSE);
        }
        long b7 = b().b();
        if (this.f5391h != null && b7 < this.f5393j) {
            return new Pair(this.f5391h, Boolean.valueOf(this.f5392i));
        }
        this.f5393j = b7 + f().C(str);
        C1939a.b(true);
        try {
            C1939a.C0266a a7 = C1939a.a(a());
            this.f5391h = "";
            String a8 = a7.a();
            if (a8 != null) {
                this.f5391h = a8;
            }
            this.f5392i = a7.b();
        } catch (Exception e7) {
            j().F().b("Unable to get advertising id", e7);
            this.f5391h = "";
        }
        C1939a.b(false);
        return new Pair(this.f5391h, Boolean.valueOf(this.f5392i));
    }

    public final void v(Boolean bool) {
        n();
        SharedPreferences.Editor edit = F().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    public final void w(boolean z7) {
        n();
        SharedPreferences.Editor edit = F().edit();
        edit.putBoolean("use_service", z7);
        edit.apply();
    }

    public final boolean x(int i7) {
        return C0585q3.k(i7, F().getInt("consent_source", 100));
    }

    public final boolean y(long j7) {
        return j7 - this.f5394k.a() > this.f5399p.a();
    }

    public final boolean z(C0643z c0643z) {
        n();
        if (!C0585q3.k(c0643z.a(), I().a())) {
            return false;
        }
        SharedPreferences.Editor edit = F().edit();
        edit.putString("dma_consent_settings", c0643z.i());
        edit.apply();
        return true;
    }
}
