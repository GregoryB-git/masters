/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.android.exoplayer2.source.MediaSourceEventListener
 *  com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher
 *  com.google.android.exoplayer2.source.MediaSourceEventListener$LoadEventInfo
 *  com.google.android.exoplayer2.source.MediaSourceEventListener$MediaLoadData
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.Runnable
 */
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import java.io.IOException;

public final class c3
implements Runnable {
    public final MediaSourceEventListener.EventDispatcher a;
    public final MediaSourceEventListener b;
    public final MediaSourceEventListener.LoadEventInfo c;
    public final MediaSourceEventListener.MediaLoadData d;
    public final IOException e;
    public final boolean f;

    public /* synthetic */ c3(MediaSourceEventListener.EventDispatcher eventDispatcher, MediaSourceEventListener mediaSourceEventListener, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData, IOException iOException, boolean bl) {
        this.a = eventDispatcher;
        this.b = mediaSourceEventListener;
        this.c = loadEventInfo;
        this.d = mediaLoadData;
        this.e = iOException;
        this.f = bl;
    }

    public final void run() {
        MediaSourceEventListener.EventDispatcher.c((MediaSourceEventListener.EventDispatcher)this.a, (MediaSourceEventListener)this.b, (MediaSourceEventListener.LoadEventInfo)this.c, (MediaSourceEventListener.MediaLoadData)this.d, (IOException)this.e, (boolean)this.f);
    }
}

