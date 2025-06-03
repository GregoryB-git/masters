package vc;

import java.util.concurrent.atomic.AtomicReferenceArray;
import sc.t;

/* loaded from: classes.dex */
public final class k extends t<k> {

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceArray f16118e;

    public k(long j10, k kVar, int i10) {
        super(j10, kVar, i10);
        this.f16118e = new AtomicReferenceArray(j.f);
    }

    @Override // sc.t
    public final int f() {
        return j.f;
    }

    @Override // sc.t
    public final void g(int i10, ub.h hVar) {
        this.f16118e.set(i10, j.f16117e);
        h();
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("SemaphoreSegment[id=");
        l10.append(this.f14367c);
        l10.append(", hashCode=");
        l10.append(hashCode());
        l10.append(']');
        return l10.toString();
    }
}
