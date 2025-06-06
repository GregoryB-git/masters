package com.google.android.exoplayer2;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.drm.FrameworkMediaCrypto;
import com.google.android.exoplayer2.metadata.MetadataOutput;
import com.google.android.exoplayer2.text.TextOutput;
import com.google.android.exoplayer2.video.VideoRendererEventListener;

public abstract interface RenderersFactory
{
  public abstract Renderer[] createRenderers(Handler paramHandler, VideoRendererEventListener paramVideoRendererEventListener, AudioRendererEventListener paramAudioRendererEventListener, TextOutput paramTextOutput, MetadataOutput paramMetadataOutput, @Nullable DrmSessionManager<FrameworkMediaCrypto> paramDrmSessionManager);
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.RenderersFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */