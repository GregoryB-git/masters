package com.devbrackets.android.exomedia;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.devbrackets.android.exomedia.core.source.MediaSourceProvider;
import com.devbrackets.android.exomedia.core.source.MediaSourceProvider.SourceTypeBuilder;
import com.devbrackets.android.exomedia.core.source.builder.DashMediaSourceBuilder;
import com.devbrackets.android.exomedia.core.source.builder.HlsMediaSourceBuilder;
import com.devbrackets.android.exomedia.core.source.builder.SsMediaSourceBuilder;
import com.google.android.exoplayer2.LoadControl;
import com.google.android.exoplayer2.Renderer;
import com.google.android.exoplayer2.upstream.DataSource.Factory;
import com.google.android.exoplayer2.upstream.HttpDataSource.BaseFactory;
import com.google.android.exoplayer2.upstream.TransferListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ExoMedia
{
  public static void registerMediaSourceBuilder(@NonNull MediaSourceProvider.SourceTypeBuilder paramSourceTypeBuilder)
  {
    Data.sourceTypeBuilders.add(0, paramSourceTypeBuilder);
  }
  
  public static void registerRenderer(@NonNull RendererType paramRendererType, @NonNull Class<? extends Renderer> paramClass)
  {
    ((List)Data.registeredRendererClasses.get(paramRendererType)).add(paramClass.getName());
  }
  
  public static void setDataSourceFactoryProvider(@Nullable DataSourceFactoryProvider paramDataSourceFactoryProvider)
  {
    Data.dataSourceFactoryProvider = paramDataSourceFactoryProvider;
  }
  
  @Deprecated
  public static void setHttpDataSourceFactoryProvider(@Nullable HttpDataSourceFactoryProvider paramHttpDataSourceFactoryProvider)
  {
    Data.httpDataSourceFactoryProvider = paramHttpDataSourceFactoryProvider;
  }
  
  public static void setLoadControl(@Nullable LoadControl paramLoadControl)
  {
    Data.loadControl = paramLoadControl;
  }
  
  public static class Data
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
  
  public static abstract interface DataSourceFactoryProvider
  {
    @NonNull
    public abstract DataSource.Factory provide(@NonNull String paramString, @Nullable TransferListener paramTransferListener);
  }
  
  @Deprecated
  public static abstract interface HttpDataSourceFactoryProvider
  {
    @NonNull
    public abstract HttpDataSource.BaseFactory provide(@NonNull String paramString, @Nullable TransferListener paramTransferListener);
  }
  
  public static enum RendererType
  {
    static
    {
      RendererType localRendererType1 = new RendererType("AUDIO", 0);
      AUDIO = localRendererType1;
      RendererType localRendererType2 = new RendererType("VIDEO", 1);
      VIDEO = localRendererType2;
      RendererType localRendererType3 = new RendererType("CLOSED_CAPTION", 2);
      CLOSED_CAPTION = localRendererType3;
      RendererType localRendererType4 = new RendererType("METADATA", 3);
      METADATA = localRendererType4;
      $VALUES = new RendererType[] { localRendererType1, localRendererType2, localRendererType3, localRendererType4 };
    }
    
    private RendererType() {}
  }
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.ExoMedia
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */