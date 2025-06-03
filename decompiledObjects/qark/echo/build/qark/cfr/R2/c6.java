/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.net.Uri$Builder
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.util.Pair
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Set
 */
package R2;

import E2.e;
import R2.C3;
import R2.G2;
import R2.K;
import R2.N2;
import R2.P1;
import R2.Y1;
import R2.a2;
import R2.g;
import R2.l2;
import R2.q2;
import R2.r2;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import java.util.Set;

public final class c6 {
    public final N2 a;

    public c6(N2 n22) {
        this.a = n22;
    }

    public final void a() {
        this.a.e().n();
        if (!this.d()) {
            return;
        }
        if (this.e()) {
            this.a.F().w.b(null);
            Bundle bundle = new Bundle();
            bundle.putString("source", "(not set)");
            bundle.putString("medium", "(not set)");
            bundle.putString("_cis", "intent");
            bundle.putLong("_cc", 1L);
            this.a.H().z0("auto", "_cmpx", bundle);
        } else {
            Object object = this.a.F().w.a();
            if (TextUtils.isEmpty((CharSequence)object)) {
                this.a.j().I().a("Cache still valid but referrer not found");
            } else {
                long l8 = this.a.F().x.a() / 3600000L;
                object = Uri.parse((String)object);
                Bundle bundle = new Bundle();
                Pair pair = new Pair((Object)object.getPath(), (Object)bundle);
                for (String string2 : object.getQueryParameterNames()) {
                    bundle.putString(string2, object.getQueryParameter(string2));
                }
                ((Bundle)pair.second).putLong("_cc", (l8 - 1L) * 3600000L);
                object = pair.first;
                object = object == null ? "app" : (String)object;
                this.a.H().z0((String)object, "_cmp", (Bundle)pair.second);
            }
            this.a.F().w.b(null);
        }
        this.a.F().x.b(0L);
    }

    public final void b(String string2, Bundle bundle) {
        block5 : {
            block9 : {
                block6 : {
                    String string3;
                    block8 : {
                        block7 : {
                            this.a.e().n();
                            if (this.a.p()) break block5;
                            if (bundle == null || bundle.isEmpty()) break block6;
                            if (string2 == null) break block7;
                            string3 = string2;
                            if (!string2.isEmpty()) break block8;
                        }
                        string3 = "auto";
                    }
                    string2 = new Uri.Builder();
                    string2.path(string3);
                    for (String string4 : bundle.keySet()) {
                        string2.appendQueryParameter(string4, bundle.getString(string4));
                    }
                    string2 = string2.build().toString();
                    break block9;
                }
                string2 = null;
            }
            if (!TextUtils.isEmpty((CharSequence)string2)) {
                this.a.F().w.b(string2);
                this.a.F().x.b(this.a.b().a());
            }
        }
    }

    public final void c() {
        if (this.d() && this.e()) {
            this.a.F().w.b(null);
        }
    }

    public final boolean d() {
        if (this.a.F().x.a() > 0L) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (!this.d()) {
            return false;
        }
        if (this.a.b().a() - this.a.F().x.a() > this.a.z().x(null, K.V)) {
            return true;
        }
        return false;
    }
}

