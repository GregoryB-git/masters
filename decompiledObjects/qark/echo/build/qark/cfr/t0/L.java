/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodec
 *  android.media.MediaCodec$CryptoInfo
 *  android.os.Bundle
 *  java.lang.Object
 */
package t0;

import android.media.MediaCodec;
import android.os.Bundle;
import j0.c;
import t0.n;

public class L
implements n {
    public final MediaCodec a;

    public L(MediaCodec mediaCodec) {
        this.a = mediaCodec;
    }

    @Override
    public void a(int n8, int n9, c c8, long l8, int n10) {
        this.a.queueSecureInputBuffer(n8, n9, c8.a(), l8, n10);
    }

    @Override
    public void b(int n8, int n9, int n10, long l8, int n11) {
        this.a.queueInputBuffer(n8, n9, n10, l8, n11);
    }

    @Override
    public void c(Bundle bundle) {
        this.a.setParameters(bundle);
    }

    @Override
    public void d() {
    }

    @Override
    public void flush() {
    }

    @Override
    public void shutdown() {
    }

    @Override
    public void start() {
    }
}

