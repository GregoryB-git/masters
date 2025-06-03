/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.android.exoplayer2.source.hls.HlsDataSourceFactory
 *  com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker
 *  com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParserFactory
 *  com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
 *  com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker$Factory
 *  com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy
 *  java.lang.Object
 */
import com.google.android.exoplayer2.source.hls.HlsDataSourceFactory;
import com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParserFactory;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;

public final class z0
implements HlsPlaylistTracker.Factory {
    public final HlsPlaylistTracker createTracker(HlsDataSourceFactory hlsDataSourceFactory, LoadErrorHandlingPolicy loadErrorHandlingPolicy, HlsPlaylistParserFactory hlsPlaylistParserFactory) {
        return new DefaultHlsPlaylistTracker(hlsDataSourceFactory, loadErrorHandlingPolicy, hlsPlaylistParserFactory);
    }
}

