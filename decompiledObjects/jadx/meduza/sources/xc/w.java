package xc;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes.dex */
public interface w extends Closeable, Flushable {
    z c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    void g0(f fVar, long j10);
}
