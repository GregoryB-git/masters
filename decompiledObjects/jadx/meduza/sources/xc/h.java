package xc;

import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public interface h extends y, ReadableByteChannel {
    String E(long j10);

    boolean K(i iVar);

    String S(Charset charset);

    String f0();

    i l(long j10);

    byte readByte();

    int readInt();

    short readShort();

    void skip(long j10);

    f t();

    void u0(long j10);

    boolean v();

    long x0();
}
