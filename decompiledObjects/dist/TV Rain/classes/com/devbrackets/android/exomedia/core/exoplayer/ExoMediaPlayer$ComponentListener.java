package com.devbrackets.android.exomedia.core.exoplayer;

import android.view.Surface;
import com.devbrackets.android.exomedia.core.listener.CaptionListener;
import com.devbrackets.android.exomedia.core.listener.ExoPlayerListener;
import com.devbrackets.android.exomedia.core.listener.InternalErrorListener;
import com.devbrackets.android.exomedia.core.listener.MetadataListener;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataOutput;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.TextOutput;
import com.google.android.exoplayer2.video.VideoRendererEventListener;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

class ExoMediaPlayer$ComponentListener
  implements VideoRendererEventListener, AudioRendererEventListener, TextOutput, MetadataOutput
{
  private ExoMediaPlayer$ComponentListener(ExoMediaPlayer paramExoMediaPlayer) {}
  
  public void onAudioDecoderInitialized(String paramString, long paramLong1, long paramLong2)
  {
    ExoMediaPlayer.access$800(this$0).onAudioDecoderInitialized(paramString, paramLong1, paramLong2);
  }
  
  public void onAudioDisabled(DecoderCounters paramDecoderCounters)
  {
    ExoMediaPlayer.access$902(this$0, 0);
    ExoMediaPlayer.access$800(this$0).onAudioDisabled(paramDecoderCounters);
  }
  
  public void onAudioEnabled(DecoderCounters paramDecoderCounters)
  {
    ExoMediaPlayer.access$800(this$0).onAudioEnabled(paramDecoderCounters);
  }
  
  public void onAudioInputFormatChanged(Format paramFormat)
  {
    ExoMediaPlayer.access$800(this$0).onAudioInputFormatChanged(paramFormat);
  }
  
  public void onAudioSessionId(int paramInt)
  {
    ExoMediaPlayer.access$902(this$0, paramInt);
    ExoMediaPlayer.access$800(this$0).onAudioSessionId(paramInt);
  }
  
  public void onAudioSinkUnderrun(int paramInt, long paramLong1, long paramLong2)
  {
    if (ExoMediaPlayer.access$700(this$0) != null) {
      ExoMediaPlayer.access$700(this$0).onAudioSinkUnderrun(paramInt, paramLong1, paramLong2);
    }
    ExoMediaPlayer.access$800(this$0).onAudioSinkUnderrun(paramInt, paramLong1, paramLong2);
  }
  
  public void onCues(List<Cue> paramList)
  {
    if (ExoMediaPlayer.access$1200(this$0) != null) {
      ExoMediaPlayer.access$1200(this$0).onCues(paramList);
    }
  }
  
  public void onDroppedFrames(int paramInt, long paramLong)
  {
    ExoMediaPlayer.access$800(this$0).onDroppedFrames(paramInt, paramLong);
  }
  
  public void onMetadata(Metadata paramMetadata)
  {
    if (ExoMediaPlayer.access$1100(this$0) != null) {
      ExoMediaPlayer.access$1100(this$0).onMetadata(paramMetadata);
    }
    ExoMediaPlayer.access$800(this$0).onMetadata(paramMetadata);
  }
  
  public void onRenderedFirstFrame(Surface paramSurface)
  {
    ExoMediaPlayer.access$800(this$0).onRenderedFirstFrame(paramSurface);
  }
  
  public void onVideoDecoderInitialized(String paramString, long paramLong1, long paramLong2)
  {
    ExoMediaPlayer.access$800(this$0).onVideoDecoderInitialized(paramString, paramLong1, paramLong2);
  }
  
  public void onVideoDisabled(DecoderCounters paramDecoderCounters)
  {
    ExoMediaPlayer.access$800(this$0).onVideoDisabled(paramDecoderCounters);
  }
  
  public void onVideoEnabled(DecoderCounters paramDecoderCounters)
  {
    ExoMediaPlayer.access$800(this$0).onVideoEnabled(paramDecoderCounters);
  }
  
  public void onVideoInputFormatChanged(Format paramFormat)
  {
    ExoMediaPlayer.access$800(this$0).onVideoInputFormatChanged(paramFormat);
  }
  
  public void onVideoSizeChanged(int paramInt1, int paramInt2, int paramInt3, float paramFloat)
  {
    Iterator localIterator = ExoMediaPlayer.access$1000(this$0).iterator();
    while (localIterator.hasNext()) {
      ((ExoPlayerListener)localIterator.next()).onVideoSizeChanged(paramInt1, paramInt2, paramInt3, paramFloat);
    }
    ExoMediaPlayer.access$800(this$0).onVideoSizeChanged(paramInt1, paramInt2, paramInt3, paramFloat);
  }
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.core.exoplayer.ExoMediaPlayer.ComponentListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */