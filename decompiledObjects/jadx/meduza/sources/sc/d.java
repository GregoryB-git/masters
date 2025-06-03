package sc;

import nc.d0;

/* loaded from: classes.dex */
public final class d implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final ub.h f14333a;

    public d(ub.h hVar) {
        this.f14333a = hVar;
    }

    @Override // nc.d0
    public final ub.h f() {
        return this.f14333a;
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("CoroutineScope(coroutineContext=");
        l10.append(this.f14333a);
        l10.append(')');
        return l10.toString();
    }
}
