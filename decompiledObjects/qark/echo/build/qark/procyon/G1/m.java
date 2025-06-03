// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package G1;

import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import android.preference.PreferenceManager;
import x1.B;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import java.util.UUID;

public final class m
{
    public static final a g;
    public final Long a;
    public Long b;
    public UUID c;
    public int d;
    public Long e;
    public o f;
    
    static {
        g = new a(null);
    }
    
    public m(final Long a, final Long b, final UUID c) {
        Intrinsics.checkNotNullParameter(c, "sessionId");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static final /* synthetic */ void a(final m m, final int d) {
        m.d = d;
    }
    
    public final Long b() {
        Long n;
        if ((n = this.e) == null) {
            n = 0L;
        }
        return n;
    }
    
    public final int c() {
        return this.d;
    }
    
    public final UUID d() {
        return this.c;
    }
    
    public final Long e() {
        return this.b;
    }
    
    public final long f() {
        if (this.a != null) {
            final Long b = this.b;
            if (b != null) {
                if (b != null) {
                    return b.longValue() - this.a;
                }
                throw new IllegalStateException("Required value was null.".toString());
            }
        }
        return 0L;
    }
    
    public final o g() {
        return this.f;
    }
    
    public final void h() {
        ++this.d;
    }
    
    public final void i(final Long e) {
        this.e = e;
    }
    
    public final void j(final UUID c) {
        Intrinsics.checkNotNullParameter(c, "<set-?>");
        this.c = c;
    }
    
    public final void k(final Long b) {
        this.b = b;
    }
    
    public final void l(final o f) {
        this.f = f;
    }
    
    public final void m() {
        final SharedPreferences$Editor edit = PreferenceManager.getDefaultSharedPreferences(B.l()).edit();
        final Long a = this.a;
        final long n = 0L;
        long longValue;
        if (a == null) {
            longValue = 0L;
        }
        else {
            longValue = a;
        }
        edit.putLong("com.facebook.appevents.SessionInfo.sessionStartTime", longValue);
        final Long b = this.b;
        long longValue2;
        if (b == null) {
            longValue2 = n;
        }
        else {
            longValue2 = b;
        }
        edit.putLong("com.facebook.appevents.SessionInfo.sessionEndTime", longValue2);
        edit.putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.d);
        edit.putString("com.facebook.appevents.SessionInfo.sessionId", this.c.toString());
        edit.apply();
        final o f = this.f;
        if (f != null) {
            if (f == null) {
                return;
            }
            f.a();
        }
    }
    
    public static final class a
    {
        public final void a() {
            final SharedPreferences$Editor edit = PreferenceManager.getDefaultSharedPreferences(B.l()).edit();
            edit.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
            edit.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
            edit.remove("com.facebook.appevents.SessionInfo.interruptionCount");
            edit.remove("com.facebook.appevents.SessionInfo.sessionId");
            edit.apply();
            o.c.a();
        }
        
        public final m b() {
            final SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(B.l());
            final long long1 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionStartTime", 0L);
            final long long2 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionEndTime", 0L);
            final String string = defaultSharedPreferences.getString("com.facebook.appevents.SessionInfo.sessionId", (String)null);
            if (long1 == 0L || long2 == 0L) {
                return null;
            }
            if (string == null) {
                return null;
            }
            final m m = new m(long1, long2, null, 4, null);
            G1.m.a(m, defaultSharedPreferences.getInt("com.facebook.appevents.SessionInfo.interruptionCount", 0));
            m.l(o.c.b());
            m.i(System.currentTimeMillis());
            final UUID fromString = UUID.fromString(string);
            Intrinsics.checkNotNullExpressionValue(fromString, "fromString(sessionIDStr)");
            m.j(fromString);
            return m;
        }
    }
}
