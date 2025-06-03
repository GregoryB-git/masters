package R4;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final d f5715a;

    /* renamed from: b, reason: collision with root package name */
    public final d f5716b;

    /* renamed from: c, reason: collision with root package name */
    public final double f5717c;

    public f(d performance, d crashlytics, double d7) {
        Intrinsics.checkNotNullParameter(performance, "performance");
        Intrinsics.checkNotNullParameter(crashlytics, "crashlytics");
        this.f5715a = performance;
        this.f5716b = crashlytics;
        this.f5717c = d7;
    }

    public final d a() {
        return this.f5716b;
    }

    public final d b() {
        return this.f5715a;
    }

    public final double c() {
        return this.f5717c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f5715a == fVar.f5715a && this.f5716b == fVar.f5716b && Intrinsics.a(Double.valueOf(this.f5717c), Double.valueOf(fVar.f5717c));
    }

    public int hashCode() {
        return (((this.f5715a.hashCode() * 31) + this.f5716b.hashCode()) * 31) + e.a(this.f5717c);
    }

    public String toString() {
        return "DataCollectionStatus(performance=" + this.f5715a + ", crashlytics=" + this.f5716b + ", sessionSamplingRate=" + this.f5717c + ')';
    }

    public /* synthetic */ f(d dVar, d dVar2, double d7, int i7, kotlin.jvm.internal.g gVar) {
        this((i7 & 1) != 0 ? d.COLLECTION_SDK_NOT_INSTALLED : dVar, (i7 & 2) != 0 ? d.COLLECTION_SDK_NOT_INSTALLED : dVar2, (i7 & 4) != 0 ? 1.0d : d7);
    }
}
