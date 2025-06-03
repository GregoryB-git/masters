/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.android.exoplayer2.source.MediaSource$MediaPeriodId
 *  com.google.android.exoplayer2.source.MediaSourceEventListener
 *  com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher
 *  java.lang.Object
 *  java.lang.Runnable
 */
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceEventListener;

public final class d3
implements Runnable {
    public final int a;
    public final MediaSourceEventListener.EventDispatcher b;
    public final MediaSourceEventListener c;
    public final MediaSource.MediaPeriodId d;

    public /* synthetic */ d3(MediaSourceEventListener.EventDispatcher eventDispatcher, MediaSourceEventListener mediaSourceEventListener, MediaSource.MediaPeriodId mediaPeriodId, int n) {
        this.a = n;
        this.b = eventDispatcher;
        this.c = mediaSourceEventListener;
        this.d = mediaPeriodId;
    }

    public final void run() {
        switch (this.a) {
            default: {
                break;
            }
            case 1: {
                MediaSourceEventListener.EventDispatcher.h((MediaSourceEventListener.EventDispatcher)this.b, (MediaSourceEventListener)this.c, (MediaSource.MediaPeriodId)this.d);
                return;
            }
            case 0: {
                MediaSourceEventListener.EventDispatcher.i((MediaSourceEventListener.EventDispatcher)this.b, (MediaSourceEventListener)this.c, (MediaSource.MediaPeriodId)this.d);
                return;
            }
        }
        MediaSourceEventListener.EventDispatcher.f((MediaSourceEventListener.EventDispatcher)this.b, (MediaSourceEventListener)this.c, (MediaSource.MediaPeriodId)this.d);
    }
}

