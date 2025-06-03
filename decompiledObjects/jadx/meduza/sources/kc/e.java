package kc;

import dc.p;
import java.util.Iterator;
import nc.o1;
import p2.m0;

/* loaded from: classes.dex */
public final class e implements b<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f9247a;

    public e(o1.g gVar) {
        this.f9247a = gVar;
    }

    @Override // kc.b
    public final Iterator<Object> iterator() {
        p pVar = this.f9247a;
        ec.i.e(pVar, "block");
        c cVar = new c();
        cVar.f9246c = m0.u(cVar, cVar, pVar);
        return cVar;
    }
}
