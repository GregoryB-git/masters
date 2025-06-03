package hb;

import c4.x;
import hb.a;
import io.flutter.embedding.android.KeyboardMap;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class b implements jb.c {

    /* renamed from: d, reason: collision with root package name */
    public static final Logger f7221d = Logger.getLogger(i.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final a f7222a;

    /* renamed from: b, reason: collision with root package name */
    public final jb.c f7223b;

    /* renamed from: c, reason: collision with root package name */
    public final j f7224c = new j(Level.FINE);

    public interface a {
        void a(Exception exc);
    }

    public b(a aVar, a.d dVar) {
        x6.b.y(aVar, "transportExceptionHandler");
        this.f7222a = aVar;
        this.f7223b = dVar;
    }

    @Override // jb.c
    public final void A(boolean z10, int i10, List list) {
        try {
            this.f7223b.A(z10, i10, list);
        } catch (IOException e10) {
            this.f7222a.a(e10);
        }
    }

    @Override // jb.c
    public final void L(x xVar) {
        j jVar = this.f7224c;
        if (jVar.a()) {
            jVar.f7311a.log(jVar.f7312b, a0.j.u(2) + " SETTINGS: ack=true");
        }
        try {
            this.f7223b.L(xVar);
        } catch (IOException e10) {
            this.f7222a.a(e10);
        }
    }

    @Override // jb.c
    public final void R(int i10, jb.a aVar) {
        this.f7224c.e(2, i10, aVar);
        try {
            this.f7223b.R(i10, aVar);
        } catch (IOException e10) {
            this.f7222a.a(e10);
        }
    }

    @Override // jb.c
    public final void a0(x xVar) {
        this.f7224c.f(2, xVar);
        try {
            this.f7223b.a0(xVar);
        } catch (IOException e10) {
            this.f7222a.a(e10);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.f7223b.close();
        } catch (IOException e10) {
            f7221d.log(e10.getClass().equals(IOException.class) ? Level.FINE : Level.INFO, "Failed closing connection", (Throwable) e10);
        }
    }

    @Override // jb.c
    public final void d(int i10, long j10) {
        this.f7224c.g(2, i10, j10);
        try {
            this.f7223b.d(i10, j10);
        } catch (IOException e10) {
            this.f7222a.a(e10);
        }
    }

    @Override // jb.c
    public final void e(int i10, int i11, boolean z10) {
        if (z10) {
            j jVar = this.f7224c;
            long j10 = (KeyboardMap.kValueMask & i11) | (i10 << 32);
            if (jVar.a()) {
                jVar.f7311a.log(jVar.f7312b, a0.j.u(2) + " PING: ack=true bytes=" + j10);
            }
        } else {
            this.f7224c.d(2, (KeyboardMap.kValueMask & i11) | (i10 << 32));
        }
        try {
            this.f7223b.e(i10, i11, z10);
        } catch (IOException e10) {
            this.f7222a.a(e10);
        }
    }

    @Override // jb.c
    public final void flush() {
        try {
            this.f7223b.flush();
        } catch (IOException e10) {
            this.f7222a.a(e10);
        }
    }

    @Override // jb.c
    public final void o0(jb.a aVar, byte[] bArr) {
        this.f7224c.c(2, 0, aVar, xc.i.o(bArr));
        try {
            this.f7223b.o0(aVar, bArr);
            this.f7223b.flush();
        } catch (IOException e10) {
            this.f7222a.a(e10);
        }
    }

    @Override // jb.c
    public final int t0() {
        return this.f7223b.t0();
    }

    @Override // jb.c
    public final void u(boolean z10, int i10, xc.f fVar, int i11) {
        j jVar = this.f7224c;
        fVar.getClass();
        jVar.b(2, i10, fVar, i11, z10);
        try {
            this.f7223b.u(z10, i10, fVar, i11);
        } catch (IOException e10) {
            this.f7222a.a(e10);
        }
    }

    @Override // jb.c
    public final void w() {
        try {
            this.f7223b.w();
        } catch (IOException e10) {
            this.f7222a.a(e10);
        }
    }
}
