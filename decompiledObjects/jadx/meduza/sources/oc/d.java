package oc;

import nc.k;
import nc.l;

/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f12141a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f12142b;

    public d(l lVar, f fVar) {
        this.f12141a = lVar;
        this.f12142b = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12141a.h(this.f12142b, rb.h.f13851a);
    }
}
