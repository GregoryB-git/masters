/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.media.AudioTrack
 *  android.os.Handler
 *  java.lang.Object
 *  java.lang.Runnable
 */
package m0;

import android.media.AudioTrack;
import android.os.Handler;
import g0.f;
import m0.N;
import m0.z;

public final class J
implements Runnable {
    public final /* synthetic */ AudioTrack o;
    public final /* synthetic */ z.d p;
    public final /* synthetic */ Handler q;
    public final /* synthetic */ z.a r;
    public final /* synthetic */ f s;

    public /* synthetic */ J(AudioTrack audioTrack, z.d d8, Handler handler, z.a a8, f f8) {
        this.o = audioTrack;
        this.p = d8;
        this.q = handler;
        this.r = a8;
        this.s = f8;
    }

    public final void run() {
        N.D(this.o, this.p, this.q, this.r, this.s);
    }
}

