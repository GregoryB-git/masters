/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher
 *  com.google.android.exoplayer2.decoder.DecoderCounters
 *  java.lang.Object
 *  java.lang.Runnable
 */
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.decoder.DecoderCounters;

public final class p
implements Runnable {
    public final int a;
    public final AudioRendererEventListener.EventDispatcher b;
    public final DecoderCounters c;

    public /* synthetic */ p(AudioRendererEventListener.EventDispatcher eventDispatcher, DecoderCounters decoderCounters, int n) {
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
                AudioRendererEventListener.EventDispatcher.f((AudioRendererEventListener.EventDispatcher)this.b, (DecoderCounters)this.c);
                return;
            }
        }
        AudioRendererEventListener.EventDispatcher.e((AudioRendererEventListener.EventDispatcher)this.b, (DecoderCounters)this.c);
    }
}

