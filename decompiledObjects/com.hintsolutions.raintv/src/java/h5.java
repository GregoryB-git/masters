/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher
 *  java.lang.Object
 *  java.lang.Runnable
 */
import com.google.android.exoplayer2.video.VideoRendererEventListener;

public final class h5
implements Runnable {
    public final VideoRendererEventListener.EventDispatcher a;
    public final int b;
    public final long c;

    public /* synthetic */ h5(VideoRendererEventListener.EventDispatcher eventDispatcher, int n, long l) {
        this.a = eventDispatcher;
        this.b = n;
        this.c = l;
    }

    public final void run() {
        VideoRendererEventListener.EventDispatcher.c((VideoRendererEventListener.EventDispatcher)this.a, (int)this.b, (long)this.c);
    }
}

