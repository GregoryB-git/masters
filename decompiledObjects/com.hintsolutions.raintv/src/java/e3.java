/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.android.exoplayer2.source.MediaSourceEventListener
 *  com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher
 *  com.google.android.exoplayer2.source.MediaSourceEventListener$LoadEventInfo
 *  com.google.android.exoplayer2.source.MediaSourceEventListener$MediaLoadData
 *  java.lang.Object
 *  java.lang.Runnable
 */
import com.google.android.exoplayer2.source.MediaSourceEventListener;

public final class e3
implements Runnable {
    public final int a;
    public final MediaSourceEventListener.EventDispatcher b;
    public final MediaSourceEventListener c;
    public final MediaSourceEventListener.LoadEventInfo d;
    public final MediaSourceEventListener.MediaLoadData e;

    public /* synthetic */ e3(MediaSourceEventListener.EventDispatcher eventDispatcher, MediaSourceEventListener mediaSourceEventListener, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData, int n) {
        this.a = n;
        this.b = eventDispatcher;
        this.c = mediaSourceEventListener;
        this.d = loadEventInfo;
        this.e = mediaLoadData;
    }

    public final void run() {
        switch (this.a) {
            default: {
                break;
            }
            case 1: {
                MediaSourceEventListener.EventDispatcher.g((MediaSourceEventListener.EventDispatcher)this.b, (MediaSourceEventListener)this.c, (MediaSourceEventListener.LoadEventInfo)this.d, (MediaSourceEventListener.MediaLoadData)this.e);
                return;
            }
            case 0: {
                MediaSourceEventListener.EventDispatcher.a((MediaSourceEventListener.EventDispatcher)this.b, (MediaSourceEventListener)this.c, (MediaSourceEventListener.LoadEventInfo)this.d, (MediaSourceEventListener.MediaLoadData)this.e);
                return;
            }
        }
        MediaSourceEventListener.EventDispatcher.e((MediaSourceEventListener.EventDispatcher)this.b, (MediaSourceEventListener)this.c, (MediaSourceEventListener.LoadEventInfo)this.d, (MediaSourceEventListener.MediaLoadData)this.e);
    }
}

