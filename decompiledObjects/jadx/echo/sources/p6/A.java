package p6;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public final Object f18482a;

    /* renamed from: b, reason: collision with root package name */
    public final g6.l f18483b;

    public A(Object obj, g6.l lVar) {
        this.f18482a = obj;
        this.f18483b = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a7 = (A) obj;
        return Intrinsics.a(this.f18482a, a7.f18482a) && Intrinsics.a(this.f18483b, a7.f18483b);
    }

    public int hashCode() {
        Object obj = this.f18482a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f18483b.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.f18482a + ", onCancellation=" + this.f18483b + ')';
    }
}
