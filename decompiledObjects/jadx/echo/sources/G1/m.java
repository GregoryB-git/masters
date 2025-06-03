package G1;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import x1.C2146B;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: g, reason: collision with root package name */
    public static final a f2064g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final Long f2065a;

    /* renamed from: b, reason: collision with root package name */
    public Long f2066b;

    /* renamed from: c, reason: collision with root package name */
    public UUID f2067c;

    /* renamed from: d, reason: collision with root package name */
    public int f2068d;

    /* renamed from: e, reason: collision with root package name */
    public Long f2069e;

    /* renamed from: f, reason: collision with root package name */
    public o f2070f;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final void a() {
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(C2146B.l()).edit();
            edit.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
            edit.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
            edit.remove("com.facebook.appevents.SessionInfo.interruptionCount");
            edit.remove("com.facebook.appevents.SessionInfo.sessionId");
            edit.apply();
            o.f2074c.a();
        }

        public final m b() {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(C2146B.l());
            long j7 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionStartTime", 0L);
            long j8 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionEndTime", 0L);
            String string = defaultSharedPreferences.getString("com.facebook.appevents.SessionInfo.sessionId", null);
            if (j7 == 0 || j8 == 0 || string == null) {
                return null;
            }
            m mVar = new m(Long.valueOf(j7), Long.valueOf(j8), null, 4, null);
            mVar.f2068d = defaultSharedPreferences.getInt("com.facebook.appevents.SessionInfo.interruptionCount", 0);
            mVar.l(o.f2074c.b());
            mVar.i(Long.valueOf(System.currentTimeMillis()));
            UUID fromString = UUID.fromString(string);
            Intrinsics.checkNotNullExpressionValue(fromString, "fromString(sessionIDStr)");
            mVar.j(fromString);
            return mVar;
        }
    }

    public m(Long l7, Long l8, UUID sessionId) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.f2065a = l7;
        this.f2066b = l8;
        this.f2067c = sessionId;
    }

    public final Long b() {
        Long l7 = this.f2069e;
        if (l7 == null) {
            return 0L;
        }
        return l7;
    }

    public final int c() {
        return this.f2068d;
    }

    public final UUID d() {
        return this.f2067c;
    }

    public final Long e() {
        return this.f2066b;
    }

    public final long f() {
        Long l7;
        if (this.f2065a == null || (l7 = this.f2066b) == null) {
            return 0L;
        }
        if (l7 != null) {
            return l7.longValue() - this.f2065a.longValue();
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public final o g() {
        return this.f2070f;
    }

    public final void h() {
        this.f2068d++;
    }

    public final void i(Long l7) {
        this.f2069e = l7;
    }

    public final void j(UUID uuid) {
        Intrinsics.checkNotNullParameter(uuid, "<set-?>");
        this.f2067c = uuid;
    }

    public final void k(Long l7) {
        this.f2066b = l7;
    }

    public final void l(o oVar) {
        this.f2070f = oVar;
    }

    public final void m() {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(C2146B.l()).edit();
        Long l7 = this.f2065a;
        edit.putLong("com.facebook.appevents.SessionInfo.sessionStartTime", l7 == null ? 0L : l7.longValue());
        Long l8 = this.f2066b;
        edit.putLong("com.facebook.appevents.SessionInfo.sessionEndTime", l8 != null ? l8.longValue() : 0L);
        edit.putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.f2068d);
        edit.putString("com.facebook.appevents.SessionInfo.sessionId", this.f2067c.toString());
        edit.apply();
        o oVar = this.f2070f;
        if (oVar == null || oVar == null) {
            return;
        }
        oVar.a();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ m(java.lang.Long r1, java.lang.Long r2, java.util.UUID r3, int r4, kotlin.jvm.internal.g r5) {
        /*
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            java.util.UUID r3 = java.util.UUID.randomUUID()
            java.lang.String r4 = "randomUUID()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
        Ld:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: G1.m.<init>(java.lang.Long, java.lang.Long, java.util.UUID, int, kotlin.jvm.internal.g):void");
    }
}
