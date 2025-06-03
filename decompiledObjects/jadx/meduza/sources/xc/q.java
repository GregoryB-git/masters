package xc;

import java.io.OutputStream;

/* loaded from: classes.dex */
public final class q implements w {

    /* renamed from: a, reason: collision with root package name */
    public final OutputStream f17278a;

    /* renamed from: b, reason: collision with root package name */
    public final z f17279b;

    public q(OutputStream outputStream, z zVar) {
        this.f17278a = outputStream;
        this.f17279b = zVar;
    }

    @Override // xc.w
    public final z c() {
        return this.f17279b;
    }

    @Override // xc.w, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f17278a.close();
    }

    @Override // xc.w, java.io.Flushable
    public final void flush() {
        this.f17278a.flush();
    }

    @Override // xc.w
    public final void g0(f fVar, long j10) {
        ec.i.e(fVar, "source");
        b.b(fVar.f17252b, 0L, j10);
        while (j10 > 0) {
            this.f17279b.f();
            t tVar = fVar.f17251a;
            ec.i.b(tVar);
            int min = (int) Math.min(j10, tVar.f17288c - tVar.f17287b);
            this.f17278a.write(tVar.f17286a, tVar.f17287b, min);
            int i10 = tVar.f17287b + min;
            tVar.f17287b = i10;
            long j11 = min;
            j10 -= j11;
            fVar.f17252b -= j11;
            if (i10 == tVar.f17288c) {
                fVar.f17251a = tVar.a();
                u.a(tVar);
            }
        }
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("sink(");
        l10.append(this.f17278a);
        l10.append(')');
        return l10.toString();
    }
}
