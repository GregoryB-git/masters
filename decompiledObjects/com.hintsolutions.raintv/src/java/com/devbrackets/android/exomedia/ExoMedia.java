/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.google.android.exoplayer2.LoadControl
 *  com.google.android.exoplayer2.Renderer
 *  com.google.android.exoplayer2.upstream.DataSource$Factory
 *  com.google.android.exoplayer2.upstream.HttpDataSource$BaseFactory
 *  com.google.android.exoplayer2.upstream.TransferListener
 *  java.lang.Class
 *  java.lang.Deprecated
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.LinkedList
 *  java.util.List
 *  java.util.Map
 */
package com.devbrackets.android.exomedia;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.devbrackets.android.exomedia.core.source.MediaSourceProvider;
import com.devbrackets.android.exomedia.core.source.builder.DashMediaSourceBuilder;
import com.devbrackets.android.exomedia.core.source.builder.HlsMediaSourceBuilder;
import com.devbrackets.android.exomedia.core.source.builder.SsMediaSourceBuilder;
import com.google.android.exoplayer2.LoadControl;
import com.google.android.exoplayer2.Renderer;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.TransferListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ExoMedia {
    public static void registerMediaSourceBuilder(@NonNull MediaSourceProvider.SourceTypeBuilder sourceTypeBuilder) {
        Data.sourceTypeBuilders.add(0, (Object)sourceTypeBuilder);
    }

    public static void registerRenderer(@NonNull RendererType rendererType, @NonNull Class<? extends Renderer> clazz) {
        ((List)Data.registeredRendererClasses.get((Object)rendererType)).add((Object)clazz.getName());
    }

    public static void setDataSourceFactoryProvider(@Nullable DataSourceFactoryProvider dataSourceFactoryProvider) {
        Data.dataSourceFactoryProvider = dataSourceFactoryProvider;
    }

    @Deprecated
    public static void setHttpDataSourceFactoryProvider(@Nullable HttpDataSourceFactoryProvider httpDataSourceFactoryProvider) {
        Data.httpDataSourceFactoryProvider = httpDataSourceFactoryProvider;
    }

    public static void setLoadControl(@Nullable LoadControl loadControl) {
        Data.loadControl = loadControl;
    }

    public static class Data {
        @Nullable
        public static volatile DataSourceFactoryProvider dataSourceFactoryProvider;
        @Deprecated
        @Nullable
        public static volatile HttpDataSourceFactoryProvider httpDataSourceFactoryProvider;
        @Nullable
        public static volatile LoadControl loadControl;
        @NonNull
        public static volatile MediaSourceProvider mediaSourceProvider;
        @NonNull
        public static final Map<RendererType, List<String>> registeredRendererClasses;
        @NonNull
        public static final List<MediaSourceProvider.SourceTypeBuilder> sourceTypeBuilders;

        static {
            registeredRendererClasses = new HashMap();
            sourceTypeBuilders = new ArrayList();
            mediaSourceProvider = new MediaSourceProvider();
            Data.instantiateRendererClasses();
            Data.instantiateSourceProviders();
        }

        private static void instantiateRendererClasses() {
            Map<RendererType, List<String>> map = registeredRendererClasses;
            RendererType rendererType = RendererType.AUDIO;
            map.put((Object)rendererType, (Object)new LinkedList());
            RendererType rendererType2 = RendererType.VIDEO;
            map.put((Object)rendererType2, (Object)new LinkedList());
            map.put((Object)RendererType.CLOSED_CAPTION, (Object)new LinkedList());
            map.put((Object)RendererType.METADATA, (Object)new LinkedList());
            rendererType = (List)map.get((Object)rendererType);
            rendererType.add("com.google.android.exoplayer2.ext.opus.LibopusAudioRenderer");
            rendererType.add("com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer");
            rendererType.add("com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer");
            ((List)map.get((Object)rendererType2)).add((Object)"com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer");
        }

        private static void instantiateSourceProviders() {
            List<MediaSourceProvider.SourceTypeBuilder> list = sourceTypeBuilders;
            list.add((Object)new MediaSourceProvider.SourceTypeBuilder(new HlsMediaSourceBuilder(), null, ".m3u8", ".*\\.m3u8.*"));
            list.add((Object)new MediaSourceProvider.SourceTypeBuilder(new DashMediaSourceBuilder(), null, ".mpd", ".*\\.mpd.*"));
            list.add((Object)new MediaSourceProvider.SourceTypeBuilder(new SsMediaSourceBuilder(), null, ".ism", ".*\\.ism.*"));
        }
    }

    public static interface DataSourceFactoryProvider {
        @NonNull
        public DataSource.Factory provide(@NonNull String var1, @Nullable TransferListener var2);
    }

    @Deprecated
    public static interface HttpDataSourceFactoryProvider {
        @NonNull
        public HttpDataSource.BaseFactory provide(@NonNull String var1, @Nullable TransferListener var2);
    }

    public static final class RendererType
    extends Enum<RendererType> {
        private static final RendererType[] $VALUES;
        public static final /* enum */ RendererType AUDIO;
        public static final /* enum */ RendererType CLOSED_CAPTION;
        public static final /* enum */ RendererType METADATA;
        public static final /* enum */ RendererType VIDEO;

        static {
            RendererType rendererType;
            RendererType rendererType2;
            RendererType rendererType3;
            RendererType rendererType4;
            AUDIO = rendererType4 = new RendererType();
            VIDEO = rendererType3 = new RendererType();
            CLOSED_CAPTION = rendererType2 = new RendererType();
            METADATA = rendererType = new RendererType();
            $VALUES = new RendererType[]{rendererType4, rendererType3, rendererType2, rendererType};
        }

        public static RendererType valueOf(String string2) {
            return (RendererType)Enum.valueOf(RendererType.class, (String)string2);
        }

        public static RendererType[] values() {
            return (RendererType[])$VALUES.clone();
        }
    }
}

