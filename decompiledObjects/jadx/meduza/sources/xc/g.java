package xc;

import java.nio.channels.WritableByteChannel;

/* loaded from: classes.dex */
public interface g extends w, WritableByteChannel {
    g D();

    g O(String str);

    g Y(long j10);

    @Override // xc.w, java.io.Flushable
    void flush();

    f k();

    g o();

    g write(byte[] bArr);

    g writeByte(int i10);

    g writeInt(int i10);

    g writeShort(int i10);
}
