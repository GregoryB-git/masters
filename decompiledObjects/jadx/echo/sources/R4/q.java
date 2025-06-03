package R4;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final j f5762a;

    /* renamed from: b, reason: collision with root package name */
    public final t f5763b;

    /* renamed from: c, reason: collision with root package name */
    public final b f5764c;

    public q(j eventType, t sessionData, b applicationInfo) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(sessionData, "sessionData");
        Intrinsics.checkNotNullParameter(applicationInfo, "applicationInfo");
        this.f5762a = eventType;
        this.f5763b = sessionData;
        this.f5764c = applicationInfo;
    }

    public final b a() {
        return this.f5764c;
    }

    public final j b() {
        return this.f5762a;
    }

    public final t c() {
        return this.f5763b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f5762a == qVar.f5762a && Intrinsics.a(this.f5763b, qVar.f5763b) && Intrinsics.a(this.f5764c, qVar.f5764c);
    }

    public int hashCode() {
        return (((this.f5762a.hashCode() * 31) + this.f5763b.hashCode()) * 31) + this.f5764c.hashCode();
    }

    public String toString() {
        return "SessionEvent(eventType=" + this.f5762a + ", sessionData=" + this.f5763b + ", applicationInfo=" + this.f5764c + ')';
    }
}
