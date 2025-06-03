package xc;

import java.io.IOException;

/* loaded from: classes.dex */
public final class e implements y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f17249a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f17250b;

    public e(x xVar, o oVar) {
        this.f17249a = xVar;
        this.f17250b = oVar;
    }

    @Override // xc.y
    public final z c() {
        return this.f17249a;
    }

    @Override // xc.y, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        c cVar = this.f17249a;
        y yVar = this.f17250b;
        cVar.h();
        try {
            yVar.close();
            rb.h hVar = rb.h.f13851a;
            if (cVar.i()) {
                throw cVar.j(null);
            }
        } catch (IOException e10) {
            if (!cVar.i()) {
                throw e10;
            }
            throw cVar.j(e10);
        } finally {
            cVar.i();
        }
    }

    @Override // xc.y
    public final long e0(f fVar, long j10) {
        ec.i.e(fVar, "sink");
        c cVar = this.f17249a;
        y yVar = this.f17250b;
        cVar.h();
        try {
            long e02 = yVar.e0(fVar, j10);
            if (cVar.i()) {
                throw cVar.j(null);
            }
            return e02;
        } catch (IOException e10) {
            if (cVar.i()) {
                throw cVar.j(e10);
            }
            throw e10;
        } finally {
            cVar.i();
        }
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("AsyncTimeout.source(");
        l10.append(this.f17250b);
        l10.append(')');
        return l10.toString();
    }
}
