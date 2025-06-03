/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.os.Bundle
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.List
 *  java.util.Map
 *  java.util.concurrent.ConcurrentHashMap
 */
package R2;

import A2.n;
import E2.e;
import R2.A4;
import R2.B;
import R2.B4;
import R2.C;
import R2.C3;
import R2.C4;
import R2.D4;
import R2.E4;
import R2.G1;
import R2.G2;
import R2.N2;
import R2.S1;
import R2.S5;
import R2.V1;
import R2.X1;
import R2.Y1;
import R2.a2;
import R2.d0;
import R2.f;
import R2.f1;
import R2.g;
import R2.l2;
import R2.l5;
import R2.m3;
import R2.r5;
import R2.w4;
import R2.x4;
import R2.y4;
import R2.z4;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class v4
extends f1 {
    public volatile w4 c;
    public volatile w4 d;
    public w4 e;
    public final Map f = new ConcurrentHashMap();
    public Activity g;
    public volatile boolean h;
    public volatile w4 i;
    public w4 j;
    public boolean k;
    public final Object l = new Object();

    public v4(N2 n22) {
        super(n22);
    }

    public static /* synthetic */ void H(v4 v42, Bundle bundle, w4 w42, w4 w43, long l8) {
        if (bundle != null) {
            bundle.remove("screen_name");
            bundle.remove("screen_class");
        }
        v42.I(w42, w43, l8, true, v42.k().F(null, "screen_view", bundle, null, false));
    }

    @Override
    public final boolean A() {
        return false;
    }

    public final w4 C(boolean bl) {
        this.v();
        this.n();
        if (!bl) {
            return this.e;
        }
        w4 w42 = this.e;
        if (w42 != null) {
            return w42;
        }
        return this.j;
    }

    public final String D(Class object, String object2) {
        if ((object = object.getCanonicalName()) == null) {
            return object2;
        }
        object = (object = object.split("\\.")).length > 0 ? object[object.length - 1] : "";
        object2 = object;
        if (object.length() > this.f().t(null)) {
            object2 = object.substring(0, this.f().t(null));
        }
        return object2;
    }

    public final void I(w4 w42, w4 object, long l8, boolean bl, Bundle bundle) {
        this.n();
        boolean bl2 = false;
        boolean bl3 = object == null || object.c != w42.c || !y4.a(object.b, w42.b) || !y4.a(object.a, w42.a);
        boolean bl4 = bl2;
        if (bl) {
            bl4 = bl2;
            if (this.e != null) {
                bl4 = true;
            }
        }
        if (bl3) {
            long l9;
            long l10;
            bundle = bundle != null ? new Bundle(bundle) : new Bundle();
            S5.L(w42, bundle, true);
            if (object != null) {
                String string2 = object.a;
                if (string2 != null) {
                    bundle.putString("_pn", string2);
                }
                if ((string2 = object.b) != null) {
                    bundle.putString("_pc", string2);
                }
                bundle.putLong("_pi", object.c);
            }
            if (bl4 && (l10 = this.u().f.a(l8)) > 0L) {
                this.k().P(bundle, l10);
            }
            if (!this.f().Q()) {
                bundle.putLong("_mst", 1L);
            }
            object = w42.e ? "app" : "auto";
            l10 = this.b().a();
            if (w42.e && (l9 = w42.f) != 0L) {
                l10 = l9;
            }
            this.r().U((String)object, "_vs", l10, bundle);
        }
        if (bl4) {
            this.J(this.e, true, l8);
        }
        this.e = w42;
        if (w42.e) {
            this.j = w42;
        }
        this.t().G(w42);
    }

    public final void J(w4 w42, boolean bl, long l8) {
        this.o().v(this.b().b());
        boolean bl2 = w42 != null && w42.d;
        if (this.u().E(bl2, bl, l8) && w42 != null) {
            w42.d = false;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void K(Activity activity) {
        Object object = this.l;
        // MONITORENTER : object
        if (activity == this.g) {
            this.g = null;
        }
        // MONITOREXIT : object
        if (!this.f().Q()) {
            return;
        }
        this.f.remove((Object)activity);
    }

    public final void L(Activity object, w4 w42, boolean bl) {
        w4 w43 = this.c == null ? this.d : this.c;
        if (w42.b == null) {
            object = object != null ? this.D(object.getClass(), "Activity") : null;
            w42 = new w4(w42.a, (String)object, w42.c, w42.e, w42.f);
        }
        this.d = this.c;
        this.c = w42;
        long l8 = this.b().b();
        this.e().D(new A4(this, w42, w43, l8, bl));
    }

    public final void M(Activity activity, Bundle object) {
        if (!this.f().Q()) {
            return;
        }
        if (object == null) {
            return;
        }
        if ((object = object.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        object = new w4(object.getString("name"), object.getString("referrer_name"), object.getLong("id"));
        this.f.put((Object)activity, object);
    }

    public final void N(Activity activity, String object, String string2) {
        if (!this.f().Q()) {
            this.j().M().a("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        Object object2 = this.c;
        if (object2 == null) {
            this.j().M().a("setCurrentScreen cannot be called while no activity active");
            return;
        }
        if (this.f.get((Object)activity) == null) {
            this.j().M().a("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        String string3 = string2;
        if (string2 == null) {
            string3 = this.D(activity.getClass(), "Activity");
        }
        boolean bl = y4.a(object2.b, string3);
        boolean bl2 = y4.a(object2.a, object);
        if (bl && bl2) {
            this.j().M().a("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (object != null && (object.length() <= 0 || object.length() > this.f().t(null))) {
            this.j().M().b("Invalid screen name length in setCurrentScreen. Length", object.length());
            return;
        }
        if (string3 != null && (string3.length() <= 0 || string3.length() > this.f().t(null))) {
            this.j().M().b("Invalid class name length in setCurrentScreen. Length", string3.length());
            return;
        }
        object2 = this.j().K();
        string2 = object == null ? "null" : object;
        object2.c("Setting current screen to name, class", string2, string3);
        object = new w4((String)object, string3, this.k().P0());
        this.f.put((Object)activity, object);
        this.L(activity, (w4)object, true);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void O(Bundle bundle, long l8) {
        String string2;
        Object object;
        Object object2;
        block11 : {
            block10 : {
                object = this.l;
                // MONITORENTER : object
                if (!this.k) {
                    this.j().M().a("Cannot log screen view event when the app is in the background.");
                    // MONITOREXIT : object
                    return;
                }
                object2 = null;
                if (bundle == null) break block10;
                string2 = bundle.getString("screen_name");
                if (string2 != null && (string2.length() <= 0 || string2.length() > this.f().t(null))) {
                    this.j().M().b("Invalid screen name length for screen view. Length", string2.length());
                    // MONITOREXIT : object
                    return;
                }
                object2 = bundle.getString("screen_class");
                if (object2 != null && (object2.length() <= 0 || object2.length() > this.f().t(null))) {
                    this.j().M().b("Invalid screen class length for screen view. Length", object2.length());
                    // MONITOREXIT : object
                    return;
                }
                break block11;
            }
            string2 = null;
        }
        Object object3 = object2;
        if (object2 == null) {
            object3 = this.g;
            object3 = object3 != null ? this.D(object3.getClass(), "Activity") : "Activity";
        }
        object2 = this.c;
        if (this.h && object2 != null) {
            this.h = false;
            boolean bl = y4.a(object2.b, object3);
            boolean bl2 = y4.a(object2.a, string2);
            if (bl && bl2) {
                this.j().M().a("Ignoring call to log screen view event with duplicate parameters.");
                // MONITOREXIT : object
                return;
            }
        }
        // MONITOREXIT : object
        a2 a22 = this.j().K();
        object2 = string2 == null ? "null" : string2;
        object = object3 == null ? "null" : object3;
        a22.c("Logging screen view with name, class", object2, object);
        object2 = this.c == null ? this.d : this.c;
        this.c = object3 = new w4(string2, (String)object3, this.k().P0(), true, l8);
        this.d = object2;
        this.i = object3;
        l8 = this.b().b();
        this.e().D(new x4(this, bundle, (w4)object3, (w4)object2, l8));
    }

    public final w4 P() {
        return this.c;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void Q(Activity object) {
        Object object2 = this.l;
        synchronized (object2) {
            this.k = false;
            this.h = true;
        }
        long l8 = this.b().b();
        if (!this.f().Q()) {
            this.c = null;
            this.e().D(new C4(this, l8));
            return;
        }
        object = this.T((Activity)object);
        this.d = this.c;
        this.c = null;
        this.e().D(new B4(this, (w4)object, l8));
    }

    public final void R(Activity object, Bundle bundle) {
        if (!this.f().Q()) {
            return;
        }
        if (bundle == null) {
            return;
        }
        if ((object = (w4)this.f.get(object)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", object.c);
        bundle2.putString("name", object.a);
        bundle2.putString("referrer_name", object.b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void S(Activity var1_1) {
        var4_3 = this.l;
        synchronized (var4_3) {
            block10 : {
                this.k = true;
                if (var1_1 == this.g) break block10;
                var5_4 = this.l;
                ** synchronized (var5_4)
lbl-1000: // 1 sources:
                {
                    this.g = var1_1;
                    this.h = false;
                }
                if (!this.f().Q()) break block10;
                this.i = null;
                this.e().D(new E4(this));
            }
            ** if (this.f().Q()) goto lbl19
        }
lbl-1000: // 1 sources:
        {
            this.c = this.i;
            this.e().D(new z4(this));
            return;
        }
lbl19: // 1 sources:
        this.L((Activity)var1_1, this.T((Activity)var1_1), false);
        var1_1 = this.o();
        var2_5 = var1_1.b().b();
        var1_1.e().D(new d0((B)var1_1, var2_5));
        return;
        {
            catch (Throwable var1_2) {}
            throw var1_2;
        }
    }

    public final w4 T(Activity activity) {
        w4 w42;
        n.i((Object)activity);
        w4 w43 = w42 = (w4)this.f.get((Object)activity);
        if (w42 == null) {
            w43 = new w4(null, this.D(activity.getClass(), "Activity"), this.k().P0());
            this.f.put((Object)activity, (Object)w43);
        }
        if (this.i != null) {
            return this.i;
        }
        return w43;
    }
}

