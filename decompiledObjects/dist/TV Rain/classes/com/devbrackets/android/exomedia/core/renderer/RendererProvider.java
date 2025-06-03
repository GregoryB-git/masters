package com.devbrackets.android.exomedia.core.renderer;

import android.content.Context;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.devbrackets.android.exomedia.ExoMedia.Data;
import com.devbrackets.android.exomedia.ExoMedia.RendererType;
import com.google.android.exoplayer2.Renderer;
import com.google.android.exoplayer2.audio.AudioCapabilities;
import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.audio.MediaCodecAudioRenderer;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.drm.FrameworkMediaCrypto;
import com.google.android.exoplayer2.mediacodec.MediaCodecSelector;
import com.google.android.exoplayer2.metadata.MetadataDecoderFactory;
import com.google.android.exoplayer2.metadata.MetadataOutput;
import com.google.android.exoplayer2.metadata.MetadataRenderer;
import com.google.android.exoplayer2.text.TextOutput;
import com.google.android.exoplayer2.text.TextRenderer;
import com.google.android.exoplayer2.video.MediaCodecVideoRenderer;
import com.google.android.exoplayer2.video.VideoRendererEventListener;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class RendererProvider
{
  @NonNull
  public AudioRendererEventListener audioRendererEventListener;
  @NonNull
  public TextOutput captionListener;
  @NonNull
  public Context context;
  @Nullable
  public DrmSessionManager<FrameworkMediaCrypto> drmSessionManager;
  public int droppedFrameNotificationAmount = 50;
  @NonNull
  public Handler handler;
  @NonNull
  public MetadataOutput metadataListener;
  public int videoJoiningTimeMs = 5000;
  @NonNull
  public VideoRendererEventListener videoRendererEventListener;
  
  public RendererProvider(@NonNull Context paramContext, @NonNull Handler paramHandler, @NonNull TextOutput paramTextOutput, @NonNull MetadataOutput paramMetadataOutput, @NonNull AudioRendererEventListener paramAudioRendererEventListener, @NonNull VideoRendererEventListener paramVideoRendererEventListener)
  {
    context = paramContext;
    handler = paramHandler;
    captionListener = paramTextOutput;
    metadataListener = paramMetadataOutput;
    audioRendererEventListener = paramAudioRendererEventListener;
    videoRendererEventListener = paramVideoRendererEventListener;
  }
  
  @NonNull
  public List<Renderer> buildAudioRenderers()
  {
    ArrayList localArrayList = new ArrayList();
    Object localObject = context;
    localArrayList.add(new MediaCodecAudioRenderer((Context)localObject, MediaCodecSelector.DEFAULT, drmSessionManager, true, handler, audioRendererEventListener, AudioCapabilities.getCapabilities((Context)localObject), new AudioProcessor[0]));
    localObject = (List)ExoMedia.Data.registeredRendererClasses.get(ExoMedia.RendererType.AUDIO);
    if (localObject != null) {
      localObject = ((List)localObject).iterator();
    }
    for (;;)
    {
      String str;
      if (((Iterator)localObject).hasNext()) {
        str = (String)((Iterator)localObject).next();
      }
      try
      {
        localArrayList.add((Renderer)Class.forName(str).getConstructor(new Class[] { Handler.class, AudioRendererEventListener.class }).newInstance(new Object[] { handler, audioRendererEventListener }));
      }
      catch (Exception localException) {}
      return localArrayList;
    }
  }
  
  @NonNull
  public List<Renderer> buildCaptionRenderers()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new TextRenderer(captionListener, handler.getLooper()));
    return localArrayList;
  }
  
  @NonNull
  public List<Renderer> buildMetadataRenderers()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new MetadataRenderer(metadataListener, handler.getLooper(), MetadataDecoderFactory.DEFAULT));
    return localArrayList;
  }
  
  @NonNull
  public List<Renderer> buildVideoRenderers()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new MediaCodecVideoRenderer(context, MediaCodecSelector.DEFAULT, videoJoiningTimeMs, drmSessionManager, false, handler, videoRendererEventListener, droppedFrameNotificationAmount));
    Object localObject = (List)ExoMedia.Data.registeredRendererClasses.get(ExoMedia.RendererType.VIDEO);
    if (localObject != null) {
      localObject = ((List)localObject).iterator();
    }
    for (;;)
    {
      String str;
      if (((Iterator)localObject).hasNext()) {
        str = (String)((Iterator)localObject).next();
      }
      try
      {
        localArrayList.add((Renderer)Class.forName(str).getConstructor(new Class[] { Boolean.TYPE, Long.TYPE, Handler.class, VideoRendererEventListener.class, Integer.TYPE }).newInstance(new Object[] { Boolean.TRUE, Integer.valueOf(videoJoiningTimeMs), handler, videoRendererEventListener, Integer.valueOf(droppedFrameNotificationAmount) }));
      }
      catch (Exception localException) {}
      return localArrayList;
    }
  }
  
  @NonNull
  public List<Renderer> generate()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.addAll(buildAudioRenderers());
    localArrayList.addAll(buildVideoRenderers());
    localArrayList.addAll(buildCaptionRenderers());
    localArrayList.addAll(buildMetadataRenderers());
    return localArrayList;
  }
  
  public void setDrmSessionManager(@Nullable DrmSessionManager<FrameworkMediaCrypto> paramDrmSessionManager)
  {
    drmSessionManager = paramDrmSessionManager;
  }
  
  public void setDroppedFrameNotificationAmount(int paramInt)
  {
    droppedFrameNotificationAmount = paramInt;
  }
  
  public void setVideoJoiningTimeMs(int paramInt)
  {
    videoJoiningTimeMs = paramInt;
  }
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.core.renderer.RendererProvider
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */