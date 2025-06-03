package xc;

import java.io.IOException;
import java.io.InputStream;
import p2.m0;

/* loaded from: classes.dex */
public final class o implements y {

    /* renamed from: a, reason: collision with root package name */
    public final InputStream f17275a;

    /* renamed from: b, reason: collision with root package name */
    public final z f17276b;

    public o(InputStream inputStream, z zVar) {
        ec.i.e(zVar, "timeout");
        this.f17275a = inputStream;
        this.f17276b = zVar;
    }

    @Override // xc.y
    public final z c() {
        return this.f17276b;
    }

    @Override // xc.y, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f17275a.close();
    }

    @Override // xc.y
    public final long e0(f fVar, long j10) {
        ec.i.e(fVar, "sink");
        if (j10 == 0) {
            return 0L;
        }
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(a0.j.i("byteCount < 0: ", j10).toString());
        }
        try {
            this.f17276b.f();
            t r02 = fVar.r0(1);
            int read = this.f17275a.read(r02.f17286a, r02.f17288c, (int) Math.min(j10, 8192 - r02.f17288c));
            if (read != -1) {
                r02.f17288c += read;
                long j11 = read;
                fVar.f17252b += j11;
                return j11;
            }
            if (r02.f17287b != r02.f17288c) {
                return -1L;
            }
            fVar.f17251a = r02.a();
            u.a(r02);
            return -1L;
        } catch (AssertionError e10) {
            if (m0.Q(e10)) {
                throw new IOException(e10);
            }
            throw e10;
        }
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("source(");
        l10.append(this.f17275a);
        l10.append(')');
        return l10.toString();
    }
}
