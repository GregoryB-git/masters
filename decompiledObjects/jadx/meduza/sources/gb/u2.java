package gb;

import java.io.Closeable;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface u2 extends Closeable {
    void U(byte[] bArr, int i10, int i11);

    void Z();

    int b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void m0(OutputStream outputStream, int i10);

    boolean markSupported();

    u2 r(int i10);

    int readUnsignedByte();

    void reset();

    void skipBytes(int i10);

    void v0(ByteBuffer byteBuffer);
}
