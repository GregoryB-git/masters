package p1;

import java.io.File;

/* loaded from: classes.dex */
public final class o implements t1.c, c {

    /* renamed from: a, reason: collision with root package name */
    public b f12846a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f12847b;

    public final void C(boolean z10) {
        if (getDatabaseName() == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        throw null;
    }

    @Override // t1.c, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        throw null;
    }

    @Override // p1.c
    public final t1.c f() {
        return null;
    }

    public final void g(File file) {
        throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
    }

    @Override // t1.c
    public final String getDatabaseName() {
        throw null;
    }

    @Override // t1.c
    public final t1.b getWritableDatabase() {
        if (!this.f12847b) {
            C(true);
            this.f12847b = true;
        }
        throw null;
    }

    @Override // t1.c
    public final void setWriteAheadLoggingEnabled(boolean z10) {
        throw null;
    }
}
