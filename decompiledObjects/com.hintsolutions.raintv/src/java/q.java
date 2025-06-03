/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher
 *  java.lang.Object
 *  java.lang.Runnable
 */
import com.google.android.exoplayer2.audio.AudioRendererEventListener;

public final class q
implements Runnable {
    public final AudioRendererEventListener.EventDispatcher a;
    public final int b;
    public final long c;
    public final long d;

    public /* synthetic */ q(AudioRendererEventListener.EventDispatcher eventDispatcher, int n, long l, long l2) {
        this.a = eventDispatcher;
        this.b = n;
        this.c = l;
        this.d = l2;
    }

    public final void run() {
        AudioRendererEventListener.EventDispatcher.b((AudioRendererEventListener.EventDispatcher)this.a, (int)this.b, (long)this.c, (long)this.d);
    }
}

