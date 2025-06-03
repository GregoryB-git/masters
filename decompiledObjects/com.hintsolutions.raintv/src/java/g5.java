/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.android.exoplayer2.decoder.DecoderCounters
 *  com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher
 *  java.lang.Object
 *  java.lang.Runnable
 */
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.video.VideoRendererEventListener;

public final class g5
implements Runnable {
    public final int a;
    public final VideoRendererEventListener.EventDispatcher b;
    public final DecoderCounters c;

    public /* synthetic */ g5(VideoRendererEventListener.EventDispatcher eventDispatcher, DecoderCounters decoderCounters, int n) {
        this.a = n;
        this.b = eventDispatcher;
        this.c = decoderCounters;
    }

    public final void run() {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                VideoRendererEventListener.EventDispatcher.f((VideoRendererEventListener.EventDispatcher)this.b, (DecoderCounters)this.c);
                return;
            }
        }
        VideoRendererEventListener.EventDispatcher.b((VideoRendererEventListener.EventDispatcher)this.b, (DecoderCounters)this.c);
    }
}

