package y6;

import X5.g;
import java.util.concurrent.atomic.AtomicReferenceArray;
import u6.C;
import u6.F;

/* loaded from: classes.dex */
public final class f extends C {

    /* renamed from: s, reason: collision with root package name */
    public final AtomicReferenceArray f21548s;

    public f(long j7, f fVar, int i7) {
        super(j7, fVar, i7);
        int i8;
        i8 = e.f21547f;
        this.f21548s = new AtomicReferenceArray(i8);
    }

    @Override // u6.C
    public int n() {
        int i7;
        i7 = e.f21547f;
        return i7;
    }

    @Override // u6.C
    public void o(int i7, Throwable th, g gVar) {
        F f7;
        f7 = e.f21546e;
        r().set(i7, f7);
        p();
    }

    public final AtomicReferenceArray r() {
        return this.f21548s;
    }

    public String toString() {
        return "SemaphoreSegment[id=" + this.f19955q + ", hashCode=" + hashCode() + ']';
    }
}
