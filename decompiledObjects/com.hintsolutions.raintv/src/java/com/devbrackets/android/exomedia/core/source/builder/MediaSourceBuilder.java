/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.os.Handler
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.google.android.exoplayer2.source.MediaSource
 *  com.google.android.exoplayer2.upstream.DataSource$Factory
 *  com.google.android.exoplayer2.upstream.DefaultDataSourceFactory
 *  com.google.android.exoplayer2.upstream.DefaultHttpDataSourceFactory
 *  com.google.android.exoplayer2.upstream.TransferListener
 *  java.lang.Object
 *  java.lang.String
 */
package com.devbrackets.android.exomedia.core.source.builder;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.devbrackets.android.exomedia.ExoMedia;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import com.google.android.exoplayer2.upstream.DefaultHttpDataSourceFactory;
import com.google.android.exoplayer2.upstream.TransferListener;

public abstract class MediaSourceBuilder {
    @NonNull
    public abstract MediaSource build(@NonNull Context var1, @NonNull Uri var2, @NonNull String var3, @NonNull Handler var4, @Nullable TransferListener var5);

    @NonNull
    public DataSource.Factory buildDataSourceFactory(@NonNull Context context, @NonNull String string2, @Nullable TransferListener transferListener) {
        ExoMedia.DataSourceFactoryProvider dataSourceFactoryProvider = ExoMedia.Data.dataSourceFactoryProvider;
        Object var6_5 = null;
        Object object = dataSourceFactoryProvider != null ? dataSourceFactoryProvider.provide(string2, transferListener) : null;
        dataSourceFactoryProvider = object;
        if (object == null) {
            object = ExoMedia.Data.httpDataSourceFactoryProvider;
            dataSourceFactoryProvider = var6_5;
            if (object != null) {
                dataSourceFactoryProvider = object.provide(string2, transferListener);
            }
        }
        object = dataSourceFactoryProvider;
        if (dataSourceFactoryProvider == null) {
            object = new DefaultHttpDataSourceFactory(string2, transferListener);
        }
        return new DefaultDataSourceFactory(context, transferListener, (DataSource.Factory)object);
    }
}

