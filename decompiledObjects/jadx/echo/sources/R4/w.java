package R4;

import android.os.SystemClock;
import o6.a;

/* loaded from: classes.dex */
public final class w implements x {

    /* renamed from: a, reason: collision with root package name */
    public static final a f5791a = new a(null);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    @Override // R4.x
    public long a() {
        return System.currentTimeMillis() * 1000;
    }

    @Override // R4.x
    public long b() {
        a.C0243a c0243a = o6.a.f18197p;
        return o6.c.p(SystemClock.elapsedRealtime(), o6.d.f18206r);
    }
}
