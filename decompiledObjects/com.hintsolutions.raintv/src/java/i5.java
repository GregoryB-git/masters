/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher
 *  java.lang.Object
 *  java.lang.Runnable
 */
import com.google.android.exoplayer2.video.VideoRendererEventListener;

public final class i5
implements Runnable {
    public final VideoRendererEventListener.EventDispatcher a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public /* synthetic */ i5(VideoRendererEventListener.EventDispatcher eventDispatcher, int n, int n2, int n3, float f2) {
        this.a = eventDispatcher;
        this.b = n;
        this.c = n2;
        this.d = n3;
        this.e = f2;
    }

    public final void run() {
        VideoRendererEventListener.EventDispatcher.g((VideoRendererEventListener.EventDispatcher)this.a, (int)this.b, (int)this.c, (int)this.d, (float)this.e);
    }
}

