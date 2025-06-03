/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  com.google.android.exoplayer2.offline.DownloadAction$Deserializer
 *  com.google.android.exoplayer2.offline.DownloadManager
 *  com.google.android.exoplayer2.offline.DownloadManager$Listener
 *  com.google.android.exoplayer2.offline.DownloaderConstructorHelper
 *  com.google.android.exoplayer2.offline.StreamKey
 *  com.google.android.exoplayer2.source.MediaSource
 *  com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory
 *  com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistParserFactory
 *  com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParserFactory
 *  com.google.android.exoplayer2.upstream.DataSource$Factory
 *  com.google.android.exoplayer2.upstream.DefaultDataSourceFactory
 *  com.google.android.exoplayer2.upstream.DefaultHttpDataSourceFactory
 *  com.google.android.exoplayer2.upstream.FileDataSourceFactory
 *  com.google.android.exoplayer2.upstream.HttpDataSource$Factory
 *  com.google.android.exoplayer2.upstream.cache.Cache
 *  com.google.android.exoplayer2.upstream.cache.CacheDataSourceFactory
 *  com.google.android.exoplayer2.upstream.cache.CacheEvictor
 *  com.google.android.exoplayer2.upstream.cache.NoOpCacheEvictor
 *  com.google.android.exoplayer2.upstream.cache.SimpleCache
 *  com.hintsolutions.raintv.services.video.DownloadTracker
 *  java.io.File
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.List
 *  tvrain.utils.ConstsKt
 */
package com.hintsolutions.raintv.utils;

import android.content.Context;
import android.net.Uri;
import com.google.android.exoplayer2.offline.DownloadAction;
import com.google.android.exoplayer2.offline.DownloadManager;
import com.google.android.exoplayer2.offline.DownloaderConstructorHelper;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistParserFactory;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParserFactory;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import com.google.android.exoplayer2.upstream.DefaultHttpDataSourceFactory;
import com.google.android.exoplayer2.upstream.FileDataSourceFactory;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.CacheDataSourceFactory;
import com.google.android.exoplayer2.upstream.cache.CacheEvictor;
import com.google.android.exoplayer2.upstream.cache.NoOpCacheEvictor;
import com.google.android.exoplayer2.upstream.cache.SimpleCache;
import com.hintsolutions.raintv.services.video.DownloadTracker;
import java.io.File;
import java.util.List;
import tvrain.utils.ConstsKt;

public class VideoDownloadHelper {
    private static final String DOWNLOAD_ACTION_FILE = "actions";
    private static final String DOWNLOAD_TRACKER_ACTION_FILE = "tracked_actions";
    private Context context;
    private Cache downloadCache;
    private DownloadManager downloadManager;
    private DownloadTracker downloadTracker;
    private String userAgent = ConstsKt.getUserAgentHeader();

    public VideoDownloadHelper(Context context) {
        this.context = context;
    }

    private DataSource.Factory buildDataSourceFactory() {
        return VideoDownloadHelper.buildReadOnlyCacheDataSource(new DefaultDataSourceFactory(this.context, (DataSource.Factory)this.buildHttpDataSourceFactory()), this.getDownloadCache());
    }

    private HttpDataSource.Factory buildHttpDataSourceFactory() {
        return new DefaultHttpDataSourceFactory(this.userAgent);
    }

    private static CacheDataSourceFactory buildReadOnlyCacheDataSource(DefaultDataSourceFactory defaultDataSourceFactory, Cache cache) {
        return new CacheDataSourceFactory(cache, (DataSource.Factory)defaultDataSourceFactory, (DataSource.Factory)new FileDataSourceFactory(), null, 2, null);
    }

    private File getAppDataDirectory() {
        return new File(VideoDownloadHelper.getAppDataDirectory(this.context));
    }

    private static String getAppDataDirectory(Context context) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(context.getFilesDir().getAbsolutePath());
        stringBuilder.append("/TvRain/");
        return stringBuilder.toString();
    }

    private Cache getDownloadCache() {
        VideoDownloadHelper videoDownloadHelper = this;
        synchronized (videoDownloadHelper) {
            Cache cache;
            if (this.downloadCache == null) {
                cache = new File(VideoDownloadHelper.getDownloadedVideoFolderPath(this.context));
                NoOpCacheEvictor noOpCacheEvictor = new NoOpCacheEvictor();
                SimpleCache simpleCache = new SimpleCache((File)cache, (CacheEvictor)noOpCacheEvictor);
                this.downloadCache = simpleCache;
            }
            cache = this.downloadCache;
            return cache;
        }
    }

    private static String getDownloadedVideoFolderPath(Context context) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(context.getFilesDir().getAbsolutePath());
        stringBuilder.append("/TvRain/DownloadsNew/");
        return stringBuilder.toString();
    }

    private List<StreamKey> getOfflineStreamKeys(Uri uri) {
        return this.getDownloadTracker().getOfflineStreamKeys(uri);
    }

    public DownloadTracker getDownloadTracker() {
        return this.downloadTracker;
    }

    public MediaSource getMediaSourceForUrl(String string2) {
        DataSource.Factory factory = this.buildDataSourceFactory();
        string2 = Uri.parse((String)string2);
        return new HlsMediaSource.Factory(factory).setPlaylistParserFactory((HlsPlaylistParserFactory)new DefaultHlsPlaylistParserFactory(this.getOfflineStreamKeys((Uri)string2))).createMediaSource((Uri)string2);
    }

    public DownloadManager initDownloadManager() {
        VideoDownloadHelper videoDownloadHelper = this;
        synchronized (videoDownloadHelper) {
            DownloadManager downloadManager;
            if (this.downloadManager == null) {
                DownloadManager downloadManager2;
                DownloaderConstructorHelper downloaderConstructorHelper = new DownloaderConstructorHelper(this.getDownloadCache(), (DataSource.Factory)this.buildHttpDataSourceFactory());
                downloadManager = new File(this.getAppDataDirectory(), DOWNLOAD_ACTION_FILE);
                this.downloadManager = downloadManager2 = new DownloadManager(downloaderConstructorHelper, 50, 5, (File)downloadManager, new DownloadAction.Deserializer[0]);
                downloaderConstructorHelper = this.context;
                downloadManager2 = this.buildDataSourceFactory();
                File file = new File(this.getAppDataDirectory(), DOWNLOAD_TRACKER_ACTION_FILE);
                downloadManager = new DownloadTracker((Context)downloaderConstructorHelper, (DataSource.Factory)downloadManager2, file, new DownloadAction.Deserializer[0]);
                this.downloadTracker = downloadManager;
                this.downloadManager.addListener((DownloadManager.Listener)downloadManager);
            }
            downloadManager = this.downloadManager;
            return downloadManager;
        }
    }
}

