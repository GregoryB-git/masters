// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import android.os.BaseBundle;
import s2.a;
import com.google.android.gms.internal.measurement.u6;
import android.text.TextUtils;
import android.os.Build$VERSION;
import android.util.SparseArray;
import A2.n;
import android.content.SharedPreferences$Editor;
import android.os.Bundle;
import android.content.SharedPreferences;
import android.util.Pair;

public final class l2 extends l3
{
    public static final Pair z;
    public SharedPreferences c;
    public p2 d;
    public final q2 e;
    public final q2 f;
    public final r2 g;
    public String h;
    public boolean i;
    public long j;
    public final q2 k;
    public final o2 l;
    public final r2 m;
    public final n2 n;
    public final o2 o;
    public final q2 p;
    public final q2 q;
    public boolean r;
    public o2 s;
    public o2 t;
    public q2 u;
    public final r2 v;
    public final r2 w;
    public final q2 x;
    public final n2 y;
    
    static {
        z = new Pair((Object)"", (Object)0L);
    }
    
    public l2(final N2 n2) {
        super(n2);
        this.k = new q2(this, "session_timeout", 1800000L);
        this.l = new o2(this, "start_new_session", true);
        this.p = new q2(this, "last_pause_time", 0L);
        this.q = new q2(this, "session_id", 0L);
        this.m = new r2(this, "non_personalized_ads", null);
        this.n = new n2(this, "last_received_uri_timestamps_by_source", null);
        this.o = new o2(this, "allow_remote_dynamite", false);
        this.e = new q2(this, "first_open_time", 0L);
        this.f = new q2(this, "app_install_time", 0L);
        this.g = new r2(this, "app_instance_id", null);
        this.s = new o2(this, "app_backgrounded", false);
        this.t = new o2(this, "deep_link_retrieval_complete", false);
        this.u = new q2(this, "deep_link_retrieval_attempts", 0L);
        this.v = new r2(this, "firebase_feature_rollouts", null);
        this.w = new r2(this, "deferred_attribution_cache", null);
        this.x = new q2(this, "deferred_attribution_cache_timestamp", 0L);
        this.y = new n2(this, "default_event_parameters", null);
    }
    
    public final boolean A(final q3 q3) {
        this.n();
        final int b = q3.b();
        if (this.x(b)) {
            final SharedPreferences$Editor edit = this.F().edit();
            edit.putString("consent_settings", q3.v());
            edit.putInt("consent_source", b);
            edit.apply();
            return true;
        }
        return false;
    }
    
    public final boolean B() {
        final SharedPreferences c = this.c;
        return c != null && c.contains("deferred_analytics_collection");
    }
    
    public final void C(final Boolean b) {
        this.n();
        final SharedPreferences$Editor edit = this.F().edit();
        if (b != null) {
            edit.putBoolean("measurement_enabled_from_api", (boolean)b);
        }
        else {
            edit.remove("measurement_enabled_from_api");
        }
        edit.apply();
    }
    
    public final void D(final String s) {
        this.n();
        final SharedPreferences$Editor edit = this.F().edit();
        edit.putString("admob_app_id", s);
        edit.apply();
    }
    
    public final void E(final boolean b) {
        this.n();
        this.j().K().b("App measurement setting deferred collection", b);
        final SharedPreferences$Editor edit = this.F().edit();
        edit.putBoolean("deferred_analytics_collection", b);
        edit.apply();
    }
    
    public final SharedPreferences F() {
        this.n();
        this.o();
        A2.n.i(this.c);
        return this.c;
    }
    
    public final void G(final String s) {
        this.n();
        final SharedPreferences$Editor edit = this.F().edit();
        edit.putString("gmp_app_id", s);
        edit.apply();
    }
    
