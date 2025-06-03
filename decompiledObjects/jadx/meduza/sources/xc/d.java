package xc;

import java.io.IOException;

/* loaded from: classes.dex */
public final class d implements w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f17247a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f17248b;

    public d(x xVar, q qVar) {
        this.f17247a = xVar;
        this.f17248b = qVar;
    }

    @Override // xc.w
    public final z c() {
        return this.f17247a;
    }

    @Override // xc.w, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        c cVar = this.f17247a;
        w wVar = this.f17248b;
        cVar.h();
        try {
            wVar.close();
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

    @Override // xc.w, java.io.Flushable
    public final void flush() {
        c cVar = this.f17247a;
        w wVar = this.f17248b;
        cVar.h();
        try {
            wVar.flush();
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

    @Override // xc.w
    public final void g0(f fVar, long j10) {
        ec.i.e(fVar, "source");
        b.b(fVar.f17252b, 0L, j10);
        while (true) {
            long j11 = 0;
            if (j10 <= 0) {
                return;
            }
            t tVar = fVar.f17251a;
            while (true) {
                ec.i.b(tVar);
                if (j11 >= 65536) {
                    break;
                }
                j11 += tVar.f17288c - tVar.f17287b;
                if (j11 >= j10) {
                    j11 = j10;
                    break;
                }
                tVar = tVar.f;
            }
            c cVar = this.f17247a;
            w wVar = this.f17248b;
            cVar.h();
            try {
                wVar.g0(fVar, j11);
                rb.h hVar = rb.h.f13851a;
                if (cVar.i()) {
                    throw cVar.j(null);
                }
                j10 -= j11;
            } catch (IOException e10) {
                if (!cVar.i()) {
                    throw e10;
                }
                throw cVar.j(e10);
            } finally {
                cVar.i();
            }
        }
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("AsyncTimeout.sink(");
        l10.append(this.f17248b);
        l10.append(')');
        return l10.toString();
    }
}
