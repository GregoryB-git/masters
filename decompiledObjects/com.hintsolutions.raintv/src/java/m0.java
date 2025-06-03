/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.android.exoplayer2.Timeline
 *  com.google.android.exoplayer2.source.CompositeMediaSource
 *  com.google.android.exoplayer2.source.MediaSource
 *  com.google.android.exoplayer2.source.MediaSource$SourceInfoRefreshListener
 *  java.lang.Object
 */
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.CompositeMediaSource;
import com.google.android.exoplayer2.source.MediaSource;

public final class m0
implements MediaSource.SourceInfoRefreshListener {
    public final CompositeMediaSource a;
    public final Object b;

    public /* synthetic */ m0(CompositeMediaSource compositeMediaSource, Object object) {
        this.a = compositeMediaSource;
        this.b = object;
    }

    public final void onSourceInfoRefreshed(MediaSource mediaSource, Timeline timeline, Object object) {
        CompositeMediaSource.a((CompositeMediaSource)this.a, (Object)this.b, (MediaSource)mediaSource, (Timeline)timeline, (Object)object);
    }
}

