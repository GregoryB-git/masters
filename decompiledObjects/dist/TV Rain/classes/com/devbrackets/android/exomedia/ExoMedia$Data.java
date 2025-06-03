package com.devbrackets.android.exomedia;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.devbrackets.android.exomedia.core.source.MediaSourceProvider;
import com.devbrackets.android.exomedia.core.source.MediaSourceProvider.SourceTypeBuilder;
import com.devbrackets.android.exomedia.core.source.builder.DashMediaSourceBuilder;
import com.devbrackets.android.exomedia.core.source.builder.HlsMediaSourceBuilder;
import com.devbrackets.android.exomedia.core.source.builder.SsMediaSourceBuilder;
import com.google.android.exoplayer2.LoadControl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ExoMedia$Data
{
  @Nullable
  public static volatile ExoMedia.DataSourceFactoryProvider dataSourceFactoryProvider;
  @Deprecated
  @Nullable
  public static volatile ExoMedia.HttpDataSourceFactoryProvider httpDataSourceFactoryProvider;
  @Nullable
  public static volatile LoadControl loadControl;
  @NonNull
  public static volatile MediaSourceProvider mediaSourceProvider;
  @NonNull
  public static final Map<ExoMedia.RendererType, List<String>> registeredRendererClasses = new HashMap();
  @NonNull
  public static final List<MediaSourceProvider.SourceTypeBuilder> sourceTypeBuilders = new ArrayList();
  
  static
  {
    mediaSourceProvider = new MediaSourceProvider();
    instantiateRendererClasses();
    instantiateSourceProviders();
  }
  
  private static void instantiateRendererClasses()
  {
    Map localMap = registeredRendererClasses;
    Object localObject = ExoMedia.RendererType.AUDIO;
    localMap.put(localObject, new LinkedList());
    ExoMedia.RendererType localRendererType = ExoMedia.RendererType.VIDEO;
    localMap.put(localRendererType, new LinkedList());
    localMap.put(ExoMedia.RendererType.CLOSED_CAPTION, new LinkedList());
    localMap.put(ExoMedia.RendererType.METADATA, new LinkedList());
    localObject = (List)localMap.get(localObject);
    ((List)localObject).add("com.google.android.exoplayer2.ext.opus.LibopusAudioRenderer");
    ((List)localObject).add("com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer");
    ((List)localObject).add("com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer");
    ((List)localMap.get(localRendererType)).add("com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer");
  }
  
  private static void instantiateSourceProviders()
  {
    List localList = sourceTypeBuilders;
    localList.add(new MediaSourceProvider.SourceTypeBuilder(new HlsMediaSourceBuilder(), null, ".m3u8", ".*\\.m3u8.*"));
    localList.add(new MediaSourceProvider.SourceTypeBuilder(new DashMediaSourceBuilder(), null, ".mpd", ".*\\.mpd.*"));
    localList.add(new MediaSourceProvider.SourceTypeBuilder(new SsMediaSourceBuilder(), null, ".ism", ".*\\.ism.*"));
  }
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.ExoMedia.Data
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */