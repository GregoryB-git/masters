package p0;

import X2.g0;
import android.net.Uri;
import d0.C1198u;
import g0.AbstractC1297a;
import i0.g;
import i0.m;
import java.util.Map;
import p0.C1776h;

/* renamed from: p0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1780l implements InterfaceC1767A {

    /* renamed from: a, reason: collision with root package name */
    public final Object f18322a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public C1198u.f f18323b;

    /* renamed from: c, reason: collision with root package name */
    public x f18324c;

    /* renamed from: d, reason: collision with root package name */
    public g.a f18325d;

    /* renamed from: e, reason: collision with root package name */
    public String f18326e;

    /* renamed from: f, reason: collision with root package name */
    public B0.m f18327f;

    @Override // p0.InterfaceC1767A
    public x a(C1198u c1198u) {
        x xVar;
        AbstractC1297a.e(c1198u.f12800b);
        C1198u.f fVar = c1198u.f12800b.f12894c;
        if (fVar == null) {
            return x.f18348a;
        }
        synchronized (this.f18322a) {
            try {
                if (!g0.M.c(fVar, this.f18323b)) {
                    this.f18323b = fVar;
                    this.f18324c = b(fVar);
                }
                xVar = (x) AbstractC1297a.e(this.f18324c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return xVar;
    }

    public final x b(C1198u.f fVar) {
        g.a aVar = this.f18325d;
        if (aVar == null) {
            aVar = new m.b().e(this.f18326e);
        }
        Uri uri = fVar.f12851c;
        O o7 = new O(uri == null ? null : uri.toString(), fVar.f12856h, aVar);
        g0 it = fVar.f12853e.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            o7.e((String) entry.getKey(), (String) entry.getValue());
        }
        C1776h.b e7 = new C1776h.b().f(fVar.f12849a, N.f18228d).c(fVar.f12854f).d(fVar.f12855g).e(a3.f.n(fVar.f12858j));
        B0.m mVar = this.f18327f;
        if (mVar != null) {
            e7.b(mVar);
        }
        C1776h a7 = e7.a(o7);
        a7.F(0, fVar.c());
        return a7;
    }
}
