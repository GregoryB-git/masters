package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* loaded from: classes.dex */
public final class A extends Writer {

    /* renamed from: o, reason: collision with root package name */
    public final String f9204o;

    /* renamed from: p, reason: collision with root package name */
    public StringBuilder f9205p = new StringBuilder(128);

    public A(String str) {
        this.f9204o = str;
    }

    public final void a() {
        if (this.f9205p.length() > 0) {
            Log.d(this.f9204o, this.f9205p.toString());
            StringBuilder sb = this.f9205p;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i7, int i8) {
        for (int i9 = 0; i9 < i8; i9++) {
            char c7 = cArr[i7 + i9];
            if (c7 == '\n') {
                a();
            } else {
                this.f9205p.append(c7);
            }
        }
    }
}