    public final SparseArray H() {
        final Bundle a = this.n.a();
        if (a == null) {
            return new SparseArray();
        }
        final int[] intArray = ((BaseBundle)a).getIntArray("uriSources");
        final long[] longArray = ((BaseBundle)a).getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            this.j().G().a("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        final SparseArray sparseArray = new SparseArray();
        for (int i = 0; i < intArray.length; ++i) {
            sparseArray.put(intArray[i], (Object)longArray[i]);
        }
        return sparseArray;
    }
    
    public final z I() {
        this.n();
        return R2.z.c(this.F().getString("dma_consent_settings", (String)null));
    }
    
    public final q3 J() {
        this.n();
        return q3.f(this.F().getString("consent_settings", "G1"), this.F().getInt("consent_source", 100));
    }
    
    public final Boolean K() {
        this.n();
        if (!this.F().contains("use_service")) {
            return null;
        }
        return this.F().getBoolean("use_service", false);
    }
    
    public final Boolean L() {
        this.n();
        if (this.F().contains("measurement_enabled_from_api")) {
            return this.F().getBoolean("measurement_enabled_from_api", true);
        }
        return null;
    }
    
    public final Boolean M() {
        this.n();
        if (this.F().contains("measurement_enabled")) {
            return this.F().getBoolean("measurement_enabled", true);
        }
        return null;
    }
    
    public final String N() {
        this.n();
        final String string = this.F().getString("previous_os_version", (String)null);
        this.g().o();
        final String release = Build$VERSION.RELEASE;
        if (!TextUtils.isEmpty((CharSequence)release) && !release.equals(string)) {
            final SharedPreferences$Editor edit = this.F().edit();
            edit.putString("previous_os_version", release);
            edit.apply();
        }
        return string;
    }
    
    public final String O() {
        this.n();
        return this.F().getString("admob_app_id", (String)null);
    }
    
    public final String P() {
        this.n();
        return this.F().getString("gmp_app_id", (String)null);
    }
    
    public final void Q() {
        this.n();
        final Boolean m = this.M();
        final SharedPreferences$Editor edit = this.F().edit();
        edit.clear();
        edit.apply();
        if (m != null) {
            this.v(m);
        }
    }
    
    @Override
    public final boolean s() {
        return true;
    }
    
    @Override
    public final void t() {
        final SharedPreferences sharedPreferences = this.a().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.c = sharedPreferences;
        if (!(this.r = sharedPreferences.getBoolean("has_been_opened", false))) {
            final SharedPreferences$Editor edit = this.c.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.d = new p2(this, "health_monitor", Math.max(0L, (long)K.e.a(null)), null);
    }
    
    public final Pair u(final String s) {
        this.n();
        if (u6.a() && this.f().s(K.R0) && !this.J().l(q3.a.p)) {
            return new Pair((Object)"", (Object)Boolean.FALSE);
        }
        final long b = this.b().b();
        if (this.h != null && b < this.j) {
            return new Pair((Object)this.h, (Object)this.i);
        }
        this.j = b + this.f().C(s);
        s2.a.b(true);
        while (true) {
            try {
                final a.a a = s2.a.a(this.a());
                this.h = "";
                final String a2 = a.a();
                if (a2 != null) {
                    this.h = a2;
                }
                this.i = a.b();
                while (true) {
                    s2.a.b(false);
                    return new Pair((Object)this.h, (Object)this.i);
                    final Exception ex;
                    this.j().F().b("Unable to get advertising id", ex);
                    this.h = "";
                    continue;
                }
            }
            catch (Exception ex2) {}
            final Exception ex2;
            final Exception ex = ex2;
            continue;
        }
    }
    
    public final void v(final Boolean b) {
        this.n();
        final SharedPreferences$Editor edit = this.F().edit();
        if (b != null) {
            edit.putBoolean("measurement_enabled", (boolean)b);
        }
        else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }
    
    public final void w(final boolean b) {
        this.n();
        final SharedPreferences$Editor edit = this.F().edit();
        edit.putBoolean("use_service", b);
        edit.apply();
    }
    
    public final boolean x(final int n) {
        return q3.k(n, this.F().getInt("consent_source", 100));
    }
    
    public final boolean y(final long n) {
        return n - this.k.a() > this.p.a();
    }
    
    public final boolean z(final z z) {
        this.n();
        if (q3.k(z.a(), this.I().a())) {
            final SharedPreferences$Editor edit = this.F().edit();
            edit.putString("dma_consent_settings", z.i());
            edit.apply();
            return true;
        }
        return false;
    }
}
