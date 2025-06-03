/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.preference.PreferenceManager
 *  java.lang.IllegalStateException
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.util.UUID
 */
package G1;

import G1.o;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import x1.B;

public final class m {
    public static final a g = new a(null);
    public final Long a;
    public Long b;
    public UUID c;
    public int d;
    public Long e;
    public o f;

    public m(Long l8, Long l9, UUID uUID) {
        Intrinsics.checkNotNullParameter((Object)uUID, "sessionId");
        this.a = l8;
        this.b = l9;
        this.c = uUID;
    }

    public /* synthetic */ m(Long l8, Long l9, UUID uUID, int n8, g g8) {
        if ((n8 & 4) != 0) {
            uUID = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue((Object)uUID, "randomUUID()");
        }
        this(l8, l9, uUID);
    }

    public static final /* synthetic */ void a(m m8, int n8) {
        m8.d = n8;
    }

    public final Long b() {
        Long l8;
        Long l9 = l8 = this.e;
        if (l8 == null) {
            l9 = 0L;
        }
        return l9;
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
        Long l8;
        if (this.a != null && (l8 = this.b) != null) {
            if (l8 != null) {
                return l8 - this.a;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
        return 0L;
    }

    public final o g() {
        return this.f;
    }

    public final void h() {
        ++this.d;
    }

    public final void i(Long l8) {
        this.e = l8;
    }

    public final void j(UUID uUID) {
        Intrinsics.checkNotNullParameter((Object)uUID, "<set-?>");
        this.c = uUID;
    }

    public final void k(Long l8) {
        this.b = l8;
    }

    public final void l(o o8) {
        this.f = o8;
    }

    public final void m() {
        Object object = PreferenceManager.getDefaultSharedPreferences((Context)B.l()).edit();
        Long l8 = this.a;
        long l9 = 0L;
        long l10 = l8 == null ? 0L : l8;
        object.putLong("com.facebook.appevents.SessionInfo.sessionStartTime", l10);
        l8 = this.b;
        l10 = l8 == null ? l9 : l8;
        object.putLong("com.facebook.appevents.SessionInfo.sessionEndTime", l10);
        object.putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.d);
        object.putString("com.facebook.appevents.SessionInfo.sessionId", this.c.toString());
        object.apply();
        object = this.f;
        if (object != null) {
            if (object == null) {
                return;
            }
            object.a();
        }
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }

        public final void a() {
            SharedPreferences.Editor editor = PreferenceManager.getDefaultSharedPreferences((Context)B.l()).edit();
            editor.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
            editor.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
            editor.remove("com.facebook.appevents.SessionInfo.interruptionCount");
            editor.remove("com.facebook.appevents.SessionInfo.sessionId");
            editor.apply();
            o.c.a();
        }

        public final m b() {
            SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences((Context)B.l());
            long l8 = sharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionStartTime", 0L);
            long l9 = sharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionEndTime", 0L);
            String string2 = sharedPreferences.getString("com.facebook.appevents.SessionInfo.sessionId", null);
            if (l8 != 0L && l9 != 0L) {
                if (string2 == null) {
                    return null;
                }
                m m8 = new m(l8, l9, null, 4, null);
                m.a(m8, sharedPreferences.getInt("com.facebook.appevents.SessionInfo.interruptionCount", 0));
                m8.l(o.c.b());
                m8.i(System.currentTimeMillis());
                sharedPreferences = UUID.fromString((String)string2);
                Intrinsics.checkNotNullExpressionValue((Object)sharedPreferences, "fromString(sessionIDStr)");
                m8.j((UUID)sharedPreferences);
                return m8;
            }
            return null;
        }
    }

}

