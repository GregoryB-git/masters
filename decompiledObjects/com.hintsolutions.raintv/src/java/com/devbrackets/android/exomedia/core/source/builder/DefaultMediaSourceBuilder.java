/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.os.Handler
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.google.android.exoplayer2.extractor.DefaultExtractorsFactory
 *  com.google.android.exoplayer2.extractor.ExtractorsFactory
 *  com.google.android.exoplayer2.source.ExtractorMediaSource$Factory
 *  com.google.android.exoplayer2.source.MediaSource
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
import com.google.android.exoplayer2.extractor.DefaultExtractorsFactory;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.source.ExtractorMediaSource;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.upstream.TransferListener;

public class DefaultMediaSourceBuilder
extends MediaSourceBuilder {
    @Override
    @NonNull
    public MediaSource build(@NonNull Context context, @NonNull Uri uri, @NonNull String string2, @NonNull Handler handler, @Nullable TransferListener transferListener) {
        return new ExtractorMediaSource.Factory(this.buildDataSourceFactory(context, string2, transferListener)).setExtractorsFactory((ExtractorsFactory)new DefaultExtractorsFactory()).createMediaSource(uri);
    }
}

