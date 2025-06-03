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
import t0.b;
import t0.m;

public final class a
implements MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ b a;
    public final /* synthetic */ m.d b;

    public /* synthetic */ a(b b8, m.d d8) {
        this.a = b8;
        this.b = d8;
    }

    public final void onFrameRendered(MediaCodec mediaCodec, long l8, long l9) {
        b.p(this.a, this.b, mediaCodec, l8, l9);
    }
}

