/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.net.Uri
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.google.android.exoplayer2.source.MediaSource
 *  com.google.android.exoplayer2.upstream.TransferListener
 *  java.lang.Deprecated
 *  java.lang.Object
 *  java.lang.String
 */
package com.devbrackets.android.exomedia.core.source;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.devbrackets.android.exomedia.ExoMedia;
import com.devbrackets.android.exomedia.core.source.builder.DefaultMediaSourceBuilder;
import com.devbrackets.android.exomedia.core.source.builder.MediaSourceBuilder;
import com.devbrackets.android.exomedia.util.MediaSourceUtil;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.upstream.TransferListener;

public class MediaSourceProvider {
    public static final String USER_AGENT_FORMAT = "ExoMedia %s (%d) / Android %s / %s";
    @SuppressLint(value={"DefaultLocale"})
    @NonNull
    public String userAgent = String.format((String)"ExoMedia %s (%d) / Android %s / %s", (Object[])new Object[]{"4.3.0", 43000, Build.VERSION.RELEASE, Build.MODEL});

    @Nullable
    public static SourceTypeBuilder findByExtension(@NonNull Uri object) {
        if ((object = MediaSourceUtil.getExtension(object)) != null && !object.isEmpty()) {
            for (SourceTypeBuilder sourceTypeBuilder : ExoMedia.Data.sourceTypeBuilders) {
                String string2 = sourceTypeBuilder.extension;
                if (string2 == null || !string2.equalsIgnoreCase((String)object)) continue;
                return sourceTypeBuilder;
            }
        }
        return null;
    }

    @Nullable
    public static SourceTypeBuilder findByLooseComparison(@NonNull Uri uri) {
        for (SourceTypeBuilder sourceTypeBuilder : ExoMedia.Data.sourceTypeBuilders) {
            if (sourceTypeBuilder.looseComparisonRegex == null || !uri.toString().matches(sourceTypeBuilder.looseComparisonRegex)) continue;
            return sourceTypeBuilder;
        }
        return null;
    }

    @Nullable
    public static SourceTypeBuilder findByProviders(@NonNull Uri object) {
        SourceTypeBuilder sourceTypeBuilder = MediaSourceProvider.findByScheme(object);
        if (sourceTypeBuilder != null) {
            return sourceTypeBuilder;
        }
        sourceTypeBuilder = MediaSourceProvider.findByExtension(object);
        if (sourceTypeBuilder != null) {
            return sourceTypeBuilder;
        }
        if ((object = MediaSourceProvider.findByLooseComparison(object)) != null) {
            return object;
        }
        return null;
    }

    @Nullable
    public static SourceTypeBuilder findByScheme(@NonNull Uri object) {
        String string2 = object.getScheme();
        if (string2 != null && !string2.isEmpty()) {
            for (SourceTypeBuilder sourceTypeBuilder : ExoMedia.Data.sourceTypeBuilders) {
                object = sourceTypeBuilder.uriScheme;
                if (object == null || !object.equalsIgnoreCase(string2)) continue;
                return sourceTypeBuilder;
            }
        }
        return null;
    }

    @NonNull
    public MediaSource generate(@NonNull Context context, @NonNull Handler handler, @NonNull Uri uri, @Nullable TransferListener transferListener) {
        Object object = MediaSourceProvider.findByProviders(uri);
        object = object != null ? ((SourceTypeBuilder)object).builder : new DefaultMediaSourceBuilder();
        return ((MediaSourceBuilder)object).build(context, uri, this.userAgent, handler, transferListener);
    }

    public static class SourceTypeBuilder {
        @NonNull
        public final MediaSourceBuilder builder;
        @Nullable
        public final String extension;
        @Nullable
        public final String looseComparisonRegex;
        @Nullable
        public final String uriScheme;

        @Deprecated
        public SourceTypeBuilder(@NonNull MediaSourceBuilder mediaSourceBuilder, @NonNull String string2, @Nullable String string3) {
            this(mediaSourceBuilder, null, string2, string3);
        }

        public SourceTypeBuilder(@NonNull MediaSourceBuilder mediaSourceBuilder, @Nullable String string2, @Nullable String string3, @Nullable String string4) {
            this.builder = mediaSourceBuilder;
            this.uriScheme = string2;
            this.extension = string3;
            this.looseComparisonRegex = string4;
        }
    }
}

