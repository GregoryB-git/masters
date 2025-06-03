package x0;

import android.util.Log;
import java.io.Writer;

/* loaded from: classes.dex */
public final class p0 extends Writer {

    /* renamed from: b, reason: collision with root package name */
    public StringBuilder f16727b = new StringBuilder(128);

    /* renamed from: a, reason: collision with root package name */
    public final String f16726a = "FragmentManager";

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        f();
    }

    public final void f() {
        if (this.f16727b.length() > 0) {
            Log.d(this.f16726a, this.f16727b.toString());
            StringBuilder sb2 = this.f16727b;
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        f();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c10 = cArr[i10 + i12];
            if (c10 == '\n') {
                f();
            } else {
                this.f16727b.append(c10);
            }
        }
    }
}
