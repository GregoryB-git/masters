package kotlin.text;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f16256a;

    /* renamed from: b, reason: collision with root package name */
    public final l6.c f16257b;

    public d(String value, l6.c range) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(range, "range");
        this.f16256a = value;
        this.f16257b = range;
    }

    public final String a() {
        return this.f16256a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.a(this.f16256a, dVar.f16256a) && Intrinsics.a(this.f16257b, dVar.f16257b);
    }

    public int hashCode() {
        return (this.f16256a.hashCode() * 31) + this.f16257b.hashCode();
    }

    public String toString() {
        return "MatchGroup(value=" + this.f16256a + ", range=" + this.f16257b + ')';
    }
}
