/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodec
 *  android.media.MediaCodec$OnFrameRenderedListener
 *  java.lang.Object
 */
package t0;

import android.media.MediaCodec;
import t0.K;
import t0.m;

public final class J
implements MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ K a;
    public final /* synthetic */ m.d b;

    public /* synthetic */ J(K k8, m.d d8) {
        this.a = k8;
        this.b = d8;
    }

    public final void onFrameRendered(MediaCodec mediaCodec, long l8, long l9) {
        K.p(this.a, this.b, mediaCodec, l8, l9);
    }
}

