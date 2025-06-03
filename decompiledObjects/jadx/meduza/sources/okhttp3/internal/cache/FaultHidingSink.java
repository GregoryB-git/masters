package okhttp3.internal.cache;

import java.io.IOException;
import xc.f;
import xc.j;

/* loaded from: classes.dex */
class FaultHidingSink extends j {

    /* renamed from: b, reason: collision with root package name */
    public boolean f12406b;

    public FaultHidingSink() {
        throw null;
    }

    @Override // xc.j, xc.w, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f12406b) {
            return;
        }
        try {
            super.close();
        } catch (IOException unused) {
            this.f12406b = true;
            f();
        }
    }

    public void f() {
    }

    @Override // xc.j, xc.w, java.io.Flushable
    public final void flush() {
        if (this.f12406b) {
            return;
        }
        try {
            super.flush();
        } catch (IOException unused) {
            this.f12406b = true;
            f();
        }
    }

    @Override // xc.j, xc.w
    public final void g0(f fVar, long j10) {
        if (this.f12406b) {
            fVar.skip(j10);
            return;
        }
        try {
            super.g0(fVar, j10);
        } catch (IOException unused) {
            this.f12406b = true;
            f();
        }
    }
}
