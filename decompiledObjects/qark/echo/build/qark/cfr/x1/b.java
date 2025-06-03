/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.os.Bundle
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package x1;

import V5.t;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import org.json.JSONException;
import org.json.JSONObject;
import x1.B;
import x1.M;
import x1.a;

public final class b {
    public static final a d = new a(null);
    public final SharedPreferences a;
    public final b b;
    public M c;

    public b() {
        SharedPreferences sharedPreferences = B.l().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        Intrinsics.checkNotNullExpressionValue((Object)sharedPreferences, "FacebookSdk.getApplicationContext()\n              .getSharedPreferences(\n                  AccessTokenManager.SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)");
        this(sharedPreferences, new b());
    }

    public b(SharedPreferences sharedPreferences, b b8) {
        Intrinsics.checkNotNullParameter((Object)sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(b8, "tokenCachingStrategyFactory");
        this.a = sharedPreferences;
        this.b = b8;
    }

    public final void a() {
        this.a.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
        if (this.h()) {
            this.d().a();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final x1.a b() {
        Object object = this.a;
        Object object2 = null;
        if ((object = object.getString("com.facebook.AccessTokenManager.CachedAccessToken", null)) == null) return object2;
        try {
            object2 = new JSONObject((String)object);
            return x1.a.z.b((JSONObject)object2);
        }
        catch (JSONException jSONException) {
            return null;
        }
    }

    public final x1.a c() {
        Bundle bundle = this.d().c();
        if (bundle != null && M.c.g(bundle)) {
            return x1.a.z.c(bundle);
        }
        return null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final M d() {
        block9 : {
            if (T1.a.d(this)) {
                return null;
            }
            if (this.c != null) ** GOTO lbl14
            // MONITORENTER : this
            try {
                if (this.c != null) break block9;
                this.c = this.b.a();
            }
            catch (Throwable var1_2) {}
        }
        try {
            var1_1 = t.a;
            // MONITOREXIT : this
lbl14: // 2 sources:
            if ((var1_1 = this.c) == null) throw new IllegalStateException("Required value was null.".toString());
            return var1_1;
        }
        catch (Throwable var1_3) {}
        finally {
            throw var1_2;
        }
    }

    public final boolean e() {
        return this.a.contains("com.facebook.AccessTokenManager.CachedAccessToken");
    }

    public final x1.a f() {
        x1.a a8;
        if (this.e()) {
            return this.b();
        }
        if (this.h()) {
            x1.a a9;
            a8 = a9 = this.c();
            if (a9 != null) {
                this.g(a9);
                this.d().a();
                return a9;
            }
        } else {
            a8 = null;
        }
        return a8;
    }

    public final void g(x1.a a8) {
        Intrinsics.checkNotNullParameter(a8, "accessToken");
        try {
            a8 = a8.o();
            this.a.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", a8.toString()).apply();
            return;
        }
        catch (JSONException jSONException) {
            return;
        }
    }

    public final boolean h() {
        return B.G();
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }
    }

    public static final class b {
        public final M a() {
            return new M(B.l(), null, 2, null);
        }
    }

}

