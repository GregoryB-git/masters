/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.util.Pair
 *  android.util.SparseArray
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 */
package R2;

import A2.n;
import E2.e;
import R2.C;
import R2.K;
import R2.N2;
import R2.P1;
import R2.Y1;
import R2.a2;
import R2.g;
import R2.l3;
import R2.n2;
import R2.o2;
import R2.p2;
import R2.q2;
import R2.q3;
import R2.r2;
import R2.s2;
import R2.z;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.internal.measurement.u6;
import s2.a;

public final class l2
extends l3 {
    public static final Pair z = new Pair((Object)"", (Object)0L);
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

    public l2(N2 n22) {
        super(n22);
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

    public final boolean A(q3 q32) {
        this.n();
        int n8 = q32.b();
        if (this.x(n8)) {
            SharedPreferences.Editor editor = this.F().edit();
            editor.putString("consent_settings", q32.v());
            editor.putInt("consent_source", n8);
            editor.apply();
            return true;
        }
        return false;
    }

    public final boolean B() {
        SharedPreferences sharedPreferences = this.c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    public final void C(Boolean bl) {
        this.n();
        SharedPreferences.Editor editor = this.F().edit();
        if (bl != null) {
            editor.putBoolean("measurement_enabled_from_api", bl.booleanValue());
        } else {
            editor.remove("measurement_enabled_from_api");
        }
        editor.apply();
    }

    public final void D(String string2) {
        this.n();
        SharedPreferences.Editor editor = this.F().edit();
        editor.putString("admob_app_id", string2);
        editor.apply();
    }

    public final void E(boolean bl) {
        this.n();
        this.j().K().b("App measurement setting deferred collection", bl);
        SharedPreferences.Editor editor = this.F().edit();
        editor.putBoolean("deferred_analytics_collection", bl);
        editor.apply();
    }

    public final SharedPreferences F() {
        this.n();
        this.o();
        n.i((Object)this.c);
        return this.c;
    }

    public final void G(String string2) {
        this.n();
        SharedPreferences.Editor editor = this.F().edit();
        editor.putString("gmp_app_id", string2);
        editor.apply();
    }

    public final SparseArray H() {
        long[] arrl = this.n.a();
        if (arrl == null) {
            return new SparseArray();
        }
        int[] arrn = arrl.getIntArray("uriSources");
        arrl = arrl.getLongArray("uriTimestamps");
        if (arrn != null && arrl != null) {
            if (arrn.length != arrl.length) {
                this.j().G().a("Trigger URI source and timestamp array lengths do not match");
                return new SparseArray();
            }
            SparseArray sparseArray = new SparseArray();
            for (int i8 = 0; i8 < arrn.length; ++i8) {
                sparseArray.put(arrn[i8], (Object)arrl[i8]);
            }
            return sparseArray;
        }
        return new SparseArray();
    }

    public final z I() {
        this.n();
        return z.c(this.F().getString("dma_consent_settings", null));
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
        String string2 = this.F().getString("previous_os_version", null);
        this.g().o();
        String string3 = Build.VERSION.RELEASE;
        if (!TextUtils.isEmpty((CharSequence)string3) && !string3.equals((Object)string2)) {
            SharedPreferences.Editor editor = this.F().edit();
            editor.putString("previous_os_version", string3);
            editor.apply();
        }
        return string2;
    }

    public final String O() {
        this.n();
        return this.F().getString("admob_app_id", null);
    }

    public final String P() {
        this.n();
        return this.F().getString("gmp_app_id", null);
    }

    public final void Q() {
        this.n();
        Boolean bl = this.M();
        SharedPreferences.Editor editor = this.F().edit();
        editor.clear();
        editor.apply();
        if (bl != null) {
            this.v(bl);
        }
    }

    @Override
    public final boolean s() {
        return true;
    }

    @Override
    public final void t() {
        boolean bl;
        SharedPreferences sharedPreferences;
        this.c = sharedPreferences = this.a().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.r = bl = sharedPreferences.getBoolean("has_been_opened", false);
        if (!bl) {
            sharedPreferences = this.c.edit();
            sharedPreferences.putBoolean("has_been_opened", true);
            sharedPreferences.apply();
        }
        this.d = new p2(this, "health_monitor", Math.max((long)0L, (long)((Long)K.e.a(null))), null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Pair u(String object) {
        block5 : {
            this.n();
            if (u6.a() && this.f().s(K.R0) && !this.J().l(q3.a.p)) {
                return new Pair((Object)"", (Object)Boolean.FALSE);
            }
            long l8 = this.b().b();
            if (this.h != null && l8 < this.j) {
                return new Pair((Object)this.h, (Object)this.i);
            }
            this.j = l8 + this.f().C((String)object);
            a.b(true);
            try {
                object = a.a(this.a());
                this.h = "";
                String string2 = object.a();
                if (string2 != null) {
                    this.h = string2;
                }
                this.i = object.b();
                break block5;
            }
            catch (Exception exception) {}
            this.j().F().b("Unable to get advertising id", (Object)exception);
            this.h = "";
        }
        a.b(false);
        return new Pair((Object)this.h, (Object)this.i);
    }

    public final void v(Boolean bl) {
        this.n();
        SharedPreferences.Editor editor = this.F().edit();
        if (bl != null) {
            editor.putBoolean("measurement_enabled", bl.booleanValue());
        } else {
            editor.remove("measurement_enabled");
        }
        editor.apply();
    }

    public final void w(boolean bl) {
        this.n();
        SharedPreferences.Editor editor = this.F().edit();
        editor.putBoolean("use_service", bl);
        editor.apply();
    }

    public final boolean x(int n8) {
        return q3.k(n8, this.F().getInt("consent_source", 100));
    }

    public final boolean y(long l8) {
        if (l8 - this.k.a() > this.p.a()) {
            return true;
        }
        return false;
    }

    public final boolean z(z z8) {
        this.n();
        z z9 = this.I();
        if (q3.k(z8.a(), z9.a())) {
            z9 = this.F().edit();
            z9.putString("dma_consent_settings", z8.i());
            z9.apply();
            return true;
        }
        return false;
    }
}

