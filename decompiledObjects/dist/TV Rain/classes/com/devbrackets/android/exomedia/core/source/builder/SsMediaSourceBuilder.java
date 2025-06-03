package com.devbrackets.android.exomedia.core.source.builder;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.smoothstreaming.DefaultSsChunkSource.Factory;
import com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource.Factory;
import com.google.android.exoplayer2.upstream.TransferListener;

public class SsMediaSourceBuilder
  extends MediaSourceBuilder
{
  @NonNull
  public MediaSource build(@NonNull Context paramContext, @NonNull Uri paramUri, @NonNull String paramString, @NonNull Handler paramHandler, @Nullable TransferListener paramTransferListener)
  {
    paramHandler = buildDataSourceFactory(paramContext, paramString, null);
    return new SsMediaSource.Factory(new DefaultSsChunkSource.Factory(buildDataSourceFactory(paramContext, paramString, paramTransferListener)), paramHandler).createMediaSource(paramUri);
  }
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.core.source.builder.SsMediaSourceBuilder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */