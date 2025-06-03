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
 *  com.google.android.exoplayer2.source.dash.DashChunkSource$Factory
 *  com.google.android.exoplayer2.source.dash.DashMediaSource$Factory
 *  com.google.android.exoplayer2.source.dash.DefaultDashChunkSource$Factory
 *  com.google.android.exoplayer2.upstream.DataSource$Factory
 *  com.google.android.exoplayer2.upstream.TransferListener
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.devbrackets.android.exomedia.core.source.builder;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.devbrackets.android.exomedia.core.source.builder.MediaSourceBuilder;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.dash.DashChunkSource;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.source.dash.DefaultDashChunkSource;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.TransferListener;

public class DashMediaSourceBuilder
extends MediaSourceBuilder {
    @Override
    @NonNull
    public MediaSource build(@NonNull Context context, @NonNull Uri uri, @NonNull String string2, @NonNull Handler handler, @Nullable TransferListener transferListener) {
        handler = this.buildDataSourceFactory(context, string2, null);
        return new DashMediaSource.Factory((DashChunkSource.Factory)new DefaultDashChunkSource.Factory(this.buildDataSourceFactory(context, string2, transferListener)), (DataSource.Factory)handler).createMediaSource(uri);
    }
}

