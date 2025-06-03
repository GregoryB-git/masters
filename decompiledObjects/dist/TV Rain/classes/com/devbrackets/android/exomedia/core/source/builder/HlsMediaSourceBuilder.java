package com.devbrackets.android.exomedia.core.source.builder;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.hls.HlsMediaSource.Factory;
import com.google.android.exoplayer2.upstream.TransferListener;

public class HlsMediaSourceBuilder
  extends MediaSourceBuilder
{
  @NonNull
  public MediaSource build(@NonNull Context paramContext, @NonNull Uri paramUri, @NonNull String paramString, @NonNull Handler paramHandler, @Nullable TransferListener paramTransferListener)
  {
    return new HlsMediaSource.Factory(buildDataSourceFactory(paramContext, paramString, paramTransferListener)).createMediaSource(paramUri);
  }
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.core.source.builder.HlsMediaSourceBuilder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */