package gb;

import gb.v2;

/* loaded from: classes.dex */
public abstract class b implements u2 {
    @Override // gb.u2
    public void Z() {
    }

    @Override // gb.u2, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final void f(int i10) {
        if (b() < i10) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override // gb.u2
    public boolean markSupported() {
        return this instanceof v2.b;
    }

    @Override // gb.u2
    public void reset() {
        throw new UnsupportedOperationException();
    }
}
