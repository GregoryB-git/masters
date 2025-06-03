/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher
 *  com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.video.VideoRendererEventListener;

public final class r
implements Runnable {
    public final int a;
    public final String b;
    public final long c;
    public final long d;
    public final Object e;

    public /* synthetic */ r(Object object, String string2, long l, long l2, int n) {
        this.a = n;
        this.e = object;
        this.b = string2;
        this.c = l;
        this.d = l2;
    }

    public final void run() {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                AudioRendererEventListener.EventDispatcher.d((AudioRendererEventListener.EventDispatcher)((AudioRendererEventListener.EventDispatcher)this.e), (String)this.b, (long)this.c, (long)this.d);
                return;
            }
        }
        VideoRendererEventListener.EventDispatcher.d((VideoRendererEventListener.EventDispatcher)((VideoRendererEventListener.EventDispatcher)this.e), (String)this.b, (long)this.c, (long)this.d);
    }
}

