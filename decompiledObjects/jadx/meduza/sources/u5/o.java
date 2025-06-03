package u5;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import v5.a;
import v5.e0;

/* loaded from: classes.dex */
public final class o extends BufferedOutputStream {

    /* renamed from: a, reason: collision with root package name */
    public boolean f15054a;

    public o(FileOutputStream fileOutputStream, int i10) {
        super(fileOutputStream, i10);
    }

    public o(a.C0250a c0250a) {
        super(c0250a);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f15054a = true;
        try {
            flush();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            ((BufferedOutputStream) this).out.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        if (th == null) {
            return;
        }
        int i10 = e0.f15881a;
        throw th;
    }

    public final void f(OutputStream outputStream) {
        x6.b.H(this.f15054a);
        ((BufferedOutputStream) this).out = outputStream;
        ((BufferedOutputStream) this).count = 0;
        this.f15054a = false;
    }
}
