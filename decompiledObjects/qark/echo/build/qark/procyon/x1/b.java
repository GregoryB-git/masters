// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x1;

import V5.t;
import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import android.content.SharedPreferences;

public final class b
{
    public static final a d;
    public final SharedPreferences a;
    public final b b;
    public M c;
    
    static {
        d = new a(null);
    }
    
    public b() {
        final SharedPreferences sharedPreferences = B.l().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "FacebookSdk.getApplicationContext()\n              .getSharedPreferences(\n                  AccessTokenManager.SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)");
        this(sharedPreferences, new b());
    }
    
    public b(final SharedPreferences a, final b b) {
        Intrinsics.checkNotNullParameter(a, "sharedPreferences");
        Intrinsics.checkNotNullParameter(b, "tokenCachingStrategyFactory");
        this.a = a;
        this.b = b;
    }
    
    public final void a() {
        this.a.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
        if (this.h()) {
            this.d().a();
        }
    }
    
    public final x1.a b() {
        final SharedPreferences a = this.a;
        x1.a b = null;
        final String string = a.getString("com.facebook.AccessTokenManager.CachedAccessToken", (String)null);
        if (string == null) {
            return b;
        }
        try {
            b = x1.a.z.b(new JSONObject(string));
            return b;
        }
        catch (JSONException ex) {
            return null;
        }
    }
    
    public final x1.a c() {
        final Bundle c = this.d().c();
        if (c != null && M.c.g(c)) {
            return x1.a.z.c(c);
        }
        return null;
    }
    
    public final M d() {
        if (T1.a.d(this)) {
            return null;
        }
        while (true) {
            try {
                while (true) {
                    if (this.c == null) {
                        // monitorenter(this)
                        while (true) {
                            try {
                                if (this.c == null) {
                                    this.c = this.b.a();
                                }
                                final t a = t.a;
                                // monitorexit(this)
                                final M c = this.c;
                                if (c != null) {
                                    return c;
                                }
                                throw new IllegalStateException("Required value was null.".toString());
                                // monitorexit(this)
                                final Throwable t;
                                T1.a.b(t, this);
                                return null;
                            }
                            finally {}
                            continue;
                        }
                    }
                    continue;
                }
            }
            finally {}
            final Throwable t2;
            final Throwable t = t2;
            continue;
        }
    }
    
    public final boolean e() {
        return this.a.contains("com.facebook.AccessTokenManager.CachedAccessToken");
    }
    
    public final x1.a f() {
        if (this.e()) {
            return this.b();
        }
        x1.a a;
        if (this.h()) {
            final x1.a c = this.c();
            if ((a = c) != null) {
                this.g(c);
                this.d().a();
                return c;
            }
        }
        else {
            a = null;
        }
        return a;
    }
    
    public final void g(final x1.a a) {
        Intrinsics.checkNotNullParameter(a, "accessToken");
        try {
            this.a.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", a.o().toString()).apply();
        }
        catch (JSONException ex) {}
    }
    
    public final boolean h() {
        return B.G();
    }
    
    public static final class a
    {
    }
    
    public static final class b
    {
        public final M a() {
            return new M(B.l(), null, 2, null);
        }
    }
}
